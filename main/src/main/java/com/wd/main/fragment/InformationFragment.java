package com.wd.main.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.fragment.BaseNetFragment;
import com.wd.main.R;
@Route(path = "/main/InformationFragment")
public class InformationFragment extends BaseNetFragment {
    @Override
    protected void netSuccess(Object object) {

    }

    @Override
    protected void netFail(String s) {

    }

    @Override
    protected int setView() {
        return R.layout.fragment_information;
    }

    @Override
    protected void initData() {

    }
}
