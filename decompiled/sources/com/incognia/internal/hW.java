package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class hW implements PG {
    public final X6a BGx;
    public final yZI HQ;
    public final onViewDetachedFromWindowlambda1 N;
    public final sjz mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        ArrayList arrayListMbG;
        if (!this.HQ.BGx()) {
            ltx.BGx(new isItemDismissable(new Z9T((String) this.N.MediaSessionCompatResultReceiverWrapper())));
            return;
        }
        try {
            try {
                arrayListMbG = this.mbG.mbG();
            } catch (Throwable th) {
                this.BGx.BGx(th, false);
                arrayListMbG = null;
            }
            isitemdismissable = new dzv((String) W4i.N6D.MediaSessionCompatResultReceiverWrapper(), arrayListMbG);
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.N.MediaSessionCompatResultReceiverWrapper();
    }

    public hW(X6a x6a, sjz sjzVar, yZI yzi) {
        this.BGx = x6a;
        this.mbG = sjzVar;
        this.HQ = yzi;
        Object[] objArr = {Rp.BGx};
        this.N = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
