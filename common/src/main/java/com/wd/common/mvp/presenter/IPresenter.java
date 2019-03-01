package com.wd.common.mvp.presenter;

import android.content.Context;

import java.util.Map;

/**
  * @作者 GXY
  * @创建日期 2019/1/23 18:41
  * @描述 p层接口
  *
  */

public interface IPresenter {
    /**
     * get请求
     * */
    void requestGet(String url, Class clazz, Context context);
    /**
     * post请求
     * */
    void requestPost(String url, Map<String, String> map, Class clazz,Context context);
    /***
     * 上传头像
     */
    void imageRequestPost(String url, Map<String, String> map, Class clazz,Context context);
    /**
     * delete请求
     */
    void deleteRequest(String url, Class clazz, Context context);
    /**
     * put
     */
    void putRequest(String url, Map<String, String> map, Class clazz, Context context);


}
