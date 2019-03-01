package com.wd.common.base.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.wd.common.application.ApplicationConText;
import com.wd.common.loading.CircularLoading;
import com.wd.common.mvp.presenter.PresenterImpl;
import com.wd.common.mvp.view.IView;

import java.util.Map;

public abstract class BaseMessageFragment extends BaseFragment implements IView {
    PresenterImpl presenter;
    private Dialog failDialog;
    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        presenter = new PresenterImpl(this);
    }
/**
 *  @author Tang
 *  @time 2019/2/27  15:07
 *  @describe get请求
 */
    /**
     * post请求
     */
    protected void doNetWorkPostRequest(String url, Map<String, String> map, Class clazz) {
        if (presenter != null) {
                presenter.requestPost(url, map, clazz,null);
        }
    }

    /**
     * get请求
     */
    protected void doNetWorkGetRequest(String url, Class clazz) {
        if (presenter != null) {
            presenter.requestGet(url, clazz,null);
        }
    }

    /**
     * 上传头像
     */
    protected void doNetWorkPostimagesRequest(String url, Map<String, String> map, Class
            clazz) {
        if (presenter != null) {
            presenter.imageRequestPost(url, map, clazz,null);
        }
    }


    protected void doNetWorkDeleteRequest(String url, Map<String, String> map, Class
            clazz) {
        if (presenter != null) {
            presenter.deleteRequest(url, clazz,null);
        }
    }
    /**
     * put请求
     */
    protected void doNetWorkPutRequest(String url, Map<String, String> map, Class
            clazz) {
        if (presenter != null) {
            presenter.putRequest(url, map, clazz,null);
        }
    }
    @Override
    public void requestSuccess(Object o) {
        netSuccess(o);
    }

    @Override
    public void requestFail(String error) {
        if (error.equals("当前网络不可用，请检查网络状态")) {
            if (failDialog == null) {
                failDialog = CircularLoading.getInstance().showFailDialog(ApplicationConText.getAppContext(), "糟糕，网络不给力呀！", true);
            }
        } else {
            if (failDialog != null) {
                CircularLoading.closeDialog(failDialog);
            }
            netFail(error);
        }
    }

    /**
     * 成功
     */
    protected abstract void netSuccess(Object object);

    /**
     * 失败
     */
    protected abstract void netFail(String s);
}
