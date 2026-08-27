package com.huawei.location.activity.util;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JniUtils {
    public static native int analysisData(float[] fArr, float[][] fArr2);

    public static native void freeBuffer();

    public static native int loadModelByAssets(Object obj, String str);
}
