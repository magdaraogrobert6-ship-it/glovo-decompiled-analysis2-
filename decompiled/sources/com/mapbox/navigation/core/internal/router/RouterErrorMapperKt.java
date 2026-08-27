package com.mapbox.navigation.core.internal.router;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.RouterErrorType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RouterErrorMapperKt {
    public static final String mapToSdkRouterFailureType(RouterErrorType routerErrorType) {
        switch (WhenMappings.$EnumSwitchMapping$0[routerErrorType.ordinal()]) {
            case 1:
                return "UNKNOWN_ERROR";
            case 2:
                return "THROTTLING_ERROR";
            case 3:
                return "INPUT_ERROR";
            case 4:
                return "NETWORK_ERROR";
            case 5:
                return "AUTHENTICATION_ERROR";
            case 6:
            case 8:
                return "ROUTE_CREATION_ERROR";
            case 7:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Should have been processed separately");
                return null;
            case 9:
                return "MISSING_TILES_ERROR";
            case 10:
                return "ROUTE_EXPIRY_ERROR";
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RouterErrorType.values().length];
            try {
                iArr[RouterErrorType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouterErrorType.THROTTLING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouterErrorType.INPUT_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouterErrorType.NETWORK_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RouterErrorType.AUTHENTICATION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RouterErrorType.ROUTE_CREATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RouterErrorType.REQUEST_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RouterErrorType.MAP_MATCHING_CREATION_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RouterErrorType.MISSING_TILES_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[RouterErrorType.ROUTE_NOT_FOUND_ON_SERVER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
