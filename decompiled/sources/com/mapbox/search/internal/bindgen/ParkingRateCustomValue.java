package com.mapbox.search.internal.bindgen;

/* JADX INFO: loaded from: classes3.dex */
public enum ParkingRateCustomValue {
    SIX_MONTHS_MON_FRI,
    BANK_HOLIDAY,
    DAYTIME,
    EARLY_BIRD,
    EVENING,
    FLAT_RATE,
    MAX,
    MAX_ONLY_ONCE,
    MINIMUM,
    MONTH,
    MONTH_MON_FRI,
    MONTH_RESERVED,
    MONTH_UNRESERVED,
    OVERNIGHT,
    QUARTER_MON_FRI,
    UNTIL_CLOSING,
    WEEKEND,
    YEAR_MON_FRI;

    private int getValue() {
        return ordinal();
    }
}
