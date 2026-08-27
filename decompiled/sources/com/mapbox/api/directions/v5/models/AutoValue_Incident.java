package com.mapbox.api.directions.v5.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
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
final class AutoValue_Incident extends C$AutoValue_Incident {

    public static final class GsonTypeAdapter extends TypeAdapter<Incident> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private volatile TypeAdapter<Congestion> congestion_adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<List<Integer>> list__integer_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<String> string_adapter;
        private volatile TypeAdapter<TrafficCodes> trafficCodes_adapter;

        public String toString() {
            return "TypeAdapter(Incident)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Incident incident) throws IOException {
            if (incident == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (incident.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : incident.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("id");
            if (incident.id() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, incident.id());
            }
            jsonWriter.name("type");
            if (incident.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, incident.type());
            }
            jsonWriter.name("closed");
            if (incident.closed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter3 = this.boolean__adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter3;
                }
                adapter3.write(jsonWriter, incident.closed());
            }
            jsonWriter.name("congestion");
            if (incident.congestion() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Congestion> adapter4 = this.congestion_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Congestion.class);
                    this.congestion_adapter = adapter4;
                }
                adapter4.write(jsonWriter, incident.congestion());
            }
            jsonWriter.name("description");
            if (incident.description() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, incident.description());
            }
            jsonWriter.name("long_description");
            if (incident.longDescription() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, incident.longDescription());
            }
            jsonWriter.name("impact");
            if (incident.impact() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter7 = this.string_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter7;
                }
                adapter7.write(jsonWriter, incident.impact());
            }
            jsonWriter.name("sub_type");
            if (incident.subType() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, incident.subType());
            }
            jsonWriter.name("sub_type_description");
            if (incident.subTypeDescription() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter9 = this.string_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter9;
                }
                adapter9.write(jsonWriter, incident.subTypeDescription());
            }
            jsonWriter.name("alertc_codes");
            if (incident.alertcCodes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> adapter10 = this.list__integer_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = adapter10;
                }
                adapter10.write(jsonWriter, incident.alertcCodes());
            }
            jsonWriter.name("traffic_codes");
            if (incident.trafficCodes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<TrafficCodes> adapter11 = this.trafficCodes_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(TrafficCodes.class);
                    this.trafficCodes_adapter = adapter11;
                }
                adapter11.write(jsonWriter, incident.trafficCodes());
            }
            jsonWriter.name("geometry_index_start");
            if (incident.geometryIndexStart() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter12 = this.integer_adapter;
                if (adapter12 == null) {
                    adapter12 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter12;
                }
                adapter12.write(jsonWriter, incident.geometryIndexStart());
            }
            jsonWriter.name("geometry_index_end");
            if (incident.geometryIndexEnd() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter13 = this.integer_adapter;
                if (adapter13 == null) {
                    adapter13 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter13;
                }
                adapter13.write(jsonWriter, incident.geometryIndexEnd());
            }
            jsonWriter.name("creation_time");
            if (incident.creationTime() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter14 = this.string_adapter;
                if (adapter14 == null) {
                    adapter14 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter14;
                }
                adapter14.write(jsonWriter, incident.creationTime());
            }
            jsonWriter.name("start_time");
            if (incident.startTime() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter15 = this.string_adapter;
                if (adapter15 == null) {
                    adapter15 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter15;
                }
                adapter15.write(jsonWriter, incident.startTime());
            }
            jsonWriter.name("end_time");
            if (incident.endTime() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter16 = this.string_adapter;
                if (adapter16 == null) {
                    adapter16 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter16;
                }
                adapter16.write(jsonWriter, incident.endTime());
            }
            jsonWriter.name("iso_3166_1_alpha2");
            if (incident.countryCodeAlpha2() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter17 = this.string_adapter;
                if (adapter17 == null) {
                    adapter17 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter17;
                }
                adapter17.write(jsonWriter, incident.countryCodeAlpha2());
            }
            jsonWriter.name("iso_3166_1_alpha3");
            if (incident.countryCodeAlpha3() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter18 = this.string_adapter;
                if (adapter18 == null) {
                    adapter18 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter18;
                }
                adapter18.write(jsonWriter, incident.countryCodeAlpha3());
            }
            jsonWriter.name("lanes_blocked");
            if (incident.lanesBlocked() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter19 = this.list__string_adapter;
                if (adapter19 == null) {
                    adapter19 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter19;
                }
                adapter19.write(jsonWriter, incident.lanesBlocked());
            }
            jsonWriter.name("num_lanes_blocked");
            if (incident.numLanesBlocked() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter20 = this.integer_adapter;
                if (adapter20 == null) {
                    adapter20 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter20;
                }
                adapter20.write(jsonWriter, incident.numLanesBlocked());
            }
            jsonWriter.name("affected_road_names");
            if (incident.affectedRoadNames() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter21 = this.list__string_adapter;
                if (adapter21 == null) {
                    adapter21 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter21;
                }
                adapter21.write(jsonWriter, incident.affectedRoadNames());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:75:0x0116  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Incident read2(JsonReader jsonReader) throws IOException {
            String str;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Congestion congestion = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            List<Integer> list = null;
            TrafficCodes trafficCodes = null;
            Integer num = null;
            Integer num2 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            List<String> list2 = null;
            Integer num3 = null;
            List<String> list3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "sub_type":
                            TypeAdapter<String> adapter = this.string_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter;
                            }
                            str7 = adapter.read2(jsonReader);
                            break;
                        case "affected_road_names":
                            TypeAdapter<List<String>> adapter2 = this.list__string_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter2;
                            }
                            list3 = adapter2.read2(jsonReader);
                            break;
                        case "long_description":
                            TypeAdapter<String> adapter3 = this.string_adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter3;
                            }
                            str5 = adapter3.read2(jsonReader);
                            break;
                        case "start_time":
                            TypeAdapter<String> adapter4 = this.string_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter4;
                            }
                            str10 = adapter4.read2(jsonReader);
                            break;
                        case "num_lanes_blocked":
                            TypeAdapter<Integer> adapter5 = this.integer_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = adapter5;
                            }
                            num3 = adapter5.read2(jsonReader);
                            break;
                        case "lanes_blocked":
                            TypeAdapter<List<String>> adapter6 = this.list__string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter6;
                            }
                            list2 = adapter6.read2(jsonReader);
                            break;
                        case "traffic_codes":
                            TypeAdapter<TrafficCodes> adapter7 = this.trafficCodes_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(TrafficCodes.class);
                                this.trafficCodes_adapter = adapter7;
                            }
                            trafficCodes = adapter7.read2(jsonReader);
                            break;
                        case "geometry_index_start":
                            TypeAdapter<Integer> adapter8 = this.integer_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = adapter8;
                            }
                            num = adapter8.read2(jsonReader);
                            break;
                        case "sub_type_description":
                            TypeAdapter<String> adapter9 = this.string_adapter;
                            if (adapter9 == null) {
                                adapter9 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter9;
                            }
                            str8 = adapter9.read2(jsonReader);
                            break;
                        case "alertc_codes":
                            TypeAdapter<List<Integer>> adapter10 = this.list__integer_adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = adapter10;
                            }
                            list = adapter10.read2(jsonReader);
                            break;
                        case "iso_3166_1_alpha2":
                            TypeAdapter<String> adapter11 = this.string_adapter;
                            if (adapter11 == null) {
                                adapter11 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter11;
                            }
                            str12 = adapter11.read2(jsonReader);
                            break;
                        case "iso_3166_1_alpha3":
                            TypeAdapter<String> adapter12 = this.string_adapter;
                            if (adapter12 == null) {
                                adapter12 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter12;
                            }
                            str13 = adapter12.read2(jsonReader);
                            break;
                        case "end_time":
                            TypeAdapter<String> adapter13 = this.string_adapter;
                            if (adapter13 == null) {
                                adapter13 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter13;
                            }
                            str11 = adapter13.read2(jsonReader);
                            break;
                        case "geometry_index_end":
                            TypeAdapter<Integer> adapter14 = this.integer_adapter;
                            if (adapter14 == null) {
                                adapter14 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = adapter14;
                            }
                            num2 = adapter14.read2(jsonReader);
                            break;
                        case "creation_time":
                            TypeAdapter<String> adapter15 = this.string_adapter;
                            if (adapter15 == null) {
                                adapter15 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter15;
                            }
                            str9 = adapter15.read2(jsonReader);
                            break;
                        default:
                            if ("id".equals(strNextName)) {
                                TypeAdapter<String> adapter16 = this.string_adapter;
                                if (adapter16 == null) {
                                    adapter16 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter16;
                                }
                                str2 = adapter16.read2(jsonReader);
                                break;
                            } else {
                                if ("type".equals(strNextName)) {
                                    TypeAdapter<String> adapter17 = this.string_adapter;
                                    if (adapter17 == null) {
                                        adapter17 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter17;
                                    }
                                    str3 = adapter17.read2(jsonReader);
                                } else if ("closed".equals(strNextName)) {
                                    TypeAdapter<Boolean> adapter18 = this.boolean__adapter;
                                    if (adapter18 == null) {
                                        adapter18 = this.gson.getAdapter(Boolean.class);
                                        this.boolean__adapter = adapter18;
                                    }
                                    bool = adapter18.read2(jsonReader);
                                } else if ("congestion".equals(strNextName)) {
                                    TypeAdapter<Congestion> adapter19 = this.congestion_adapter;
                                    if (adapter19 == null) {
                                        adapter19 = this.gson.getAdapter(Congestion.class);
                                        this.congestion_adapter = adapter19;
                                    }
                                    congestion = adapter19.read2(jsonReader);
                                } else if ("description".equals(strNextName)) {
                                    TypeAdapter<String> adapter20 = this.string_adapter;
                                    if (adapter20 == null) {
                                        adapter20 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter20;
                                    }
                                    str4 = adapter20.read2(jsonReader);
                                } else if ("impact".equals(strNextName)) {
                                    TypeAdapter<String> adapter21 = this.string_adapter;
                                    if (adapter21 == null) {
                                        adapter21 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter21;
                                    }
                                    str6 = adapter21.read2(jsonReader);
                                } else {
                                    if (linkedHashMap == null) {
                                        linkedHashMap = new LinkedHashMap();
                                    }
                                    SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            jsonReader.endObject();
            if (str2 == null) {
                str = " id";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new AutoValue_Incident(linkedHashMap, str2, str3, bool, congestion, str4, str5, str6, str7, str8, list, trafficCodes, num, num2, str9, str10, str11, str12, str13, list2, num3, list3);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str));
            return null;
        }
    }

    public AutoValue_Incident(final Map<String, SerializableJsonElement> map, final String str, final String str2, final Boolean bool, final Congestion congestion, final String str3, final String str4, final String str5, final String str6, final String str7, final List<Integer> list, final TrafficCodes trafficCodes, final Integer num, final Integer num2, final String str8, final String str9, final String str10, final String str11, final String str12, final List<String> list2, final Integer num3, final List<String> list3) {
        new Incident(map, str, str2, bool, congestion, str3, str4, str5, str6, str7, list, trafficCodes, num, num2, str8, str9, str10, str11, str12, list2, num3, list3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Incident
            private final List<String> affectedRoadNames;
            private final List<Integer> alertcCodes;
            private final Boolean closed;
            private final Congestion congestion;
            private final String countryCodeAlpha2;
            private final String countryCodeAlpha3;
            private final String creationTime;
            private final String description;
            private final String endTime;
            private final Integer geometryIndexEnd;
            private final Integer geometryIndexStart;
            private final String id;
            private final String impact;
            private final List<String> lanesBlocked;
            private final String longDescription;
            private final Integer numLanesBlocked;
            private final String startTime;
            private final String subType;
            private final String subTypeDescription;
            private final TrafficCodes trafficCodes;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Incident$Builder */
            public static class Builder extends Incident.Builder {
                private List<String> affectedRoadNames;
                private List<Integer> alertcCodes;
                private Boolean closed;
                private Congestion congestion;
                private String countryCodeAlpha2;
                private String countryCodeAlpha3;
                private String creationTime;
                private String description;
                private String endTime;
                private Integer geometryIndexEnd;
                private Integer geometryIndexStart;
                private String id;
                private String impact;
                private List<String> lanesBlocked;
                private String longDescription;
                private Integer numLanesBlocked;
                private String startTime;
                private String subType;
                private String subTypeDescription;
                private TrafficCodes trafficCodes;
                private String type;
                private Map<String, SerializableJsonElement> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder geometryIndexEnd(Integer num) {
                    this.geometryIndexEnd = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident.Builder geometryIndexStart(Integer num) {
                    this.geometryIndexStart = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.Incident.Builder
                public Incident build() {
                    String str = this.id == null ? " id" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_Incident(this.unrecognized, this.id, this.type, this.closed, this.congestion, this.description, this.longDescription, this.impact, this.subType, this.subTypeDescription, this.alertcCodes, this.trafficCodes, this.geometryIndexStart, this.geometryIndexEnd, this.creationTime, this.startTime, this.endTime, this.countryCodeAlpha2, this.countryCodeAlpha3, this.lanesBlocked, this.numLanesBlocked, this.affectedRoadNames);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(str));
                    return null;
                }

                private Builder(Incident incident) {
                    this.unrecognized = incident.unrecognized();
                    this.id = incident.id();
                    this.type = incident.type();
                    this.closed = incident.closed();
                    this.congestion = incident.congestion();
                    this.description = incident.description();
                    this.longDescription = incident.longDescription();
                    this.impact = incident.impact();
                    this.subType = incident.subType();
                    this.subTypeDescription = incident.subTypeDescription();
                    this.alertcCodes = incident.alertcCodes();
                    this.trafficCodes = incident.trafficCodes();
                    this.geometryIndexStart = incident.geometryIndexStart();
                    this.geometryIndexEnd = incident.geometryIndexEnd();
                    this.creationTime = incident.creationTime();
                    this.startTime = incident.startTime();
                    this.endTime = incident.endTime();
                    this.countryCodeAlpha2 = incident.countryCodeAlpha2();
                    this.countryCodeAlpha3 = incident.countryCodeAlpha3();
                    this.lanesBlocked = incident.lanesBlocked();
                    this.numLanesBlocked = incident.numLanesBlocked();
                    this.affectedRoadNames = incident.affectedRoadNames();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public Incident.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("affected_road_names")
            public List<String> affectedRoadNames() {
                return this.affectedRoadNames;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("alertc_codes")
            public List<Integer> alertcCodes() {
                return this.alertcCodes;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public Boolean closed() {
                return this.closed;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public Congestion congestion() {
                return this.congestion;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("iso_3166_1_alpha2")
            public String countryCodeAlpha2() {
                return this.countryCodeAlpha2;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("iso_3166_1_alpha3")
            public String countryCodeAlpha3() {
                return this.countryCodeAlpha3;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("creation_time")
            public String creationTime() {
                return this.creationTime;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public String description() {
                return this.description;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("end_time")
            public String endTime() {
                return this.endTime;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("geometry_index_end")
            public Integer geometryIndexEnd() {
                return this.geometryIndexEnd;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("geometry_index_start")
            public Integer geometryIndexStart() {
                return this.geometryIndexStart;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public String id() {
                return this.id;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @Incident.ImpactType
            public String impact() {
                return this.impact;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("lanes_blocked")
            public List<String> lanesBlocked() {
                return this.lanesBlocked;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("long_description")
            public String longDescription() {
                return this.longDescription;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("num_lanes_blocked")
            public Integer numLanesBlocked() {
                return this.numLanesBlocked;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("start_time")
            public String startTime() {
                return this.startTime;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("sub_type")
            public String subType() {
                return this.subType;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("sub_type_description")
            public String subTypeDescription() {
                return this.subTypeDescription;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @SerializedName("traffic_codes")
            public TrafficCodes trafficCodes() {
                return this.trafficCodes;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            @Incident.IncidentType
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null id");
                    throw null;
                }
                this.id = str;
                this.type = str2;
                this.closed = bool;
                this.congestion = congestion;
                this.description = str3;
                this.longDescription = str4;
                this.impact = str5;
                this.subType = str6;
                this.subTypeDescription = str7;
                this.alertcCodes = list;
                this.trafficCodes = trafficCodes;
                this.geometryIndexStart = num;
                this.geometryIndexEnd = num2;
                this.creationTime = str8;
                this.startTime = str9;
                this.endTime = str10;
                this.countryCodeAlpha2 = str11;
                this.countryCodeAlpha3 = str12;
                this.lanesBlocked = list2;
                this.numLanesBlocked = num3;
                this.affectedRoadNames = list3;
            }

            @Override // com.mapbox.api.directions.v5.models.Incident
            public Incident.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Incident)) {
                    return false;
                }
                Incident incident = (Incident) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (incident.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(incident.unrecognized())) {
                    return false;
                }
                if (!this.id.equals(incident.id())) {
                    return false;
                }
                String str13 = this.type;
                if (str13 == null) {
                    if (incident.type() != null) {
                        return false;
                    }
                } else if (!str13.equals(incident.type())) {
                    return false;
                }
                Boolean bool2 = this.closed;
                if (bool2 == null) {
                    if (incident.closed() != null) {
                        return false;
                    }
                } else if (!bool2.equals(incident.closed())) {
                    return false;
                }
                Congestion congestion2 = this.congestion;
                if (congestion2 == null) {
                    if (incident.congestion() != null) {
                        return false;
                    }
                } else if (!congestion2.equals(incident.congestion())) {
                    return false;
                }
                String str14 = this.description;
                if (str14 == null) {
                    if (incident.description() != null) {
                        return false;
                    }
                } else if (!str14.equals(incident.description())) {
                    return false;
                }
                String str15 = this.longDescription;
                if (str15 == null) {
                    if (incident.longDescription() != null) {
                        return false;
                    }
                } else if (!str15.equals(incident.longDescription())) {
                    return false;
                }
                String str16 = this.impact;
                if (str16 == null) {
                    if (incident.impact() != null) {
                        return false;
                    }
                } else if (!str16.equals(incident.impact())) {
                    return false;
                }
                String str17 = this.subType;
                if (str17 == null) {
                    if (incident.subType() != null) {
                        return false;
                    }
                } else if (!str17.equals(incident.subType())) {
                    return false;
                }
                String str18 = this.subTypeDescription;
                if (str18 == null) {
                    if (incident.subTypeDescription() != null) {
                        return false;
                    }
                } else if (!str18.equals(incident.subTypeDescription())) {
                    return false;
                }
                List<Integer> list4 = this.alertcCodes;
                if (list4 == null) {
                    if (incident.alertcCodes() != null) {
                        return false;
                    }
                } else if (!list4.equals(incident.alertcCodes())) {
                    return false;
                }
                TrafficCodes trafficCodes2 = this.trafficCodes;
                if (trafficCodes2 == null) {
                    if (incident.trafficCodes() != null) {
                        return false;
                    }
                } else if (!trafficCodes2.equals(incident.trafficCodes())) {
                    return false;
                }
                Integer num4 = this.geometryIndexStart;
                if (num4 == null) {
                    if (incident.geometryIndexStart() != null) {
                        return false;
                    }
                } else if (!num4.equals(incident.geometryIndexStart())) {
                    return false;
                }
                Integer num5 = this.geometryIndexEnd;
                if (num5 == null) {
                    if (incident.geometryIndexEnd() != null) {
                        return false;
                    }
                } else if (!num5.equals(incident.geometryIndexEnd())) {
                    return false;
                }
                String str19 = this.creationTime;
                if (str19 == null) {
                    if (incident.creationTime() != null) {
                        return false;
                    }
                } else if (!str19.equals(incident.creationTime())) {
                    return false;
                }
                String str20 = this.startTime;
                if (str20 == null) {
                    if (incident.startTime() != null) {
                        return false;
                    }
                } else if (!str20.equals(incident.startTime())) {
                    return false;
                }
                String str21 = this.endTime;
                if (str21 == null) {
                    if (incident.endTime() != null) {
                        return false;
                    }
                } else if (!str21.equals(incident.endTime())) {
                    return false;
                }
                String str22 = this.countryCodeAlpha2;
                if (str22 == null) {
                    if (incident.countryCodeAlpha2() != null) {
                        return false;
                    }
                } else if (!str22.equals(incident.countryCodeAlpha2())) {
                    return false;
                }
                String str23 = this.countryCodeAlpha3;
                if (str23 == null) {
                    if (incident.countryCodeAlpha3() != null) {
                        return false;
                    }
                } else if (!str23.equals(incident.countryCodeAlpha3())) {
                    return false;
                }
                List<String> list5 = this.lanesBlocked;
                if (list5 == null) {
                    if (incident.lanesBlocked() != null) {
                        return false;
                    }
                } else if (!list5.equals(incident.lanesBlocked())) {
                    return false;
                }
                Integer num6 = this.numLanesBlocked;
                if (num6 == null) {
                    if (incident.numLanesBlocked() != null) {
                        return false;
                    }
                } else if (!num6.equals(incident.numLanesBlocked())) {
                    return false;
                }
                List<String> list6 = this.affectedRoadNames;
                if (list6 == null) {
                    if (incident.affectedRoadNames() != null) {
                        return false;
                    }
                } else if (!list6.equals(incident.affectedRoadNames())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Incident{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", id=");
                sb.append(this.id);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", closed=");
                sb.append(this.closed);
                sb.append(", congestion=");
                sb.append(this.congestion);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", longDescription=");
                sb.append(this.longDescription);
                sb.append(", impact=");
                sb.append(this.impact);
                sb.append(", subType=");
                sb.append(this.subType);
                sb.append(", subTypeDescription=");
                sb.append(this.subTypeDescription);
                sb.append(", alertcCodes=");
                sb.append(this.alertcCodes);
                sb.append(", trafficCodes=");
                sb.append(this.trafficCodes);
                sb.append(", geometryIndexStart=");
                sb.append(this.geometryIndexStart);
                sb.append(", geometryIndexEnd=");
                sb.append(this.geometryIndexEnd);
                sb.append(", creationTime=");
                sb.append(this.creationTime);
                sb.append(", startTime=");
                sb.append(this.startTime);
                sb.append(", endTime=");
                sb.append(this.endTime);
                sb.append(", countryCodeAlpha2=");
                sb.append(this.countryCodeAlpha2);
                sb.append(", countryCodeAlpha3=");
                sb.append(this.countryCodeAlpha3);
                sb.append(", lanesBlocked=");
                sb.append(this.lanesBlocked);
                sb.append(", numLanesBlocked=");
                sb.append(this.numLanesBlocked);
                sb.append(", affectedRoadNames=");
                return MediaSessionCompatQueueItem.read(sb, this.affectedRoadNames, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.id.hashCode();
                String str13 = this.type;
                int iHashCode3 = str13 == null ? 0 : str13.hashCode();
                Boolean bool2 = this.closed;
                int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
                Congestion congestion2 = this.congestion;
                int iHashCode5 = congestion2 == null ? 0 : congestion2.hashCode();
                String str14 = this.description;
                int iHashCode6 = str14 == null ? 0 : str14.hashCode();
                String str15 = this.longDescription;
                int iHashCode7 = str15 == null ? 0 : str15.hashCode();
                String str16 = this.impact;
                int iHashCode8 = str16 == null ? 0 : str16.hashCode();
                String str17 = this.subType;
                int iHashCode9 = str17 == null ? 0 : str17.hashCode();
                String str18 = this.subTypeDescription;
                int iHashCode10 = str18 == null ? 0 : str18.hashCode();
                List<Integer> list4 = this.alertcCodes;
                int iHashCode11 = list4 == null ? 0 : list4.hashCode();
                TrafficCodes trafficCodes2 = this.trafficCodes;
                int iHashCode12 = trafficCodes2 == null ? 0 : trafficCodes2.hashCode();
                Integer num4 = this.geometryIndexStart;
                int iHashCode13 = num4 == null ? 0 : num4.hashCode();
                Integer num5 = this.geometryIndexEnd;
                int iHashCode14 = num5 == null ? 0 : num5.hashCode();
                String str19 = this.creationTime;
                int iHashCode15 = str19 == null ? 0 : str19.hashCode();
                String str20 = this.startTime;
                int iHashCode16 = str20 == null ? 0 : str20.hashCode();
                String str21 = this.endTime;
                int iHashCode17 = str21 == null ? 0 : str21.hashCode();
                String str22 = this.countryCodeAlpha2;
                int iHashCode18 = str22 == null ? 0 : str22.hashCode();
                String str23 = this.countryCodeAlpha3;
                int iHashCode19 = str23 == null ? 0 : str23.hashCode();
                List<String> list5 = this.lanesBlocked;
                int iHashCode20 = list5 == null ? 0 : list5.hashCode();
                Integer num6 = this.numLanesBlocked;
                int iHashCode21 = num6 == null ? 0 : num6.hashCode();
                List<String> list6 = this.affectedRoadNames;
                return ((((((((((((((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ iHashCode15) * 1000003) ^ iHashCode16) * 1000003) ^ iHashCode17) * 1000003) ^ iHashCode18) * 1000003) ^ iHashCode19) * 1000003) ^ iHashCode20) * 1000003) ^ iHashCode21) * 1000003) ^ (list6 == null ? 0 : list6.hashCode());
            }
        };
    }
}
