package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum SapaType {
    NONE("None"),
    SERVICE_AREA("ServiceArea"),
    REST_AREA("RestArea");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    SapaType(String str) {
        this.str = str;
    }
}
