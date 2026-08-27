package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class M3d implements PG {
    public final IEr BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public M3d(IEr iEr) {
        this.BGx = iEr;
        Object[] objArr = {DOM.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            if (XUh.BGx(XUh.BGx, 21, 0, 2)) {
                isitemdismissable = new oCV((String) W4i.Z7.MediaSessionCompatResultReceiverWrapper(), new fBS(this.BGx.A1(), this.BGx.VV3(), IEr.BGx(), this.BGx.fZl(), this.BGx.N(), this.BGx.hIl(), IEr.x(), this.BGx.q(), this.BGx.hs(), this.BGx.mbG(), this.BGx.HQ()));
            } else {
                isitemdismissable = new oCV((String) W4i.Z7.MediaSessionCompatResultReceiverWrapper(), null);
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }
}
