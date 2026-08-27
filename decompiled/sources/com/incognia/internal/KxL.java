package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class KxL implements PG {
    public final D4B BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public Set N;
    public final Xxc mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            D4B d4b = this.BGx;
            NvL nvL = d4b.BGx;
            String str = D4B.x;
            ArrayList arrayList = D4B.OV7;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, arrayList));
            NvL nvL2 = d4b.BGx;
            if (((JSONObject) nvL2.BGx.get()).optBoolean(D4B.fZl, false)) {
                setParcelableVolumeInfo.addAll(arrayList);
            }
            this.N = aIN.BGx(onContentCardDismissed.ParcelableVolumeInfo(setParcelableVolumeInfo));
            Xxc xxc = this.mbG;
            String str2 = (String) W4i.wI.MediaSessionCompatResultReceiverWrapper();
            Set set = this.N;
            if (set == null) {
                set = null;
            }
            ArrayList arrayListBGx = xxc.BGx(str2, set);
            isitemdismissable = new JWV((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), arrayListBGx, new c8h(new K1m(arrayListBGx)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public KxL(D4B d4b, Xxc xxc) {
        this.BGx = d4b;
        this.mbG = xxc;
        Object[] objArr = {uaH.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
