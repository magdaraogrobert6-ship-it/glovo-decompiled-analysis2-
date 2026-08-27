package com.braze.support;

import android.os.Bundle;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class BundleUtils {
    public static final Map<String, String> toStringMap(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle == null) {
            return linkedHashMap;
        }
        Set<String> setKeySet = bundle.keySet();
        setKeySet.getClass();
        for (String str : setKeySet) {
            try {
                Object obj = bundle.get(str);
                if (obj != null && (obj instanceof String)) {
                    linkedHashMap.put(str, obj);
                }
            } catch (Exception unused) {
            }
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public static final Bundle toBundle(Map<String, String> map) {
        map.getClass();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }
}
