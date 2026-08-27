package com.mapbox.navigation.core.routeoptions;

import com.huawei.location.lite.common.util.ReflectionUtils;
import com.mapbox.api.directions.v5.models.RouteOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteOptionsUpdater$RouteOptionsResult$Success extends ReflectionUtils {
    public final RouteOptions routeOptions;

    public final int hashCode() {
        return this.routeOptions.hashCode();
    }

    public RouteOptionsUpdater$RouteOptionsResult$Success(RouteOptions routeOptions) {
        this.routeOptions = routeOptions;
    }

    public final String toString() {
        return "Success(routeOptions=" + this.routeOptions + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteOptionsUpdater$RouteOptionsResult$Success.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.routeOptions.equals(((RouteOptionsUpdater$RouteOptionsResult$Success) obj).routeOptions);
    }
}
