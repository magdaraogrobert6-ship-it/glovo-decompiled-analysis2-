package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class SetRoutesParams implements Serializable {
    private final List<RouteInterface> alternativeRoutes;
    private final int legIndex;
    private final RouteInterface primaryRoute;

    public List<RouteInterface> getAlternativeRoutes() {
        return this.alternativeRoutes;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public RouteInterface getPrimaryRoute() {
        return this.primaryRoute;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        RouteInterface routeInterface = this.primaryRoute;
        int i = this.legIndex;
        return Objects.hash(routeInterface, Integer.valueOf(i), this.alternativeRoutes);
    }

    public SetRoutesParams(RouteInterface routeInterface, int i, List<RouteInterface> list) {
        this.primaryRoute = routeInterface;
        this.legIndex = i;
        this.alternativeRoutes = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[primaryRoute: ");
        sb.append(RecordUtils.fieldToString(this.primaryRoute));
        sb.append(", legIndex: ");
        IconCompatParcelizer.write(this.legIndex, ", alternativeRoutes: ", sb);
        return MediaSessionCompatQueueItem.read(this.alternativeRoutes, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRoutesParams setRoutesParams = (SetRoutesParams) obj;
        return Objects.equals(this.primaryRoute, setRoutesParams.primaryRoute) && this.legIndex == setRoutesParams.legIndex && Objects.equals(this.alternativeRoutes, setRoutesParams.alternativeRoutes);
    }
}
