package com.incognia.internal;

import android.content.pm.PackageInfo;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.accessgetInstancedelegatecp;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class zv5 implements PG {
    public final C BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final YZr mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        ArrayList arrayList;
        ArrayList arrayList2;
        try {
            YZr yZr = this.mbG;
            int i = 0;
            if (yZr.HQ) {
                List<PackageInfo> listBGx = J3.BGx(yZr.mbG, 0);
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(listBGx, 10));
                for (PackageInfo packageInfo : listBGx) {
                    yZr.N.getClass();
                    arrayList.add(QP.BGx(packageInfo, null));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (!((dCe) obj).N) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = null;
            }
            String strBGx = arrayList2 != null ? this.BGx.BGx(arrayList2) : null;
            isitemdismissable = new JWV((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), strBGx, new bMs(new ctB(strBGx)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public zv5(C c, YZr yZr) {
        this.BGx = c;
        this.mbG = yZr;
        Object[] objArr = {fI8.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
