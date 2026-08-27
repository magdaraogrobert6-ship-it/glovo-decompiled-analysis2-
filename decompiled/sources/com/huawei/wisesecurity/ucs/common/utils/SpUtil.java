package com.huawei.wisesecurity.ucs.common.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SpUtil {
    public static SharedPreferences IconCompatParcelizer;

    public static SharedPreferences getInstance(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SpUtil.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = context.createDeviceProtectedStorageContext().getSharedPreferences("ucs.sdk", 0);
            }
            sharedPreferences = IconCompatParcelizer;
        }
        return sharedPreferences;
    }

    public static void putInt(Context context, int i, String str) {
        getInstance(context).edit().putInt(str, i).apply();
    }

    public static void putString(Context context, String str, String str2) {
        getInstance(context).edit().putString(str, str2).apply();
    }
}
