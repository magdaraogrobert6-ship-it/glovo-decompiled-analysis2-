package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ranges.RangesKt;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class tKC implements PG {
    public static final String A1 = (String) W4i.cG.MediaSessionCompatResultReceiverWrapper();
    public static final String q = (String) W4i.blt.MediaSessionCompatResultReceiverWrapper();
    public final FW BGx;
    public final x7 HQ;
    public final onViewDetachedFromWindowlambda1 N;
    public Set VV3;
    public Set hIl;
    public Set hs;
    public final a0K mbG;
    public Set x;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        try {
            this.x = this.mbG.mbG();
            this.hIl = this.mbG.BGx();
            a0K a0k = this.mbG;
            NvL nvL = a0k.BGx;
            String str = a0K.hs;
            List list = a0K.q;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, list));
            NvL nvL2 = a0k.BGx;
            if (((JSONObject) nvL2.BGx.get()).optBoolean(a0K.N, false)) {
                setParcelableVolumeInfo.addAll(list);
            }
            this.hs = setParcelableVolumeInfo;
            this.VV3 = this.HQ.BGx();
            isitemdismissable = new AvQ((String) this.N.MediaSessionCompatResultReceiverWrapper(), new HS5(HQ(), N()));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.N.MediaSessionCompatResultReceiverWrapper();
    }

    public tKC(FW fw, iQx iqx, a0K a0k, x7 x7Var) {
        this.BGx = fw;
        this.mbG = a0k;
        this.HQ = x7Var;
        Object[] objArr = {VXL.BGx};
        this.N = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    public final ArrayList N() {
        String str;
        File file;
        ArrayList arrayList = null;
        try {
            str = System.getenv(A1);
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            arrayList = new ArrayList();
            for (String str2 : hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{":"}, 6)) {
                FW fw = this.BGx;
                String str3 = q;
                fw.getClass();
                if (str3 != null) {
                    try {
                        file = new File(str2, str3);
                    } catch (Throwable unused2) {
                    }
                } else {
                    file = new File(str2);
                }
                if (file.exists()) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList HQ() {
        Set set = this.x;
        if (set == null) {
            set = null;
        }
        Set set2 = this.hIl;
        if (set2 == null) {
            set2 = null;
        }
        LinkedHashSet linkedHashSet = RangesKt.read(set, set2);
        Set set3 = this.hs;
        if (set3 == null) {
            set3 = null;
        }
        LinkedHashSet linkedHashSet2 = RangesKt.read(linkedHashSet, set3);
        Set set4 = this.VV3;
        LinkedHashSet linkedHashSet3 = RangesKt.read(linkedHashSet2, set4 != null ? set4 : null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet3) {
            String str = (String) obj;
            this.BGx.getClass();
            try {
                if (new File(str).exists()) {
                    arrayList.add(obj);
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
