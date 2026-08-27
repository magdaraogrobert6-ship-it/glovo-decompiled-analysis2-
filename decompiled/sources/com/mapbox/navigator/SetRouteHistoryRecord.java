package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class SetRouteHistoryRecord implements Serializable {
    private final int legIndex;
    private final MapboxAPI mapboxApi;
    private final RouterOrigin origin;
    private final SetRoutesReason reason;
    private final String routeId;
    private final int routeIndex;
    private final String routeRequest;
    private final String routeResponse;

    public int getLegIndex() {
        return this.legIndex;
    }

    public MapboxAPI getMapboxApi() {
        return this.mapboxApi;
    }

    public RouterOrigin getOrigin() {
        return this.origin;
    }

    public SetRoutesReason getReason() {
        return this.reason;
    }

    public String getRouteId() {
        return this.routeId;
    }

    public int getRouteIndex() {
        return this.routeIndex;
    }

    public String getRouteRequest() {
        return this.routeRequest;
    }

    public String getRouteResponse() {
        return this.routeResponse;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.routeResponse;
        int i = this.routeIndex;
        int i2 = this.legIndex;
        return Objects.hash(str, Integer.valueOf(i), Integer.valueOf(i2), this.routeRequest, this.origin, this.mapboxApi, this.reason, this.routeId);
    }

    public SetRouteHistoryRecord(String str, int i, int i2, String str2, RouterOrigin routerOrigin, MapboxAPI mapboxAPI, SetRoutesReason setRoutesReason, String str3) {
        this.routeResponse = str;
        this.routeIndex = i;
        this.legIndex = i2;
        this.routeRequest = str2;
        this.origin = routerOrigin;
        this.mapboxApi = mapboxAPI;
        this.reason = setRoutesReason;
        this.routeId = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[routeResponse: ");
        IconCompatParcelizer.read(sb, this.routeResponse, ", routeIndex: ");
        IconCompatParcelizer.write(this.routeIndex, ", legIndex: ", sb);
        IconCompatParcelizer.write(this.legIndex, ", routeRequest: ", sb);
        IconCompatParcelizer.read(sb, this.routeRequest, ", origin: ");
        sb.append(RecordUtils.fieldToString(this.origin));
        sb.append(", mapboxApi: ");
        sb.append(RecordUtils.fieldToString(this.mapboxApi));
        sb.append(", reason: ");
        sb.append(RecordUtils.fieldToString(this.reason));
        sb.append(", routeId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.routeId, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRouteHistoryRecord setRouteHistoryRecord = (SetRouteHistoryRecord) obj;
        return Objects.equals(this.routeResponse, setRouteHistoryRecord.routeResponse) && this.routeIndex == setRouteHistoryRecord.routeIndex && this.legIndex == setRouteHistoryRecord.legIndex && Objects.equals(this.routeRequest, setRouteHistoryRecord.routeRequest) && Objects.equals(this.origin, setRouteHistoryRecord.origin) && Objects.equals(this.mapboxApi, setRouteHistoryRecord.mapboxApi) && Objects.equals(this.reason, setRouteHistoryRecord.reason) && Objects.equals(this.routeId, setRouteHistoryRecord.routeId);
    }
}
