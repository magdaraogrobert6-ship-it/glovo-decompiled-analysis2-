package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class cqI extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ bV BGx;
    public final /* synthetic */ long mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqI(bV bVVar, long j) {
        super(1);
        this.BGx = bVVar;
        this.mbG = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        this.BGx.VV3.getClass();
        return Boolean.valueOf(System.currentTimeMillis() - ((Gbn) obj).N <= this.mbG);
    }
}
