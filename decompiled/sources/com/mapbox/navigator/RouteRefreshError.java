package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RouteRefreshError implements Serializable {
    private final String message;
    private final Integer refreshTtl;
    private final RouteRefreshErrorType type;

    public String getMessage() {
        return this.message;
    }

    public Integer getRefreshTtl() {
        return this.refreshTtl;
    }

    public RouteRefreshErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.message, this.type, this.refreshTtl);
    }

    public RouteRefreshError(String str, RouteRefreshErrorType routeRefreshErrorType, Integer num) {
        this.message = str;
        this.type = routeRefreshErrorType;
        this.refreshTtl = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[message: ");
        IconCompatParcelizer.read(sb, this.message, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", refreshTtl: ");
        sb.append(RecordUtils.fieldToString(this.refreshTtl));
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
        RouteRefreshError routeRefreshError = (RouteRefreshError) obj;
        return Objects.equals(this.message, routeRefreshError.message) && Objects.equals(this.type, routeRefreshError.type) && Objects.equals(this.refreshTtl, routeRefreshError.refreshTtl);
    }
}
