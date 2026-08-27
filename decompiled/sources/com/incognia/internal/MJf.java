package com.incognia.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MJf extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        CBQ cbq = (CBQ) this.MediaMetadataCompat;
        if (zBooleanValue) {
            cbq.getClass();
            mP mPVar = Ay.HQ;
            String str = CBQ.Y;
            Long lN = mPVar.N(str);
            mPVar.BGx(str, Long.valueOf((lN != null ? lN.longValue() : 0L) + 1));
            cbq.BGx(hX.BGx, new UfY(cbq));
        } else if (!cbq.e) {
            cbq.BGx(Z0.BGx, PTj.BGx);
            UsU usU = E79.BGx;
            cbq.j = E79.BGx(CBQ.mQ, null);
        }
        return createFromParcel.INSTANCE;
    }

    public MJf(CBQ cbq) {
        super(1, 0, CBQ.class, cbq, "onTimeoutStep", "onTimeoutStep(Z)V");
    }
}
