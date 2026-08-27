package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class GeometryCollection implements Geometry {
    private static final String TYPE = "GeometryCollection";
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    public static final class GsonTypeAdapter extends TypeAdapter<GeometryCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Geometry>> listGeometryAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, GeometryCollection geometryCollection) throws IOException {
            if (geometryCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (geometryCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.stringTypeAdapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = adapter;
                }
                adapter.write(jsonWriter, geometryCollection.type());
            }
            jsonWriter.name("bbox");
            if (geometryCollection.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> adapter2 = this.boundingBoxTypeAdapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxTypeAdapter = adapter2;
                }
                adapter2.write(jsonWriter, geometryCollection.bbox());
            }
            jsonWriter.name("geometries");
            if (geometryCollection.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Geometry>> adapter3 = this.listGeometryAdapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
                    this.listGeometryAdapter = adapter3;
                }
                adapter3.write(jsonWriter, geometryCollection.geometries());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:29:0x0060  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public GeometryCollection read2(JsonReader jsonReader) throws IOException {
            byte b;
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            BoundingBox boundingBox = null;
            List<Geometry> list = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3017257) {
                        if (iHashCode != 3575610) {
                            if (iHashCode == 203916432 && strNextName.equals("geometries")) {
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
                        TypeAdapter<BoundingBox> adapter = this.boundingBoxTypeAdapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(BoundingBox.class);
                            this.boundingBoxTypeAdapter = adapter;
                        }
                        boundingBox = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<String> adapter2 = this.stringTypeAdapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.stringTypeAdapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else if (b != 2) {
                        jsonReader.skipValue();
                    } else {
                        TypeAdapter<List<Geometry>> adapter3 = this.listGeometryAdapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
                            this.listGeometryAdapter = adapter3;
                        }
                        list = adapter3.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            if (str == null) {
                str = GeometryCollection.TYPE;
            }
            return new GeometryCollection(str, boundingBox, list);
        }
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public List<Geometry> geometries() {
        return this.geometries;
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static GeometryCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return (GeometryCollection) gsonBuilder.create().fromJson(str, GeometryCollection.class);
    }

    public static TypeAdapter<GeometryCollection> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        BoundingBox boundingBox = this.bbox;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.geometries.hashCode();
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return gsonBuilder.create().toJson(this);
    }

    public static GeometryCollection fromGeometry(Geometry geometry) {
        return new GeometryCollection(TYPE, null, Arrays.asList(geometry));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeometryCollection)) {
            return false;
        }
        GeometryCollection geometryCollection = (GeometryCollection) obj;
        if (!this.type.equals(geometryCollection.type())) {
            return false;
        }
        BoundingBox boundingBox = this.bbox;
        if (boundingBox == null) {
            if (geometryCollection.bbox() != null) {
                return false;
            }
        } else if (!boundingBox.equals(geometryCollection.bbox())) {
            return false;
        }
        return this.geometries.equals(geometryCollection.geometries());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeometryCollection{type=");
        sb.append(this.type);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", geometries=");
        return MediaSessionCompatQueueItem.read(sb, this.geometries, "}");
    }

    public static GeometryCollection fromGeometries(List<Geometry> list) {
        return new GeometryCollection(TYPE, null, list);
    }

    public GeometryCollection(String str, BoundingBox boundingBox, List<Geometry> list) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list != null) {
            this.geometries = list;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometries");
            throw null;
        }
    }

    public static GeometryCollection fromGeometries(List<Geometry> list, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, Arrays.asList(geometry));
    }
}
