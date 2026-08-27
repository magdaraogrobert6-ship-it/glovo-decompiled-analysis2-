package com.mapbox.api.directions.v5.models;

import com.braze.models.inappmessage.InAppMessageBase;
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
final class AutoValue_LegAnnotation extends C$AutoValue_LegAnnotation {

    public static final class GsonTypeAdapter extends TypeAdapter<LegAnnotation> {
        private final Gson gson;
        private volatile TypeAdapter<List<Double>> list__double_adapter;
        private volatile TypeAdapter<List<Integer>> list__integer_adapter;
        private volatile TypeAdapter<List<MaxSpeed>> list__maxSpeed_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;

        public String toString() {
            return "TypeAdapter(LegAnnotation)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, LegAnnotation legAnnotation) throws IOException {
            if (legAnnotation == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (legAnnotation.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : legAnnotation.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("distance");
            if (legAnnotation.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> adapter = this.list__double_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = adapter;
                }
                adapter.write(jsonWriter, legAnnotation.distance());
            }
            jsonWriter.name(InAppMessageBase.DURATION);
            if (legAnnotation.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> adapter2 = this.list__double_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = adapter2;
                }
                adapter2.write(jsonWriter, legAnnotation.duration());
            }
            jsonWriter.name("speed");
            if (legAnnotation.speed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> adapter3 = this.list__double_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = adapter3;
                }
                adapter3.write(jsonWriter, legAnnotation.speed());
            }
            jsonWriter.name("maxspeed");
            if (legAnnotation.maxspeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<MaxSpeed>> adapter4 = this.list__maxSpeed_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, MaxSpeed.class));
                    this.list__maxSpeed_adapter = adapter4;
                }
                adapter4.write(jsonWriter, legAnnotation.maxspeed());
            }
            jsonWriter.name("congestion");
            if (legAnnotation.congestion() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter5 = this.list__string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, legAnnotation.congestion());
            }
            jsonWriter.name("congestion_numeric");
            if (legAnnotation.congestionNumeric() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> adapter6 = this.list__integer_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = adapter6;
                }
                adapter6.write(jsonWriter, legAnnotation.congestionNumeric());
            }
            jsonWriter.name("traffic_tendency");
            if (legAnnotation.trafficTendency() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> adapter7 = this.list__integer_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = adapter7;
                }
                adapter7.write(jsonWriter, legAnnotation.trafficTendency());
            }
            jsonWriter.name("freeflow_speed");
            if (legAnnotation.freeflowSpeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> adapter8 = this.list__integer_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = adapter8;
                }
                adapter8.write(jsonWriter, legAnnotation.freeflowSpeed());
            }
            jsonWriter.name("current_speed");
            if (legAnnotation.currentSpeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> adapter9 = this.list__integer_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = adapter9;
                }
                adapter9.write(jsonWriter, legAnnotation.currentSpeed());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:31:0x0070  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public LegAnnotation read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            List<Double> list = null;
            List<Double> list2 = null;
            List<Double> list3 = null;
            List<MaxSpeed> list4 = null;
            List<String> list5 = null;
            List<Integer> list6 = null;
            List<Integer> list7 = null;
            List<Integer> list8 = null;
            List<Integer> list9 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "congestion_numeric":
                            b = 0;
                            break;
                        case "current_speed":
                            b = 1;
                            break;
                        case "freeflow_speed":
                            b = 2;
                            break;
                        case "traffic_tendency":
                            b = 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter<List<Integer>> adapter = this.list__integer_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                            this.list__integer_adapter = adapter;
                        }
                        list6 = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<List<Integer>> adapter2 = this.list__integer_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                            this.list__integer_adapter = adapter2;
                        }
                        list9 = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<List<Integer>> adapter3 = this.list__integer_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                            this.list__integer_adapter = adapter3;
                        }
                        list8 = adapter3.read2(jsonReader);
                    } else if (b != 3) {
                        if ("distance".equals(strNextName)) {
                            TypeAdapter<List<Double>> adapter4 = this.list__double_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                this.list__double_adapter = adapter4;
                            }
                            list = adapter4.read2(jsonReader);
                        } else if (InAppMessageBase.DURATION.equals(strNextName)) {
                            TypeAdapter<List<Double>> adapter5 = this.list__double_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                this.list__double_adapter = adapter5;
                            }
                            list2 = adapter5.read2(jsonReader);
                        } else if ("speed".equals(strNextName)) {
                            TypeAdapter<List<Double>> adapter6 = this.list__double_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                this.list__double_adapter = adapter6;
                            }
                            list3 = adapter6.read2(jsonReader);
                        } else if ("maxspeed".equals(strNextName)) {
                            TypeAdapter<List<MaxSpeed>> adapter7 = this.list__maxSpeed_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, MaxSpeed.class));
                                this.list__maxSpeed_adapter = adapter7;
                            }
                            list4 = adapter7.read2(jsonReader);
                        } else if ("congestion".equals(strNextName)) {
                            TypeAdapter<List<String>> adapter8 = this.list__string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter8;
                            }
                            list5 = adapter8.read2(jsonReader);
                        } else {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                        }
                    } else {
                        TypeAdapter<List<Integer>> adapter9 = this.list__integer_adapter;
                        if (adapter9 == null) {
                            adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                            this.list__integer_adapter = adapter9;
                        }
                        list7 = adapter9.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_LegAnnotation(linkedHashMap, list, list2, list3, list4, list5, list6, list7, list8, list9);
        }
    }

    public AutoValue_LegAnnotation(Map<String, SerializableJsonElement> map, List<Double> list, List<Double> list2, List<Double> list3, List<MaxSpeed> list4, List<String> list5, List<Integer> list6, List<Integer> list7, List<Integer> list8, List<Integer> list9) {
        new LegAnnotation(map, list, list2, list3, list4, list5, list6, list7, list8, list9) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_LegAnnotation
            private final List<String> congestion;
            private final List<Integer> congestionNumeric;
            private final List<Integer> currentSpeed;
            private final List<Double> distance;
            private final List<Double> duration;
            private final List<Integer> freeflowSpeed;
            private final List<MaxSpeed> maxspeed;
            private final List<Double> speed;
            private final List<Integer> trafficTendency;
            private final Map<String, SerializableJsonElement> unrecognized;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_LegAnnotation$Builder */
            public static class Builder extends LegAnnotation.Builder {
                private List<String> congestion;
                private List<Integer> congestionNumeric;
                private List<Integer> currentSpeed;
                private List<Double> distance;
                private List<Double> duration;
                private List<Integer> freeflowSpeed;
                private List<MaxSpeed> maxspeed;
                private List<Double> speed;
                private List<Integer> trafficTendency;
                private Map<String, SerializableJsonElement> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder congestion(List<String> list) {
                    this.congestion = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder congestionNumeric(List<Integer> list) {
                    this.congestionNumeric = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder currentSpeed(List<Integer> list) {
                    this.currentSpeed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder distance(List<Double> list) {
                    this.distance = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder duration(List<Double> list) {
                    this.duration = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder freeflowSpeed(List<Integer> list) {
                    this.freeflowSpeed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder maxspeed(List<MaxSpeed> list) {
                    this.maxspeed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation.Builder speed(List<Double> list) {
                    this.speed = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.LegAnnotation.Builder
                public LegAnnotation build() {
                    return new AutoValue_LegAnnotation(this.unrecognized, this.distance, this.duration, this.speed, this.maxspeed, this.congestion, this.congestionNumeric, this.trafficTendency, this.freeflowSpeed, this.currentSpeed);
                }

                private Builder(LegAnnotation legAnnotation) {
                    this.unrecognized = legAnnotation.unrecognized();
                    this.distance = legAnnotation.distance();
                    this.duration = legAnnotation.duration();
                    this.speed = legAnnotation.speed();
                    this.maxspeed = legAnnotation.maxspeed();
                    this.congestion = legAnnotation.congestion();
                    this.congestionNumeric = legAnnotation.congestionNumeric();
                    this.trafficTendency = legAnnotation.trafficTendency();
                    this.freeflowSpeed = legAnnotation.freeflowSpeed();
                    this.currentSpeed = legAnnotation.currentSpeed();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public LegAnnotation.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                public Builder() {
                }
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<String> congestion() {
                return this.congestion;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("congestion_numeric")
            public List<Integer> congestionNumeric() {
                return this.congestionNumeric;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("current_speed")
            public List<Integer> currentSpeed() {
                return this.currentSpeed;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<Double> distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<Double> duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("freeflow_speed")
            public List<Integer> freeflowSpeed() {
                return this.freeflowSpeed;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<MaxSpeed> maxspeed() {
                return this.maxspeed;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public List<Double> speed() {
                return this.speed;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            @SerializedName("traffic_tendency")
            public List<Integer> trafficTendency() {
                return this.trafficTendency;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.distance = list;
                this.duration = list2;
                this.speed = list3;
                this.maxspeed = list4;
                this.congestion = list5;
                this.congestionNumeric = list6;
                this.trafficTendency = list7;
                this.freeflowSpeed = list8;
                this.currentSpeed = list9;
            }

            @Override // com.mapbox.api.directions.v5.models.LegAnnotation
            public LegAnnotation.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LegAnnotation)) {
                    return false;
                }
                LegAnnotation legAnnotation = (LegAnnotation) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (legAnnotation.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(legAnnotation.unrecognized())) {
                    return false;
                }
                List<Double> list10 = this.distance;
                if (list10 == null) {
                    if (legAnnotation.distance() != null) {
                        return false;
                    }
                } else if (!list10.equals(legAnnotation.distance())) {
                    return false;
                }
                List<Double> list11 = this.duration;
                if (list11 == null) {
                    if (legAnnotation.duration() != null) {
                        return false;
                    }
                } else if (!list11.equals(legAnnotation.duration())) {
                    return false;
                }
                List<Double> list12 = this.speed;
                if (list12 == null) {
                    if (legAnnotation.speed() != null) {
                        return false;
                    }
                } else if (!list12.equals(legAnnotation.speed())) {
                    return false;
                }
                List<MaxSpeed> list13 = this.maxspeed;
                if (list13 == null) {
                    if (legAnnotation.maxspeed() != null) {
                        return false;
                    }
                } else if (!list13.equals(legAnnotation.maxspeed())) {
                    return false;
                }
                List<String> list14 = this.congestion;
                if (list14 == null) {
                    if (legAnnotation.congestion() != null) {
                        return false;
                    }
                } else if (!list14.equals(legAnnotation.congestion())) {
                    return false;
                }
                List<Integer> list15 = this.congestionNumeric;
                if (list15 == null) {
                    if (legAnnotation.congestionNumeric() != null) {
                        return false;
                    }
                } else if (!list15.equals(legAnnotation.congestionNumeric())) {
                    return false;
                }
                List<Integer> list16 = this.trafficTendency;
                if (list16 == null) {
                    if (legAnnotation.trafficTendency() != null) {
                        return false;
                    }
                } else if (!list16.equals(legAnnotation.trafficTendency())) {
                    return false;
                }
                List<Integer> list17 = this.freeflowSpeed;
                if (list17 == null) {
                    if (legAnnotation.freeflowSpeed() != null) {
                        return false;
                    }
                } else if (!list17.equals(legAnnotation.freeflowSpeed())) {
                    return false;
                }
                List<Integer> list18 = this.currentSpeed;
                if (list18 == null) {
                    if (legAnnotation.currentSpeed() != null) {
                        return false;
                    }
                } else if (!list18.equals(legAnnotation.currentSpeed())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("LegAnnotation{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", distance=");
                sb.append(this.distance);
                sb.append(", duration=");
                sb.append(this.duration);
                sb.append(", speed=");
                sb.append(this.speed);
                sb.append(", maxspeed=");
                sb.append(this.maxspeed);
                sb.append(", congestion=");
                sb.append(this.congestion);
                sb.append(", congestionNumeric=");
                sb.append(this.congestionNumeric);
                sb.append(", trafficTendency=");
                sb.append(this.trafficTendency);
                sb.append(", freeflowSpeed=");
                sb.append(this.freeflowSpeed);
                sb.append(", currentSpeed=");
                return MediaSessionCompatQueueItem.read(sb, this.currentSpeed, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                List<Double> list10 = this.distance;
                int iHashCode2 = list10 == null ? 0 : list10.hashCode();
                List<Double> list11 = this.duration;
                int iHashCode3 = list11 == null ? 0 : list11.hashCode();
                List<Double> list12 = this.speed;
                int iHashCode4 = list12 == null ? 0 : list12.hashCode();
                List<MaxSpeed> list13 = this.maxspeed;
                int iHashCode5 = list13 == null ? 0 : list13.hashCode();
                List<String> list14 = this.congestion;
                int iHashCode6 = list14 == null ? 0 : list14.hashCode();
                List<Integer> list15 = this.congestionNumeric;
                int iHashCode7 = list15 == null ? 0 : list15.hashCode();
                List<Integer> list16 = this.trafficTendency;
                int iHashCode8 = list16 == null ? 0 : list16.hashCode();
                List<Integer> list17 = this.freeflowSpeed;
                int iHashCode9 = list17 == null ? 0 : list17.hashCode();
                List<Integer> list18 = this.currentSpeed;
                return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ (list18 != null ? list18.hashCode() : 0);
            }
        };
    }
}
