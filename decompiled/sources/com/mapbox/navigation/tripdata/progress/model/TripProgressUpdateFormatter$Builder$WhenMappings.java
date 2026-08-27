package com.mapbox.navigation.tripdata.progress.model;

import com.mapbox.navigation.base.formatter.UnitType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class TripProgressUpdateFormatter$Builder$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[UnitType.values().length];
        try {
            iArr[UnitType.IMPERIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UnitType.METRIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
