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
final class AutoValue_TollCollection extends C$AutoValue_TollCollection {

    public static final class GsonTypeAdapter extends TypeAdapter<TollCollection> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(TollCollection)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, TollCollection tollCollection) throws IOException {
            if (tollCollection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (tollCollection.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : tollCollection.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("type");
            if (tollCollection.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, tollCollection.type());
            }
            jsonWriter.name("name");
            if (tollCollection.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, tollCollection.name());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public TollCollection read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("type".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if ("name".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = adapter2.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_TollCollection(linkedHashMap, str, str2);
        }
    }

    public AutoValue_TollCollection(final Map<String, SerializableJsonElement> map, final String str, final String str2) {
        new TollCollection(map, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_TollCollection
            private final String name;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.TollCollection
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.TollCollection
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.type = str;
                this.name = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TollCollection)) {
                    return false;
                }
                TollCollection tollCollection = (TollCollection) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (tollCollection.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(tollCollection.unrecognized())) {
                    return false;
                }
                String str3 = this.type;
                if (str3 == null) {
                    if (tollCollection.type() != null) {
                        return false;
                    }
                } else if (!str3.equals(tollCollection.type())) {
                    return false;
                }
                String str4 = this.name;
                if (str4 == null) {
                    if (tollCollection.name() != null) {
                        return false;
                    }
                } else if (!str4.equals(tollCollection.name())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("TollCollection{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", name=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.name, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str3 = this.type;
                int iHashCode2 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.name;
                return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }
        };
    }
}
