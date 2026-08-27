package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class t0M implements PG {
    public final Jpu BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        try {
            ltx.BGx(new YYt((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), this.BGx.mbG()));
        } catch (Throwable th) {
            if (th instanceof Exception) {
                ltx.BGx(new YYt((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), new h0(null, null, bKM.BGx(th), null, 11)));
            } else {
                ltx.BGx(new isItemDismissable(th));
            }
        }
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public t0M(Jpu jpu) {
        this.BGx = jpu;
        Object[] objArr = {XtZ.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
