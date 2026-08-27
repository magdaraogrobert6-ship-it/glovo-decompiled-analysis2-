package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.io.TextStreamsKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class KlQ implements PG {
    public final AJy BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            AJy aJy = this.BGx;
            NvL nvL = aJy.BGx;
            String str = AJy.mbG;
            ArrayList arrayList = AJy.N;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, arrayList));
            if (((JSONObject) aJy.BGx.BGx.get()).optBoolean(AJy.HQ, true)) {
                setParcelableVolumeInfo.addAll(arrayList);
            }
            Set setBGx = aIN.BGx(onContentCardDismissed.ParcelableVolumeInfo(setParcelableVolumeInfo));
            ArrayList arrayList2 = null;
            if (setBGx == null) {
                setBGx = null;
            }
            ArrayList arrayList3 = new ArrayList();
            if (setBGx.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                BufferedReader bufferedReaderMbG = P5.mbG();
                if (bufferedReaderMbG != null) {
                    TextStreamsKt.RemoteActionCompatParcelizer(bufferedReaderMbG, new k0K(setBGx, arrayList3));
                    arrayList2 = arrayList3;
                }
            }
            isitemdismissable = new JWV((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), arrayList2, new c8h(new XdJ(arrayList2)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public KlQ(AJy aJy, P5 p5) {
        this.BGx = aJy;
        Object[] objArr = {FtC.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
