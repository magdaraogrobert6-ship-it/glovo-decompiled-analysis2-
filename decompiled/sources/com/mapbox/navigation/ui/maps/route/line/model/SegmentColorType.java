package com.mapbox.navigation.ui.maps.route.line.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;

/* JADX INFO: loaded from: classes2.dex */
public enum SegmentColorType {
    PRIMARY_DEFAULT,
    PRIMARY_LOW_CONGESTION,
    PRIMARY_MODERATE_CONGESTION,
    PRIMARY_HEAVY_CONGESTION,
    PRIMARY_SEVERE_CONGESTION,
    PRIMARY_UNKNOWN_CONGESTION,
    PRIMARY_CASING,
    PRIMARY_CLOSURE,
    PRIMARY_RESTRICTED,
    TRAVELED,
    TRAVELED_CASING,
    INACTIVE_DEFAULT,
    INACTIVE_LOW_CONGESTION,
    INACTIVE_MODERATE_CONGESTION,
    INACTIVE_HEAVY_CONGESTION,
    INACTIVE_SEVERE_CONGESTION,
    INACTIVE_UNKNOWN_CONGESTION,
    INACTIVE_CASING,
    INACTIVE_CLOSURE,
    INACTIVE_RESTRICTED,
    ALTERNATIVE_DEFAULT,
    ALTERNATIVE_LOW_CONGESTION,
    ALTERNATIVE_MODERATE_CONGESTION,
    ALTERNATIVE_HEAVY_CONGESTION,
    ALTERNATIVE_SEVERE_CONGESTION,
    ALTERNATIVE_UNKNOWN_CONGESTION,
    ALTERNATIVE_CASING,
    ALTERNATIVE_CLOSURE,
    ALTERNATIVE_RESTRICTED,
    TRANSPARENT;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentColorType.values().length];
            try {
                iArr[SegmentColorType.PRIMARY_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_LOW_CONGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_MODERATE_CONGESTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_HEAVY_CONGESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_SEVERE_CONGESTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_UNKNOWN_CONGESTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_CASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_CLOSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SegmentColorType.PRIMARY_RESTRICTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SegmentColorType.TRAVELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SegmentColorType.TRAVELED_CASING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_DEFAULT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_LOW_CONGESTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_MODERATE_CONGESTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_HEAVY_CONGESTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_SEVERE_CONGESTION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_UNKNOWN_CONGESTION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_CASING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_CLOSURE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[SegmentColorType.INACTIVE_RESTRICTED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_DEFAULT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_LOW_CONGESTION.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_MODERATE_CONGESTION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_HEAVY_CONGESTION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_SEVERE_CONGESTION.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_UNKNOWN_CONGESTION.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_CASING.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_CLOSURE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[SegmentColorType.ALTERNATIVE_RESTRICTED.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[SegmentColorType.TRANSPARENT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final int getColor(RouteLineViewOptionsData routeLineViewOptionsData) {
        routeLineViewOptionsData.getClass();
        RouteLineColorResources routeLineColorResources = routeLineViewOptionsData.getRouteLineColorResources();
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return routeLineColorResources.getRouteDefaultColor();
            case 2:
                return routeLineColorResources.getRouteLowCongestionColor();
            case 3:
                return routeLineColorResources.getRouteModerateCongestionColor();
            case 4:
                return routeLineColorResources.getRouteHeavyCongestionColor();
            case 5:
                return routeLineColorResources.getRouteSevereCongestionColor();
            case 6:
                return routeLineColorResources.getRouteUnknownCongestionColor();
            case 7:
                return routeLineColorResources.getRouteCasingColor();
            case 8:
                return routeLineColorResources.getRouteClosureColor();
            case 9:
                return routeLineColorResources.getRestrictedRoadColor();
            case 10:
                return routeLineColorResources.getRouteLineTraveledColor();
            case 11:
                return routeLineColorResources.getRouteLineTraveledCasingColor();
            case 12:
                return routeLineColorResources.getInActiveRouteLegsColor();
            case 13:
                return routeLineColorResources.getInactiveRouteLegLowCongestionColor();
            case 14:
                return routeLineColorResources.getInactiveRouteLegModerateCongestionColor();
            case 15:
                return routeLineColorResources.getInactiveRouteLegHeavyCongestionColor();
            case 16:
                return routeLineColorResources.getInactiveRouteLegSevereCongestionColor();
            case 17:
                return routeLineColorResources.getInactiveRouteLegUnknownCongestionColor();
            case 18:
                return routeLineColorResources.getInactiveRouteLegCasingColor();
            case 19:
                return routeLineColorResources.getInactiveRouteLegClosureColor();
            case 20:
                return routeLineColorResources.getInactiveRouteLegRestrictedRoadColor();
            case 21:
                return routeLineColorResources.getAlternativeRouteDefaultColor();
            case 22:
                return routeLineColorResources.getAlternativeRouteLowCongestionColor();
            case 23:
                return routeLineColorResources.getAlternativeRouteModerateCongestionColor();
            case 24:
                return routeLineColorResources.getAlternativeRouteHeavyCongestionColor();
            case 25:
                return routeLineColorResources.getAlternativeRouteSevereCongestionColor();
            case 26:
                return routeLineColorResources.getAlternativeRouteUnknownCongestionColor();
            case 27:
                return routeLineColorResources.getAlternativeRouteCasingColor();
            case 28:
                return routeLineColorResources.getAlternativeRouteClosureColor();
            case 29:
                return routeLineColorResources.getAlternativeRouteRestrictedRoadColor();
            case 30:
                return 0;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return 0;
        }
    }
}
