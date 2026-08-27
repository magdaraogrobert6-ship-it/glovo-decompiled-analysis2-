package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class ListOfDoublesCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<double[]> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public double[] read2(JsonReader jsonReader) throws IOException {
        return readPointList(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, double[] dArr) throws IOException {
        writePointList(jsonWriter, dArr);
    }
}
