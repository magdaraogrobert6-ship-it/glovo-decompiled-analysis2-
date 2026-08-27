package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Metadata extends C$AutoValue_Metadata {

    public static final class GsonTypeAdapter extends TypeAdapter<Metadata> {
        private final Gson gson;
        private volatile TypeAdapter<Map<String, String>> map__string_string_adapter;

        public String toString() {
            return "TypeAdapter(Metadata)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Metadata metadata) throws IOException {
            if (metadata == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (metadata.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : metadata.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("map");
            if (metadata.infoMap() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Map<String, String>> adapter = this.map__string_string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                    this.map__string_string_adapter = adapter;
                }
                adapter.write(jsonWriter, metadata.infoMap());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Metadata read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Map<String, String> map = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("map")) {
                        TypeAdapter<Map<String, String>> adapter = this.map__string_string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                            this.map__string_string_adapter = adapter;
                        }
                        map = adapter.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_Metadata(linkedHashMap, map);
        }
    }

    public AutoValue_Metadata(final Map<String, SerializableJsonElement> map, final Map<String, String> map2) {
        new Metadata(map, map2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Metadata
            private final Map<String, String> infoMap;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.Metadata
            @SerializedName("map")
            public Map<String, String> infoMap() {
                return this.infoMap;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.infoMap = map2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Metadata)) {
                    return false;
                }
                Metadata metadata = (Metadata) obj;
                Map<String, SerializableJsonElement> map3 = this.unrecognized;
                if (map3 == null) {
                    if (metadata.unrecognized() != null) {
                        return false;
                    }
                } else if (!map3.equals(metadata.unrecognized())) {
                    return false;
                }
                Map<String, String> map4 = this.infoMap;
                if (map4 == null) {
                    if (metadata.infoMap() != null) {
                        return false;
                    }
                } else if (!map4.equals(metadata.infoMap())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Metadata{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", infoMap=");
                return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.infoMap, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map3 = this.unrecognized;
                int iHashCode = map3 == null ? 0 : map3.hashCode();
                Map<String, String> map4 = this.infoMap;
                return ((iHashCode ^ 1000003) * 1000003) ^ (map4 != null ? map4.hashCode() : 0);
            }
        };
    }
}
