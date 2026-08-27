package com.mapbox.navigation.base.internal.extensions;

import com.mapbox.navigation.base.internal.route.Waypoint;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class WaypointExKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Waypoint.InternalType.values().length];
        try {
            iArr[Waypoint.InternalType.Regular.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Waypoint.InternalType.Silent.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Waypoint.InternalType.EvChargingUser.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Waypoint.InternalType.EvChargingServer.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
