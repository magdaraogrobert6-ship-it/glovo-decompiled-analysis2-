package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum LaneType {
    REVERSE("Reverse"),
    BOTH_WAYS("BothWays"),
    BUS("Bus");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    LaneType(String str) {
        this.str = str;
    }
}
