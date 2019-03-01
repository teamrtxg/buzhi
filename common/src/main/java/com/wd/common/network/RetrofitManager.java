package com.wd.common.network;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *  @author Tang
 *  @time 2019/2/26  20:43
 *  @describe 
 */
public class RetrofitManager {
    private final String BASE_URL = "https://mobile.bwstudent.com/techApi/";
    private final BaseApis baseApis;

    /**
     * 静态内部类的单例模式
     */
    public static RetrofitManager getInstance() {
        return SingletonHolder.instance;
    }



    private static class SingletonHolder {
        private static final RetrofitManager instance = new RetrofitManager();
    }

    //无参构造
    private RetrofitManager() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.sslSocketFactory(TrustAllCerts.createSSLSocketFactory());
        builder.hostnameVerifier(new TrustAllCerts.TrustAllHostnameVerifier());
        builder.readTimeout(15, TimeUnit.SECONDS);
        builder.writeTimeout(15, TimeUnit.SECONDS);
        builder.connectTimeout(15, TimeUnit.SECONDS);
        builder.addInterceptor(interceptor);

        builder.retryOnConnectionFailure(true);
        OkHttpClient build = builder.build();
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .client(build)
                .build();
        baseApis = retrofit.create(BaseApis.class);
    }

    /**
     * get
     */
    public void get(String url, Map<String, String> headMap, HttpListener listener) {
        baseApis.get(url,headMap)
                //后台执行在哪个线程
                .subscribeOn(Schedulers.io())
                //最终完成后执行在哪个线程
                .observeOn(AndroidSchedulers.mainThread())
                //设置rxjava
                .subscribe(getObserver(listener));
    }

    public void DELETE(String url, Map<String, String> headMap, HttpListener listener) {
        baseApis.get(url,headMap)
                //后台执行在哪个线程
                .subscribeOn(Schedulers.io())
                //最终完成后执行在哪个线程
                .observeOn(AndroidSchedulers.mainThread())
                //设置rxjava
                .subscribe(getObserver(listener));
    }
    /**
     * 普通post
     */
    public void post(String url, Map<String, String> map, Map<String, String> headMap, HttpListener listener) {
        if (map == null) {
            map = new HashMap<>();
        }
        baseApis.post(url,map,headMap)
                // 后台执行在哪个线程
                .subscribeOn(Schedulers.io())
                //最终完成后执行在哪个线程
                .observeOn(AndroidSchedulers.mainThread())
                //设置rxjava
                .subscribe(getObserver(listener));

    }
    public void put(String url, Map<String, String> map, Map<String, String> headMap, HttpListener listener) {
        if (map == null) {
            map = new HashMap<>();
        }
        baseApis.post(url,map,headMap)
                // 后台执行在哪个线程
                .subscribeOn(Schedulers.io())
                //最终完成后执行在哪个线程
                .observeOn(AndroidSchedulers.mainThread())
                //设置rxjava
                .subscribe(getObserver(listener));

    }
    /**
     * 上传头像
     */
    public static MultipartBody filesMultipar(Map<String, String> map) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            File file = new File(entry.getValue());
            builder.addFormDataPart(entry.getKey(), "tp.png",
                    RequestBody.create(MediaType.parse("multipart/form-data"), file));
        }
        builder.setType(MultipartBody.FORM);
        MultipartBody multipartBody = builder.build();
        return multipartBody;
    }

    public void imagePost(String url, Map<String, String> map, Map<String, String> headMap, HttpListener listener) {
        if (map == null) {
            map = new HashMap<>();
        }
        MultipartBody multipartBody = filesMultipar(map);
        baseApis.imagePost(url, multipartBody,headMap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getObserver(listener));
    }
    /**
     * 观察者
     */
    private Observer getObserver(final HttpListener listener) {
        Observer observer = new Observer<ResponseBody>() {
            @Override
            public void onCompleted() {

            }
            @Override
            public void onError(Throwable e) {
                if (listener != null) {
                    listener.onFail(e.getMessage());
                }
            }
            @Override
            public void onNext(ResponseBody responseBody) {
                try {
                    String data = responseBody.string();
                    if (null != listener) {
                        listener.onSuccess(data);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (listener != null) {
                        listener.onFail(e.getMessage());
                    }
                }
            }
        };
        return observer;
    }

    //定义接口
    public interface HttpListener {
        void onSuccess(String data);
        void onFail(String error);
    }
}
