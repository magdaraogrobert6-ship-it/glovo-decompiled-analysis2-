package com.huawei.riemann.location.gwivdr.utils;

import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorCodeManager {
    private static final Object LOCK = new Object();
    private static final String TAG = "ErrorCodeManager";
    private static volatile int errorCode;

    public static int getErrorCode() {
        return errorCode;
    }

    public static void setErrorCode(int i) {
        synchronized (LOCK) {
            if (errorCode != i) {
                WrappedCompositionsetContent1211.read();
                errorCode = i;
            }
        }
    }

    public String toString() {
        return "ErrorCodeManager{}";
    }
}
