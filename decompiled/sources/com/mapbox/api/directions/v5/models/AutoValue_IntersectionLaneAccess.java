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
import java.util.List;
import java.util.Map;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_IntersectionLaneAccess extends C$AutoValue_IntersectionLaneAccess {

    public static final class GsonTypeAdapter extends TypeAdapter<IntersectionLaneAccess> {
        private final Gson gson;
        private volatile TypeAdapter<List<String>> list__string_adapter;

        public String toString() {
            return "TypeAdapter(IntersectionLaneAccess)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, IntersectionLaneAccess intersectionLaneAccess) throws IOException {
            if (intersectionLaneAccess == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (intersectionLaneAccess.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : intersectionLaneAccess.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("designated");
            if (intersectionLaneAccess.designated() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter = this.list__string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter;
                }
                adapter.write(jsonWriter, intersectionLaneAccess.designated());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public IntersectionLaneAccess read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<String> list = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("designated")) {
                        TypeAdapter<List<String>> adapter = this.list__string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = adapter;
                        }
                        list = adapter.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_IntersectionLaneAccess(linkedHashMap, list);
        }
    }

    public AutoValue_IntersectionLaneAccess(final Map<String, SerializableJsonElement> map, final List<String> list) {
        new IntersectionLaneAccess(map, list) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_IntersectionLaneAccess
            private final List<String> designated;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.IntersectionLaneAccess
            @SerializedName("designated")
            public List<String> designated() {
                return this.designated;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.designated = list;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof IntersectionLaneAccess)) {
                    return false;
                }
                IntersectionLaneAccess intersectionLaneAccess = (IntersectionLaneAccess) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (intersectionLaneAccess.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(intersectionLaneAccess.unrecognized())) {
                    return false;
                }
                List<String> list2 = this.designated;
                if (list2 == null) {
                    if (intersectionLaneAccess.designated() != null) {
                        return false;
                    }
                } else if (!list2.equals(intersectionLaneAccess.designated())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("IntersectionLaneAccess{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", designated=");
                return MediaSessionCompatQueueItem.read(sb, this.designated, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                List<String> list2 = this.designated;
                return ((iHashCode ^ 1000003) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
            }
        };
    }
}
