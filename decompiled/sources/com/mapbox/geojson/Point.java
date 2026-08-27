package com.mapbox.geojson;

import androidx.annotation.Keep;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Point implements FlattenedCoordinateContainer<List<Double>, double[]> {
    static final String TYPE = "Point";
    private final BoundingBox bbox;
    private final double[] coordinates;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Point, List<Double>, double[]> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfDoublesCoordinatesTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Double>> createCoordinateContainer(String str, BoundingBox boundingBox, double[] dArr) {
            if (str == null) {
                str = Point.TYPE;
            }
            return new Point(str, boundingBox, dArr);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Point read2(JsonReader jsonReader) throws IOException {
            return (Point) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Point point) throws IOException {
            writeFlattenedCoordinateContainer(jsonWriter, point);
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

    public static Point fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (Point) gsonBuilder.create().fromJson(str, Point.class);
    }

    public static TypeAdapter<Point> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public double altitude() {
        double[] dArr = this.coordinates;
        if (dArr.length < 3) {
            return Double.NaN;
        }
        return dArr[2];
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    @Deprecated
    public List<Double> coordinates() {
        ArrayList arrayList = new ArrayList(this.coordinates.length);
        for (double d : this.coordinates) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        BoundingBox boundingBox = this.bbox;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ Arrays.hashCode(this.coordinates);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public String toString() {
        String strM;
        double[] dArr = this.coordinates;
        if (dArr.length > 2) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(dArr[0]);
            sb.append(", ");
            sb.append(this.coordinates[1]);
            sb.append(", ");
            strM = ff$$ExternalSyntheticOutline0.m(this.coordinates[2], "]", sb);
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(dArr[0]);
            sb2.append(", ");
            strM = ff$$ExternalSyntheticOutline0.m(this.coordinates[1], "]", sb2);
        }
        return "Point{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + strM + "}";
    }

    public Point(String str, BoundingBox boundingBox, double[] dArr) {
        this.type = str;
        this.bbox = boundingBox;
        if (dArr.length != 0) {
            this.coordinates = dArr;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null coordinates");
            throw null;
        }
    }

    public double latitude() {
        return this.coordinates[1];
    }

    public double longitude() {
        return this.coordinates[0];
    }

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    @Override // com.mapbox.geojson.FlattenedCoordinateContainer
    public double[] flattenCoordinates() {
        return this.coordinates;
    }

    public static Point fromLngLat(double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return Objects.equals(this.type, point.type) && Objects.equals(this.bbox, point.bbox) && Objects.deepEquals(this.coordinates, point.coordinates);
    }

    public static Point fromLngLat(double d, double d2, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shift(d, d2));
    }

    public static Point fromLngLat(double d, double d2, double d3) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shift(d, d2, d3));
    }

    public static Point fromLngLat(double d, double d2, double d3, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shift(d, d2, d3));
    }

    public static Point fromLngLat(double d, double d2) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shift(d, d2));
    }
}
