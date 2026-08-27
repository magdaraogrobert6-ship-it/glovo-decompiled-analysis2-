package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class MatchableRouteObject implements Serializable {
    private final double distanceFromStartOfRoute;
    private final String id;
    private final Double length;
    private final String routeId;

    public double getDistanceFromStartOfRoute() {
        return this.distanceFromStartOfRoute;
    }

    public String getId() {
        return this.id;
    }

    public Double getLength() {
        return this.length;
    }

    public String getRouteId() {
        return this.routeId;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.id;
        double d = this.distanceFromStartOfRoute;
        return Objects.hash(str, Double.valueOf(d), this.length, this.routeId);
    }

    public MatchableRouteObject(String str, double d, Double d2, String str2) {
        this.id = str;
        this.distanceFromStartOfRoute = d;
        this.length = d2;
        this.routeId = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", distanceFromStartOfRoute: ");
        m1$$ExternalSyntheticOutline0.m(this.distanceFromStartOfRoute, ", length: ", sb);
        af$$ExternalSyntheticOutline1.m(this.length, sb, ", routeId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.routeId, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchableRouteObject matchableRouteObject = (MatchableRouteObject) obj;
        return Objects.equals(this.id, matchableRouteObject.id) && PartialEq.compare(this.distanceFromStartOfRoute, matchableRouteObject.distanceFromStartOfRoute) && Objects.equals(this.length, matchableRouteObject.length) && Objects.equals(this.routeId, matchableRouteObject.routeId);
    }
}
