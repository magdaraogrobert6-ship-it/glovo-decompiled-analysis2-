package com.incognia.internal;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class r55 {
    public static Du BGx(ActivityManager.MemoryInfo memoryInfo) {
        return new Du(Long.valueOf(memoryInfo.totalMem), XUh.BGx(XUh.BGx, 34, 0, 2) ? Long.valueOf(memoryInfo.advertisedMem) : null);
    }
}
