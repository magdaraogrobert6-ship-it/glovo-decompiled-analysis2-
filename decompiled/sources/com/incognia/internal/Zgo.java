package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Zgo implements PG {
    public static final String N = (String) W4i.Jv3.MediaSessionCompatResultReceiverWrapper();
    public final NvL BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final Q9 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        tQZ tqz;
        List listSubList;
        try {
            int iOptInt = ((JSONObject) this.BGx.BGx.get()).optInt(N, 5);
            if (iOptInt <= 0) {
                isitemdismissable = new B2v((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), null);
            } else {
                Q9 q9 = this.mbG;
                try {
                    if (q9.hIl.BGx()) {
                        q9.hIl.BGx(q9.BGx());
                    }
                    tqz = (tQZ) q9.hIl.N;
                } catch (Throwable unused) {
                    tqz = null;
                }
                List list = tqz != null ? tqz.BGx : null;
                if (list != null) {
                    int size = list.size();
                    if (iOptInt > size) {
                        iOptInt = size;
                    }
                    listSubList = list.subList(0, iOptInt);
                } else {
                    listSubList = null;
                }
                isitemdismissable = new B2v((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), new tQZ(listSubList, tqz != null ? tqz.mbG : null));
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        ltx.invoke(new onItemDismiss(isitemdismissable));
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public Zgo(NvL nvL, Q9 q9) {
        this.BGx = nvL;
        this.mbG = q9;
        Object[] objArr = {xkC.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
