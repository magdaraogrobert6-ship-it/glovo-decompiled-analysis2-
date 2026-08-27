package com.incognia.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class iLf {
    public final Context BGx;

    public final boolean BGx(String str) {
        return this.BGx.checkCallingOrSelfPermission(str) == 0;
    }

    public iLf(Context context) {
        this.BGx = context;
    }
}
