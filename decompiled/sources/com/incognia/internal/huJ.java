package com.incognia.internal;

import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class huJ implements THn {
    public final /* synthetic */ bV BGx;

    @Override // com.incognia.internal.THn
    public final void BGx(String str, boolean z) {
    }

    public huJ(bV bVVar) {
        this.BGx = bVVar;
    }

    public static final void BGx(bV bVVar, Gbn gbn) {
        String str = bV.JR;
        Ms msBGx = bVVar.BGx(true, true);
        bVVar.e--;
        if (bVVar.iaH == null) {
            if (gbn == null || !IET.BGx(gbn, msBGx)) {
                return;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0BGx = bVVar.BGx(gbn, bV.q());
            boolean zBooleanValue = ((Boolean) onviewattachedtowindowlambda0BGx.serializer).booleanValue();
            MLu mLu = (MLu) onviewattachedtowindowlambda0BGx.write;
            if (zBooleanValue && mLu != null) {
                bVVar.HQ.BGx(new ZmT(mLu));
            }
            Ay.BGx.BGx(bV.JR, gbn, hn.BGx);
            return;
        }
        Object obj = null;
        if (gbn != null && IET.BGx(gbn, msBGx)) {
            Ay.BGx.BGx(bV.JR, gbn, hn.BGx);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = bVVar.iaH;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(bV.q()));
            }
            bVVar.iaH = null;
            return;
        }
        if (bVVar.e == 0) {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = bVVar.iaH;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(new onItemDismiss(obj));
            }
            bVVar.iaH = null;
        }
    }

    @Override // com.incognia.internal.THn
    public final void BGx(Gbn gbn) {
        bV bVVar = this.BGx;
        O6.BGx(bVVar, new EGf$$ExternalSyntheticLambda1(bVVar, gbn, 1));
    }
}
