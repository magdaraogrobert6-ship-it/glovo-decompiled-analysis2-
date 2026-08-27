package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import java.io.IOException;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class FlattenListOfPointsTypeAdapter extends BaseCoordinatesTypeAdapter<FlattenListOfPoints> {
    private static final int INITIAL_CAPACITY = 100;

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, FlattenListOfPoints flattenListOfPoints) throws IOException {
        double[] dArr;
        if (flattenListOfPoints == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int size = flattenListOfPoints.size();
        if (size == 0) {
            jsonWriter.endArray();
            return;
        }
        double[] flattenLngLatArray = flattenListOfPoints.getFlattenLngLatArray();
        double[] altitudes = flattenListOfPoints.getAltitudes();
        for (int i = 0; i < size; i++) {
            if (altitudes == null || Double.isNaN(altitudes[i])) {
                int i2 = i * 2;
                dArr = new double[]{flattenLngLatArray[i2], flattenLngLatArray[i2 + 1]};
            } else {
                int i3 = i * 2;
                dArr = new double[]{flattenLngLatArray[i3], flattenLngLatArray[i3 + 1], altitudes[i]};
            }
            writePointList(jsonWriter, dArr);
        }
        jsonWriter.endArray();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public FlattenListOfPoints read2(JsonReader jsonReader) throws IOException {
        double[] dArr = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            throw null;
        }
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            throw new GeoJsonException("coordinates should be non-null array of array of double");
        }
        jsonReader.beginArray();
        double[] dArr2 = new double[200];
        int i = 0;
        double[] dArr3 = null;
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            if (!jsonReader.hasNext()) {
                DrawableTransformation.read("Point coordinates should contain at least two values");
                return null;
            }
            int i2 = i * 2;
            dArr2[i2] = jsonReader.nextDouble();
            if (!jsonReader.hasNext()) {
                DrawableTransformation.read("Point coordinates should contain at least two values");
                return null;
            }
            dArr2[i2 + 1] = jsonReader.nextDouble();
            if (jsonReader.hasNext()) {
                if (dArr3 == null) {
                    dArr3 = new double[dArr2.length / 2];
                    for (int i3 = 0; i3 < i; i3++) {
                        dArr3[i3] = Double.NaN;
                    }
                }
                dArr3[i] = jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
            } else {
                jsonReader.endArray();
                if (dArr3 != null) {
                    dArr3[i] = Double.NaN;
                }
            }
            i++;
            if (i * 2 >= dArr2.length) {
                double[] dArr4 = new double[dArr2.length * 2];
                System.arraycopy(dArr2, 0, dArr4, 0, dArr2.length);
                if (dArr3 != null) {
                    double[] dArr5 = new double[dArr3.length * 2];
                    System.arraycopy(dArr3, 0, dArr5, 0, dArr3.length);
                    dArr3 = dArr5;
                }
                dArr2 = dArr4;
            }
        }
        jsonReader.endArray();
        int i4 = i * 2;
        double[] dArr6 = new double[i4];
        System.arraycopy(dArr2, 0, dArr6, 0, i4);
        if (dArr3 != null) {
            dArr = new double[i];
            System.arraycopy(dArr3, 0, dArr, 0, i);
        }
        return new FlattenListOfPoints(dArr6, dArr);
    }
}
