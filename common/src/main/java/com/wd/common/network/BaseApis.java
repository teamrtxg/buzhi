package com.wd.common.network;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 *  @author Tang
 *  @time 2019/2/26  19:49
 *  @describe 网络请求
 */
public interface BaseApis<E> {
    /**
     * Observable被观察者
     * */
    @GET
    Observable<ResponseBody> get(@Url String url, @HeaderMap Map<String, String> headMap);

    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String url, @FieldMap Map<String, String> map, @HeaderMap Map<String, String> headMap);

    @POST
    Observable<ResponseBody> imagePost(@Url String url, @Body MultipartBody multipartBody, @HeaderMap Map<String, String> headMap);

    @DELETE
    Observable<ResponseBody> delete(@Url String url, @HeaderMap Map<String, String> headMap);

    @PUT
    Observable<ResponseBody> put(@Url String url, @QueryMap Map<String, String> map, @HeaderMap Map<String, String> headMap);


}
