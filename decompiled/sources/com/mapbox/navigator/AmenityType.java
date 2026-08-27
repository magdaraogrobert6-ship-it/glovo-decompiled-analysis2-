package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum AmenityType {
    UNDEFINED,
    GAS_STATION,
    ELECTRIC_CHARGING_STATION,
    TOILET,
    COFFEE,
    RESTAURANT,
    SNACK,
    ATM,
    INFO,
    BABY_CARE,
    FACILITIES_FOR_DISABLED,
    SHOP,
    TELEPHONE,
    HOTEL,
    HOTSPRING,
    SHOWER,
    PICNIC_SHELTER,
    POST,
    FAX;

    private int getValue() {
        return ordinal();
    }
}
