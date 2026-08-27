package com.huawei.hms.framework.network.grs.g.j;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    private final Future<com.huawei.hms.framework.network.grs.g.d> a;
    private final long b = SystemClock.elapsedRealtime();

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.a;
    }

    public b(Future<com.huawei.hms.framework.network.grs.g.d> future) {
        this.a = future;
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.b <= 300000;
    }
}
