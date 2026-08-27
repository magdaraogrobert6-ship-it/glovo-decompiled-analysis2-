package com.mapbox.search.base.factory.parking;

import com.mapbox.search.internal.bindgen.ParkingAvailabilityLevel;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ParkingAvailabilityLevelKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ParkingAvailabilityLevel.values().length];
        try {
            iArr[ParkingAvailabilityLevel.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParkingAvailabilityLevel.MID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParkingAvailabilityLevel.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParkingAvailabilityLevel.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
