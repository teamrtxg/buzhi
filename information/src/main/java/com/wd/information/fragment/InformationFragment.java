package com.wd.information.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.fragment.BaseNetFragment;
import com.wd.information.R;
/**
 *资讯页
 *@author Administrator
 *@time 2019/3/1 0001 17:04
 */
@Route(path = "/information/InformationFragment")
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
