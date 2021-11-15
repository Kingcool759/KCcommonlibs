package com.kc.commonlibs.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * created by zhaojianwei03
 * on 2021-11-15
 * at 12:06 PM
 */
public class ToastUtils {

    public static void showLongToast(Context content, String msg) {
        Toast.makeText(content,msg,Toast.LENGTH_LONG).show();
    }
    public static void showShortToast(Context content, String msg) {
        Toast.makeText(content,msg,Toast.LENGTH_SHORT).show();
    }
}
