package com.mapbox.search.internal.bindgen;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RoutablePoint implements Serializable {
    private final String name;
    private final Point point;

    public String getName() {
        return this.name;
    }

    public Point getPoint() {
        return this.point;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.point, this.name);
    }

    public RoutablePoint(Point point, String str) {
        this.point = point;
        this.name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[point: ");
        c8$$ExternalSyntheticOutline0.m(this.point, sb, ", name: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.name, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutablePoint routablePoint = (RoutablePoint) obj;
        return Objects.equals(this.point, routablePoint.point) && Objects.equals(this.name, routablePoint.name);
    }
}
