package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ResultType {
    UNKNOWN("Unknown"),
    COUNTRY("Country"),
    REGION("Region"),
    PLACE("Place"),
    DISTRICT("District"),
    LOCALITY("Locality"),
    NEIGHBORHOOD("Neighborhood"),
    STREET("Street"),
    ADDRESS("Address"),
    POSTCODE("Postcode"),
    BLOCK("Block"),
    POI("Poi"),
    CATEGORY("Category"),
    BRAND("Brand"),
    QUERY("Query"),
    USER_RECORD("UserRecord");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    ResultType(String str) {
        this.str = str;
    }
}
