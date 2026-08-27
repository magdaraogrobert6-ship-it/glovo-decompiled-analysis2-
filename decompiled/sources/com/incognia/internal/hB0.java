package com.incognia.internal;

import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hB0 {
    public static final AtomicInteger BGx = new AtomicInteger(1);

    public static HandlerThread BGx(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        HandlerThread handlerThread = new HandlerThread("ibgnd-" + BGx.getAndIncrement());
        handlerThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        handlerThread.start();
        return handlerThread;
    }
}
