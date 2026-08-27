package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    @Deprecated
    public static BoundingBox fromCoordinates(double d, double d2, double d3, double d4) {
        return fromLngLats(d, d2, d3, d4);
    }

    public Point northeast() {
        return this.northeast;
    }

    public Point southwest() {
        return this.southwest;
    }

    public static BoundingBox fromJson(String str) {
        return (BoundingBox) new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().fromJson(str, BoundingBox.class);
    }

    public static BoundingBox fromLngLats(double d, double d2, double d3, double d4) {
        return new BoundingBox(Point.fromLngLat(d, d2), Point.fromLngLat(d3, d4));
    }

    public static BoundingBox fromPoints(Point point, Point point2) {
        return new BoundingBox(point, point2);
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new BoundingBoxTypeAdapter();
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public final String toJson() {
        return new GsonBuilder().registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).create().toJson(this, BoundingBox.class);
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        return this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast());
    }

    public final double north() {
        return northeast().latitude();
    }

    public final double south() {
        return southwest().latitude();
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + "}";
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d, double d2, double d3, double d4, double d5, double d6) {
        return fromLngLats(d, d2, d3, d4, d5, d6);
    }

    public BoundingBox(Point point, Point point2) {
        if (point == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null southwest");
            throw null;
        }
        this.southwest = point;
        if (point2 != null) {
            this.northeast = point2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null northeast");
            throw null;
        }
    }

    public static BoundingBox fromLngLats(double d, double d2, double d3, double d4, double d5, double d6) {
        return new BoundingBox(Point.fromLngLat(d, d2, d3), Point.fromLngLat(d4, d5, d6));
    }
}
