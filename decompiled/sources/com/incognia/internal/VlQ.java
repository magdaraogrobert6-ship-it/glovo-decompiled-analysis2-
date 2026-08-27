package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class VlQ extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ uEN BGx;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        List list = (List) obj2;
        uEN uen = this.BGx;
        if (uen != null) {
            uen.BGx(zBooleanValue, list);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VlQ(uEN uen) {
        super(2);
        this.BGx = uen;
    }
}
