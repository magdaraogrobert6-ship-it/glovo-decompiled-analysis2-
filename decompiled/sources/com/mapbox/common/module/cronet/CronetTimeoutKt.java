package com.mapbox.common.module.cronet;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public final class CronetTimeoutKt {
    private static final long SECOND_AS_MILLISECONDS = 1000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nowMilliseconds() {
        return SystemClock.elapsedRealtime();
    }
}
