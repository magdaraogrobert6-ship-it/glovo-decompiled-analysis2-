package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class FC implements PG {
    public final UsU BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final dV2 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public FC(UsU usU, dV2 dv2) {
        this.BGx = usU;
        this.mbG = dv2;
        Object[] objArr = {X0l.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.mbG.BGx(new gE(this, ltx));
    }
}
