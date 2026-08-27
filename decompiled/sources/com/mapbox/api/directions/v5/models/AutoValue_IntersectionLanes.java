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
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_IntersectionLanes extends C$AutoValue_IntersectionLanes {

    public static final class GsonTypeAdapter extends TypeAdapter<IntersectionLanes> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<IntersectionLaneAccess> intersectionLaneAccess_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(IntersectionLanes)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, IntersectionLanes intersectionLanes) throws IOException {
            if (intersectionLanes == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (intersectionLanes.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : intersectionLanes.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("valid");
            if (intersectionLanes.valid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter = this.boolean__adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter;
                }
                adapter.write(jsonWriter, intersectionLanes.valid());
            }
            jsonWriter.name("active");
            if (intersectionLanes.active() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter2 = this.boolean__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter2;
                }
                adapter2.write(jsonWriter, intersectionLanes.active());
            }
            jsonWriter.name("valid_indication");
            if (intersectionLanes.validIndication() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, intersectionLanes.validIndication());
            }
            jsonWriter.name("indications");
            if (intersectionLanes.indications() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter4 = this.list__string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, intersectionLanes.indications());
            }
            jsonWriter.name("payment_methods");
            if (intersectionLanes.paymentMethods() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter5 = this.list__string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, intersectionLanes.paymentMethods());
            }
            jsonWriter.name("access");
            if (intersectionLanes.access() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<IntersectionLaneAccess> adapter6 = this.intersectionLaneAccess_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(IntersectionLaneAccess.class);
                    this.intersectionLaneAccess_adapter = adapter6;
                }
                adapter6.write(jsonWriter, intersectionLanes.access());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:29:0x0065  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public IntersectionLanes read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            List<String> list = null;
            List<String> list2 = null;
            IntersectionLaneAccess intersectionLaneAccess = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -1847017863) {
                        if (iHashCode != -1423461020) {
                            if (iHashCode == 1096359295 && strNextName.equals("valid_indication")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("access")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("payment_methods")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter<List<String>> adapter = this.list__string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = adapter;
                        }
                        list2 = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<IntersectionLaneAccess> adapter2 = this.intersectionLaneAccess_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(IntersectionLaneAccess.class);
                            this.intersectionLaneAccess_adapter = adapter2;
                        }
                        intersectionLaneAccess = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<String> adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str = adapter3.read2(jsonReader);
                    } else if ("valid".equals(strNextName)) {
                        TypeAdapter<Boolean> adapter4 = this.boolean__adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = adapter4;
                        }
                        bool = adapter4.read2(jsonReader);
                    } else if ("active".equals(strNextName)) {
                        TypeAdapter<Boolean> adapter5 = this.boolean__adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = adapter5;
                        }
                        bool2 = adapter5.read2(jsonReader);
                    } else if ("indications".equals(strNextName)) {
                        TypeAdapter<List<String>> adapter6 = this.list__string_adapter;
                        if (adapter6 == null) {
                            adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = adapter6;
                        }
                        list = adapter6.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_IntersectionLanes(linkedHashMap, bool, bool2, str, list, list2, intersectionLaneAccess);
        }
    }

    public AutoValue_IntersectionLanes(final Map<String, SerializableJsonElement> map, final Boolean bool, final Boolean bool2, final String str, final List<String> list, final List<String> list2, final IntersectionLaneAccess intersectionLaneAccess) {
        new IntersectionLanes(map, bool, bool2, str, list, list2, intersectionLaneAccess) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_IntersectionLanes
            private final IntersectionLaneAccess access;
            private final Boolean active;
            private final List<String> indications;
            private final List<String> paymentMethods;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final Boolean valid;
            private final String validIndication;

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            @SerializedName("access")
            public IntersectionLaneAccess access() {
                return this.access;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            public Boolean active() {
                return this.active;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            public List<String> indications() {
                return this.indications;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            @SerializedName("payment_methods")
            public List<String> paymentMethods() {
                return this.paymentMethods;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            public Boolean valid() {
                return this.valid;
            }

            @Override // com.mapbox.api.directions.v5.models.IntersectionLanes
            @SerializedName("valid_indication")
            public String validIndication() {
                return this.validIndication;
            }

            {
                this.unrecognized = map;
                this.valid = bool;
                this.active = bool2;
                this.validIndication = str;
                this.indications = list;
                this.paymentMethods = list2;
                this.access = intersectionLaneAccess;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof IntersectionLanes)) {
                    return false;
                }
                IntersectionLanes intersectionLanes = (IntersectionLanes) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (intersectionLanes.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(intersectionLanes.unrecognized())) {
                    return false;
                }
                Boolean bool3 = this.valid;
                if (bool3 == null) {
                    if (intersectionLanes.valid() != null) {
                        return false;
                    }
                } else if (!bool3.equals(intersectionLanes.valid())) {
                    return false;
                }
                Boolean bool4 = this.active;
                if (bool4 == null) {
                    if (intersectionLanes.active() != null) {
                        return false;
                    }
                } else if (!bool4.equals(intersectionLanes.active())) {
                    return false;
                }
                String str2 = this.validIndication;
                if (str2 == null) {
                    if (intersectionLanes.validIndication() != null) {
                        return false;
                    }
                } else if (!str2.equals(intersectionLanes.validIndication())) {
                    return false;
                }
                List<String> list3 = this.indications;
                if (list3 == null) {
                    if (intersectionLanes.indications() != null) {
                        return false;
                    }
                } else if (!list3.equals(intersectionLanes.indications())) {
                    return false;
                }
                List<String> list4 = this.paymentMethods;
                if (list4 == null) {
                    if (intersectionLanes.paymentMethods() != null) {
                        return false;
                    }
                } else if (!list4.equals(intersectionLanes.paymentMethods())) {
                    return false;
                }
                IntersectionLaneAccess intersectionLaneAccess2 = this.access;
                if (intersectionLaneAccess2 == null) {
                    if (intersectionLanes.access() != null) {
                        return false;
                    }
                } else if (!intersectionLaneAccess2.equals(intersectionLanes.access())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "IntersectionLanes{unrecognized=" + this.unrecognized + ", valid=" + this.valid + ", active=" + this.active + ", validIndication=" + this.validIndication + ", indications=" + this.indications + ", paymentMethods=" + this.paymentMethods + ", access=" + this.access + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                Boolean bool3 = this.valid;
                int iHashCode2 = bool3 == null ? 0 : bool3.hashCode();
                Boolean bool4 = this.active;
                int iHashCode3 = bool4 == null ? 0 : bool4.hashCode();
                String str2 = this.validIndication;
                int iHashCode4 = str2 == null ? 0 : str2.hashCode();
                List<String> list3 = this.indications;
                int iHashCode5 = list3 == null ? 0 : list3.hashCode();
                List<String> list4 = this.paymentMethods;
                int iHashCode6 = list4 == null ? 0 : list4.hashCode();
                IntersectionLaneAccess intersectionLaneAccess2 = this.access;
                return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (intersectionLaneAccess2 != null ? intersectionLaneAccess2.hashCode() : 0);
            }
        };
    }
}
