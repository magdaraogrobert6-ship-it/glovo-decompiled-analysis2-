package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class CEN extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ CBQ BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((ZmT) obj);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CEN(CBQ cbq) {
        super(1);
        this.BGx = cbq;
    }

    public final void BGx(ZmT zmT) {
        CBQ cbq = this.BGx;
        O6.BGx(cbq, new Dd$$ExternalSyntheticLambda0(cbq, 1, zmT));
    }

    public static final void BGx(CBQ cbq, ZmT zmT) {
        MLu mLu = zmT.BGx;
        String str = CBQ.YO;
        cbq.BGx(mLu);
    }
}
