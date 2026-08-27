package com.mapbox.bindgen;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class HashMapKeyValueExtractor {
    private final Object[] keys;
    private final Object[] values;

    public Object[] getKeys() {
        return this.keys;
    }

    public Object[] getValues() {
        return this.values;
    }

    public HashMapKeyValueExtractor(HashMap<Object, Object> map) {
        Set<Object> setKeySet = map.keySet();
        int size = setKeySet.size();
        this.keys = new Object[size];
        this.values = new Object[size];
        int i = 0;
        for (Object obj : setKeySet) {
            this.keys[i] = obj;
            this.values[i] = map.get(obj);
            i++;
        }
    }
}
