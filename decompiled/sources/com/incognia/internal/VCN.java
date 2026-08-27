package com.incognia.internal;

import com.incognia.Incognia;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class VCN extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ boolean BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VCN(boolean z) {
        super(0);
        this.BGx = z;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("setLocationEnabled", new IUD(this.BGx));
        return createFromParcel.INSTANCE;
    }
}
