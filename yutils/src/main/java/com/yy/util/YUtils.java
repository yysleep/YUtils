package com.yy.util;

import android.app.Application;

public class YUtils {

  static Application gApp;

  public static void init(Application app) {
    if (gApp != null) {
      return;
    }
    gApp = app;
    ToastUtil.init(app);
  }
}
