package com.mapbox.navigation.base.internal.utils;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.RouterOrigin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RouterExKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RouterOrigin.values().length];
            try {
                iArr[RouterOrigin.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouterOrigin.ONBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouterOrigin.CUSTOM_EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouterOrigin.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String mapToSdkRouteOrigin(RouterOrigin routerOrigin) {
        routerOrigin.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[routerOrigin.ordinal()];
        if (i == 1) {
            return "ONLINE";
        }
        if (i == 2) {
            return "OFFLINE";
        }
        if (i == 3) {
            return "CUSTOM_EXTERNAL";
        }
        if (i != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("native CUSTOM origin isn't supported");
        return null;
    }
}
