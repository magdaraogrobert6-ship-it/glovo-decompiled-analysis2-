package com.mapbox.search.base.factory.parking;

import com.mapbox.search.internal.bindgen.ParkingPriceType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ParkingPriceTypeKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ParkingPriceType.values().length];
        try {
            iArr[ParkingPriceType.DURATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParkingPriceType.DURATION_ADDITIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParkingPriceType.CUSTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
