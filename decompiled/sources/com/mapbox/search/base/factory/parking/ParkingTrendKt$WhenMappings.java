package com.mapbox.search.base.factory.parking;

import com.mapbox.search.internal.bindgen.ParkingTrend;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ParkingTrendKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ParkingTrend.values().length];
        try {
            iArr[ParkingTrend.NO_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParkingTrend.DECREASING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParkingTrend.INCREASING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParkingTrend.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
