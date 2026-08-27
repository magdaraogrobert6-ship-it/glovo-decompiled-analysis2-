package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ranges.RangesKt;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class nBr implements PG {
    public TEI A1;
    public final NvL BGx;
    public final Vi2 HQ;
    public final D4B N;
    public Set VV3;
    public Set hIl;
    public Set hs;
    public final Xxc mbG;
    public final onViewDetachedFromWindowlambda1 x;
    public static final String q = (String) W4i.vir.MediaSessionCompatResultReceiverWrapper();
    public static final String fZl = (String) W4i.FH.MediaSessionCompatResultReceiverWrapper();
    public static final String S = (String) W4i.jHv.MediaSessionCompatResultReceiverWrapper();
    public static final String[] iaH = {(String) W4i.hY1.MediaSessionCompatResultReceiverWrapper()};
    public static final String[] e = {(String) W4i.qG.MediaSessionCompatResultReceiverWrapper(), (String) W4i.o1.MediaSessionCompatResultReceiverWrapper()};

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        InputStream inputStream;
        ArrayList arrayList;
        Process processExec;
        try {
            D4B d4b = this.N;
            NvL nvL = d4b.BGx;
            String str = D4B.mbG;
            ArrayList arrayList2 = D4B.e;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, arrayList2));
            int i = 0;
            if (((JSONObject) d4b.BGx.BGx.get()).optBoolean(D4B.VV3, false)) {
                setParcelableVolumeInfo.addAll(arrayList2);
            }
            this.hIl = setParcelableVolumeInfo;
            D4B d4b2 = this.N;
            NvL nvL2 = d4b2.BGx;
            String str2 = D4B.HQ;
            ArrayList arrayList3 = D4B.VLD;
            Set setParcelableVolumeInfo2 = onContentCardDismissed.ParcelableVolumeInfo(nvL2.BGx(str2, arrayList3));
            if (((JSONObject) d4b2.BGx.BGx.get()).optBoolean(D4B.A1, false)) {
                setParcelableVolumeInfo2.addAll(arrayList3);
            }
            this.hs = setParcelableVolumeInfo2;
            D4B d4b3 = this.N;
            NvL nvL3 = d4b3.BGx;
            String str3 = D4B.N;
            ArrayList arrayList4 = D4B.TfN;
            Set setParcelableVolumeInfo3 = onContentCardDismissed.ParcelableVolumeInfo(nvL3.BGx(str3, arrayList4));
            if (((JSONObject) d4b3.BGx.BGx.get()).optBoolean(D4B.q, true)) {
                setParcelableVolumeInfo3.addAll(arrayList4);
            }
            this.VV3 = setParcelableVolumeInfo3;
            Xxc xxc = this.mbG;
            String str4 = S;
            try {
                Runtime runtimeBGx = xxc.BGx();
                inputStream = (runtimeBGx == null || (processExec = runtimeBGx.exec(str4)) == null) ? null : processExec.getInputStream();
            } catch (Throwable unused) {
            }
            this.A1 = this.HQ.BGx(inputStream);
            String str5 = (String) this.x.MediaSessionCompatResultReceiverWrapper();
            Set set = this.hIl;
            if (set == null) {
                set = null;
            }
            Set set2 = this.hs;
            if (set2 == null) {
                set2 = null;
            }
            LinkedHashSet linkedHashSet = RangesKt.read(set, set2);
            TEI tei = this.A1;
            if (tei == null) {
                tei = null;
            }
            ArrayList arrayList5 = tei.BGx;
            if (arrayList5 != null) {
                arrayList = new ArrayList();
                int size = arrayList5.size();
                while (i < size) {
                    Object obj = arrayList5.get(i);
                    i++;
                    if (linkedHashSet.contains((String) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            isitemdismissable = new sHZ(str5, new UZn(arrayList, ((JSONObject) this.BGx.BGx.get()).optBoolean(q, true) ? this.mbG.BGx(iaH, (String[]) null) : null, ((JSONObject) this.BGx.BGx.get()).optBoolean(fZl, true) ? this.mbG.BGx(e, (String[]) null) : null, HQ()));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.x.MediaSessionCompatResultReceiverWrapper();
    }

    public nBr(NvL nvL, Xxc xxc, Vi2 vi2, D4B d4b) {
        this.BGx = nvL;
        this.mbG = xxc;
        this.HQ = vi2;
        this.N = d4b;
        Object[] objArr = {Qdw.BGx};
        this.x = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    public final LinkedHashMap HQ() {
        TEI tei = this.A1;
        if (tei == null) {
            tei = null;
        }
        LinkedHashMap linkedHashMap = tei.mbG;
        if (linkedHashMap == null) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Set set = this.VV3;
            if (set == null) {
                set = null;
            }
            if (set.contains(str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }
}
