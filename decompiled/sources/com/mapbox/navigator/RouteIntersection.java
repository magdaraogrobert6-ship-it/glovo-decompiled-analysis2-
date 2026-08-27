package com.mapbox.navigator;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RouteIntersection implements Serializable {
    private final int geometryIndex;
    private final int legIndex;
    private final Point location;
    private final int segmentIndex;

    public int getGeometryIndex() {
        return this.geometryIndex;
    }

    public int getLegIndex() {
        return this.legIndex;
    }

    public Point getLocation() {
        return this.location;
    }

    public int getSegmentIndex() {
        return this.segmentIndex;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.location, Integer.valueOf(this.geometryIndex), Integer.valueOf(this.segmentIndex), Integer.valueOf(this.legIndex));
    }

    public RouteIntersection(Point point, int i, int i2, int i3) {
        this.location = point;
        this.geometryIndex = i;
        this.segmentIndex = i2;
        this.legIndex = i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[location: ");
        c8$$ExternalSyntheticOutline0.m(this.location, sb, ", geometryIndex: ");
        IconCompatParcelizer.write(this.geometryIndex, ", segmentIndex: ", sb);
        IconCompatParcelizer.write(this.segmentIndex, ", legIndex: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.legIndex, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteIntersection routeIntersection = (RouteIntersection) obj;
        return Objects.equals(this.location, routeIntersection.location) && this.geometryIndex == routeIntersection.geometryIndex && this.segmentIndex == routeIntersection.segmentIndex && this.legIndex == routeIntersection.legIndex;
    }
}
