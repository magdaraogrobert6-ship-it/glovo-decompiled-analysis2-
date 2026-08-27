package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class SVT extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ B5 BGx;
    public final /* synthetic */ mO mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SVT(B5 b5, mO mOVar) {
        super(1);
        this.BGx = b5;
        this.mbG = mOVar;
    }

    public final void BGx(E3 e3) {
        B5 b5 = this.BGx;
        O6.BGx(b5, new Rq$$ExternalSyntheticLambda0(b5, e3, this.mbG, 3));
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((E3) obj);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(B5 b5, E3 e3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        b5.A1 = false;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(B5.S);
        }
    }
}
