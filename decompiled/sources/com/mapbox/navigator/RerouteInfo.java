package com.mapbox.navigator;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RerouteInfo implements Serializable {
    private final RouterOrigin origin;
    private final String routeRequest;
    private final DataRef routeResponse;

    public RouterOrigin getOrigin() {
        return this.origin;
    }

    public String getRouteRequest() {
        return this.routeRequest;
    }

    public DataRef getRouteResponse() {
        return this.routeResponse;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.routeResponse, this.routeRequest, this.origin);
    }

    public RerouteInfo(DataRef dataRef, String str, RouterOrigin routerOrigin) {
        this.routeResponse = dataRef;
        this.routeRequest = str;
        this.origin = routerOrigin;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[routeResponse: ");
        sb.append(RecordUtils.fieldToString(this.routeResponse));
        sb.append(", routeRequest: ");
        IconCompatParcelizer.read(sb, this.routeRequest, ", origin: ");
        sb.append(RecordUtils.fieldToString(this.origin));
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
        RerouteInfo rerouteInfo = (RerouteInfo) obj;
        return Objects.equals(this.routeResponse, rerouteInfo.routeResponse) && Objects.equals(this.routeRequest, rerouteInfo.routeRequest) && Objects.equals(this.origin, rerouteInfo.origin);
    }
}
