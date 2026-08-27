package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ChargingStatus {
    UNKNOWN,
    AVAILABLE,
    BLOCKED,
    CHARGING,
    INOPERATIVE,
    OUT_OF_ORDER,
    PLANNED,
    REMOVED,
    RESERVED;

    private int getValue() {
        return ordinal();
    }
}
