package com.incognia.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cgs extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        CBQ.BGx((CBQ) this.MediaMetadataCompat, ((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public cgs(CBQ cbq) {
        super(1, 0, CBQ.class, cbq, "onFinished", "onFinished(Ljava/lang/Object;)V");
    }
}
