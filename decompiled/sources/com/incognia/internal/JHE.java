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
public final class JHE implements PG {
    public final NvL BGx;
    public final yDo HQ;
    public final yZI N;
    public B74 hIl;
    public final UsU mbG;
    public final onViewDetachedFromWindowlambda1 x;
    public static final String hs = (String) W4i.Uvi.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.Ux.MediaSessionCompatResultReceiverWrapper();
    public static final String A1 = (String) W4i.mFD.MediaSessionCompatResultReceiverWrapper();
    public static final long q = 15000;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(JHE jhe, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (!jhe.N.BGx()) {
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(new Z9T((String) jhe.x.MediaSessionCompatResultReceiverWrapper())), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            return;
        }
        jhe.HQ.BGx(new yXu(jhe, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
        jhe.hIl = BGx(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        NvL nvL = jhe.BGx;
        jhe.mbG.BGx(((JSONObject) nvL.BGx.get()).optLong(VV3, q), jhe.hIl);
    }

    public static final void mbG(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        af$$ExternalSyntheticOutline0.m(new isItemDismissable(new jO(hs)), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public JHE(NvL nvL, UsU usU, yDo ydo, yZI yzi) {
        this.BGx = nvL;
        this.mbG = usU;
        this.HQ = ydo;
        this.N = yzi;
        Object[] objArr = {D1X.BGx};
        this.x = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.x.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.mbG.BGx(new Dd$$ExternalSyntheticLambda0(this, 4, ltx));
    }

    public static B74 BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new B74(new JHE$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0));
    }
}
