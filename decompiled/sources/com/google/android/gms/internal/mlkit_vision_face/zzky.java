package com.google.android.gms.internal.mlkit_vision_face;

import com.google.gson.JsonElement;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzky {
    public static HashMap fromSerializableProperties(Map map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, ((SerializableJsonElement) map.get(str)).element);
        }
        return map2;
    }

    public static HashMap toSerializableProperties(Map map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), new SerializableJsonElement((JsonElement) entry.getValue()));
        }
        return map2;
    }
}
