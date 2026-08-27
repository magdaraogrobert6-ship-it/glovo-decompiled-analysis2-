package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.TypeAdapterFactory;
import com.mapbox.geojson.internal.typeadapters.RuntimeTypeAdapterFactory;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class GeometryAdapterFactory implements TypeAdapterFactory {
    private static TypeAdapterFactory geometryTypeFactory;

    public static TypeAdapterFactory create() {
        if (geometryTypeFactory == null) {
            geometryTypeFactory = RuntimeTypeAdapterFactory.of(Geometry.class, "type", true).registerSubtype(GeometryCollection.class, "GeometryCollection").registerSubtype(Point.class, "Point").registerSubtype(MultiPoint.class, "MultiPoint").registerSubtype(LineString.class, "LineString").registerSubtype(MultiLineString.class, "MultiLineString").registerSubtype(Polygon.class, "Polygon").registerSubtype(MultiPolygon.class, "MultiPolygon");
        }
        return geometryTypeFactory;
    }
}
