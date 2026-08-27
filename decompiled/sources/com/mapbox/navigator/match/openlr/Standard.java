package com.mapbox.navigator.match.openlr;

/* JADX INFO: loaded from: classes3.dex */
public enum Standard {
    TOM_TOM("TomTom"),
    TPEG("TPEG");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    Standard(String str) {
        this.str = str;
    }
}
