package com.wd.main.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wd.common.base.activity.BaseActivity;
import com.wd.main.R;
import com.wd.main.R2;

import butterknife.BindView;
import butterknife.ButterKnife;

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
    @BindView(R2.id.activity_text_information)
    TextView activityTextInformation;
    @BindView(R2.id.activity_text_message)
    TextView activityTextMessage;
    @BindView(R2.id.activity_text_community)
    TextView activityTextCommunity;
    private Fragment informationFragment;
    private Fragment messageFragment;
    private Fragment communityFragment;
    private Fragment myFragment;
    private FrameLayout drawerlayoutFrameLayout;

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
        drawerlayoutFrameLayout = findViewById(R.id.drawerlayout_fragment);
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
        myFragment = (Fragment) ARouter.getInstance().build("/main/MyFragment").navigation();
        //默认加载资讯页面fragment
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = supportFragmentManager.beginTransaction();
        transaction.add(R.id.activity_home_frame, informationFragment, informationFragment.getClass().getName());
        transaction.show(informationFragment);
        transaction.hide(messageFragment);
        transaction.hide(communityFragment);
        transaction.commit();
        //加载侧滑页
        FragmentManager drawFragmentManager = getSupportFragmentManager();
        FragmentTransaction drawTransaction = drawFragmentManager.beginTransaction();
        drawTransaction.add(R.id.drawerlayout_fragment, myFragment, myFragment.getClass().getName());
        drawTransaction.show(myFragment);
        drawTransaction.commit();


    }

    @Override
    protected void initData() {
        activityLinearInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager managerInformation = getSupportFragmentManager();
                FragmentTransaction transactionInformation = managerInformation.beginTransaction();
                if (managerInformation.findFragmentByTag(informationFragment.getClass().getName()) == null) {
                    transactionInformation.add(R.id.activity_home_frame, informationFragment, informationFragment.getClass().getName());
                }
                transactionInformation.show(informationFragment);
                transactionInformation.hide(messageFragment);
                transactionInformation.hide(communityFragment);
                transactionInformation.commit();


                activityImgInformation.setImageResource(R.mipmap.common_tab_informatiion_s);
                activityImgMessage.setImageResource(R.mipmap.common_tab_message_n);
                activityImgCommunity.setImageResource(R.mipmap.common_tab_community_n);

                activityTextInformation.setTextColor(getResources().getColor(R.color.homeColorAsh));
                activityTextMessage.setTextColor(getResources().getColor(R.color.homeColorThree));
                activityTextCommunity.setTextColor(getResources().getColor(R.color.homeColorThree));
            }
        });
        activityLinearMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //加载消息页面fragment
                FragmentManager managerMessage = getSupportFragmentManager();
                FragmentTransaction transactionMessage = managerMessage.beginTransaction();
                if (managerMessage.findFragmentByTag(messageFragment.getClass().getName()) == null) {
                    transactionMessage.add(R.id.activity_home_frame, messageFragment, messageFragment.getClass().getName());
                }
                transactionMessage.show(messageFragment);
                transactionMessage.hide(informationFragment);
                transactionMessage.hide(communityFragment);
                transactionMessage.commit();
                activityImgInformation.setImageResource(R.mipmap.common_tab_information_n);
                activityImgMessage.setImageResource(R.mipmap.common_tab_message_s);
                activityImgCommunity.setImageResource(R.mipmap.common_tab_community_n);

                activityTextInformation.setTextColor(getResources().getColor(R.color.homeColorThree));
                activityTextMessage.setTextColor(getResources().getColor(R.color.homeColorAsh));
                activityTextCommunity.setTextColor(getResources().getColor(R.color.homeColorThree));
            }
        });
        activityLinearCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //加载社区页面fragment
                FragmentManager managerCommunity = getSupportFragmentManager();
                FragmentTransaction transactionCommunity = managerCommunity.beginTransaction();
                if (managerCommunity.findFragmentByTag(communityFragment.getClass().getName()) == null) {
                    transactionCommunity.add(R.id.activity_home_frame, communityFragment, communityFragment.getClass().getName());
                }
                transactionCommunity.show(communityFragment);
                transactionCommunity.hide(informationFragment);
                transactionCommunity.hide(messageFragment);
                transactionCommunity.commit();
                activityImgInformation.setImageResource(R.mipmap.common_tab_information_n);
                activityImgMessage.setImageResource(R.mipmap.common_tab_message_n);
                activityImgCommunity.setImageResource(R.mipmap.common_tab_community_s);

                activityTextInformation.setTextColor(getResources().getColor(R.color.homeColorThree));
                activityTextMessage.setTextColor(getResources().getColor(R.color.homeColorThree));
                activityTextCommunity.setTextColor(getResources().getColor(R.color.homeColorAsh));
            }
        });
    }

}
