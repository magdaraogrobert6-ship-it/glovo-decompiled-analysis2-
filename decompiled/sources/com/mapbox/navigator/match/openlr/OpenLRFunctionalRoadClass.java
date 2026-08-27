package com.mapbox.navigator.match.openlr;

/* JADX INFO: loaded from: classes5.dex */
public enum OpenLRFunctionalRoadClass {
    FRC0(0, "FRC0"),
    FRC1(1, "FRC1"),
    FRC2(2, "FRC2"),
    FRC3(3, "FRC3"),
    FRC4(4, "FRC4"),
    FRC5(5, "FRC5"),
    FRC6(6, "FRC6"),
    FRC7(7, "FRC7");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    OpenLRFunctionalRoadClass(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
