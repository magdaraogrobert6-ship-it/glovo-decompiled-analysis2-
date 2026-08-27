package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum LaneIndication {
    NONE("None"),
    STRAIGHT("Straight"),
    SHARP_LEFT("SharpLeft"),
    LEFT("Left"),
    SLIGHT_LEFT("SlightLeft"),
    SLIGHT_RIGHT("SlightRight"),
    RIGHT("Right"),
    SHARP_RIGHT("SharpRight"),
    UTURN("UTurn");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    LaneIndication(String str) {
        this.str = str;
    }
}
