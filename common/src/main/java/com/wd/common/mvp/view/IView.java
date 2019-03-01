package com.wd.common.mvp.view;

public interface IView<E> {
    void requestSuccess(E e);
    void requestFail(String error);
}
