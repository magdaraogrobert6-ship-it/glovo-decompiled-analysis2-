package com.incognia.internal;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class tUC implements PG {
    public final Jpu BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final UsU mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(tUC tuc, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new X((String) tuc.HQ.MediaSessionCompatResultReceiverWrapper(), tuc.BGx.BGx())));
        } catch (Throwable th) {
            if (th instanceof Exception) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new X((String) tuc.HQ.MediaSessionCompatResultReceiverWrapper(), new jrj(null, null, bKM.BGx(th), null, 11))));
            } else {
                af$$ExternalSyntheticOutline0.m(new isItemDismissable(th), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        }
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public tUC(Jpu jpu, UsU usU) {
        this.BGx = jpu;
        this.mbG = usU;
        Object[] objArr = {IfI.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.mbG.BGx(new N6$$ExternalSyntheticLambda0(this, ltx, 27));
    }
}
