package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum LaneChangeDirection {
    LEFT("Left"),
    RIGHT("Right");

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

    LaneChangeDirection(String str) {
        this.str = str;
    }
}
