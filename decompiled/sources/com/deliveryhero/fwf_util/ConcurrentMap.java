package com.deliveryhero.fwf_util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.onMove;
import o.pauseWebviewIfNecessarylambda10;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcurrentMap<K, V> {
    private final ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>();

    public final V get$fwf_client_release(K k) {
        return this.map.get(k);
    }

    public final void put$fwf_client_release(K k, V v) {
        this.map.put(k, v);
    }

    public final void remove$fwf_client_release(K k) {
        pauseWebviewIfNecessarylambda10.serializer(this.map).remove(k);
    }

    public final Map<K, V> snapshot$fwf_client_release() {
        return onMove.serializer(this.map);
    }

    public final void putAll$fwf_client_release(Map<K, ? extends V> map) {
        map.getClass();
        this.map.putAll(map);
    }
}
