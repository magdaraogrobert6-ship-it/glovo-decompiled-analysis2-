package com.incognia.internal;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class R1 {
    public final UsU BGx;
    public final Lambda HQ;
    public int N;
    public final ArrayList mbG;
    public final AtomicBoolean hIl = new AtomicBoolean(false);
    public final AtomicBoolean hs = new AtomicBoolean(false);
    public final y9X x = new Q$$ExternalSyntheticLambda1(8, this);

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.Lambda, o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0] */
    public static final void BGx(R1 r1) {
        if (r1.hIl.get()) {
            return;
        }
        int i = r1.N + 1;
        r1.N = i;
        boolean z = i >= r1.mbG.size();
        r1.HQ.invoke(Integer.valueOf(r1.N), Boolean.valueOf(z));
        if (z) {
            r1.hs.compareAndSet(false, true);
            return;
        }
        y9X y9x = r1.x;
        if (y9x != null) {
            r1.BGx.BGx(((Number) r1.mbG.get(r1.N)).longValue(), y9x);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public R1(UsU usU, ArrayList arrayList, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.BGx = usU;
        this.mbG = arrayList;
        this.HQ = (Lambda) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
