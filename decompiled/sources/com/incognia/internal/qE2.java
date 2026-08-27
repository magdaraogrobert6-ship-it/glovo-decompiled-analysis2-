package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class qE2 implements PG {
    public final yI3 BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final yZI mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        if (!this.mbG.BGx()) {
            ltx.BGx(new isItemDismissable(new Z9T((String) this.HQ.MediaSessionCompatResultReceiverWrapper())));
            return;
        }
        try {
            String str = (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
            yI3 yi3 = this.BGx;
            isitemdismissable = new bgC(str, new dWj(Boolean.valueOf(yi3.x()), Boolean.valueOf(yi3.hs())));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public qE2(yI3 yi3, yZI yzi) {
        this.BGx = yi3;
        this.mbG = yzi;
        Object[] objArr = {das.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
