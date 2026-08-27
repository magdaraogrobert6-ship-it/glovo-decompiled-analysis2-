package com.incognia.internal;

import com.incognia.EventProperties;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public final class mc {
    public final zY5 BGx(String str, String str2, EventProperties eventProperties, String str3, String str4) {
        LinkedHashMap linkedHashMap;
        if (eventProperties != null) {
            Map<String, Object> map = eventProperties.toMap();
            linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        } else {
            linkedHashMap = null;
        }
        zY5 zy5 = new zY5(str, str2, linkedHashMap, str3, str4);
        if (str == null && str2 == null && linkedHashMap == null && str3 == null && str4 == null) {
            return null;
        }
        return zy5;
    }
}
