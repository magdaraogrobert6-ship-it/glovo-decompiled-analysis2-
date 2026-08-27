package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class Ysn implements PG {
    public final qJq BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        QUy qUyBGx;
        try {
            String str = (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
            qJq qjq = this.BGx;
            try {
                qUyBGx = XUh.BGx(XUh.BGx, 24, 0, 2) ? new tG(qjq.BGx, qjq.mbG).BGx() : null;
            } catch (Exception unused) {
            }
            isitemdismissable = new SsL(str, qUyBGx);
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public Ysn(qJq qjq) {
        this.BGx = qjq;
        Object[] objArr = {dZr.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
