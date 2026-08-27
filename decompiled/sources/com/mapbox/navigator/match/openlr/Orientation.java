package com.mapbox.navigator.match.openlr;

/* JADX INFO: loaded from: classes3.dex */
public enum Orientation {
    NO_ORIENTATION_OR_UNKNOWN(0, "NoOrientationOrUnknown"),
    WITH_LINE_DIRECTION(1, "WithLineDirection"),
    AGAINST_LINE_DIRECTION(2, "AgainstLineDirection"),
    BOTH(3, "Both");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    Orientation(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
