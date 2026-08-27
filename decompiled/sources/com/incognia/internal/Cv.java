package com.incognia.internal;

import com.incognia.Incognia;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class Cv extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final Cv BGx = new Cv();

    public Cv() {
        super(0);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("clearAccountId", JDm.BGx);
        return createFromParcel.INSTANCE;
    }
}
