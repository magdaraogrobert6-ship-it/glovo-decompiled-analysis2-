package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public enum TracingBackendType {
    NOOP("Noop"),
    PLATFORM("Platform"),
    LOGGER("Logger");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    TracingBackendType(String str) {
        this.str = str;
    }
}
