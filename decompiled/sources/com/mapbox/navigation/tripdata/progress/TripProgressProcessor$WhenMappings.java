package com.mapbox.navigation.tripdata.progress;

import com.mapbox.navigation.base.trip.model.RouteProgressState;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class TripProgressProcessor$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[RouteProgressState.values().length];
        try {
            iArr[RouteProgressState.COMPLETE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
