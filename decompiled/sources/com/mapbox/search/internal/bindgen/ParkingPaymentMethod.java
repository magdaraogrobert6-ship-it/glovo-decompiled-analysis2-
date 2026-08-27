package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ParkingPaymentMethod {
    UNKNOWN,
    PAY_ON_FOOT,
    PAY_AND_DISPLAY,
    PAY_ON_EXIT,
    PAY_ON_ENTRY,
    PARKING_METER,
    MULTI_SPACE_METER,
    HONESTY_BOX,
    ATTENDANT,
    PAY_BY_PLATE,
    PAY_AT_RECEPTION,
    PAY_BY_PHONE,
    PAY_BY_COUPON,
    ELECTRONIC_PARKING_SYSTEM;

    private int getValue() {
        return ordinal();
    }
}
