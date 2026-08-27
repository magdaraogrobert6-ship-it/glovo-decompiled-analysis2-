package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class So implements PG {
    public final Tj BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final UsU mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, So so) {
        Object isitemdismissable;
        Boolean bool;
        try {
            Tj tj = so.BGx;
            synchronized (tj) {
                w wVar = tj.mbG;
                if (wVar != null) {
                    bool = wVar.mbG;
                } else {
                    w wVarHQ = tj.HQ();
                    tj.mbG = wVarHQ;
                    if (wVarHQ != null) {
                        bool = wVarHQ.mbG;
                    } else {
                        bool = null;
                    }
                }
            }
            isitemdismissable = new JWV((String) so.HQ.MediaSessionCompatResultReceiverWrapper(), bool, new HBR(new WcF(bool)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(isitemdismissable));
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public So(Tj tj, UsU usU) {
        this.BGx = tj;
        this.mbG = usU;
        Object[] objArr = {Ii.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.mbG.BGx(new Dd$$ExternalSyntheticLambda0(ltx, 11, this));
    }
}
