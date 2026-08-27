package com.mapbox.common;

/* JADX INFO: loaded from: classes5.dex */
public final class NativeExceptionController {
    public static final NativeExceptionController INSTANCE = new NativeExceptionController();

    private NativeExceptionController() {
    }

    public static final native boolean getRethrowNativeExceptions();

    public static final native void setRethrowNativeExceptions(boolean z);
}
