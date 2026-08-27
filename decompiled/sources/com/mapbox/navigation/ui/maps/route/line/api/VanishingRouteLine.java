package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.navigation.base.trip.model.RouteProgressState;
import com.mapbox.navigation.ui.maps.route.line.model.VanishingPointState;

/* JADX INFO: loaded from: classes2.dex */
public final class VanishingRouteLine {
    public Integer upcomingRouteGeometrySegmentIndex;
    public double vanishPointOffset;
    public VanishingPointState vanishingPointState;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RouteProgressState.values().length];
            try {
                iArr[RouteProgressState.TRACKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteProgressState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
