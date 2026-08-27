package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class Ap7 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ String BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ((nn) obj).S = this.BGx;
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ap7(String str) {
        super(1);
        this.BGx = str;
    }
}
