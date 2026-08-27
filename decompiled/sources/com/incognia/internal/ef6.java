package com.incognia.internal;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ef6 implements PG {
    public final B BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public ef6(B b) {
        this.BGx = b;
        Object[] objArr = {rb9.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        byte[] byteArray;
        dCe dceBGx;
        List list;
        PackageInfo packageInfoBGx;
        try {
            B b = this.BGx;
            Boolean boolBGx = null;
            try {
                YZr yZr = b.BGx;
                String str = yZr.A1;
                try {
                    int iBGx = fYB.BGx.BGx();
                    try {
                        if ((((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, yZr.A1}, getCieXyz.write())).booleanValue() || yZr.HQ) && (packageInfoBGx = J3.BGx(yZr.mbG, str, iBGx)) != null) {
                            yZr.N.getClass();
                            dceBGx = QP.BGx(packageInfoBGx, null);
                        } else {
                            dceBGx = null;
                        }
                    } catch (Throwable unused) {
                    }
                    byteArray = (dceBGx == null || (list = dceBGx.hs) == null) ? null : ((Signature) list.get(0)).toByteArray();
                } catch (Throwable unused2) {
                }
                if (byteArray != null) {
                    boolBGx = b.BGx.BGx(byteArray);
                }
            } catch (Throwable unused3) {
            }
            isitemdismissable = new JWV((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), boolBGx, new HBR(new v93(boolBGx)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }
}
