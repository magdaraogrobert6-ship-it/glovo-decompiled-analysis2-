package com.mapbox.navigation.core.reroute;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.lite.common.util.APKUtil;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Deviation$ApplyingRoute;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Deviation$RouteIgnored;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Failed;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Idle;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$Interrupted;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$RouteFetched;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$RouteObjectsParsing;
import com.mapbox.navigation.core.reroute.internal.NativeRerouteControllerState$WaitingForResponse;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.getGetTextLayoutResult;
import o.getPageDown;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RerouteStateExKt {
    public static final APKUtil toRerouteStateV2(getPageDown getpagedown) {
        getpagedown.getClass();
        if (getpagedown instanceof NativeRerouteControllerState$Idle) {
            return new RerouteStateV2$Idle();
        }
        if (getpagedown instanceof NativeRerouteControllerState$Interrupted) {
            return new RerouteStateV2$Interrupted();
        }
        if (getpagedown instanceof NativeRerouteControllerState$Failed) {
            NativeRerouteControllerState$Failed nativeRerouteControllerState$Failed = (NativeRerouteControllerState$Failed) getpagedown;
            return new RerouteStateV2$Failed(nativeRerouteControllerState$Failed.message, nativeRerouteControllerState$Failed.throwable, nativeRerouteControllerState$Failed.reasons, nativeRerouteControllerState$Failed.preRouterReasons);
        }
        if (getpagedown instanceof NativeRerouteControllerState$WaitingForResponse) {
            return new RerouteStateV2$FetchingRoute();
        }
        if (getpagedown instanceof NativeRerouteControllerState$RouteObjectsParsing) {
            return new RerouteStateV2$FetchingRoute();
        }
        if (getpagedown instanceof NativeRerouteControllerState$RouteFetched) {
            return new RerouteStateV2$RouteFetched(((NativeRerouteControllerState$RouteFetched) getpagedown).routerOrigin);
        }
        if (getpagedown instanceof NativeRerouteControllerState$Deviation$ApplyingRoute) {
            return new RerouteStateV2$Deviation$ApplyingRoute();
        }
        if (getpagedown instanceof NativeRerouteControllerState$Deviation$RouteIgnored) {
            return new RerouteStateV2$Deviation$RouteIgnored();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public static final getGetTextLayoutResult toRerouteState(APKUtil aPKUtil) {
        if (aPKUtil instanceof RerouteStateV2$Idle) {
            return RerouteState$Idle.INSTANCE;
        }
        if (aPKUtil instanceof RerouteStateV2$FetchingRoute) {
            return RerouteState$FetchingRoute.INSTANCE;
        }
        if (aPKUtil instanceof RerouteStateV2$Failed) {
            RerouteStateV2$Failed rerouteStateV2$Failed = (RerouteStateV2$Failed) aPKUtil;
            final String str = rerouteStateV2$Failed.message;
            final Throwable th = rerouteStateV2$Failed.throwable;
            final List list = rerouteStateV2$Failed.reasons;
            final List list2 = rerouteStateV2$Failed.preRouterReasons;
            return new getGetTextLayoutResult(str, th, list, list2) { // from class: com.mapbox.navigation.core.reroute.RerouteState$Failed
                public final String message;
                public final List preRouterReasons;
                public final List reasons;
                public final Throwable throwable;

                public final int hashCode() {
                    int iHashCode = this.message.hashCode();
                    Throwable th2 = this.throwable;
                    int iHashCode2 = th2 != null ? th2.hashCode() : 0;
                    List list3 = this.reasons;
                    return this.preRouterReasons.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0)) * 31);
                }

                {
                    str.getClass();
                    list2.getClass();
                    this.message = str;
                    this.throwable = th;
                    this.reasons = list;
                    this.preRouterReasons = list2;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Failed(message='");
                    sb.append(this.message);
                    sb.append("', throwable=");
                    sb.append(this.throwable);
                    sb.append(", reasons=");
                    sb.append(this.reasons);
                    sb.append(", preRouterReasons=");
                    return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.preRouterReasons, ')');
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!RerouteState$Failed.class.equals(obj != null ? obj.getClass() : null)) {
                        return false;
                    }
                    obj.getClass();
                    RerouteState$Failed rerouteState$Failed = (RerouteState$Failed) obj;
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, rerouteState$Failed.message}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.throwable, rerouteState$Failed.throwable}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.preRouterReasons, rerouteState$Failed.preRouterReasons}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reasons, rerouteState$Failed.reasons}, getCieXyz.write())).booleanValue();
                }
            };
        }
        if (aPKUtil instanceof RerouteStateV2$RouteFetched) {
            final String str2 = ((RerouteStateV2$RouteFetched) aPKUtil).routerOrigin;
            return new getGetTextLayoutResult(str2) { // from class: com.mapbox.navigation.core.reroute.RerouteState$RouteFetched
                public final String routerOrigin;

                public final int hashCode() {
                    return this.routerOrigin.hashCode();
                }

                {
                    this.routerOrigin = str2;
                }

                public final String toString() {
                    return ff$$ExternalSyntheticOutline0.m(new StringBuilder("RouteFetched(routerOrigin='"), this.routerOrigin, "')");
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!RerouteState$RouteFetched.class.equals(obj != null ? obj.getClass() : null)) {
                        return false;
                    }
                    obj.getClass();
                    return this.routerOrigin.equals(((RerouteState$RouteFetched) obj).routerOrigin);
                }
            };
        }
        if (aPKUtil instanceof RerouteStateV2$Interrupted) {
            return RerouteState$Idle.INSTANCE$1;
        }
        if ((aPKUtil instanceof RerouteStateV2$Deviation$ApplyingRoute) || (aPKUtil instanceof RerouteStateV2$Deviation$RouteIgnored)) {
            return null;
        }
        LoggerProviderKt.logW("Unexpected state: " + aPKUtil, null);
        return null;
    }
}
