package com.wd.main.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.wd.common.base.activity.BaseActivity;
import com.wd.common.base.util.IntentUtils;
import com.wd.main.R;
/**
 *启动页
 *@author Administrator
 *@time 2019/3/1 0001 16:19
 */
public class StartActivity extends BaseActivity {
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            IntentUtils.getInstence().intent(StartActivity.this,HomeActivity.class);
            finish();
        }
    };
    @Override
    protected void initP() {

    }

    @Override
    protected int setView() {
        return R.layout.activity_start;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        //延时3秒发送
        handler.sendEmptyMessageDelayed(0, 3000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }
}
