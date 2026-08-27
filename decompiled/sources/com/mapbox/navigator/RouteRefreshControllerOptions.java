package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RouteRefreshControllerOptions implements Serializable {
    private final String requestId;
    private final int routeIndex;
    private final RoutingProfile routingProfile;

    public String getRequestId() {
        return this.requestId;
    }

    public int getRouteIndex() {
        return this.routeIndex;
    }

    public RoutingProfile getRoutingProfile() {
        return this.routingProfile;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.requestId;
        int i = this.routeIndex;
        return Objects.hash(str, Integer.valueOf(i), this.routingProfile);
    }

    public RouteRefreshControllerOptions(String str, int i, RoutingProfile routingProfile) {
        this.requestId = str;
        this.routeIndex = i;
        this.routingProfile = routingProfile;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[requestId: ");
        IconCompatParcelizer.read(sb, this.requestId, ", routeIndex: ");
        IconCompatParcelizer.write(this.routeIndex, ", routingProfile: ", sb);
        sb.append(RecordUtils.fieldToString(this.routingProfile));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteRefreshControllerOptions routeRefreshControllerOptions = (RouteRefreshControllerOptions) obj;
        return Objects.equals(this.requestId, routeRefreshControllerOptions.requestId) && this.routeIndex == routeRefreshControllerOptions.routeIndex && Objects.equals(this.routingProfile, routeRefreshControllerOptions.routingProfile);
    }
}
