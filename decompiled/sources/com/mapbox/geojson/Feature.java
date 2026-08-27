package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Feature implements GeoJson {
    private static final String TYPE = "Feature";

    @JsonAdapter(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final Geometry geometry;
    private final String id;
    private final JsonObject properties;
    private final String type;

    public static final class GsonTypeAdapter extends TypeAdapter<Feature> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private volatile TypeAdapter<Geometry> geometryTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<JsonObject> jsonObjectTypeAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Feature feature) throws IOException {
            if (feature == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            if (feature.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.stringTypeAdapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = adapter;
                }
                adapter.write(jsonWriter, feature.type());
            }
            jsonWriter.name("bbox");
            if (feature.bbox() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<BoundingBox> adapter2 = this.boundingBoxTypeAdapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBoxTypeAdapter = adapter2;
                }
                adapter2.write(jsonWriter, feature.bbox());
            }
            jsonWriter.name("id");
            if (feature.id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.stringTypeAdapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.stringTypeAdapter = adapter3;
                }
                adapter3.write(jsonWriter, feature.id());
            }
            jsonWriter.name("geometry");
            if (feature.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Geometry> adapter4 = this.geometryTypeAdapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Geometry.class);
                    this.geometryTypeAdapter = adapter4;
                }
                adapter4.write(jsonWriter, feature.geometry());
            }
            jsonWriter.name("properties");
            if (feature.properties() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<JsonObject> adapter5 = this.jsonObjectTypeAdapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(JsonObject.class);
                    this.jsonObjectTypeAdapter = adapter5;
                }
                adapter5.write(jsonWriter, feature.properties());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:35:0x0071  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Feature read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            BoundingBox boundingBox = null;
            String str2 = null;
            Geometry geometry = null;
            JsonObject jsonObject = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "properties":
                            b = 0;
                            break;
                        case "id":
                            b = 1;
                            break;
                        case "bbox":
                            b = 2;
                            break;
                        case "type":
                            b = 3;
                            break;
                        case "geometry":
                            b = 4;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter<JsonObject> adapter = this.jsonObjectTypeAdapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(JsonObject.class);
                            this.jsonObjectTypeAdapter = adapter;
                        }
                        jsonObject = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<String> adapter2 = this.stringTypeAdapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.stringTypeAdapter = adapter2;
                        }
                        str2 = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<BoundingBox> adapter3 = this.boundingBoxTypeAdapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(BoundingBox.class);
                            this.boundingBoxTypeAdapter = adapter3;
                        }
                        boundingBox = adapter3.read2(jsonReader);
                    } else if (b == 3) {
                        TypeAdapter<String> adapter4 = this.stringTypeAdapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.stringTypeAdapter = adapter4;
                        }
                        str = adapter4.read2(jsonReader);
                    } else if (b != 4) {
                        jsonReader.skipValue();
                    } else {
                        TypeAdapter<Geometry> adapter5 = this.geometryTypeAdapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(Geometry.class);
                            this.geometryTypeAdapter = adapter5;
                        }
                        geometry = adapter5.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new Feature(str, boundingBox, str2, geometry, jsonObject);
        }
    }

    @Override // com.mapbox.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public Geometry geometry() {
        return this.geometry;
    }

    public String id() {
        return this.id;
    }

    public JsonObject properties() {
        return this.properties;
    }

    @Override // com.mapbox.geojson.GeoJson
    public String type() {
        return this.type;
    }

    public static Feature fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        Feature feature = (Feature) gsonBuilder.create().fromJson(str, Feature.class);
        return feature.properties() != null ? feature : new Feature(TYPE, feature.bbox(), feature.id(), feature.geometry(), new JsonObject());
    }

    public static TypeAdapter<Feature> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        BoundingBox boundingBox = this.bbox;
        int iHashCode2 = boundingBox == null ? 0 : boundingBox.hashCode();
        String str = this.id;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Geometry geometry = this.geometry;
        int iHashCode4 = geometry == null ? 0 : geometry.hashCode();
        JsonObject jsonObject = this.properties;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    @Override // com.mapbox.geojson.GeoJson
    public String toJson() {
        return new GsonBuilder().registerTypeAdapterFactory(GeoJsonAdapterFactory.create()).registerTypeAdapterFactory(GeometryAdapterFactory.create()).create().toJson(properties().size() == 0 ? new Feature(TYPE, bbox(), id(), geometry(), null) : this);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch) {
        properties().addProperty(str, ch);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (!this.type.equals(feature.type())) {
            return false;
        }
        BoundingBox boundingBox = this.bbox;
        if (boundingBox == null) {
            if (feature.bbox() != null) {
                return false;
            }
        } else if (!boundingBox.equals(feature.bbox())) {
            return false;
        }
        String str = this.id;
        if (str == null) {
            if (feature.id() != null) {
                return false;
            }
        } else if (!str.equals(feature.id())) {
            return false;
        }
        Geometry geometry = this.geometry;
        if (geometry == null) {
            if (feature.geometry() != null) {
                return false;
            }
        } else if (!geometry.equals(feature.geometry())) {
            return false;
        }
        JsonObject jsonObject = this.properties;
        if (jsonObject == null) {
            if (feature.properties() != null) {
                return false;
            }
        } else if (!jsonObject.equals(feature.properties())) {
            return false;
        }
        return true;
    }

    public Boolean getBooleanProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Boolean.valueOf(jsonElement.getAsBoolean());
    }

    public Character getCharacterProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Character.valueOf(jsonElement.getAsCharacter());
    }

    public Number getNumberProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsNumber();
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public String getStringProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    public String toString() {
        return "Feature{type=" + this.type + ", bbox=" + this.bbox + ", id=" + this.id + ", geometry=" + this.geometry + ", properties=" + this.properties + "}";
    }

    public Feature(String str, BoundingBox boundingBox, String str2, Geometry geometry, JsonObject jsonObject) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        this.type = str;
        this.bbox = boundingBox;
        this.id = str2;
        this.geometry = geometry;
        this.properties = jsonObject;
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, null, geometry, jsonObject);
    }

    public boolean hasNonNullValueForProperty(String str) {
        return hasProperty(str) && !getProperty(str).isJsonNull();
    }

    public static Feature fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new Feature(TYPE, boundingBox, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(Geometry geometry) {
        return new Feature(TYPE, null, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, null, geometry, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, null, str, geometry, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, str, geometry, jsonObject);
    }
}
