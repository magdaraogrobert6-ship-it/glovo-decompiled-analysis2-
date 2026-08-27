package com.incognia.internal;

import android.os.SystemClock;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class UfY extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ CBQ BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws JSONException {
        R1 r1 = this.BGx.fZl.N;
        if (r1 != null) {
            r1.hIl.compareAndSet(false, true);
        }
        this.BGx.N.BGx.clear();
        CBQ cbq = this.BGx;
        cbq.S = false;
        cbq.TfN = null;
        cbq.e = false;
        cbq.VLD = false;
        cbq.n = null;
        cbq.l5.clear();
        CBQ cbq2 = this.BGx;
        cbq2.l5.addAll(cbq2.vM);
        this.BGx.vM.clear();
        this.BGx.hIl.getClass();
        Ay.HQ.BGx(CBQ.Ft, Long.valueOf(SystemClock.elapsedRealtime()));
        CBQ cbq3 = this.BGx;
        if (cbq3.iaH) {
            cbq3.iaH = false;
            cbq3.BGx((MLu) null);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UfY(CBQ cbq) {
        super(0);
        this.BGx = cbq;
    }
}
