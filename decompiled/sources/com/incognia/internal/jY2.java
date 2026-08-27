package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ranges.RangesKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jY2 implements PG {
    public final FW BGx;
    public final x7 HQ;
    public final onViewDetachedFromWindowlambda1 N;
    public final a0K mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        Object isitemdismissable2;
        try {
            LinkedHashSet linkedHashSet = RangesKt.read(this.mbG.BGx(), this.mbG.mbG());
            a0K a0k = this.mbG;
            NvL nvL = a0k.BGx;
            String str = a0K.hs;
            List list = a0K.q;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, list));
            if (((JSONObject) a0k.BGx.BGx.get()).optBoolean(a0K.N, false)) {
                setParcelableVolumeInfo.addAll(list);
            }
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(RangesKt.read(RangesKt.read(linkedHashSet, setParcelableVolumeInfo), this.HQ.BGx()));
            FW fw = this.BGx;
            fw.getClass();
            Object obj = null;
            try {
                isitemdismissable2 = ((Boolean) OY8.BGx.MediaSessionCompatResultReceiverWrapper()).booleanValue() ? fw.fep(listPlaybackStateCompat) : null;
            } catch (Throwable th) {
                isitemdismissable2 = new isItemDismissable(th);
            }
            if (!(isitemdismissable2 instanceof isItemDismissable)) {
                obj = isitemdismissable2;
            }
            List list2 = (List) obj;
            isitemdismissable = new JWV((String) this.N.MediaSessionCompatResultReceiverWrapper(), list2, new c8h(new R2v(list2)));
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.N.MediaSessionCompatResultReceiverWrapper();
    }

    public jY2(FW fw, a0K a0k, x7 x7Var) {
        this.BGx = fw;
        this.mbG = a0k;
        this.HQ = x7Var;
        Object[] objArr = {UJY.BGx};
        this.N = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
