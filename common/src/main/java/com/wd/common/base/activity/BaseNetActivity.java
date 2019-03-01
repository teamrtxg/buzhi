package com.wd.common.base.activity;

import android.app.Dialog;
import com.wd.common.loading.CircularLoading;
import com.wd.common.mvp.presenter.PresenterImpl;
import com.wd.common.mvp.view.IView;

import java.util.Map;

public abstract class BaseNetActivity extends BaseActivity implements IView {

    private PresenterImpl presenter;
    private Dialog loadDialog;
    private Dialog failDialog;

    @Override
    protected void initP() {
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
            //TODO:弹出等待的loding圈
            if (loadDialog == null) {
                loadDialog = CircularLoading.getInstance().showLoadDialog(this, true);
                presenter.requestPost(url, map, clazz, null);
            }
        }
    }

    /**
     * get请求
     */
    protected void doNetWorkGetRequest(String url, Class clazz) {
        if (presenter != null) {
            //TODO:弹出等待的loding圈
            if (loadDialog == null) {
                loadDialog = CircularLoading.getInstance().showLoadDialog(this, true);
            }
            presenter.requestGet(url, clazz, null);
        }
    }

    /**
     * 上传头像
     */
    protected void doNetWorkPostimagesRequest(String url, Map<String, String> map, Class
            clazz) {
        if (presenter != null) {
            if (loadDialog == null) {
                loadDialog = CircularLoading.getInstance().showLoadDialog(this, true);
            }
            presenter.imageRequestPost(url, map, clazz, null);
        }
    }

    /**
     * delete
     *
     * @param o
     */
    protected void doNetWorkDeleteRequest(String url, Map<String, String> map, Class
            clazz) {
        if (presenter != null) {
            if (loadDialog == null) {
                loadDialog = CircularLoading.getInstance().showLoadDialog(this, true);
            }
            presenter.deleteRequest(url, clazz, null);
        }
    }

    /**
     * put请求
     */
    protected void doNetWorkPutRequest(String url, Map<String, String> map, Class
            clazz) {
        if (presenter != null) {
            if (loadDialog == null) {
                loadDialog = CircularLoading.getInstance().showLoadDialog(this, true);
            }
            presenter.putRequest(url, map, clazz, null);
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

    /***
     * 解绑防止
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.onDetach();
        }
    }

    @Override
    public void requestFail(String error) {
        if (error.equals("当前网络不可用，请检查网络状态")) {
            if (failDialog == null) {
                failDialog = CircularLoading.getInstance().showFailDialog(this, "糟糕，网络不给力呀！", true);
            }
        } else {
            if (failDialog != null) {
                CircularLoading.closeDialog(failDialog);
            }
            netFail(error);
        }
    }

    @Override
    public void requestSuccess(Object o) {
        CircularLoading.closeDialog(loadDialog);
        CircularLoading.closeDialog(failDialog);
        netSuccess(o);
    }
}