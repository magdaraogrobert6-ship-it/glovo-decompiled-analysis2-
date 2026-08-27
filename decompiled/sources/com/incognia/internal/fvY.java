package com.incognia.internal;

import android.os.Bundle;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.accessgetInstancedelegatecp;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class fvY implements PG {
    public final YZr BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public Set N;
    public final Upo mbG;
    public Set x;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            Upo upo = this.mbG;
            NvL nvL = upo.BGx;
            String str = Upo.mbG;
            ArrayList arrayList = Upo.x;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, arrayList));
            NvL nvL2 = upo.BGx;
            String str2 = Upo.N;
            if (((JSONObject) nvL2.BGx.get()).optBoolean(str2, false)) {
                setParcelableVolumeInfo.addAll(arrayList);
            }
            this.N = setParcelableVolumeInfo;
            Upo upo2 = this.mbG;
            NvL nvL3 = upo2.BGx;
            String str3 = Upo.HQ;
            ArrayList arrayList2 = Upo.hIl;
            Set setParcelableVolumeInfo2 = onContentCardDismissed.ParcelableVolumeInfo(nvL3.BGx(str3, arrayList2));
            if (((JSONObject) upo2.BGx.BGx.get()).optBoolean(str2, false)) {
                setParcelableVolumeInfo2.addAll(arrayList2);
            }
            this.x = setParcelableVolumeInfo2;
            String str4 = (String) W4i.PKr.MediaSessionCompatResultReceiverWrapper();
            Set set = this.x;
            if (set == null) {
                set = null;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : set) {
                Class.forName((String) obj);
                arrayList3.add(obj);
            }
            isitemdismissable = new ICP(str4, new FL(arrayList3, HQ()));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    public final HashMap HQ() {
        Bundle bundle;
        HashMap map = new HashMap();
        dCe dceMbG = this.BGx.mbG();
        if (dceMbG != null && (bundle = dceMbG.S) != null) {
            Set<String> set = this.N;
            if (set == null) {
                set = null;
            }
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(set, 10));
            for (String str : set) {
                String string = bundle.getString(str);
                arrayList.add(string != null ? (String) map.put(str, string) : null);
            }
        }
        if (dceMbG != null) {
            return map;
        }
        return null;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public fvY(YZr yZr, Upo upo) {
        this.BGx = yZr;
        this.mbG = upo;
        Object[] objArr = {p8S.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
