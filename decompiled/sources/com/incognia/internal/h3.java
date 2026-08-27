package com.incognia.internal;

import android.os.SystemClock;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class h3 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ S3c BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        S3c s3c = this.BGx;
        ghL ghl = s3c.N;
        s3c.HQ.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ghl.getClass();
        Ay.BGx.BGx(ghl.BGx, Long.valueOf(jElapsedRealtime));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(S3c s3c) {
        super(0);
        this.BGx = s3c;
    }
}
