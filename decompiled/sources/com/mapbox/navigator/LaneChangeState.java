package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum LaneChangeState {
    INACTIVE("Inactive"),
    PLANNING("Planning"),
    IN_PROGRESS("InProgress");

    private final String str;

    public final String getStr() {
        return this.str;
    }

    public final int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    LaneChangeState(String str) {
        this.str = str;
    }
}
