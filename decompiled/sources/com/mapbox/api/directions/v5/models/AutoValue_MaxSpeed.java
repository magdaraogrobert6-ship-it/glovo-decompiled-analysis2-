package com.mapbox.api.directions.v5.models;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.huawei.hms.android.SystemUtils;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_MaxSpeed extends C$AutoValue_MaxSpeed {

    public static final class GsonTypeAdapter extends TypeAdapter<MaxSpeed> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(MaxSpeed)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MaxSpeed maxSpeed) throws IOException {
            if (maxSpeed == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (maxSpeed.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : maxSpeed.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("speed");
            if (maxSpeed.speed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter = this.integer_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter;
                }
                adapter.write(jsonWriter, maxSpeed.speed());
            }
            jsonWriter.name("unit");
            if (maxSpeed.unit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, maxSpeed.unit());
            }
            jsonWriter.name(SystemUtils.UNKNOWN);
            if (maxSpeed.unknown() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter3 = this.boolean__adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter3;
                }
                adapter3.write(jsonWriter, maxSpeed.unknown());
            }
            jsonWriter.name("none");
            if (maxSpeed.none() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter4 = this.boolean__adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter4;
                }
                adapter4.write(jsonWriter, maxSpeed.none());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public MaxSpeed read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            Integer num = null;
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("speed".equals(strNextName)) {
                        TypeAdapter<Integer> adapter = this.integer_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter;
                        }
                        num = adapter.read2(jsonReader);
                    } else if ("unit".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else if (SystemUtils.UNKNOWN.equals(strNextName)) {
                        TypeAdapter<Boolean> adapter3 = this.boolean__adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = adapter3;
                        }
                        bool = adapter3.read2(jsonReader);
                    } else if ("none".equals(strNextName)) {
                        TypeAdapter<Boolean> adapter4 = this.boolean__adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = adapter4;
                        }
                        bool2 = adapter4.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_MaxSpeed(linkedHashMap, num, str, bool, bool2);
        }
    }

    public AutoValue_MaxSpeed(final Map<String, SerializableJsonElement> map, final Integer num, final String str, final Boolean bool, final Boolean bool2) {
        new MaxSpeed(map, num, str, bool, bool2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_MaxSpeed
            private final Boolean none;
            private final Integer speed;
            private final String unit;
            private final Boolean unknown;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            public Boolean none() {
                return this.none;
            }

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            public Integer speed() {
                return this.speed;
            }

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            @SpeedLimit$Unit
            public String unit() {
                return this.unit;
            }

            @Override // com.mapbox.api.directions.v5.models.MaxSpeed
            public Boolean unknown() {
                return this.unknown;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.speed = num;
                this.unit = str;
                this.unknown = bool;
                this.none = bool2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MaxSpeed)) {
                    return false;
                }
                MaxSpeed maxSpeed = (MaxSpeed) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (maxSpeed.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(maxSpeed.unrecognized())) {
                    return false;
                }
                Integer num2 = this.speed;
                if (num2 == null) {
                    if (maxSpeed.speed() != null) {
                        return false;
                    }
                } else if (!num2.equals(maxSpeed.speed())) {
                    return false;
                }
                String str2 = this.unit;
                if (str2 == null) {
                    if (maxSpeed.unit() != null) {
                        return false;
                    }
                } else if (!str2.equals(maxSpeed.unit())) {
                    return false;
                }
                Boolean bool3 = this.unknown;
                if (bool3 == null) {
                    if (maxSpeed.unknown() != null) {
                        return false;
                    }
                } else if (!bool3.equals(maxSpeed.unknown())) {
                    return false;
                }
                Boolean bool4 = this.none;
                if (bool4 == null) {
                    if (maxSpeed.none() != null) {
                        return false;
                    }
                } else if (!bool4.equals(maxSpeed.none())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("MaxSpeed{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", speed=");
                sb.append(this.speed);
                sb.append(", unit=");
                sb.append(this.unit);
                sb.append(", unknown=");
                sb.append(this.unknown);
                sb.append(", none=");
                return c8$$ExternalSyntheticOutline0.m(sb, "}", this.none);
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                Integer num2 = this.speed;
                int iHashCode2 = num2 == null ? 0 : num2.hashCode();
                String str2 = this.unit;
                int iHashCode3 = str2 == null ? 0 : str2.hashCode();
                Boolean bool3 = this.unknown;
                int iHashCode4 = bool3 == null ? 0 : bool3.hashCode();
                Boolean bool4 = this.none;
                return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (bool4 != null ? bool4.hashCode() : 0);
            }
        };
    }
}
