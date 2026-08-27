package com.mapbox.navigation.base.formatter;

/* JADX INFO: loaded from: classes2.dex */
public enum UnitType {
    IMPERIAL("imperial"),
    METRIC("metric");

    private final String value;

    public final String getValue() {
        return this.value;
    }

    UnitType(String str) {
        this.value = str;
    }
}
