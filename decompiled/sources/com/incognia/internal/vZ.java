package com.incognia.internal;

import androidx.sqlite.SQLite;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import o.getInAppMessageEventMap;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class vZ implements PG {
    public static final List HQ = SQLite.read((String) W4i.gkC.MediaSessionCompatResultReceiverWrapper(), (String) W4i.fe.MediaSessionCompatResultReceiverWrapper(), (String) W4i.YM.MediaSessionCompatResultReceiverWrapper(), (String) W4i.fW.MediaSessionCompatResultReceiverWrapper(), (String) W4i.oxK.MediaSessionCompatResultReceiverWrapper(), (String) W4i.Lny.MediaSessionCompatResultReceiverWrapper());
    public static final List N = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(String) W4i.Hxy.MediaSessionCompatResultReceiverWrapper()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
    public final NvL BGx;
    public final onViewDetachedFromWindowlambda1 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.mbG.MediaSessionCompatResultReceiverWrapper();
    }

    public vZ(N1p n1p, NvL nvL) {
        this.BGx = nvL;
        Object[] objArr = {ddt.BGx};
        this.mbG = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        Object isitemdismissable2;
        try {
            try {
                isitemdismissable = System.getenv();
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            LinkedHashMap linkedHashMap = null;
            if (isitemdismissable instanceof isItemDismissable) {
                isitemdismissable = null;
            }
            Map map = (Map) isitemdismissable;
            Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this.BGx.BGx((String) W4i.FTd.MediaSessionCompatResultReceiverWrapper(), HQ));
            raa raaVar = new raa(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(this.BGx.BGx((String) W4i.NeM.MediaSessionCompatResultReceiverWrapper(), N)));
            if (map != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(str)) {
                        ArrayList arrayList = raaVar.BGx;
                        if (arrayList == null || !arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                if (((getInAppMessageEventMap) obj).read(str2)) {
                                }
                            }
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            isitemdismissable2 = new JWV((String) this.mbG.MediaSessionCompatResultReceiverWrapper(), linkedHashMap, new AKN(new woO(linkedHashMap)));
        } catch (Throwable th2) {
            isitemdismissable2 = new isItemDismissable(th2);
        }
        Bq.BGx(isitemdismissable2, ltx);
    }
}
