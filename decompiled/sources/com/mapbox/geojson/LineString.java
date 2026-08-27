package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.shifter.CoordinateShifter;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import com.mapbox.geojson.utils.PolylineUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class LineString implements FlattenedCoordinateContainer<List<Point>, FlattenListOfPoints> {
    private static final String TYPE = "LineString";
    private final BoundingBox bbox;
    private final FlattenListOfPoints flattenListOfPoints;
    private final String type;

    public static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<LineString, List<Point>, FlattenListOfPoints> {
        public GsonTypeAdapter(Gson gson) {
            super(gson, new FlattenListOfPointsTypeAdapter());
        }

        @Override // com.mapbox.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Point>> createCoordinateContainer(String str, BoundingBox boundingBox, FlattenListOfPoints flattenListOfPoints) {
            if (str == null) {
                str = LineString.TYPE;
            }
            return new LineString(str, boundingBox, flattenListOfPoints);
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public LineString read2(JsonReader jsonReader) throws IOException {
            return (LineString) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, LineString lineString) throws IOException {
            writeFlattenedCoordinateContainer(jsonWriter, lineString);
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

    public static LineString fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        return (LineString) gsonBuilder.create().fromJson(str, LineString.class);
    }

    public static LineString fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] dArr2 : dArr) {
            arrayList.add(Point.fromLngLat(dArr2));
        }
        return fromLngLats(arrayList);
    }

    public static TypeAdapter<LineString> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    @Override // com.mapbox.geojson.CoordinateContainer
    @Deprecated
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

    public String toPolyline(int i) {
        return PolylineUtils.encode(this.flattenListOfPoints.getFlattenLngLatArray(), i);
    }

    public String toString() {
        return "LineString{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.flattenListOfPoints + "}";
    }

    public static LineString fromPolyline(String str, int i) {
        return fromFlattenArrayOfPoints(PolylineUtils.decodeToFlattenListOfPoints(str, i), null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mapbox.geojson.FlattenedCoordinateContainer
    public FlattenListOfPoints flattenCoordinates() {
        return this.flattenListOfPoints;
    }

    public static LineString fromFlattenArrayOfPoints(double[] dArr, BoundingBox boundingBox) {
        CoordinateShifter coordinateShifter = CoordinateShifterManager.getCoordinateShifter();
        for (int i = 0; i < dArr.length / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            double[] dArrShift = coordinateShifter.shift(dArr[i2], dArr[i3]);
            dArr[i2] = dArrShift[0];
            dArr[i3] = dArrShift[1];
        }
        return new LineString(TYPE, boundingBox, new FlattenListOfPoints(dArr, null));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LineString)) {
            return false;
        }
        LineString lineString = (LineString) obj;
        return Objects.equals(this.type, lineString.type) && Objects.equals(this.bbox, lineString.bbox) && Objects.equals(this.flattenListOfPoints, lineString.flattenListOfPoints);
    }

    public LineString(String str, BoundingBox boundingBox, FlattenListOfPoints flattenListOfPoints) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        if (flattenListOfPoints == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null coordinates");
            throw null;
        }
        this.flattenListOfPoints = flattenListOfPoints;
        this.type = str;
        this.bbox = boundingBox;
    }

    public LineString(String str, BoundingBox boundingBox, List<Point> list) {
        this(str, boundingBox, new FlattenListOfPoints(list));
    }

    public static LineString fromLngLats(List<Point> list) {
        return new LineString(TYPE, (BoundingBox) null, list);
    }

    public static LineString fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new LineString(TYPE, boundingBox, list);
    }

    public static LineString fromLngLats(MultiPoint multiPoint) {
        return new LineString(TYPE, (BoundingBox) null, multiPoint.coordinates());
    }
}
