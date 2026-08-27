package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements PG {
    public final Tj BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        String str;
        try {
            Tj tj = this.BGx;
            synchronized (tj) {
                w wVar = tj.mbG;
                if (wVar != null) {
                    str = wVar.BGx;
                } else {
                    w wVarHQ = tj.HQ();
                    tj.mbG = wVarHQ;
                    if (wVarHQ != null) {
                        str = wVarHQ.BGx;
                    } else {
                        str = null;
                    }
                }
            }
            isitemdismissable = new JWV((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), str, new bMs(new w2(str)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public g(Tj tj) {
        this.BGx = tj;
        Object[] objArr = {TT6.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
