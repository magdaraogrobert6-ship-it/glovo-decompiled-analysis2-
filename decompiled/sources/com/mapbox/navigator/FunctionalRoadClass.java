package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum FunctionalRoadClass {
    MOTORWAY("Motorway"),
    TRUNK("Trunk"),
    PRIMARY("Primary"),
    SECONDARY("Secondary"),
    TERTIARY("Tertiary"),
    UNCLASSIFIED("Unclassified"),
    RESIDENTIAL("Residential"),
    SERVICE_OTHER("ServiceOther");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    FunctionalRoadClass(String str) {
        this.str = str;
    }
}
