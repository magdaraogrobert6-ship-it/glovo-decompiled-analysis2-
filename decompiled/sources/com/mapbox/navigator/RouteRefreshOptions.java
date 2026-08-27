package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RouteRefreshOptions implements Serializable {
    private final HashMap<String, String> additionalParams;
    private final String baseURL;
    private final Integer currentRouteGeometryIndex;
    private final int legIndex;
    private final String requestId;
    private final int routeIndex;
    private final RoutingProfile routingProfile;

    public HashMap<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public String getBaseURL() {
        return this.baseURL;
    }

    public Integer getCurrentRouteGeometryIndex() {
        return this.currentRouteGeometryIndex;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

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
        int i2 = this.legIndex;
        return Objects.hash(str, Integer.valueOf(i), Integer.valueOf(i2), this.routingProfile, this.baseURL, this.currentRouteGeometryIndex, this.additionalParams);
    }

    public RouteRefreshOptions(String str, int i, int i2, RoutingProfile routingProfile, String str2, Integer num, HashMap<String, String> map) {
        this.requestId = str;
        this.routeIndex = i;
        this.legIndex = i2;
        this.routingProfile = routingProfile;
        this.baseURL = str2;
        this.currentRouteGeometryIndex = num;
        this.additionalParams = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[requestId: ");
        IconCompatParcelizer.read(sb, this.requestId, ", routeIndex: ");
        IconCompatParcelizer.write(this.routeIndex, ", legIndex: ", sb);
        IconCompatParcelizer.write(this.legIndex, ", routingProfile: ", sb);
        sb.append(RecordUtils.fieldToString(this.routingProfile));
        sb.append(", baseURL: ");
        IconCompatParcelizer.read(sb, this.baseURL, ", currentRouteGeometryIndex: ");
        SweepGradientShader9KIMszodefault.read(this.currentRouteGeometryIndex, ", additionalParams: ", sb);
        sb.append(RecordUtils.fieldToString(this.additionalParams));
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
        RouteRefreshOptions routeRefreshOptions = (RouteRefreshOptions) obj;
        return Objects.equals(this.requestId, routeRefreshOptions.requestId) && this.routeIndex == routeRefreshOptions.routeIndex && this.legIndex == routeRefreshOptions.legIndex && Objects.equals(this.routingProfile, routeRefreshOptions.routingProfile) && Objects.equals(this.baseURL, routeRefreshOptions.baseURL) && Objects.equals(this.currentRouteGeometryIndex, routeRefreshOptions.currentRouteGeometryIndex) && Objects.equals(this.additionalParams, routeRefreshOptions.additionalParams);
    }
}
