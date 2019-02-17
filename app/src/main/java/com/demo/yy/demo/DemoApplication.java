package com.demo.yy.demo;

import android.app.Application;

import com.yy.yutils.YUtils;

public class DemoApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    YUtils.init(this);
  }
}
