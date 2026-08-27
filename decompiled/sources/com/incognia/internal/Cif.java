package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: renamed from: com.incognia.internal.if, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Cif extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ long BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(long j) {
        super(0);
        this.BGx = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return SAF.BGx("generateRequestTokenWithStatusSync", this.BGx, false);
    }
}
