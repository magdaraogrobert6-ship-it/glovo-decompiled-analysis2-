package com.mapbox.navigation.core.reroute;

import com.mapbox.navigation.core.internal.router.GetRouteSignature;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class RerouteContextReasonOptionsAdapter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[GetRouteSignature.Reason.values().length];
        try {
            iArr[GetRouteSignature.Reason.NEW_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GetRouteSignature.Reason.REROUTE_BY_DEVIATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GetRouteSignature.Reason.REROUTE_OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
