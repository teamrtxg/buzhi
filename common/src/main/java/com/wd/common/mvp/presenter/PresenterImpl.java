package com.wd.common.mvp.presenter;

import android.content.Context;

import com.wd.common.mvp.model.ModelImpl;
import com.wd.common.mvp.model.MyCallBack;
import com.wd.common.mvp.view.IView;

import java.util.Map;

/**
 * @author Tang
 * @time 2019/2/26  20:33
 * @describe
 */

public class PresenterImpl implements IPresenter {
    private IView mIView;
    private ModelImpl model;

    public PresenterImpl(IView iView) {
        mIView = iView;
        model = new ModelImpl();
    }

    /**
     * get请求
     */
    @Override
    public void requestGet(String url, Class clazz, Context context) {
        model.getRequest(url, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                mIView.requestSuccess(data);
            }

            @Override
            public void onFail(String error) {
                mIView.requestFail(error);
            }
        }, context);
    }

    /**
     * post请求
     */
    @Override
    public void requestPost(String url, Map<String, String> map, Class clazz, Context context) {
        model.postRequest(url, map, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                mIView.requestSuccess(data);
            }

            @Override
            public void onFail(String error) {
                mIView.requestFail(error);
            }
        }, context);
    }

    /**
     * 上传头像
     */
    @Override
    public void imageRequestPost(String url, Map<String, String> map, Class clazz, Context context) {
        model.ImagePostrRequest(url, map, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                mIView.requestSuccess(data);
            }

            @Override
            public void onFail(String error) {
                mIView.requestFail(error);
            }
        }, context);
    }

    @Override
    public void deleteRequest(String url, Class clazz, Context context) {
        model.deleteRequest(url, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                mIView.requestSuccess(data);
            }

            @Override
            public void onFail(String error) {
                mIView.requestFail(error);
            }
        }, context);
    }

    @Override
    public void putRequest(String url, Map<String, String> map, Class clazz, Context context) {
        model.putRequest(url, map, clazz, new MyCallBack() {
            @Override
            public void onSuccess(Object data) {
                mIView.requestSuccess(data);
            }

            @Override
            public void onFail(String error) {
                mIView.requestFail(error);
            }
        }, context);
    }


    public void onDetach() {
        if (mIView != null) {
            mIView = null;
        }
        if (model != null) {
            model = null;
        }
    }


}
