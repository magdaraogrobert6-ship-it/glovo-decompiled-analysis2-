package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ResultAccuracy {
    POINT("Point"),
    ROOFTOP("Rooftop"),
    PARCEL("Parcel"),
    INTERPOLATED("Interpolated"),
    INTERSECTION("Intersection"),
    APPROXIMATE("Approximate"),
    STREET("Street"),
    PROXIMATE("Proximate");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ResultAccuracy(String str) {
        this.str = str;
    }
}
