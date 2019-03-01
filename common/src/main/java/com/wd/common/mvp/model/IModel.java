package com.wd.common.mvp.model;

import android.content.Context;

import java.util.Map;

/**
 * @author Tang
 * @time 2019/2/26  20:04
 * @describe 数据处理层
 */
public interface IModel {
    /**
     * get请求
     */
    void getRequest(String url, Class clazz, MyCallBack myCallBack, Context context);

    /**
     * post请求
     */
    void postRequest(String url, Map<String, String> map, Class clazz, MyCallBack myCallBack, Context context);

    /**
     * 上传头像
     */
    void ImagePostrRequest(String url, Map<String, String> map, Class clazz, MyCallBack myCallBack, Context context);

    /**
     * delete请求
     */
    void deleteRequest(String url, Class clazz, MyCallBack myCallBack, Context context);

    /**
     * put
     */
    void putRequest(String url, Map<String, String> map, Class clazz, MyCallBack myCallBack, Context context);
}
