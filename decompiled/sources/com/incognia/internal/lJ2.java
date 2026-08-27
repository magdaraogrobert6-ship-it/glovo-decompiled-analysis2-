package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class lJ2 implements PG {
    public final onViewDetachedFromWindowlambda1 BGx;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            XUh xUh = XUh.BGx;
            isitemdismissable = new HaX((String) W4i.vM.MediaSessionCompatResultReceiverWrapper(), new Lw(XUh.mbG, XUh.HQ, XUh.N, XUh.x, XUh.hIl, XUh.hs, XUh.VV3, XUh.A1, xUh.BGx(), XUh.VLD, XUh.TfN, xUh.mbG(), xUh.HQ(), xUh.N(), xUh.hs(), xUh.x(), xUh.hIl(), XUh.OV7, XUh.JR, XUh.j, XUh.n));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
    }

    public lJ2() {
        Object[] objArr = {ZX.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
