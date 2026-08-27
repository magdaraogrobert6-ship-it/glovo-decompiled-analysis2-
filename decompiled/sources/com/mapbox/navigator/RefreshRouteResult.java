package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class RefreshRouteResult implements Serializable {
    private final List<RouteAlternative> alternatives;
    private final RouteInterface route;

    public List<RouteAlternative> getAlternatives() {
        return this.alternatives;
    }

    public RouteInterface getRoute() {
        return this.route;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.route, this.alternatives);
    }

    public RefreshRouteResult(RouteInterface routeInterface, List<RouteAlternative> list) {
        this.route = routeInterface;
        this.alternatives = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[route: ");
        sb.append(RecordUtils.fieldToString(this.route));
        sb.append(", alternatives: ");
        return MediaSessionCompatQueueItem.read(this.alternatives, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RefreshRouteResult refreshRouteResult = (RefreshRouteResult) obj;
        return Objects.equals(this.route, refreshRouteResult.route) && Objects.equals(this.alternatives, refreshRouteResult.alternatives);
    }
}
