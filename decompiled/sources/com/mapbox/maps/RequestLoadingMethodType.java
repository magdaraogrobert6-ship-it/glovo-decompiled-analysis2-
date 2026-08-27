package com.mapbox.maps;

/* JADX INFO: loaded from: classes5.dex */
public enum RequestLoadingMethodType {
    NETWORK("Network"),
    CACHE("Cache");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RequestLoadingMethodType(String str) {
        this.str = str;
    }
}
