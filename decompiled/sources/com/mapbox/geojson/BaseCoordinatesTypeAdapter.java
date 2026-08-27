package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import com.mapbox.geojson.utils.GeoJsonUtils;
import java.io.IOException;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes2.dex */
@Keep
abstract class BaseCoordinatesTypeAdapter<T> extends TypeAdapter<T> {
    public Point readPoint(JsonReader jsonReader) throws IOException {
        return new Point("Point", null, readPointList(jsonReader));
    }

    public void writePoint(JsonWriter jsonWriter, Point point) throws IOException {
        if (point == null) {
            return;
        }
        writePointList(jsonWriter, point.flattenCoordinates());
    }

    public void writePointList(JsonWriter jsonWriter, double[] dArr) throws IOException {
        if (dArr == null) {
            return;
        }
        jsonWriter.beginArray();
        double[] dArrUnshiftPointArray = CoordinateShifterManager.getCoordinateShifter().unshiftPointArray(dArr);
        jsonWriter.value(GeoJsonUtils.trim(dArrUnshiftPointArray[0]));
        jsonWriter.value(GeoJsonUtils.trim(dArrUnshiftPointArray[1]));
        if (dArr.length > 2) {
            jsonWriter.value(dArrUnshiftPointArray[2]);
        }
        jsonWriter.endArray();
    }

    public double[] readPointList(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            throw null;
        }
        jsonReader.beginArray();
        if (!jsonReader.hasNext()) {
            DrawableTransformation.read("Point coordinates should contain at least two values");
            return null;
        }
        double dNextDouble = jsonReader.nextDouble();
        if (!jsonReader.hasNext()) {
            DrawableTransformation.read("Point coordinates should contain at least two values");
            return null;
        }
        double dNextDouble2 = jsonReader.nextDouble();
        if (!jsonReader.hasNext()) {
            jsonReader.endArray();
            return CoordinateShifterManager.getCoordinateShifter().shift(dNextDouble, dNextDouble2);
        }
        double dNextDouble3 = jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return CoordinateShifterManager.getCoordinateShifter().shift(dNextDouble, dNextDouble2, dNextDouble3);
    }
}
