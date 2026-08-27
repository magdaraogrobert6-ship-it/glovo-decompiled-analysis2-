package com.incognia.internal;

import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class dO extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ZM BGx;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dO(ZM zm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(1);
        this.BGx = zm;
        this.mbG = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Object obj, ZM zm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (onItemDismiss.serializer(obj) != null) {
            B74 b74 = zm.hs;
            if (b74 == null || !b74.mbG.compareAndSet(0, 3)) {
                return;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(ZM.BGx(zm.q, 2)));
            return;
        }
        U9 u9 = (U9) obj;
        B74 b75 = zm.hs;
        if (b75 == null || !b75.mbG.compareAndSet(0, 3)) {
            return;
        }
        Gbn gbn = zm.q;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(gbn != null ? new tV(ZM.fZl, new hvS(gbn, u9)) : new tV(ZM.fZl, null)));
    }

    public final void BGx(Object obj) {
        ZM zm = this.BGx;
        zm.mbG.BGx(new Rq$$ExternalSyntheticLambda0(obj, zm, this.mbG, 4));
    }
}
