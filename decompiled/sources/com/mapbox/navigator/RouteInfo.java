package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class RouteInfo implements Serializable {
    private final List<UpcomingRouteAlert> alerts;

    public List<UpcomingRouteAlert> getAlerts() {
        return this.alerts;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.alerts);
    }

    public RouteInfo(List<UpcomingRouteAlert> list) {
        this.alerts = list;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read(this.alerts, new StringBuilder("[alerts: "), "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.alerts, ((RouteInfo) obj).alerts);
    }
}
