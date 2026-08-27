package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum ServiceAreaType {
    REST_AREA("RestArea"),
    SERVICE_AREA("ServiceArea");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ServiceAreaType(String str) {
        this.str = str;
    }
}
