package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_TrafficCodes extends C$AutoValue_TrafficCodes {

    public static final class GsonTypeAdapter extends TypeAdapter<TrafficCodes> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;

        public String toString() {
            return "TypeAdapter(TrafficCodes)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, TrafficCodes trafficCodes) throws IOException {
            if (trafficCodes == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (trafficCodes.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : trafficCodes.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("jartic_cause_code");
            if (trafficCodes.jarticCauseCode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter = this.integer_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter;
                }
                adapter.write(jsonWriter, trafficCodes.jarticCauseCode());
            }
            jsonWriter.name("jartic_regulation_code");
            if (trafficCodes.jarticRegulationCode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter2 = this.integer_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter2;
                }
                adapter2.write(jsonWriter, trafficCodes.jarticRegulationCode());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public TrafficCodes read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Integer num = null;
            Integer num2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("jartic_regulation_code")) {
                        TypeAdapter<Integer> adapter = this.integer_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter;
                        }
                        num2 = adapter.read2(jsonReader);
                    } else if (strNextName.equals("jartic_cause_code")) {
                        TypeAdapter<Integer> adapter2 = this.integer_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter2;
                        }
                        num = adapter2.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_TrafficCodes(linkedHashMap, num, num2);
        }
    }

    public AutoValue_TrafficCodes(final Map<String, SerializableJsonElement> map, final Integer num, final Integer num2) {
        new TrafficCodes(map, num, num2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_TrafficCodes
            private final Integer jarticCauseCode;
            private final Integer jarticRegulationCode;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.TrafficCodes
            @SerializedName("jartic_cause_code")
            public Integer jarticCauseCode() {
                return this.jarticCauseCode;
            }

            @Override // com.mapbox.api.directions.v5.models.TrafficCodes
            @SerializedName("jartic_regulation_code")
            public Integer jarticRegulationCode() {
                return this.jarticRegulationCode;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.jarticCauseCode = num;
                this.jarticRegulationCode = num2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TrafficCodes)) {
                    return false;
                }
                TrafficCodes trafficCodes = (TrafficCodes) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (trafficCodes.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(trafficCodes.unrecognized())) {
                    return false;
                }
                Integer num3 = this.jarticCauseCode;
                if (num3 == null) {
                    if (trafficCodes.jarticCauseCode() != null) {
                        return false;
                    }
                } else if (!num3.equals(trafficCodes.jarticCauseCode())) {
                    return false;
                }
                Integer num4 = this.jarticRegulationCode;
                if (num4 == null) {
                    if (trafficCodes.jarticRegulationCode() != null) {
                        return false;
                    }
                } else if (!num4.equals(trafficCodes.jarticRegulationCode())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("TrafficCodes{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", jarticCauseCode=");
                sb.append(this.jarticCauseCode);
                sb.append(", jarticRegulationCode=");
                return IconCompatParcelizer.write(this.jarticRegulationCode, "}", sb);
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                Integer num3 = this.jarticCauseCode;
                int iHashCode2 = num3 == null ? 0 : num3.hashCode();
                Integer num4 = this.jarticRegulationCode;
                return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (num4 != null ? num4.hashCode() : 0);
            }
        };
    }
}
