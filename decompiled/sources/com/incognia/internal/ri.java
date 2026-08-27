package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class ri extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ KNe BGx;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        this.BGx.mbG.invoke(bool);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(KNe kNe) {
        super(2);
        this.BGx = kNe;
    }
}
