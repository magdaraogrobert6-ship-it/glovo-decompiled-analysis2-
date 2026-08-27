package com.google.android.gms.location;

import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class zza {
    private long zza = Long.MIN_VALUE;

    public final zza zza(long j) {
        accessgetSystemNavigationDowncp.write("intervalMillis can't be negative.", j >= 0);
        this.zza = j;
        return this;
    }

    public final zzb zzb() {
        accessgetSystemNavigationDowncp.serializer("Must set intervalMillis.", this.zza != Long.MIN_VALUE);
        return new zzb(this.zza, true, null, null, null, false, null, 0L, null);
    }
}
