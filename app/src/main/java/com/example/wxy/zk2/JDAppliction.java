package com.example.wxy.zk2;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by WXY on 2018/6/16.
 */

public class JDAppliction extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
