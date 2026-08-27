package com.mapbox.search.base.utils.extension;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MapKt {
    public static void addValue$default(LinkedHashMap linkedHashMap, Object obj, Object obj2) {
        linkedHashMap.getClass();
        Set linkedHashSet = (Set) linkedHashMap.get(obj);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            linkedHashMap.put(obj, linkedHashSet);
        }
        linkedHashSet.add(obj2);
    }
}
