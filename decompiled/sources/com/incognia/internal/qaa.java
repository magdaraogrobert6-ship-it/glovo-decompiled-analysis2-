package com.incognia.internal;

import com.incognia.Incognia;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class qaa extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qaa(String str) {
        super(0);
        this.BGx = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("reportBusinessUnitId", new SV(this.BGx));
        return createFromParcel.INSTANCE;
    }
}
