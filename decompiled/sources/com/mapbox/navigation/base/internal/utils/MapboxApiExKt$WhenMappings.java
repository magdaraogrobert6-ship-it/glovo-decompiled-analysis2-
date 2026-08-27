package com.mapbox.navigation.base.internal.utils;

import com.mapbox.navigator.MapboxAPI;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class MapboxApiExKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[MapboxAPI.values().length];
        try {
            iArr[MapboxAPI.DIRECTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapboxAPI.MAP_MATCHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
