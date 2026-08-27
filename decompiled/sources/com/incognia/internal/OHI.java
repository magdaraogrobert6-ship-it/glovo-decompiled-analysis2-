package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class OHI extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ZM BGx;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM HQ;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OHI(ZM zm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        super(1);
        this.BGx = zm;
        this.mbG = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.HQ = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Object obj, ZM zm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            B74 b74 = zm.hs;
            if (b74 == null || !b74.mbG.compareAndSet(0, 3)) {
                return;
            }
            B74 b75 = zm.VV3;
            if (b75 != null) {
                b75.mbG.compareAndSet(0, 3);
            }
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(thSerializer), r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            return;
        }
        Gbn gbn = (Gbn) obj;
        B74 b76 = zm.hs;
        if (b76 == null || b76.mbG.get() == 2) {
            return;
        }
        B74 b77 = zm.VV3;
        if (b77 != null) {
            b77.mbG.compareAndSet(0, 3);
        }
        if (gbn == null) {
            B74 b78 = zm.hs;
            if (b78 != null) {
                b78.mbG.compareAndSet(0, 3);
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(new onItemDismiss(ZM.BGx((Gbn) null, 3)));
            return;
        }
        if (gbn.x) {
            B74 b79 = zm.hs;
            if (b79 != null) {
                b79.mbG.compareAndSet(0, 3);
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(new onItemDismiss(ZM.BGx(gbn, 2)));
            return;
        }
        if (zm.A1) {
            zm.q = gbn;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(ZM.BGx(gbn, 2));
            zm.HQ.BGx(gbn, new dO(zm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2));
        } else {
            B74 b710 = zm.hs;
            if (b710 != null) {
                b710.mbG.compareAndSet(0, 3);
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(new onItemDismiss(ZM.BGx(gbn, 2)));
        }
    }

    public final void BGx(Object obj) {
        ZM zm = this.BGx;
        zm.mbG.BGx(new OHI$$ExternalSyntheticLambda0(obj, zm, this.mbG, this.HQ, 0));
    }
}
