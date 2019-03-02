package com.wd.community.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.fragment.BaseNetFragment;
import com.wd.community.R;
/**
  * @作者 GXY
  * @创建日期 2019/3/1 15:57
  * @描述 社区页面
  *
  */
@Route(path = "/community/CommunityFragment")
public class CommunityFragment extends BaseNetFragment {
    @Override
    protected void netSuccess(Object object) {

    }

    @Override
    protected void netFail(String s) {

    }

    @Override
    protected int setView() {
        return R.layout.community_fragment;
    }

    @Override
    protected void initData() {

    }

}
