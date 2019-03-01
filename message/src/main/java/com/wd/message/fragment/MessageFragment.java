package com.wd.message.fragment;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.fragment.BaseFragment;
import com.wd.message.R;
@Route(path = "/message/MessageFragment")
public class MessageFragment extends BaseFragment {
    @Override
    protected int setView() {
        return R.layout.message_fragment;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

    }
}
