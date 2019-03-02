package com.wd.message.fragment;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.fragment.BaseFragment;
import com.wd.message.R;
/**
 * @author YU
 * @date 2019/3/1 16:23
 * @descirbe 消息页面
 */
@Route(path = "/message/MessageFragment")
public class MessageFragment extends BaseFragment {
    @Override
    protected int setView() {
        return R.layout.fragment_message;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

    }
}
