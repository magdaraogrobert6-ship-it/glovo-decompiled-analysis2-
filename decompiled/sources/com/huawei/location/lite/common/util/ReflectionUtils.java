package com.huawei.location.lite.common.util;

import o.WrappedCompositionsetContent1211;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReflectionUtils {
    public static Class getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            WrappedCompositionsetContent1211.read("ReflectionUtils", "className not found:".concat(str));
            return null;
        }
    }
}
