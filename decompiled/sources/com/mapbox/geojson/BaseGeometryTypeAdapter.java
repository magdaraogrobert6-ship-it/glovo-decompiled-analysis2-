package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@Keep
abstract class BaseGeometryTypeAdapter<G, T, A> extends TypeAdapter<G> {
    private volatile TypeAdapter<BoundingBox> boundingBoxAdapter;
    private final BaseCoordinatesTypeAdapter<A> coordinatesAdapter;
    private final Gson gson;
    private volatile TypeAdapter<String> stringAdapter;

    public abstract CoordinateContainer<T> createCoordinateContainer(String str, BoundingBox boundingBox, A a);

    public void writeCoordinateContainer(JsonWriter jsonWriter, CoordinateContainer<A> coordinateContainer) throws IOException {
        if (coordinateContainer == null) {
            jsonWriter.nullValue();
            return;
        }
        writeCommon(jsonWriter, coordinateContainer);
        jsonWriter.name("coordinates");
        if (coordinateContainer.coordinates() == null) {
            jsonWriter.nullValue();
        } else {
            this.coordinatesAdapter.write(jsonWriter, coordinateContainer.coordinates());
        }
        jsonWriter.endObject();
    }

    public void writeFlattenedCoordinateContainer(JsonWriter jsonWriter, FlattenedCoordinateContainer<T, A> flattenedCoordinateContainer) throws IOException {
        if (flattenedCoordinateContainer == null) {
            jsonWriter.nullValue();
            return;
        }
        writeCommon(jsonWriter, flattenedCoordinateContainer);
        jsonWriter.name("coordinates");
        this.coordinatesAdapter.write(jsonWriter, flattenedCoordinateContainer.flattenCoordinates());
        jsonWriter.endObject();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    public CoordinateContainer<T> readCoordinateContainer(JsonReader jsonReader) throws IOException {
        byte b;
        String str = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        BoundingBox boundingBox = null;
        A a = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                strNextName.getClass();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3017257) {
                    if (iHashCode != 3575610) {
                        if (iHashCode == 1871919611 && strNextName.equals("coordinates")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("type")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("bbox")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    TypeAdapter<BoundingBox> adapter = this.boundingBoxAdapter;
                    if (adapter == null) {
                        adapter = this.gson.getAdapter(BoundingBox.class);
                        this.boundingBoxAdapter = adapter;
                    }
                    boundingBox = adapter.read2(jsonReader);
                } else if (b == 1) {
                    TypeAdapter<String> adapter2 = this.stringAdapter;
                    if (adapter2 == null) {
                        adapter2 = this.gson.getAdapter(String.class);
                        this.stringAdapter = adapter2;
                    }
                    str = adapter2.read2(jsonReader);
                } else if (b != 2) {
                    jsonReader.skipValue();
                } else {
                    BaseCoordinatesTypeAdapter<A> baseCoordinatesTypeAdapter = this.coordinatesAdapter;
                    if (baseCoordinatesTypeAdapter == null) {
                        throw new GeoJsonException("Coordinates type adapter is null");
                    }
                    a = baseCoordinatesTypeAdapter.read2(jsonReader);
                }
            }
        }
        jsonReader.endObject();
        return createCoordinateContainer(str, boundingBox, a);
    }

    public BaseGeometryTypeAdapter(Gson gson, BaseCoordinatesTypeAdapter<A> baseCoordinatesTypeAdapter) {
        if (baseCoordinatesTypeAdapter == null) {
            throw new GeoJsonException("Coordinates type adapter is null");
        }
        this.gson = gson;
        this.coordinatesAdapter = baseCoordinatesTypeAdapter;
        this.boundingBoxAdapter = new BoundingBoxTypeAdapter();
    }

    private void writeCommon(JsonWriter jsonWriter, CoordinateContainer coordinateContainer) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("type");
        if (coordinateContainer.type() == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter<String> adapter = this.stringAdapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(String.class);
                this.stringAdapter = adapter;
            }
            adapter.write(jsonWriter, coordinateContainer.type());
        }
        jsonWriter.name("bbox");
        if (coordinateContainer.bbox() == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter<BoundingBox> adapter2 = this.boundingBoxAdapter;
        if (adapter2 == null) {
            adapter2 = this.gson.getAdapter(BoundingBox.class);
            this.boundingBoxAdapter = adapter2;
        }
        adapter2.write(jsonWriter, coordinateContainer.bbox());
    }
}
