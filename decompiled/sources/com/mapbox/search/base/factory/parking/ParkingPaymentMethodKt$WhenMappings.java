package com.mapbox.search.base.factory.parking;

import com.mapbox.search.internal.bindgen.ParkingPaymentMethod;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ParkingPaymentMethodKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ParkingPaymentMethod.values().length];
        try {
            iArr[ParkingPaymentMethod.PAY_ON_FOOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParkingPaymentMethod.PAY_AND_DISPLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParkingPaymentMethod.PAY_ON_EXIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParkingPaymentMethod.PAY_ON_ENTRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ParkingPaymentMethod.PARKING_METER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ParkingPaymentMethod.MULTI_SPACE_METER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ParkingPaymentMethod.HONESTY_BOX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ParkingPaymentMethod.ATTENDANT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ParkingPaymentMethod.PAY_BY_PLATE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ParkingPaymentMethod.PAY_AT_RECEPTION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ParkingPaymentMethod.PAY_BY_PHONE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ParkingPaymentMethod.PAY_BY_COUPON.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ParkingPaymentMethod.ELECTRONIC_PARKING_SYSTEM.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ParkingPaymentMethod.UNKNOWN.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
