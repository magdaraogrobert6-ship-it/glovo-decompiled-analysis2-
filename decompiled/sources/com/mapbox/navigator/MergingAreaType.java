package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum MergingAreaType {
    FROM_LEFT("FromLeft"),
    FROM_RIGHT("FromRight"),
    FROM_BOTH("FromBoth");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    MergingAreaType(String str) {
        this.str = str;
    }
}
