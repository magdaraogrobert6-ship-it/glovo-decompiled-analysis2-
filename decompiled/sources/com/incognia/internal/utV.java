package com.incognia.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class utV {
    public final UsU BGx;
    public final LinkedHashMap mbG = new LinkedHashMap();
    public final LinkedHashMap HQ = new LinkedHashMap();

    public static final void BGx(utV utv, Class cls, SVJ svj) {
        Set linkedHashSet = (Set) utv.mbG.get(cls);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            utv.mbG.put(cls, linkedHashSet);
        }
        linkedHashSet.add(svj);
        Object obj = utv.HQ.get(cls);
        LmG lmG = obj instanceof LmG ? (LmG) obj : null;
        if (lmG != null) {
            BGx(svj, lmG);
        }
    }

    public static final void mbG(utV utv, Class cls, SVJ svj) {
        Set set = (Set) utv.mbG.get(cls);
        if (set != null) {
            set.remove(svj);
        }
        if (set == null || !set.isEmpty()) {
            return;
        }
        utv.mbG.remove(cls);
    }

    public utV(UsU usU) {
        this.BGx = usU;
    }

    public final void mbG(Class cls, SVJ svj) {
        this.BGx.BGx(new Rq$$ExternalSyntheticLambda0(this, cls, svj, 6));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    public static final void mbG(SVJ svj, LmG lmG) {
        svj.HQ.invoke(lmG);
    }

    public final void BGx(LmG lmG) {
        this.BGx.BGx(new Dd$$ExternalSyntheticLambda0(lmG, 15, this));
    }

    public static final void BGx(LmG lmG, boolean z, utV utv) {
        Class<?> cls = lmG.getClass();
        if (z) {
            utv.HQ.put(cls, lmG);
        }
        Set set = (Set) utv.mbG.get(cls);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                BGx((SVJ) it.next(), lmG);
            }
        }
    }

    public final void BGx(Class cls, SVJ svj) {
        this.BGx.BGx(new ZM$$ExternalSyntheticLambda1(this, cls, svj, 5));
    }

    public static void BGx(SVJ svj, LmG lmG) {
        svj.mbG.BGx(new Dd$$ExternalSyntheticLambda0(svj, 16, lmG));
    }
}
