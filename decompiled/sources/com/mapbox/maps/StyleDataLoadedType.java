package com.mapbox.maps;

/* JADX INFO: loaded from: classes4.dex */
public enum StyleDataLoadedType {
    STYLE("Style"),
    SPRITE("Sprite"),
    SOURCES("Sources");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    StyleDataLoadedType(String str) {
        this.str = str;
    }
}
