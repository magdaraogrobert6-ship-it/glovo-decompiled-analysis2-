package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class MultiPoint implements FlattenedCoordinateContainer<List<Point>, FlattenListOfPoints> {
    private static final String TYPE = "MultiPoint";
    private final BoundingBox bbox;
    private final FlattenListOfPoints flattenListOfPoints;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPoint, List<Point>, FlattenListOfPoints> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new FlattenListOfPointsTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Point>> createCoordinateContainer(String str, BoundingBox boundingBox, FlattenListOfPoints flattenListOfPoints) {
            if (str == null) {
                str = MultiPoint.TYPE;
            }
            return new MultiPoint(str, boundingBox, flattenListOfPoints);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public MultiPoint read2(JsonReader jsonReader) throws IOException {
            return (MultiPoint) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MultiPoint multiPoint) throws IOException {
            writeFlattenedCoordinateContainer(jsonWriter, multiPoint);
        }
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static MultiPoint fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (MultiPoint) gsonBuilder.create().fromJson(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] dArr2 : dArr) {
            arrayList.add(Point.fromLngLat(dArr2));
        }
        return new MultiPoint(TYPE, (BoundingBox) null, arrayList);
    }

    public static TypeAdapter<MultiPoint> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    public List<Point> coordinates() {
        return this.flattenListOfPoints.points();
    }

    public int hashCode() {
        return Objects.hash(this.type, this.bbox, this.flattenListOfPoints);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        return "MultiPoint{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.flattenListOfPoints + "}";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mapbox.geojson.FlattenedCoordinateContainer
    public FlattenListOfPoints flattenCoordinates() {
        return this.flattenListOfPoints;
    }

    public MultiPoint(String str, BoundingBox boundingBox, FlattenListOfPoints flattenListOfPoints) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (flattenListOfPoints != null) {
            this.flattenListOfPoints = flattenListOfPoints;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null coordinates");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MultiPoint)) {
            return false;
        }
        MultiPoint multiPoint = (MultiPoint) obj;
        return Objects.equals(this.type, multiPoint.type) && Objects.equals(this.bbox, multiPoint.bbox) && Objects.equals(this.flattenListOfPoints, multiPoint.flattenListOfPoints);
    }

    public MultiPoint(String str, BoundingBox boundingBox, List<Point> list) {
        this(str, boundingBox, new FlattenListOfPoints(list));
    }

    public static MultiPoint fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new MultiPoint(TYPE, boundingBox, list);
    }

    public static MultiPoint fromLngLats(List<Point> list) {
        return new MultiPoint(TYPE, (BoundingBox) null, list);
    }
}
