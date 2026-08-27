package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ContextHolder {
    private static final String TAG = "ContextHolder";

    @SuppressLint
    private static Context sAppContext;

    @SuppressLint
    private static Context sKitContext;

    public static Context getAppContext() {
        return sAppContext;
    }

    public static Context getKitContext() {
        return sKitContext;
    }

    public static void setKitContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sKitContext == null");
        sKitContext = context;
    }

    public static Context getResourceContext() {
        return getKitContext() != null ? getKitContext() : getAppContext();
    }

    public static void setAppContext(Context context) {
        if (sAppContext != null) {
            return;
        }
        CheckParamUtils.checkNotNull(context, "sAppContext == null");
        sAppContext = context.getApplicationContext();
    }
}
