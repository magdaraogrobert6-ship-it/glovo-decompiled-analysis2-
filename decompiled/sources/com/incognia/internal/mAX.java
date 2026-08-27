package com.incognia.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class mAX {
    public final KWh BGx;
    public final long mbG;
    public Object N = null;
    public long HQ = 0;

    public mAX(KWh kWh, long j) {
        this.BGx = kWh;
        this.mbG = j;
    }

    public final boolean BGx() {
        if (this.N == null) {
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.HQ;
        return jElapsedRealtime < j || jElapsedRealtime - j >= this.mbG;
    }

    public final void BGx(Object obj) {
        this.BGx.getClass();
        this.HQ = SystemClock.elapsedRealtime();
        this.N = obj;
    }
}
