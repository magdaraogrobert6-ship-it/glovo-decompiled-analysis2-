package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class AbD implements PG {
    public final onViewDetachedFromWindowlambda1 BGx;
    public final AtomicReference mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        BRm bRm = (BRm) this.mbG.get();
        if (bRm != null) {
            ltx.BGx(new GiK((String) this.BGx.MediaSessionCompatResultReceiverWrapper(), bRm));
        } else {
            ltx.BGx(new isItemDismissable(new ib((String) this.BGx.MediaSessionCompatResultReceiverWrapper())));
        }
        this.mbG.set(null);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
    }

    public AbD() {
        Object[] objArr = {l3.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.mbG = new AtomicReference();
    }
}
