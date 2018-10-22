package com.yy.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/**
 * @author YySleep
 */

public class ToastUtil {

  private static volatile Toast sToast;

  private static Handler sHandler = new Handler(Looper.getMainLooper());

  @SuppressLint("ShowToast")
  public static void toast(final String content) {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      sToast.setText(content);
      sToast.show();
    } else {
      sHandler.post(new Runnable() {
        @Override
        public void run() {
          sToast.setText(content);
          sToast.show();
        }
      });
    }
  }

  @SuppressLint("ShowToast")
  static void init(Application app) {
    if (sToast == null) {
      synchronized (ToastUtil.class) {
        if (sToast == null) {
          sToast = Toast.makeText(app.getApplicationContext(), "", Toast.LENGTH_SHORT);
        }
      }
    }
  }

}
