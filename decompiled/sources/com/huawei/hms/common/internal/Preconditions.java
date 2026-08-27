package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class Preconditions {
    private static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <O> O checkNotNull(O o2, Object obj) {
        if (o2 != null) {
            return o2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    private Preconditions() {
        throw new AssertionError("Cannot use constructor to make a new instance");
    }

    public static void checkMainThread(String str) {
        if (a()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
    }

    public static void checkNotMainThread() {
        if (a()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Must not be called on the main application thread");
        }
    }

    public static <O> O checkNotNull(O o2) {
        if (o2 != null) {
            return o2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("must not refer to a null object");
        return null;
    }

    public static void checkHandlerThread(Handler handler) {
        checkHandlerThread(handler, "Must be called on the handler thread");
    }
}
