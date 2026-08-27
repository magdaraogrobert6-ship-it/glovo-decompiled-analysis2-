package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
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
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RestStop extends C$AutoValue_RestStop {

    public static final class GsonTypeAdapter extends TypeAdapter<RestStop> {
        private final Gson gson;
        private volatile TypeAdapter<List<Amenity>> list__amenity_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(RestStop)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, RestStop restStop) throws IOException {
            if (restStop == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (restStop.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : restStop.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("type");
            if (restStop.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, restStop.type());
            }
            jsonWriter.name("name");
            if (restStop.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, restStop.name());
            }
            jsonWriter.name("amenities");
            if (restStop.amenities() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Amenity>> adapter3 = this.list__amenity_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Amenity.class));
                    this.list__amenity_adapter = adapter3;
                }
                adapter3.write(jsonWriter, restStop.amenities());
            }
            jsonWriter.name("guidemap");
            if (restStop.guideMap() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, restStop.guideMap());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public RestStop read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            String str = null;
            String str2 = null;
            List<Amenity> list = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("guidemap")) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str3 = adapter.read2(jsonReader);
                    } else if ("type".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else if ("name".equals(strNextName)) {
                        TypeAdapter<String> adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str2 = adapter3.read2(jsonReader);
                    } else if ("amenities".equals(strNextName)) {
                        TypeAdapter<List<Amenity>> adapter4 = this.list__amenity_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Amenity.class));
                            this.list__amenity_adapter = adapter4;
                        }
                        list = adapter4.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_RestStop(linkedHashMap, str, str2, list, str3);
        }
    }

    public AutoValue_RestStop(final Map<String, SerializableJsonElement> map, final String str, final String str2, final List<Amenity> list, final String str3) {
        new RestStop(map, str, str2, list, str3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_RestStop
            private final List<Amenity> amenities;
            private final String guideMap;
            private final String name;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.RestStop
            public List<Amenity> amenities() {
                return this.amenities;
            }

            @Override // com.mapbox.api.directions.v5.models.RestStop
            @SerializedName("guidemap")
            public String guideMap() {
                return this.guideMap;
            }

            @Override // com.mapbox.api.directions.v5.models.RestStop
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.RestStop
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
                this.amenities = list;
                this.guideMap = str3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RestStop)) {
                    return false;
                }
                RestStop restStop = (RestStop) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (restStop.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(restStop.unrecognized())) {
                    return false;
                }
                String str4 = this.type;
                if (str4 == null) {
                    if (restStop.type() != null) {
                        return false;
                    }
                } else if (!str4.equals(restStop.type())) {
                    return false;
                }
                String str5 = this.name;
                if (str5 == null) {
                    if (restStop.name() != null) {
                        return false;
                    }
                } else if (!str5.equals(restStop.name())) {
                    return false;
                }
                List<Amenity> list2 = this.amenities;
                if (list2 == null) {
                    if (restStop.amenities() != null) {
                        return false;
                    }
                } else if (!list2.equals(restStop.amenities())) {
                    return false;
                }
                String str6 = this.guideMap;
                if (str6 == null) {
                    if (restStop.guideMap() != null) {
                        return false;
                    }
                } else if (!str6.equals(restStop.guideMap())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("RestStop{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", amenities=");
                sb.append(this.amenities);
                sb.append(", guideMap=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.guideMap, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str4 = this.type;
                int iHashCode2 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.name;
                int iHashCode3 = str5 == null ? 0 : str5.hashCode();
                List<Amenity> list2 = this.amenities;
                int iHashCode4 = list2 == null ? 0 : list2.hashCode();
                String str6 = this.guideMap;
                return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (str6 != null ? str6.hashCode() : 0);
            }
        };
    }
}
