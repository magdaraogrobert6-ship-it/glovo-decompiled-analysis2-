package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class dMz implements PG {
    public final onViewDetachedFromWindowlambda1 BGx;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        nz0 nz0Var;
        try {
            String str = (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
            synchronized (c6J.BGx) {
                mP mPVar = Ay.BGx;
                String str2 = c6J.mbG;
                nz0 nz0Var2 = (nz0) mPVar.BGx(c4.BGx, str2);
                if (nz0Var2 == null) {
                    nz0Var2 = new nz0();
                }
                nz0Var = new nz0(nz0Var2.BGx);
                mPVar.BGx(str2, new nz0(), adq.BGx);
            }
            isitemdismissable = new Eg(str, nz0Var);
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.BGx.MediaSessionCompatResultReceiverWrapper();
    }

    public dMz() {
        Object[] objArr = {AMt.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
