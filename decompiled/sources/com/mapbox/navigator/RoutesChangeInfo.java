package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class RoutesChangeInfo implements Serializable {
    private final List<RouteAlternative> alternativeRoutes;
    private final AlternativeRoutesChangeReason alternativeRoutesChangeReason;
    private final RouteInterface primaryRoute;
    private final PrimaryRouteChangeReason primaryRouteChangeReason;

    public List<RouteAlternative> getAlternativeRoutes() {
        return this.alternativeRoutes;
    }

    public AlternativeRoutesChangeReason getAlternativeRoutesChangeReason() {
        return this.alternativeRoutesChangeReason;
    }

    public RouteInterface getPrimaryRoute() {
        return this.primaryRoute;
    }

    public PrimaryRouteChangeReason getPrimaryRouteChangeReason() {
        return this.primaryRouteChangeReason;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.primaryRouteChangeReason, this.primaryRoute, this.alternativeRoutesChangeReason, this.alternativeRoutes);
    }

    public RoutesChangeInfo(PrimaryRouteChangeReason primaryRouteChangeReason, RouteInterface routeInterface, AlternativeRoutesChangeReason alternativeRoutesChangeReason, List<RouteAlternative> list) {
        this.primaryRouteChangeReason = primaryRouteChangeReason;
        this.primaryRoute = routeInterface;
        this.alternativeRoutesChangeReason = alternativeRoutesChangeReason;
        this.alternativeRoutes = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[primaryRouteChangeReason: ");
        sb.append(RecordUtils.fieldToString(this.primaryRouteChangeReason));
        sb.append(", primaryRoute: ");
        sb.append(RecordUtils.fieldToString(this.primaryRoute));
        sb.append(", alternativeRoutesChangeReason: ");
        sb.append(RecordUtils.fieldToString(this.alternativeRoutesChangeReason));
        sb.append(", alternativeRoutes: ");
        return MediaSessionCompatQueueItem.read(this.alternativeRoutes, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutesChangeInfo routesChangeInfo = (RoutesChangeInfo) obj;
        return Objects.equals(this.primaryRouteChangeReason, routesChangeInfo.primaryRouteChangeReason) && Objects.equals(this.primaryRoute, routesChangeInfo.primaryRoute) && Objects.equals(this.alternativeRoutesChangeReason, routesChangeInfo.alternativeRoutesChangeReason) && Objects.equals(this.alternativeRoutes, routesChangeInfo.alternativeRoutes);
    }
}
