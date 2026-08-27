package com.incognia.internal;

import com.incognia.Callback;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class It8 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Long BGx;
    public final /* synthetic */ Callback HQ;
    public final /* synthetic */ int mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public It8(Long l, int i, Callback callback) {
        super(0);
        this.BGx = l;
        this.mbG = i;
        this.HQ = callback;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int iBGx = E79.BGx("async_request_token_generation", null);
        Long l = this.BGx;
        SAF.BGx("generateRequestToken", l != null ? l.longValue() : 0L, true, new Qbd(iBGx, this.mbG, this.HQ));
        return createFromParcel.INSTANCE;
    }
}
