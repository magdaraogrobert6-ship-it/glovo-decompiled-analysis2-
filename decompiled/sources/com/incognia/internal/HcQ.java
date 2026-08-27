package com.incognia.internal;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.SimpleItemTouchHelperCallback;
import o.isItemDismissable;
import o.onContentCardClicked;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public final class HcQ implements Xeg {
    @Override // com.incognia.internal.Xeg
    public final int BGx() {
        return 3;
    }

    @Override // com.incognia.internal.Xeg
    public final boolean mbG() {
        return true;
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.incognia.internal.Xeg
    public final void BGx(Context context) {
        ?? isitemdismissable;
        Set setMediaSessionCompatQueueItem = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{(String) W4i.NaG.MediaSessionCompatResultReceiverWrapper(), (String) W4i.mbG.MediaSessionCompatResultReceiverWrapper(), (String) W4i.Vg.MediaSessionCompatResultReceiverWrapper()});
        sSc ssc = Ay.N;
        ssc.getClass();
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = setMediaSessionCompatQueueItem.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(ssc.HQ((String) it.next()));
            }
            Map<String, ?> all = ssc.BGx.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!linkedHashSet.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            isitemdismissable = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
            for (Object obj : linkedHashMap.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Object value = ((Map.Entry) obj).getValue();
                isitemdismissable.put(key, value != null ? value.toString() : null);
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        boolean z = isitemdismissable instanceof isItemDismissable;
        ?? r0 = isitemdismissable;
        if (z) {
            r0 = SimpleItemTouchHelperCallback.serializer;
        }
        Map map = (Map) r0;
        mP mPVar = Ay.BGx;
        mPVar.getClass();
        try {
            for (Map.Entry entry2 : map.entrySet()) {
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                ConcurrentHashMap concurrentHashMap = mPVar.x;
                if (str2 != null) {
                    concurrentHashMap.put(str, str2);
                } else {
                    concurrentHashMap.remove(str);
                }
            }
            mPVar.hIl.incrementAndGet();
            mPVar.N();
        } catch (Throwable unused) {
        }
        Ay.N.BGx(setMediaSessionCompatQueueItem);
    }
}
