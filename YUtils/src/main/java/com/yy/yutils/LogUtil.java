package com.yy.yutils;

import android.util.Log;


/**
 * @author yysleep
 */

public class LogUtil {

  private static final String F_TAG = "LogUtil-";
  private static final boolean DEBUG = true;

  public static void i(String tag, String content) {
    if (DEBUG && tag != null && content != null)
      Log.i(F_TAG + tag, content);
  }

  public static void d(String tag, String content) {
    if (DEBUG && tag != null && content != null)
      Log.d(F_TAG + tag, content);
  }

  public static void e(String tag, String content) {
    if (DEBUG && tag != null && content != null)
      Log.e(F_TAG + tag, content);
  }

  public static void e(String tag, String content, Throwable e) {
    if (DEBUG && tag != null && content != null)
      Log.e(F_TAG + tag, content, e);
  }

  public static void w(String tag, String content) {
    if (DEBUG && tag != null && content != null)
      Log.w(F_TAG + tag, content);
  }

  public static void w(String tag, String content, Throwable e) {
    if (DEBUG && tag != null && content != null)
      Log.w(F_TAG + tag, content, e);
  }
}
