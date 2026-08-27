package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum TollCollectionType {
    TOLL_BOOTH("TollBooth"),
    TOLL_GANTRY("TollGantry");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    TollCollectionType(String str) {
        this.str = str;
    }
}
