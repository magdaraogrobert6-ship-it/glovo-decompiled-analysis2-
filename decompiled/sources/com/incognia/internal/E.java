package com.incognia.internal;

import android.content.Context;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements PG {
    public final Context BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final ujl N;
    public final YZr mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            dCe dceMbG = this.mbG.mbG();
            if (dceMbG == null) {
                isitemdismissable = new i1y((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), null);
            } else {
                this.N.getClass();
                long j = dceMbG.BGx;
                long j2 = dceMbG.mbG;
                long j3 = dceMbG.HQ;
                String str = dceMbG.OV7;
                String str2 = dceMbG.JR;
                isitemdismissable = new i1y((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), new G2U(j, j2, j3, str, dceMbG.fZl, dceMbG.q, this.BGx.getApplicationInfo().className, dceMbG.VLD, str2));
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public E(Context context, YZr yZr) {
        this.BGx = context;
        this.mbG = yZr;
        Object[] objArr = {SL.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.N = new ujl();
    }
}
