package com.incognia.internal;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.security.MessageDigest;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Afr implements PG {
    public static final String HQ = (String) W4i.sMC.MediaSessionCompatResultReceiverWrapper();
    public final YZr BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        dCe dceBGx;
        List list;
        PackageInfo packageInfoBGx;
        try {
            YZr yZr = this.BGx;
            String str = HQ;
            yZr.getClass();
            String strHQ = null;
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
                if (dceBGx != null && (list = dceBGx.hs) != null) {
                    byte[] byteArray = ((Signature) list.get(0)).toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(byteArray);
                    strHQ = yEy.HQ(2, messageDigest.digest());
                }
            } catch (Throwable unused2) {
            }
            isitemdismissable = new JWV((String) W4i.H.MediaSessionCompatResultReceiverWrapper(), strHQ, new bMs(new c8(strHQ)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public Afr(YZr yZr) {
        this.BGx = yZr;
        Object[] objArr = {gi.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
