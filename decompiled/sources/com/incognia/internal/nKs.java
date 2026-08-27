package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class nKs extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ B5 BGx;
    public final /* synthetic */ mO mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nKs(B5 b5, mO mOVar) {
        super(1);
        this.BGx = b5;
        this.mbG = mOVar;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((jP7) obj);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(jP7 jp7, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, B5 b5) {
        if (jp7 == null) {
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(B5.S);
            }
            b5.A1 = false;
        } else {
            B5.BGx(b5, jp7);
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(B5.S);
            }
            b5.A1 = false;
        }
    }

    public final void BGx(jP7 jp7) {
        B5 b5 = this.BGx;
        O6.BGx(b5, new Rq$$ExternalSyntheticLambda0((Object) jp7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.mbG, (Object) b5, 5));
    }
}
