package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class hbK implements PG {
    public final Tj BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final ByN mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            String strMbG = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG.BGx(), tr.BGx}, getCieXyz.write())).booleanValue() ? this.BGx.mbG() : null;
            isitemdismissable = new JWV((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), strMbG, new bMs(new c2i(strMbG)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public hbK(Tj tj, ByN byN) {
        this.BGx = tj;
        this.mbG = byN;
        Object[] objArr = {HQp.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
