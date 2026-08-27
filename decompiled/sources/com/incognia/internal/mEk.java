package com.incognia.internal;

import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import o.accessgetInstancedelegatecp;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mEk implements PG {
    public static final String x = (String) W4i.Wi.MediaSessionCompatResultReceiverWrapper();
    public final NvL BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final ujl N;
    public final d0 mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        Object lku;
        try {
            vzp vzpVarBGx = this.mbG.BGx(fYB.BGx);
            List list = vzpVarBGx != null ? vzpVarBGx.BGx : null;
            if (list == null) {
                lku = new lKu((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), null);
            } else {
                int iMin = Math.min(((JSONObject) this.BGx.BGx.get()).optInt(x, 20), Constant.ERROR_UNKNOWN);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((dCe) obj).N) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    Long lValueOf = Long.valueOf(((dCe) obj2).HQ);
                    Object arrayList2 = linkedHashMap.get(lValueOf);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(lValueOf, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((List) entry.getValue()).size() == 1) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                List list2 = onContentCardDismissed.read(onContentCardDismissed.serializer(accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(linkedHashMap2.values()), new qu()), iMin);
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    dCe dce = (dCe) it.next();
                    this.N.getClass();
                    arrayList3.add(new G2U(dce.BGx, dce.mbG, dce.HQ, dce.OV7, dce.fZl, dce.q, null, dce.VLD, dce.JR));
                }
                int size2 = list.size();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    if (((dCe) obj3).N) {
                        arrayList4.add(obj3);
                    }
                }
                isitemdismissable = new lKu((String) this.HQ.MediaSessionCompatResultReceiverWrapper(), new pu(arrayList3, Integer.valueOf(size2), Integer.valueOf(arrayList4.size()), Boolean.valueOf(vzpVarBGx.BGx(fYB.BGx))));
                lku = isitemdismissable;
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(lku, ltx);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public mEk(NvL nvL, d0 d0Var) {
        this.BGx = nvL;
        this.mbG = d0Var;
        Object[] objArr = {dbW.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.N = new ujl();
    }
}
