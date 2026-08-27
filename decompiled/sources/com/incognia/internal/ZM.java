package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ZM implements PG {
    public boolean A1;
    public final NvL BGx;
    public final Rq HQ;
    public final bV N;
    public B74 VV3;
    public final onViewDetachedFromWindowlambda1 hIl;
    public B74 hs;
    public final UsU mbG;
    public Gbn q;
    public final yZI x;
    public static final String fZl = (String) W4i.ISd.MediaSessionCompatResultReceiverWrapper();
    public static final String S = (String) W4i.Dfr.MediaSessionCompatResultReceiverWrapper();
    public static final String iaH = (String) W4i.vO.MediaSessionCompatResultReceiverWrapper();
    public static final long e = 15000;
    public static final long VLD = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(ZM zm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        if (!zm.x.BGx()) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new Z9T((String) zm.hIl.MediaSessionCompatResultReceiverWrapper())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        zm.A1 = true;
        zm.q = null;
        zm.N.BGx(new OHI(zm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        zm.hs = zm.BGx(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        NvL nvL = zm.BGx;
        long jOptLong = ((JSONObject) nvL.BGx.get()).optLong(S, e);
        zm.VV3 = zm.HQ();
        NvL nvL2 = zm.BGx;
        long jOptLong2 = ((JSONObject) nvL2.BGx.get()).optLong(iaH, VLD);
        zm.mbG.BGx(jOptLong, zm.hs);
        zm.mbG.BGx(jOptLong2, zm.VV3);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.hIl.MediaSessionCompatResultReceiverWrapper();
    }

    public ZM(NvL nvL, UsU usU, Rq rq, bV bVVar, yZI yzi) {
        this.BGx = nvL;
        this.mbG = usU;
        this.HQ = rq;
        this.N = bVVar;
        this.x = yzi;
        Object[] objArr = {KaJ.BGx};
        this.hIl = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.A1 = true;
    }

    public final B74 HQ() {
        return new B74(new ZM$$ExternalSyntheticLambda2(0, this));
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.mbG.BGx(new ZM$$ExternalSyntheticLambda1(this, ltx, y0s, 0));
    }

    public final B74 BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new B74(new ZM$$ExternalSyntheticLambda0(this, 0, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final void BGx(ZM zm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Gbn gbn = zm.q;
        if (gbn != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(BGx(gbn, 2)));
        } else {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new jO(fZl)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static final void BGx(ZM zm) {
        zm.A1 = false;
    }

    public static tV BGx(Gbn gbn, int i) {
        if ((i & 1) != 0) {
            gbn = null;
        }
        if (gbn != null) {
            return new tV(fZl, new hvS(gbn, null));
        }
        return new tV(fZl, null);
    }
}
