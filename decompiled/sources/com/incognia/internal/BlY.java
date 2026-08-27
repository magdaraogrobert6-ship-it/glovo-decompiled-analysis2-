package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class BlY extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Ltx BGx;
    public final /* synthetic */ qo mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlY(Ltx ltx, qo qoVar) {
        super(1);
        this.BGx = ltx;
        this.mbG = qoVar;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        this.BGx.BGx(new sUe((String) this.mbG.mbG.MediaSessionCompatResultReceiverWrapper(), (zR) obj));
        return createFromParcel.INSTANCE;
    }
}
