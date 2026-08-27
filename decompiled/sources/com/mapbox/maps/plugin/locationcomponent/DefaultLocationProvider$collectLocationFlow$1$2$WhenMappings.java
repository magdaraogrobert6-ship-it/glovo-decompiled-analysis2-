package com.mapbox.maps.plugin.locationcomponent;

import com.mapbox.maps.plugin.PuckBearing;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class DefaultLocationProvider$collectLocationFlow$1$2$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PuckBearing.values().length];
        try {
            iArr[PuckBearing.HEADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PuckBearing.COURSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
