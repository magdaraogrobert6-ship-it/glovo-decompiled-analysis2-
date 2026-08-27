package com.mapbox.navigation.core.trip.session;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class NavigationSessionUtils$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TripSessionState.values().length];
        try {
            iArr[TripSessionState.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TripSessionState.STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
