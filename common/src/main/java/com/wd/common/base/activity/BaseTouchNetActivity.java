package com.wd.common.base.activity;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public abstract class BaseTouchNetActivity extends BaseNetActivity {
    private MotionEvent mActionDownEvent;
    private VelocityTracker mVelocityTracker;



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (mVelocityTracker == null) {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(ev);

        if (ev.getActionMasked() == MotionEvent.ACTION_DOWN) {
            if (mActionDownEvent != null) {
                mActionDownEvent.recycle();
            }
            mActionDownEvent = MotionEvent.obtain(ev);  // 记录按下时的事件
        } else if (ev.getActionMasked() == MotionEvent.ACTION_UP) {
            // 右滑返回手势检测
            int pointerId = ev.getPointerId(0);
            int maximumFlingVelocity = ViewConfiguration.get(this).getScaledMaximumFlingVelocity();
            int minimumFlingVelocity = ViewConfiguration.get(this).getScaledMinimumFlingVelocity();
            mVelocityTracker.computeCurrentVelocity(1000, maximumFlingVelocity);
            final float velocityX = mVelocityTracker.getXVelocity(pointerId);

            if (mActionDownEvent.getX() <= 50  // 左边缘检测，可根据需要调整，单位像素
                    && ev.getX() - mActionDownEvent.getX() >= 300  // 有效触发距离，可根据需要调整，单位像素
                    && Math.abs(velocityX) >= minimumFlingVelocity) {
                onBackPressed(); // finish当前Activity
            }
        }

        return super.dispatchTouchEvent(ev);  // 分发控制还给Activity
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mVelocityTracker != null) {
            mVelocityTracker.recycle();
        }
    }


}
