package com.mapbox.search.base.factory;

import com.mapbox.search.internal.bindgen.ParkingRestriction;
import com.mapbox.search.internal.bindgen.ParkingType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ParkingTypeKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ParkingType.values().length];
        try {
            iArr[ParkingType.ALONG_MOTORWAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParkingType.PARKING_GARAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParkingType.PARKING_LOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParkingType.ON_DRIVEWAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ParkingType.ON_STREET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ParkingType.OFF_STREET.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ParkingType.UNDERGROUND_GARAGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ParkingType.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ParkingRestriction.values().length];
        try {
            iArr2[ParkingRestriction.EV_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ParkingRestriction.PLUGGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ParkingRestriction.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ParkingRestriction.CUSTOMERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ParkingRestriction.MOTOR_CYCLES.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ParkingRestriction.NO_PARKING.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ParkingRestriction.MAX_STAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ParkingRestriction.MONTHLY_ONLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ParkingRestriction.NO_SUV.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[ParkingRestriction.NO_LPG.ordinal()] = 10;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[ParkingRestriction.VALET_ONLY.ordinal()] = 11;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[ParkingRestriction.VISITORS_ONLY.ordinal()] = 12;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[ParkingRestriction.EVENTS_ONLY.ordinal()] = 13;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[ParkingRestriction.NO_RESTRICTIONS_OUTSIDE_HOURS.ordinal()] = 14;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[ParkingRestriction.BOOKING_ONLY.ordinal()] = 15;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[ParkingRestriction.PARKING_DISK.ordinal()] = 16;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[ParkingRestriction.UNKNOWN.ordinal()] = 17;
        } catch (NoSuchFieldError unused25) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
