package com.incognia.internal;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import o.setCarryoverInAppMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class p31 implements PG {
    public final D4B BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public Set N;
    public final Xxc mbG;
    public static final String x = (String) W4i.Ru2.MediaSessionCompatResultReceiverWrapper();
    public static final String hIl = (String) W4i.Zwp.MediaSessionCompatResultReceiverWrapper();

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
            String str = D4B.hs;
            ArrayList arrayList = D4B.j;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, arrayList));
            NvL nvL2 = d4b.BGx;
            if (((JSONObject) nvL2.BGx.get()).optBoolean(D4B.iaH, false)) {
                setParcelableVolumeInfo.addAll(arrayList);
            }
            this.N = setParcelableVolumeInfo;
            ArrayList arrayListHQ = HQ();
            isitemdismissable = new JWV((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), arrayListHQ, new c8h(new bUI(arrayListHQ)));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    public final ArrayList HQ() throws IOException {
        InputStream inputStream;
        Scanner scanner;
        String[] strArr;
        Process processExec;
        ArrayList arrayList = new ArrayList();
        Xxc xxc = this.mbG;
        String str = x;
        try {
            Runtime runtimeBGx = xxc.BGx();
            inputStream = (runtimeBGx == null || (processExec = runtimeBGx.exec(str)) == null) ? null : processExec.getInputStream();
        } catch (Throwable unused) {
        }
        if (inputStream == null) {
            strArr = null;
        } else {
            try {
                scanner = new Scanner(inputStream);
                try {
                    strArr = (String[]) hideCurrentlyDisplayingInAppMessage.serializer(scanner.useDelimiter("\\A").next(), new String[]{"\n"}, 6).toArray(new String[0]);
                    scanner.close();
                    inputStream.close();
                } catch (Throwable unused2) {
                    if (scanner != null) {
                        scanner.close();
                    }
                    inputStream.close();
                    strArr = null;
                }
            } catch (Throwable unused3) {
                scanner = null;
            }
        }
        if (strArr == null) {
            return null;
        }
        for (String str2 : strArr) {
            String[] strArr2 = (String[]) hideCurrentlyDisplayingInAppMessage.serializer(str2, new String[]{" "}, 6).toArray(new String[0]);
            if (strArr2.length >= 4) {
                String str3 = strArr2[1];
                ArrayList arrayList2 = new ArrayList(hideCurrentlyDisplayingInAppMessage.serializer(strArr2[3], new String[]{","}, 6));
                Set set = this.N;
                if (set == null) {
                    set = null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : set) {
                    if (setCarryoverInAppMessage.serializer(str3, (String) obj, true) && arrayList2.contains(hIl)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList.addAll(arrayList3);
            }
        }
        return arrayList;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public p31(D4B d4b, Xxc xxc) {
        this.BGx = d4b;
        this.mbG = xxc;
        Object[] objArr = {h7d.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
