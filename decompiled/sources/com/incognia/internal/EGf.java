package com.incognia.internal;

import o.onItemDismiss;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EGf implements THn {
    public final /* synthetic */ bV BGx;

    public EGf(bV bVVar) {
        this.BGx = bVVar;
    }

    public static final void BGx(bV bVVar, Gbn gbn) {
        String str = bV.JR;
        if (gbn == null) {
            bVVar.getClass();
            return;
        }
        if (IET.BGx(gbn, bVVar.BGx(false, true))) {
            Gbn gbnQ = bV.q();
            Ay.BGx.BGx(bV.JR, gbn, hn.BGx);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = bVVar.iaH;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(bV.q()));
                bVVar.iaH = null;
                return;
            }
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0BGx = bVVar.BGx(gbn, gbnQ);
            boolean zBooleanValue = ((Boolean) onviewattachedtowindowlambda0BGx.serializer).booleanValue();
            MLu mLu = (MLu) onviewattachedtowindowlambda0BGx.write;
            if (!zBooleanValue || mLu == null) {
                return;
            }
            bVVar.HQ.BGx(new ZmT(mLu));
        }
    }

    @Override // com.incognia.internal.THn
    public final void BGx(Gbn gbn) {
        bV bVVar = this.BGx;
        O6.BGx(bVVar, new EGf$$ExternalSyntheticLambda1(bVVar, gbn, 0));
    }

    @Override // com.incognia.internal.THn
    public final void BGx(String str, boolean z) {
        bV bVVar = this.BGx;
        O6.BGx(bVVar, new EGf$$ExternalSyntheticLambda0(bVVar, str, z, 0));
    }

    public static final void BGx(bV bVVar, String str, boolean z) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        String str2 = bV.JR;
        if (z) {
            if (bVVar.fZl() && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = bVVar.iaH) != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(bV.q()));
                bVVar.iaH = null;
                return;
            } else {
                if (((JSONObject) bVVar.BGx.BGx.get()).optBoolean(bV.N6D, true)) {
                    bVVar.HQ.BGx(new ZmT(GQY.mbG));
                    return;
                }
                return;
            }
        }
        bVVar.getClass();
    }
}
