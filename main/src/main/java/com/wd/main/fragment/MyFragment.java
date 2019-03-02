package com.wd.main.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.fragment.BaseNetFragment;
import com.wd.main.R;

@Route(path = "/main/MyFragment")
public class MyFragment extends BaseNetFragment {
    @Override
    protected void netSuccess(Object object) {

    }

    @Override
    protected void netFail(String s) {

    }

    @Override
    protected int setView() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {

    }
}
