package com.mapbox.navigation.core.routeoptions;

import com.huawei.location.lite.common.util.ReflectionUtils;
import com.mapbox.navigation.core.reroute.PreRouterFailure;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteOptionsUpdater$RouteOptionsResult$Error extends ReflectionUtils {
    public final Throwable error;
    public final PreRouterFailure reason;

    public final int hashCode() {
        int iHashCode = this.error.hashCode();
        PreRouterFailure preRouterFailure = this.reason;
        return (iHashCode * 31) + (preRouterFailure != null ? preRouterFailure.hashCode() : 0);
    }

    public RouteOptionsUpdater$RouteOptionsResult$Error(Throwable th, PreRouterFailure preRouterFailure) {
        this.error = th;
        this.reason = preRouterFailure;
    }

    public final String toString() {
        return "Error(error=" + this.error + ", reason=" + this.reason + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteOptionsUpdater$RouteOptionsResult$Error.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteOptionsUpdater$RouteOptionsResult$Error routeOptionsUpdater$RouteOptionsResult$Error = (RouteOptionsUpdater$RouteOptionsResult$Error) obj;
        if (!this.error.equals(routeOptionsUpdater$RouteOptionsResult$Error.error)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reason, routeOptionsUpdater$RouteOptionsResult$Error.reason}, getCieXyz.write())).booleanValue();
    }
}
