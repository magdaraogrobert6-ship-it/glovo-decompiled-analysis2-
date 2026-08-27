package com.incognia.internal;

import com.incognia.Incognia;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class i01 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(String str) {
        super(0);
        this.BGx = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("setAccountId", new ZDo(this.BGx));
        return createFromParcel.INSTANCE;
    }
}
