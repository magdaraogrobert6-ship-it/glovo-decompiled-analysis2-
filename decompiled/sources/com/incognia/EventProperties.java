package com.incognia;

import java.util.LinkedHashMap;
import java.util.Map;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public final class EventProperties {
    private final Map<String, Object> properties = new LinkedHashMap();

    public final void remove(String str) {
        this.properties.remove(str);
    }

    public final Map<String, Object> toMap() {
        return onMove.serializer(this.properties);
    }

    public String toString() {
        return this.properties.toString();
    }

    public final void set(String str, int i) {
        this.properties.put(str, Integer.valueOf(i));
    }

    public final void set(String str, long j) {
        this.properties.put(str, Long.valueOf(j));
    }

    public final void set(String str, double d) {
        this.properties.put(str, Double.valueOf(d));
    }

    public final void set(String str, boolean z) {
        this.properties.put(str, Boolean.valueOf(z));
    }

    public final void set(String str, String str2) {
        this.properties.put(str, str2);
    }
}
