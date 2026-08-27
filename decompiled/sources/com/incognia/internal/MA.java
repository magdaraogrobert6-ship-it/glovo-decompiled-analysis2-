package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class MA extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Hwl BGx;
    public final /* synthetic */ String mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MA(Hwl hwl, String str) {
        super(0);
        this.BGx = hwl;
        this.mbG = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        this.BGx.hs.BGx(this.mbG);
        return createFromParcel.INSTANCE;
    }
}
