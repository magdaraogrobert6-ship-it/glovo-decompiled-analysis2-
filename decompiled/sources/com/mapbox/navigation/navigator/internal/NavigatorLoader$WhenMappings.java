package com.mapbox.navigation.navigator.internal;

import com.mapbox.navigation.base.options.DeviceType;
import com.mapbox.navigation.base.options.NavigationTileDataDomain;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class NavigatorLoader$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[NavigationTileDataDomain.values().length];
        try {
            iArr[NavigationTileDataDomain.NAVIGATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigationTileDataDomain.NAVIGATION_HD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NavigationTileDataDomain.MAPS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NavigationTileDataDomain.SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NavigationTileDataDomain.ADAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[DeviceType.values().length];
        try {
            iArr2[DeviceType.HANDHELD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeviceType.AUTOMOBILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
