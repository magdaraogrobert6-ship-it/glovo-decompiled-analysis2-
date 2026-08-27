package com.incognia.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class IUD extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ boolean BGx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IUD(boolean z) {
        super(0);
        this.BGx = z;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        yZI yzi = ((Jz) oV.mbG()).N6D;
        boolean z = this.BGx;
        if (!Boolean.valueOf(z).equals((Boolean) yzi.BGx.get())) {
            Ay.BGx.BGx(yZI.N, Boolean.valueOf(z));
            yzi.BGx.set(Boolean.valueOf(z));
            Iterator it = yzi.HQ.iterator();
            while (it.hasNext()) {
                ((g6v) it.next()).BGx(z);
            }
        }
        return createFromParcel.INSTANCE;
    }
}
