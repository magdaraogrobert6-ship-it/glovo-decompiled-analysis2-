package com.incognia.internal;

import android.os.Bundle;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class gV implements PG {
    public final YZr BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        String string;
        Bundle bundle;
        try {
            YZr yZr = this.BGx;
            yZr.getClass();
            String str = (String) W4i.HT.MediaSessionCompatResultReceiverWrapper();
            try {
                dCe dceMbG = yZr.mbG();
                string = (dceMbG == null || (bundle = dceMbG.S) == null) ? null : bundle.getString(str);
            } catch (Throwable unused) {
            }
            isitemdismissable = new JWV((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), string, new bMs(new yN(string)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public gV(YZr yZr) {
        this.BGx = yZr;
        Object[] objArr = {Pfs.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
