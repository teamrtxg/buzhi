package com.wd.community.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wd.common.base.fragment.BaseNetFragment;
import com.wd.community.R;

import cn.bingoogolapple.refreshlayout.BGARefreshLayout;

/**
  * @作者 GXY
  * @创建日期 2019/3/1 15:57
  * @描述 社区页面
  *
  */
@Route(path = "/community/CommunityFragment")
public class CommunityFragment extends BaseNetFragment implements BGARefreshLayout.BGARefreshLayoutDelegate{
    @Override
    protected void netSuccess(Object object) {

    }

    @Override
    protected void netFail(String s) {

    }

    @Override
    protected int setView() {
        return R.layout.fragment_community;
    }

    @Override
    protected void initData() {

    }
    /**
     * 刷新
     * */
    @Override
    public void onBGARefreshLayoutBeginRefreshing(BGARefreshLayout refreshLayout) {

    }
    /**
     * 加载
     * */
    @Override
    public boolean onBGARefreshLayoutBeginLoadingMore(BGARefreshLayout refreshLayout) {
        return false;

    }
}
