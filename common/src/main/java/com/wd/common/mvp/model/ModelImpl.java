package com.wd.common.mvp.model;


import android.content.Context;
import android.text.TextUtils;

import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.SPStaticUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.wd.common.network.RetrofitManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tang
 * @time 2019/2/26  20:31
 * @describe
 */
public class ModelImpl implements IModel {
    /**
     * 网络是否可用
     * */
    public  final String NET_WORK = "当前网络不可用，请检查网络状态";
    @Override
    public void getRequest(String url, Class clazz, MyCallBack myCallBack, Context context) {
        if(!NetworkUtils.isAvailableByPing()){
            myCallBack.onFail(NET_WORK);
        }else {
            RetrofitManager.getInstance().get(url, getSP(context), new RetrofitManager.HttpListener() {
                @Override
                public void onSuccess(String data) {
                    Object o = new Gson().fromJson(data, clazz);
                    if (myCallBack != null) {
                        myCallBack.onSuccess(o);
                    }
                }

                @Override
                public void onFail(String error) {
                    if (myCallBack != null) {
                        myCallBack.onFail(error);
                    }
                }
            });
        }
    }

    @Override
    public void postRequest(String url, Map<String, String> map, Class clazz, MyCallBack myCallBack, Context context) {
        if(!NetworkUtils.isAvailableByPing()){
            myCallBack.onFail(NET_WORK);
        }else {
            RetrofitManager.getInstance().post(url, map, getSP(context), new RetrofitManager.HttpListener() {
                @Override
                public void onSuccess(String data) {
                    Object o = new Gson().fromJson(data, clazz);
                    if (myCallBack != null) {
                        myCallBack.onSuccess(o);
                    }
                }

                @Override
                public void onFail(String error) {
                    myCallBack.onFail(error);
                }
            });
        }
    }

    @Override
    public void ImagePostrRequest(String url, Map<String, String> map, Class clazz, MyCallBack myCallBack, Context context) {
        if(!NetworkUtils.isAvailableByPing()){
            myCallBack.onFail(NET_WORK);
        }else {
            RetrofitManager.getInstance().imagePost(url, map, getSP(context), new RetrofitManager.HttpListener() {
                @Override
                public void onSuccess(String data) {
                    Object o = new Gson().fromJson(data, clazz);
                    if (myCallBack != null) {
                        myCallBack.onSuccess(o);
                    }
                }

                @Override
                public void onFail(String error) {
                    myCallBack.onFail(error);
                }
            });
        }
    }

    @Override
    public void deleteRequest(String url, Class clazz, MyCallBack myCallBack, Context context) {
        if(!NetworkUtils.isAvailableByPing()){
            myCallBack.onFail(NET_WORK);
        }else {
            RetrofitManager.getInstance().DELETE(url, getSP(context), new RetrofitManager.HttpListener() {
                @Override
                public void onSuccess(String data) {
                    Object o = new Gson().fromJson(data, clazz);
                    if (myCallBack != null) {
                        myCallBack.onSuccess(o);
                    }
                }

                @Override
                public void onFail(String error) {
                    myCallBack.onFail(error);
                }
            });
        }
    }

    @Override
    public void putRequest(String url, Map<String, String> map, Class clazz, MyCallBack myCallBack, Context context) {
        if(!NetworkUtils.isAvailableByPing()){
            myCallBack.onFail(NET_WORK);
        }else {
            RetrofitManager.getInstance().put(url, map, getSP(context), new RetrofitManager.HttpListener() {
                @Override
                public void onSuccess(String data) {
                    Object o = new Gson().fromJson(data, clazz);
                    if (myCallBack != null) {
                        myCallBack.onSuccess(o);
                    }
                }

                @Override
                public void onFail(String error) {
                    myCallBack.onFail(error);
                }
            });
        }
    }

    private Map getSP(Context context) {
        //context.getSharedPreferences("",Context.MODE_PRIVATE)
        String userId = SPUtils.getInstance().getString("userId");
        String sessionId = SPUtils.getInstance().getString("sessionId");
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("ak", "0110010010000");
        headerMap.put("Content-Type", "application/x-www-form-urlencoded");
        if (!TextUtils.isEmpty(userId) && !TextUtils.isEmpty(sessionId)) {
            headerMap.put("userId", userId);
            headerMap.put("sessionId", sessionId);
        }
        return headerMap;
    }
}
