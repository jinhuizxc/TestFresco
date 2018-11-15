package com.example.jinhui.testfresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/15.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
