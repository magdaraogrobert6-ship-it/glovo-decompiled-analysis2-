package com.mapbox.maps;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinateBounds implements Serializable {
    private final boolean infiniteBounds;
    private final Point northeast;
    private final Point southwest;

    public static native CoordinateBounds hull(Point point, Point point2);

    private static native void nativeSelfRegister();

    public static native CoordinateBounds singleton(Point point);

    public static native CoordinateBounds world();

    public native Point center();

    public native Point constrain(Point point);

    public native boolean contains(Point point, boolean z);

    public native boolean contains(CoordinateBounds coordinateBounds, boolean z);

    public native boolean containsLatitude(double d);

    public native boolean containsLongitude(double d);

    public native boolean crossesAntimeridian();

    public native double east();

    public native CoordinateBounds extend(Point point);

    public native CoordinateBounds extend(CoordinateBounds coordinateBounds);

    public boolean getInfiniteBounds() {
        return this.infiniteBounds;
    }

    public Point getNortheast() {
        return this.northeast;
    }

    public Point getSouthwest() {
        return this.southwest;
    }

    public native boolean intersects(CoordinateBounds coordinateBounds, boolean z);

    public native boolean isBounded();

    public native boolean isEmpty();

    public native boolean isValid();

    public native double latitudeSpan();

    public native double longitudeSpan();

    public native double north();

    public native Point northwest();

    public native double south();

    public native Point southeast();

    public native double west();

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public int hashCode() {
        return Objects.hash(this.southwest, this.northeast, Boolean.valueOf(this.infiniteBounds));
    }

    public CoordinateBounds(Point point, Point point2) {
        this.southwest = point;
        this.northeast = point2;
        this.infiniteBounds = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[southwest: ");
        c8$$ExternalSyntheticOutline0.m(this.southwest, sb, ", northeast: ");
        c8$$ExternalSyntheticOutline0.m(this.northeast, sb, ", infiniteBounds: ");
        return ff$$ExternalSyntheticOutline0.m(this.infiniteBounds, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoordinateBounds coordinateBounds = (CoordinateBounds) obj;
        return Objects.equals(this.southwest, coordinateBounds.southwest) && Objects.equals(this.northeast, coordinateBounds.northeast) && this.infiniteBounds == coordinateBounds.infiniteBounds;
    }

    public CoordinateBounds(Point point, Point point2, boolean z) {
        this.southwest = point;
        this.northeast = point2;
        this.infiniteBounds = z;
    }
}
