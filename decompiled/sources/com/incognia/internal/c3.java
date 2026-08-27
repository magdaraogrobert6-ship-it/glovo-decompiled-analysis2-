package com.incognia.internal;

import com.incognia.Callback;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class c3 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int BGx;
    public final /* synthetic */ String HQ;
    public final /* synthetic */ Callback mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(int i, Callback callback, String str) {
        super(0);
        this.BGx = i;
        this.mbG = callback;
        this.HQ = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        UsU usU = E79.BGx;
        E79.HQ(this.BGx);
        this.mbG.onCompleted(this.HQ);
        return createFromParcel.INSTANCE;
    }
}
