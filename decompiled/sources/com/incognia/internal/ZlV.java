package com.incognia.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ZlV {
    public final Context BGx;

    public final boolean BGx() {
        return (this.BGx.getApplicationInfo().flags & 2) != 0;
    }

    public ZlV(Context context) {
        this.BGx = context;
    }
}
