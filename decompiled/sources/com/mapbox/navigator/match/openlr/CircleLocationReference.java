package com.mapbox.navigator.match.openlr;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class CircleLocationReference implements Serializable {
    private final Point coord;
    private final int radiusMeters;

    public Point getCoord() {
        return this.coord;
    }

    public int getRadiusMeters() {
        return this.radiusMeters;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.coord, Integer.valueOf(this.radiusMeters));
    }

    public CircleLocationReference(Point point, int i) {
        this.coord = point;
        this.radiusMeters = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[coord: ");
        c8$$ExternalSyntheticOutline0.m(this.coord, sb, ", radiusMeters: ");
        return SweepGradientShader9KIMszodefault.serializer(this.radiusMeters, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CircleLocationReference circleLocationReference = (CircleLocationReference) obj;
        return Objects.equals(this.coord, circleLocationReference.coord) && this.radiusMeters == circleLocationReference.radiusMeters;
    }
}
