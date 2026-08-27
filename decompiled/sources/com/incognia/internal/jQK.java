package com.incognia.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jQK extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ar arVar = (ar) obj;
        CBQ cbq = (CBQ) this.MediaMetadataCompat;
        if (cbq.S) {
            cbq.N.BGx.put(arVar.BGx, arVar);
        }
        return createFromParcel.INSTANCE;
    }

    public jQK(CBQ cbq) {
        super(1, 0, CBQ.class, cbq, "onData", "onData(Lcom/incognia/internal/data/CollectableData;)V");
    }
}
