package com.mapbox.navigation.ui.maps.internal.route.line;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.FeatureCollection;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class FeatureCollectionAdapter extends TypeAdapter<FeatureCollection> {
    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, FeatureCollection featureCollection) throws IOException {
        FeatureCollection featureCollection2 = featureCollection;
        jsonWriter.getClass();
        jsonWriter.value(featureCollection2 != null ? featureCollection2.toJson() : null);
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final FeatureCollection read2(JsonReader jsonReader) {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        return FeatureCollection.fromJson(jsonReader.nextString());
    }
}
