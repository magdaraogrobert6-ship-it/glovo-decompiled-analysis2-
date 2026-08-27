package com.incognia.internal;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class HxI extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ String BGx;

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        c6J c6j = c6J.BGx;
        String str = this.BGx;
        synchronized (c6j) {
            mP mPVar = Ay.BGx;
            String str2 = c6J.mbG;
            nz0 nz0Var = (nz0) mPVar.BGx(c4.BGx, str2);
            if (nz0Var == null) {
                nz0Var = new nz0();
            }
            LinkedHashMap linkedHashMapWrite = onMove.write(nz0Var.BGx);
            Long l = (Long) linkedHashMapWrite.get(str);
            linkedHashMapWrite.put(str, Long.valueOf((l != null ? l.longValue() : 0L) + 1));
            mPVar.BGx(str2, new nz0(linkedHashMapWrite), adq.BGx);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HxI(String str) {
        super(0);
        this.BGx = str;
    }
}
