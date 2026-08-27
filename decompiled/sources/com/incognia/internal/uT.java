package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class uT implements PG {
    public static final String HQ = (String) W4i.cgQ.MediaSessionCompatResultReceiverWrapper();
    public final NvL BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    public final lI5 BGx(lI5 li5) {
        int iOptInt = ((JSONObject) this.BGx.BGx.get()).optInt(HQ, 100);
        return (li5.BGx.size() > iOptInt || li5.mbG.size() > iOptInt || li5.HQ.size() > iOptInt) ? new lI5(onContentCardDismissed.IconCompatParcelizer(iOptInt, li5.BGx), onContentCardDismissed.IconCompatParcelizer(iOptInt, li5.mbG), onContentCardDismissed.IconCompatParcelizer(iOptInt, li5.HQ)) : li5;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public uT(NvL nvL) {
        this.BGx = nvL;
        Object[] objArr = {m0.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        lI5 li5;
        try {
            synchronized (g4I.BGx) {
                lI5 li5BGx = g4I.BGx();
                li5 = new lI5(li5BGx.BGx, li5BGx.mbG, li5BGx.HQ);
                Ay.BGx.BGx(g4I.mbG, new lI5(), FE.BGx);
            }
            isitemdismissable = new k0n((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), BGx(li5));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }
}
