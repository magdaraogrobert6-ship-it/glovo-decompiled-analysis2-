package com.huawei.hms.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class Checker {
    private Checker() {
    }

    public static void assertHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
    }

    public static void assertNotUiThread(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
    }

    public static void assertUiThread(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(str);
    }

    public static <T> T assertNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static <T> T checkNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static int checkNonZero(int i, String str) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void assertNonEmpty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException(String.valueOf(str2));
        }
    }

    public static String checkNonEmpty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(str2));
        }
        return str;
    }

    public static long checkNotZero(long j, String str) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static <T> T assertNonNull(T t) {
        if (t != null) {
            return t;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null reference");
        return null;
    }

    public static <T> T checkNonNull(T t) {
        if (t != null) {
            return t;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null reference");
        return null;
    }

    public static int checkNonZero(int i) {
        if (i != 0) {
            return i;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Given Integer is zero");
        return 0;
    }

    public static void assertHandlerThread(Handler handler) {
        assertHandlerThread(handler, "Must be called on the handler thread");
    }

    public static void assertNonEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Given String is empty or null");
        }
    }

    public static String checkNonEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Given String is empty or null");
        return null;
    }

    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Given Long is zero");
        return 0L;
    }
}
