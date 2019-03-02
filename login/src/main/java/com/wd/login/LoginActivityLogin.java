package com.wd.login;

import android.os.Bundle;
import android.util.Log;

import com.wd.common.base.activity.BaseNetActivity;
import com.wd.common.base.activity.BaseTouchNetActivity;
import com.wd.common.base.util.RsaCoder;
import com.wd.common.network.Apis;
import com.wd.login.bean.LoginRegisterBean;

import java.util.HashMap;
import java.util.Map;

public class LoginActivityLogin extends BaseTouchNetActivity {
    @Override
    protected void netSuccess(Object object) {
        if(object instanceof LoginRegisterBean){
            LoginRegisterBean object1 = (LoginRegisterBean) object;
            Log.i("ttt",object1.getMessage());
        }
    }

    @Override
    protected void netFail(String s) {
        Log.i("ttt",s);
    }

    @Override
    protected int setView() {
        return R.layout.login_activity_login;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        Map<String,String>map = new HashMap<>();
        map.put("phone","18911474114");
        map.put("nickName","唐唐唐");
        String s="";
        try {
           s = RsaCoder.encryptByPublicKey("123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("pwd",s );
        doNetWorkPostRequest(Apis.URL_USER_LOGIN_POST,map, LoginRegisterBean.class);
    }

    @Override
    protected void initData() {

    }
}
