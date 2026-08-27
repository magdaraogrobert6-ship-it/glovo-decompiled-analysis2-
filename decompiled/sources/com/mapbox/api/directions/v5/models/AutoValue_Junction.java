package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
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
final class AutoValue_Junction extends C$AutoValue_Junction {

    public static final class GsonTypeAdapter extends TypeAdapter<Junction> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(Junction)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Junction junction) throws IOException {
            if (junction == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (junction.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : junction.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("name");
            if (junction.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, junction.name());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Junction read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("name".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_Junction(linkedHashMap, str);
        }
    }

    public AutoValue_Junction(final Map<String, SerializableJsonElement> map, final String str) {
        new Junction(map, str) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Junction
            private final String name;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.Junction
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.name = str;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Junction)) {
                    return false;
                }
                Junction junction = (Junction) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (junction.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(junction.unrecognized())) {
                    return false;
                }
                String str2 = this.name;
                if (str2 == null) {
                    if (junction.name() != null) {
                        return false;
                    }
                } else if (!str2.equals(junction.name())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Junction{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", name=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.name, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str2 = this.name;
                return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
            }
        };
    }
}
