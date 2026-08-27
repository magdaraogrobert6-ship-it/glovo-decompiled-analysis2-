package com.mapbox.navigation.base.internal.utils;

import com.mapbox.navigator.WaypointType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class DirectionsRouteEx$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[WaypointType.values().length];
        try {
            iArr[WaypointType.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WaypointType.SILENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WaypointType.EV_CHARGING_SERVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WaypointType.EV_CHARGING_USER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
