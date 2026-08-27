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
final class AutoValue_Interchange extends C$AutoValue_Interchange {

    public static final class GsonTypeAdapter extends TypeAdapter<Interchange> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(Interchange)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Interchange interchange) throws IOException {
            if (interchange == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (interchange.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : interchange.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("name");
            if (interchange.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, interchange.name());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Interchange read2(JsonReader jsonReader) throws IOException {
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
            return new AutoValue_Interchange(linkedHashMap, str);
        }
    }

    public AutoValue_Interchange(final Map<String, SerializableJsonElement> map, final String str) {
        new Interchange(map, str) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Interchange
            private final String name;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.Interchange
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
                if (!(obj instanceof Interchange)) {
                    return false;
                }
                Interchange interchange = (Interchange) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (interchange.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(interchange.unrecognized())) {
                    return false;
                }
                String str2 = this.name;
                if (str2 == null) {
                    if (interchange.name() != null) {
                        return false;
                    }
                } else if (!str2.equals(interchange.name())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Interchange{unrecognized=");
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
