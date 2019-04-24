package com.example.bugdemo;

import android.app.Application;

import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import cat.ereza.customactivityoncrash.config.CaocConfig;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CaocConfig.Builder.create()
                .backgroundMode(CaocConfig.BACKGROUND_MODE_CRASH) //default: CaocConfig.BACKGROUND_MODE_SHOW_CUSTOM
                .restartActivity(MainActivity.class) //default: null (your app's launch activity)
                .errorActivity(DefaultErrorActivity.class) //default: null (default error activity)
                .apply();
    }
}
