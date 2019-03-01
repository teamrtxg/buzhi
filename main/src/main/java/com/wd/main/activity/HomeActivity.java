package com.wd.main.activity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wd.common.base.activity.BaseActivity;
import com.wd.main.R;
import com.wd.main.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 首页Activity
 *
 * @author Administrator
 * @time 2019/3/1 0001 15:49
 */
public class HomeActivity extends BaseActivity {


    @BindView(R2.id.activity_home_frame)
    FrameLayout activityHomeFrame;
    @BindView(R2.id.activity_home_line_text)
    TextView activityHomeLineText;
    @BindView(R2.id.activity_img_information)
    ImageView activityImgInformation;
    @BindView(R2.id.activity_linear_information)
    LinearLayout activityLinearInformation;
    @BindView(R2.id.activity_img_message)
    ImageView activityImgMessage;
    @BindView(R2.id.activity_linear_message)
    LinearLayout activityLinearMessage;
    @BindView(R2.id.activity_img_community)
    ImageView activityImgCommunity;
    @BindView(R2.id.activity_linear_community)
    LinearLayout activityLinearCommunity;
    @BindView(R2.id.activity_home_ll)
    LinearLayout activityHomeLl;
    private Fragment informationFragment;
    private Fragment messageFragment;
    private Fragment communityFragment;
    private FragmentTransaction transactionInformation;
    private FragmentTransaction transactionMessage;
    private FragmentTransaction transactionCommunity;
    private FragmentManager managerMessage;
    private FragmentManager managerCommunity;
    private FragmentManager managerInformation;

    @Override
    protected void initP() {

    }

    @Override
    protected int setView() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        ButterKnife.bind(this);
        //加载fragment
        getFragment();

    }

    /**
     * 加载fragment
     *
     * @author Administrator
     * @time 2019/3/1 0001 17:55
     */
    private void getFragment() {
        informationFragment = (Fragment) ARouter.getInstance().build("/information/InformationFragment").navigation();
        messageFragment = (Fragment) ARouter.getInstance().build("/message/MessageFragment").navigation();
        communityFragment = (Fragment) ARouter.getInstance().build("/community/CommunityFragment").navigation();
        //默认加载资讯页面fragment
        managerInformation = getSupportFragmentManager();
        transactionInformation = managerInformation.beginTransaction();
        transactionInformation.add(R.id.activity_home_frame, informationFragment, informationFragment.getClass().getName()).commit();
        //加载消息页面fragment
        managerMessage = getSupportFragmentManager();
        transactionMessage = managerMessage.beginTransaction();
        //加载社区页面fragment
        managerCommunity = getSupportFragmentManager();
        transactionCommunity = managerCommunity.beginTransaction();

    }

    @Override
    protected void initData() {
        activityLinearInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (managerInformation.findFragmentByTag(informationFragment.getClass().getName()) == null){
                    transactionInformation.add(R.id.activity_home_frame, informationFragment, informationFragment.getClass().getName()).commit();
            }
                transactionInformation.show(informationFragment);
                transactionMessage.hide(messageFragment);
                transactionCommunity.hide(communityFragment);
            }
        });
        activityLinearMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (managerMessage.findFragmentByTag(messageFragment.getClass().getName()) == null) {
                transactionMessage.add(R.id.activity_home_frame, messageFragment, messageFragment.getClass().getName()).commit();
                 }
                transactionMessage.show(messageFragment);
                transactionInformation.hide(informationFragment);
                transactionCommunity.hide(communityFragment);
            }
        });
        activityLinearCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if (managerCommunity.findFragmentByTag(communityFragment.getClass().getName()) == null) {
                transactionCommunity.add(R.id.activity_home_frame, communityFragment, communityFragment.getClass().getName()).commit();
                }
                transactionCommunity.show(communityFragment);
                transactionInformation.hide(informationFragment);
                transactionMessage.hide(messageFragment);
            }
        });
    }


}
