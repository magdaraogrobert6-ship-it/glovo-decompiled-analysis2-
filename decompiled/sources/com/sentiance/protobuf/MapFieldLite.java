package com.sentiance.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.IEventSubscriber;
import o.getAlignmentLinesMap;
import o.isFromOfflineStorage;

/* JADX INFO: loaded from: classes3.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    public static final MapFieldLite serializer;
    private boolean isMutable;

    public final void RemoteActionCompatParcelizer() {
        this.isMutable = false;
    }

    public final boolean write() {
        return this.isMutable;
    }

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        serializer = mapFieldLite;
        mapFieldLite.isMutable = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        serializer();
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        serializer();
        Charset charset = isFromOfflineStorage.read;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        serializer();
        for (K k : map.keySet()) {
            Charset charset = isFromOfflineStorage.read;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        serializer();
        return super.remove(obj);
    }

    public MapFieldLite() {
        this.isMutable = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iRemoteActionCompatParcelizer = 0;
        for (Map.Entry entry : entrySet()) {
            iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(entry.getValue()) ^ RemoteActionCompatParcelizer(entry.getKey());
        }
        return iRemoteActionCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof IEventSubscriber)) {
                return obj.hashCode();
            }
            getAlignmentLinesMap.write();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = isFromOfflineStorage.read;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final void serializer() {
        if (this.isMutable) {
            return;
        }
        getAlignmentLinesMap.write();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    public final MapFieldLite IconCompatParcelizer() {
        if (isEmpty()) {
            return new MapFieldLite();
        }
        MapFieldLite mapFieldLite = new MapFieldLite(this);
        mapFieldLite.isMutable = true;
        return mapFieldLite;
    }

    public MapFieldLite(Map map) {
        super(map);
    }
}
