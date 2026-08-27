package com.mapbox.navigation.core.internal.router;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.GetRouteOrigin;
import com.mapbox.navigator.GetRouteReason;

/* JADX INFO: loaded from: classes2.dex */
public final class GetRouteSignature {
    public final Origin origin;
    public final Reason reason;

    public enum Origin {
        SDK,
        APP;

        public final GetRouteOrigin toNativeOrigin() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return GetRouteOrigin.PLATFORM_SDK;
            }
            if (i == 2) {
                return GetRouteOrigin.CUSTOMER;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Origin.values().length];
                try {
                    iArr[Origin.SDK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Origin.APP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    public enum Reason {
        NEW_ROUTE,
        REROUTE_BY_DEVIATION,
        REROUTE_OTHER;

        public final GetRouteReason toNativeReason() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return GetRouteReason.NEW_ROUTE;
            }
            if (i == 2) {
                return GetRouteReason.REROUTE_BY_DEVIATION;
            }
            if (i == 3) {
                return GetRouteReason.REROUTE_OTHER;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Reason.values().length];
                try {
                    iArr[Reason.NEW_ROUTE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Reason.REROUTE_BY_DEVIATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Reason.REROUTE_OTHER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    public final int hashCode() {
        return this.origin.hashCode() + (this.reason.hashCode() * 31);
    }

    public GetRouteSignature(Reason reason, Origin origin) {
        reason.getClass();
        origin.getClass();
        this.reason = reason;
        this.origin = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRouteSignature)) {
            return false;
        }
        GetRouteSignature getRouteSignature = (GetRouteSignature) obj;
        return this.reason == getRouteSignature.reason && this.origin == getRouteSignature.origin;
    }

    public final String toString() {
        return "GetRouteSignature(reason=" + this.reason + ", origin=" + this.origin + ')';
    }
}
