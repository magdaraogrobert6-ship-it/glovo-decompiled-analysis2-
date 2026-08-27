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
public final class Oc implements PG {
    public static final String hIl = (String) W4i.vZ.MediaSessionCompatResultReceiverWrapper();
    public static final long hs = 15000;
    public final NvL BGx;
    public final vb HQ;
    public final onViewDetachedFromWindowlambda1 N;
    public final UsU mbG;
    public B74 x;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.N.MediaSessionCompatResultReceiverWrapper();
    }

    public Oc(NvL nvL, UsU usU, vb vbVar) {
        this.BGx = nvL;
        this.mbG = usU;
        this.HQ = vbVar;
        Object[] objArr = {Sts.BGx};
        this.N = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    public static final void BGx(Oc oc, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        oc.HQ.BGx(new iES(oc, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        oc.x = oc.BGx(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        NvL nvL = oc.BGx;
        oc.mbG.BGx(((JSONObject) nvL.BGx.get()).optLong(hIl, hs), oc.x);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.mbG.BGx(new Dd$$ExternalSyntheticLambda0(this, 8, ltx));
    }

    public final B74 BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new B74(new ND$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 23, this));
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Oc oc) {
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new jO((String) oc.N.MediaSessionCompatResultReceiverWrapper())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
