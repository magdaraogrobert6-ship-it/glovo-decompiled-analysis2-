package com.mapbox.maps;

/* JADX INFO: loaded from: classes4.dex */
public enum RenderModeType {
    PARTIAL("Partial"),
    FULL("Full");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RenderModeType(String str) {
        this.str = str;
    }
}
