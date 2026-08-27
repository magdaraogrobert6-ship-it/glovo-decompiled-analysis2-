package com.mapbox.maps;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CoordinateInfo implements Serializable {
    private final Point coordinate;
    private final boolean isOnSurface;

    public Point getCoordinate() {
        return this.coordinate;
    }

    public boolean getIsOnSurface() {
        return this.isOnSurface;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.coordinate, Boolean.valueOf(this.isOnSurface));
    }

    public CoordinateInfo(Point point, boolean z) {
        this.coordinate = point;
        this.isOnSurface = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[coordinate: ");
        c8$$ExternalSyntheticOutline0.m(this.coordinate, sb, ", isOnSurface: ");
        return ff$$ExternalSyntheticOutline0.m(this.isOnSurface, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CoordinateInfo.class != obj.getClass()) {
            return false;
        }
        CoordinateInfo coordinateInfo = (CoordinateInfo) obj;
        return Objects.equals(this.coordinate, coordinateInfo.coordinate) && this.isOnSurface == coordinateInfo.isOnSurface;
    }
}
