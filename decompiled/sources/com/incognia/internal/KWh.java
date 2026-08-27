package com.incognia.internal;

import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class KWh {
    public static Long BGx() {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        try {
            return Long.valueOf(SystemClock.currentNetworkTimeClock().millis());
        } catch (Throwable unused) {
            return null;
        }
    }
}
