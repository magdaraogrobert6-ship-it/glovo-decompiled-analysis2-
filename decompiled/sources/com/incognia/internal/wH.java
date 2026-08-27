package com.incognia.internal;

import com.incognia.Incognia$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class wH implements PG {
    public final UsU BGx;
    public final onViewDetachedFromWindowlambda1 HQ;
    public final AtomicReference N;
    public final NvL mbG;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return false;
    }

    public static final void BGx(wH wHVar, String str) {
        Map linkedHashMap;
        Map map = (Map) wHVar.N.get();
        if (map == null) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        if (map.containsKey(str)) {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        } else {
            int iOptInt = ((JSONObject) wHVar.mbG.BGx.get()).optInt((String) W4i.IGF.MediaSessionCompatResultReceiverWrapper(), 10);
            Map mapSerializer = onMove.serializer(map, new onViewAttachedToWindowlambda0(str, Long.valueOf(System.currentTimeMillis())));
            if (mapSerializer.size() > iOptInt) {
                List<Map.Entry> list = onContentCardDismissed.read(onContentCardDismissed.serializer(mapSerializer.entrySet(), new T5()), iOptInt);
                int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list, 10));
                if (iRemoteActionCompatParcelizer < 16) {
                    iRemoteActionCompatParcelizer = 16;
                }
                linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                for (Map.Entry entry : list) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else {
                linkedHashMap = mapSerializer;
            }
        }
        wHVar.N.set(linkedHashMap);
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.HQ.MediaSessionCompatResultReceiverWrapper();
    }

    public wH(UsU usU, NvL nvL, KWh kWh) {
        this.BGx = usU;
        this.mbG = nvL;
        Object[] objArr = {Pd.BGx};
        this.HQ = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        this.N = new AtomicReference();
    }

    public final void HQ() {
        this.BGx.BGx(new Incognia$$ExternalSyntheticLambda0(10, this));
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        this.BGx.BGx(new Dd$$ExternalSyntheticLambda0(this, 18, ltx));
    }

    public static final void BGx(wH wHVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Map map = (Map) wHVar.N.get();
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new N1((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new Vua((String) wHVar.HQ.MediaSessionCompatResultReceiverWrapper(), arrayList)));
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(new Vua((String) wHVar.HQ.MediaSessionCompatResultReceiverWrapper(), null)));
    }

    public final void BGx(String str) {
        this.BGx.BGx(new N6$$ExternalSyntheticLambda0(this, 29, str));
    }

    public static final void BGx(wH wHVar) {
        wHVar.N.set(null);
    }
}
