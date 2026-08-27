package com.mapbox.navigation.core.trip.session.location;

import com.mapbox.navigator.DRSensorFusionState;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class DRSensorFusionState$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DRSensorFusionState.values().length];
        try {
            iArr[DRSensorFusionState.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DRSensorFusionState.COLD_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DRSensorFusionState.INITIALIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DRSensorFusionState.NORMAL_OPERATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DRSensorFusionState.FAILURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
