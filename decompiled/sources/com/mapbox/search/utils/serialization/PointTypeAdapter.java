package com.mapbox.search.utils.serialization;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.location.LocationEngineAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class PointTypeAdapter extends TypeAdapter<Point> {
    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Point point) throws IOException {
        Point point2 = point;
        jsonWriter.getClass();
        if (point2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
            return;
        }
        LocationEngineAdapter.AnonymousClass1 anonymousClass1 = new LocationEngineAdapter.AnonymousClass1(3, point2);
        jsonWriter.beginArray();
        anonymousClass1.invoke(jsonWriter);
        jsonWriter.endArray();
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Point read2(JsonReader jsonReader) throws IOException {
        jsonReader.getClass();
        jsonReader.beginArray();
        Point pointFromLngLat = Point.fromLngLat(jsonReader.nextDouble(), jsonReader.nextDouble());
        jsonReader.endArray();
        return pointFromLngLat;
    }
}
