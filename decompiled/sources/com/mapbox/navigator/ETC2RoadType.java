package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum ETC2RoadType {
    UNKNOWN("Unknown"),
    HIGHWAY("Highway"),
    CITY_HIGHWAY("CityHighway"),
    NORMAL_ROAD("NormalRoad"),
    OTHER("Other");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ETC2RoadType(String str) {
        this.str = str;
    }
}
