package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ND implements PG {
    public static final String hIl = (String) W4i.my.MediaSessionCompatResultReceiverWrapper();
    public static final long hs = 15000;
    public final Dp BGx;
    public final UsU HQ;
    public final onViewDetachedFromWindowlambda1 N;
    public final NvL mbG;
    public B74 x;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.N.MediaSessionCompatResultReceiverWrapper();
    }

    public ND(Dp dp, NvL nvL, UsU usU) {
        this.BGx = dp;
        this.mbG = nvL;
        this.HQ = usU;
        Object[] objArr = {P3.BGx};
        this.N = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    public static final void BGx(ND nd, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        nd.BGx.BGx(new Nrf(nd, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        nd.x = nd.BGx(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        NvL nvL = nd.mbG;
        nd.HQ.BGx(((JSONObject) nvL.BGx.get()).optLong(hIl, hs), nd.x);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.HQ.BGx(new Dd$$ExternalSyntheticLambda0(this, 6, ltx));
    }

    public final B74 BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new B74(new ND$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0, this));
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ND nd) {
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new jO((String) nd.N.MediaSessionCompatResultReceiverWrapper())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
