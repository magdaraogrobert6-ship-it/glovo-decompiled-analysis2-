package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class RouteAlternative implements Serializable {
    private final RouteIntersection alternativeRouteFork;
    private final int id;
    private final AlternativeRouteInfo infoFromFork;
    private final AlternativeRouteInfo infoFromStart;
    private final boolean isNew;
    private final RouteIntersection mainRouteFork;
    private final RouteInterface route;

    public RouteIntersection getAlternativeRouteFork() {
        return this.alternativeRouteFork;
    }

    public int getId() {
        return this.id;
    }

    public AlternativeRouteInfo getInfoFromFork() {
        return this.infoFromFork;
    }

    public AlternativeRouteInfo getInfoFromStart() {
        return this.infoFromStart;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public RouteIntersection getMainRouteFork() {
        return this.mainRouteFork;
    }

    public RouteInterface getRoute() {
        return this.route;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RouteAlternative(int i, RouteInterface routeInterface, RouteIntersection routeIntersection, RouteIntersection routeIntersection2, AlternativeRouteInfo alternativeRouteInfo, AlternativeRouteInfo alternativeRouteInfo2, boolean z) {
        this.id = i;
        this.route = routeInterface;
        this.mainRouteFork = routeIntersection;
        this.alternativeRouteFork = routeIntersection2;
        this.infoFromFork = alternativeRouteInfo;
        this.infoFromStart = alternativeRouteInfo2;
        this.isNew = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.write(this.id, ", route: ", sb);
        sb.append(RecordUtils.fieldToString(this.route));
        sb.append(", mainRouteFork: ");
        sb.append(RecordUtils.fieldToString(this.mainRouteFork));
        sb.append(", alternativeRouteFork: ");
        sb.append(RecordUtils.fieldToString(this.alternativeRouteFork));
        sb.append(", infoFromFork: ");
        sb.append(RecordUtils.fieldToString(this.infoFromFork));
        sb.append(", infoFromStart: ");
        sb.append(RecordUtils.fieldToString(this.infoFromStart));
        sb.append(", isNew: ");
        return ff$$ExternalSyntheticOutline0.m(this.isNew, sb, "]");
    }

    public int hashCode() {
        int i = this.id;
        return Objects.hash(Integer.valueOf(i), this.route, this.mainRouteFork, this.alternativeRouteFork, this.infoFromFork, this.infoFromStart, Boolean.valueOf(this.isNew));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteAlternative routeAlternative = (RouteAlternative) obj;
        return this.id == routeAlternative.id && Objects.equals(this.route, routeAlternative.route) && Objects.equals(this.mainRouteFork, routeAlternative.mainRouteFork) && Objects.equals(this.alternativeRouteFork, routeAlternative.alternativeRouteFork) && Objects.equals(this.infoFromFork, routeAlternative.infoFromFork) && Objects.equals(this.infoFromStart, routeAlternative.infoFromStart) && this.isNew == routeAlternative.isNew;
    }
}
