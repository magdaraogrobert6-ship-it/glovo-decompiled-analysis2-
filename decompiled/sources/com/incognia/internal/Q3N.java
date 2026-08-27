package com.incognia.internal;

import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q3N {
    public static final AtomicReference BGx = new AtomicReference(null);
    public static final AtomicReference mbG = new AtomicReference(null);

    public static void BGx() {
        AtomicReference atomicReference = BGx;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long startUptimeMillis = Process.getStartUptimeMillis();
        while (!atomicReference.compareAndSet(null, Long.valueOf(jUptimeMillis - startUptimeMillis)) && atomicReference.get() == null) {
        }
        AtomicReference atomicReference2 = mbG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!atomicReference2.compareAndSet(null, Long.valueOf(jCurrentTimeMillis)) && atomicReference2.get() == null) {
        }
    }
}
