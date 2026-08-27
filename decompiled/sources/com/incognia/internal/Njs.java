package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Njs extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public static final Njs BGx = new Njs();

    public Njs() {
        super(2);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(removeNodeAtDepth.read(((dCe) obj).HQ, ((dCe) obj2).HQ));
    }
}
