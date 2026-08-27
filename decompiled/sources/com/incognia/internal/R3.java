package com.incognia.internal;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class R3 implements PG {
    public final flT BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        String strValueOf;
        try {
            Float fValueOf = null;
            try {
                Display display = (Display) this.BGx.HQ.MediaSessionCompatResultReceiverWrapper();
                strValueOf = String.valueOf(display != null ? Integer.valueOf(display.getDisplayId()) : null);
            } catch (Throwable unused) {
                strValueOf = null;
            }
            String strX = this.BGx.x();
            Integer numBGx = this.BGx.BGx();
            try {
                Resources resources = this.BGx.BGx.getResources();
                fValueOf = Float.valueOf((resources != null ? resources.getDisplayMetrics() : new DisplayMetrics()).density);
            } catch (Throwable unused2) {
            }
            isitemdismissable = new qI((String) W4i.aly.MediaSessionCompatResultReceiverWrapper(), new JnG(strValueOf, strX, numBGx, fValueOf));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public R3(flT flt) {
        this.BGx = flt;
        Object[] objArr = {clS.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
