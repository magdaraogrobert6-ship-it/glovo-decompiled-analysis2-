package com.incognia.internal;

import android.os.health.SystemHealthManager;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MPs extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ tG BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return (SystemHealthManager) this.BGx.BGx.getSystemService("systemhealth");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPs(tG tGVar) {
        super(0);
        this.BGx = tGVar;
    }
}
