package com.mapbox.api.directions.v5.models;

import com.braze.models.inappmessage.InAppMessageBase;
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
final class AutoValue_DirectionsRoute extends C$AutoValue_DirectionsRoute {

    public static final class GsonTypeAdapter extends TypeAdapter<DirectionsRoute> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<List<DirectionsWaypoint>> list__directionsWaypoint_adapter;
        private volatile TypeAdapter<List<RouteLeg>> list__routeLeg_adapter;
        private volatile TypeAdapter<List<TollCost>> list__tollCost_adapter;
        private volatile TypeAdapter<RouteOptions> routeOptions_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(DirectionsRoute)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, DirectionsRoute directionsRoute) throws IOException {
            if (directionsRoute == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (directionsRoute.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : directionsRoute.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("routeIndex");
            if (directionsRoute.routeIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, directionsRoute.routeIndex());
            }
            jsonWriter.name("distance");
            if (directionsRoute.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter2 = this.double__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter2;
                }
                adapter2.write(jsonWriter, directionsRoute.distance());
            }
            jsonWriter.name(InAppMessageBase.DURATION);
            if (directionsRoute.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter3 = this.double__adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter3;
                }
                adapter3.write(jsonWriter, directionsRoute.duration());
            }
            jsonWriter.name("duration_typical");
            if (directionsRoute.durationTypical() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter4 = this.double__adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter4;
                }
                adapter4.write(jsonWriter, directionsRoute.durationTypical());
            }
            jsonWriter.name("geometry");
            if (directionsRoute.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, directionsRoute.geometry());
            }
            jsonWriter.name("weight");
            if (directionsRoute.weight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter6 = this.double__adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter6;
                }
                adapter6.write(jsonWriter, directionsRoute.weight());
            }
            jsonWriter.name("weight_typical");
            if (directionsRoute.weightTypical() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter7 = this.double__adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter7;
                }
                adapter7.write(jsonWriter, directionsRoute.weightTypical());
            }
            jsonWriter.name("weight_name");
            if (directionsRoute.weightName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, directionsRoute.weightName());
            }
            jsonWriter.name("legs");
            if (directionsRoute.legs() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<RouteLeg>> adapter9 = this.list__routeLeg_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                    this.list__routeLeg_adapter = adapter9;
                }
                adapter9.write(jsonWriter, directionsRoute.legs());
            }
            jsonWriter.name("waypoints");
            if (directionsRoute.waypoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<DirectionsWaypoint>> adapter10 = this.list__directionsWaypoint_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                    this.list__directionsWaypoint_adapter = adapter10;
                }
                adapter10.write(jsonWriter, directionsRoute.waypoints());
            }
            jsonWriter.name("routeOptions");
            if (directionsRoute.routeOptions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<RouteOptions> adapter11 = this.routeOptions_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(RouteOptions.class);
                    this.routeOptions_adapter = adapter11;
                }
                adapter11.write(jsonWriter, directionsRoute.routeOptions());
            }
            jsonWriter.name("voiceLocale");
            if (directionsRoute.voiceLanguage() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter12 = this.string_adapter;
                if (adapter12 == null) {
                    adapter12 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter12;
                }
                adapter12.write(jsonWriter, directionsRoute.voiceLanguage());
            }
            jsonWriter.name("requestUuid");
            if (directionsRoute.requestUuid() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter13 = this.string_adapter;
                if (adapter13 == null) {
                    adapter13 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter13;
                }
                adapter13.write(jsonWriter, directionsRoute.requestUuid());
            }
            jsonWriter.name("toll_costs");
            if (directionsRoute.tollCosts() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<TollCost>> adapter14 = this.list__tollCost_adapter;
                if (adapter14 == null) {
                    adapter14 = this.gson.getAdapter(TypeToken.getParameterized(List.class, TollCost.class));
                    this.list__tollCost_adapter = adapter14;
                }
                adapter14.write(jsonWriter, directionsRoute.tollCosts());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:35:0x0085  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public DirectionsRoute read2(JsonReader jsonReader) throws IOException {
            String strConcat;
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            String str = null;
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            String str2 = null;
            Double d4 = null;
            Double d5 = null;
            String str3 = null;
            List<RouteLeg> list = null;
            List<DirectionsWaypoint> list2 = null;
            RouteOptions routeOptions = null;
            String str4 = null;
            String str5 = null;
            List<TollCost> list3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "duration_typical":
                            b = 0;
                            break;
                        case "toll_costs":
                            b = 1;
                            break;
                        case "weight_typical":
                            b = 2;
                            break;
                        case "voiceLocale":
                            b = 3;
                            break;
                        case "weight_name":
                            b = 4;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter<Double> adapter = this.double__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter;
                        }
                        d3 = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<List<TollCost>> adapter2 = this.list__tollCost_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, TollCost.class));
                            this.list__tollCost_adapter = adapter2;
                        }
                        list3 = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<Double> adapter3 = this.double__adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter3;
                        }
                        d5 = adapter3.read2(jsonReader);
                    } else if (b == 3) {
                        TypeAdapter<String> adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str4 = adapter4.read2(jsonReader);
                    } else if (b != 4) {
                        if ("routeIndex".equals(strNextName)) {
                            TypeAdapter<String> adapter5 = this.string_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter5;
                            }
                            str = adapter5.read2(jsonReader);
                        } else if ("distance".equals(strNextName)) {
                            TypeAdapter<Double> adapter6 = this.double__adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter6;
                            }
                            d = adapter6.read2(jsonReader);
                        } else if (InAppMessageBase.DURATION.equals(strNextName)) {
                            TypeAdapter<Double> adapter7 = this.double__adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter7;
                            }
                            d2 = adapter7.read2(jsonReader);
                        } else if ("geometry".equals(strNextName)) {
                            TypeAdapter<String> adapter8 = this.string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter8;
                            }
                            str2 = adapter8.read2(jsonReader);
                        } else if ("weight".equals(strNextName)) {
                            TypeAdapter<Double> adapter9 = this.double__adapter;
                            if (adapter9 == null) {
                                adapter9 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter9;
                            }
                            d4 = adapter9.read2(jsonReader);
                        } else if ("legs".equals(strNextName)) {
                            TypeAdapter<List<RouteLeg>> adapter10 = this.list__routeLeg_adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                                this.list__routeLeg_adapter = adapter10;
                            }
                            list = adapter10.read2(jsonReader);
                        } else if ("waypoints".equals(strNextName)) {
                            TypeAdapter<List<DirectionsWaypoint>> adapter11 = this.list__directionsWaypoint_adapter;
                            if (adapter11 == null) {
                                adapter11 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                                this.list__directionsWaypoint_adapter = adapter11;
                            }
                            list2 = adapter11.read2(jsonReader);
                        } else if ("routeOptions".equals(strNextName)) {
                            TypeAdapter<RouteOptions> adapter12 = this.routeOptions_adapter;
                            if (adapter12 == null) {
                                adapter12 = this.gson.getAdapter(RouteOptions.class);
                                this.routeOptions_adapter = adapter12;
                            }
                            routeOptions = adapter12.read2(jsonReader);
                        } else if ("requestUuid".equals(strNextName)) {
                            TypeAdapter<String> adapter13 = this.string_adapter;
                            if (adapter13 == null) {
                                adapter13 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter13;
                            }
                            str5 = adapter13.read2(jsonReader);
                        } else {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                        }
                    } else {
                        TypeAdapter<String> adapter14 = this.string_adapter;
                        if (adapter14 == null) {
                            adapter14 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter14;
                        }
                        str3 = adapter14.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            if (d == null) {
                strConcat = " distance";
            } else {
                strConcat = "";
            }
            if (d2 == null) {
                strConcat = strConcat.concat(" duration");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_DirectionsRoute(linkedHashMap, str, d, d2, d3, str2, d4, d5, str3, list, list2, routeOptions, str4, str5, list3);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_DirectionsRoute(Map<String, SerializableJsonElement> map, String str, Double d, Double d2, Double d3, String str2, Double d4, Double d5, String str3, List<RouteLeg> list, List<DirectionsWaypoint> list2, RouteOptions routeOptions, String str4, String str5, List<TollCost> list3) {
        new DirectionsRoute(map, str, d, d2, d3, str2, d4, d5, str3, list, list2, routeOptions, str4, str5, list3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsRoute
            private final Double distance;
            private final Double duration;
            private final Double durationTypical;
            private final String geometry;
            private final List<RouteLeg> legs;
            private final String requestUuid;
            private final String routeIndex;
            private final RouteOptions routeOptions;
            private final List<TollCost> tollCosts;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final String voiceLanguage;
            private final List<DirectionsWaypoint> waypoints;
            private final Double weight;
            private final String weightName;
            private final Double weightTypical;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsRoute$Builder */
            public static class Builder extends DirectionsRoute.Builder {
                private Double distance;
                private Double duration;
                private Double durationTypical;
                private String geometry;
                private List<RouteLeg> legs;
                private String requestUuid;
                private String routeIndex;
                private RouteOptions routeOptions;
                private List<TollCost> tollCosts;
                private Map<String, SerializableJsonElement> unrecognized;
                private String voiceLanguage;
                private List<DirectionsWaypoint> waypoints;
                private Double weight;
                private String weightName;
                private Double weightTypical;

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder legs(List<RouteLeg> list) {
                    this.legs = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder requestUuid(String str) {
                    this.requestUuid = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder routeIndex(String str) {
                    this.routeIndex = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder routeOptions(RouteOptions routeOptions) {
                    this.routeOptions = routeOptions;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder waypoints(List<DirectionsWaypoint> list) {
                    this.waypoints = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute build() {
                    String strConcat = this.distance == null ? " distance" : "";
                    if (this.duration == null) {
                        strConcat = strConcat.concat(" duration");
                    }
                    if (strConcat.isEmpty()) {
                        return new AutoValue_DirectionsRoute(this.unrecognized, this.routeIndex, this.distance, this.duration, this.durationTypical, this.geometry, this.weight, this.weightTypical, this.weightName, this.legs, this.waypoints, this.routeOptions, this.voiceLanguage, this.requestUuid, this.tollCosts);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder distance(Double d) {
                    if (d != null) {
                        this.distance = d;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null distance");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsRoute.Builder
                public DirectionsRoute.Builder duration(Double d) {
                    if (d != null) {
                        this.duration = d;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null duration");
                    return null;
                }

                private Builder(DirectionsRoute directionsRoute) {
                    this.unrecognized = directionsRoute.unrecognized();
                    this.routeIndex = directionsRoute.routeIndex();
                    this.distance = directionsRoute.distance();
                    this.duration = directionsRoute.duration();
                    this.durationTypical = directionsRoute.durationTypical();
                    this.geometry = directionsRoute.geometry();
                    this.weight = directionsRoute.weight();
                    this.weightTypical = directionsRoute.weightTypical();
                    this.weightName = directionsRoute.weightName();
                    this.legs = directionsRoute.legs();
                    this.waypoints = directionsRoute.waypoints();
                    this.routeOptions = directionsRoute.routeOptions();
                    this.voiceLanguage = directionsRoute.voiceLanguage();
                    this.requestUuid = directionsRoute.requestUuid();
                    this.tollCosts = directionsRoute.tollCosts();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public DirectionsRoute.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                public Builder() {
                }
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public Double distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public Double duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("duration_typical")
            public Double durationTypical() {
                return this.durationTypical;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public String geometry() {
                return this.geometry;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public List<RouteLeg> legs() {
                return this.legs;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public String requestUuid() {
                return this.requestUuid;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public String routeIndex() {
                return this.routeIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public RouteOptions routeOptions() {
                return this.routeOptions;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("toll_costs")
            public List<TollCost> tollCosts() {
                return this.tollCosts;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("voiceLocale")
            public String voiceLanguage() {
                return this.voiceLanguage;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public List<DirectionsWaypoint> waypoints() {
                return this.waypoints;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public Double weight() {
                return this.weight;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("weight_name")
            public String weightName() {
                return this.weightName;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            @SerializedName("weight_typical")
            public Double weightTypical() {
                return this.weightTypical;
            }

            {
                this.unrecognized = map;
                this.routeIndex = str;
                if (d == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null distance");
                    throw null;
                }
                this.distance = d;
                if (d2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null duration");
                    throw null;
                }
                this.duration = d2;
                this.durationTypical = d3;
                this.geometry = str2;
                this.weight = d4;
                this.weightTypical = d5;
                this.weightName = str3;
                this.legs = list;
                this.waypoints = list2;
                this.routeOptions = routeOptions;
                this.voiceLanguage = str4;
                this.requestUuid = str5;
                this.tollCosts = list3;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsRoute
            public DirectionsRoute.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectionsRoute)) {
                    return false;
                }
                DirectionsRoute directionsRoute = (DirectionsRoute) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (directionsRoute.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(directionsRoute.unrecognized())) {
                    return false;
                }
                String str6 = this.routeIndex;
                if (str6 == null) {
                    if (directionsRoute.routeIndex() != null) {
                        return false;
                    }
                } else if (!str6.equals(directionsRoute.routeIndex())) {
                    return false;
                }
                if (!this.distance.equals(directionsRoute.distance()) || !this.duration.equals(directionsRoute.duration())) {
                    return false;
                }
                Double d6 = this.durationTypical;
                if (d6 == null) {
                    if (directionsRoute.durationTypical() != null) {
                        return false;
                    }
                } else if (!d6.equals(directionsRoute.durationTypical())) {
                    return false;
                }
                String str7 = this.geometry;
                if (str7 == null) {
                    if (directionsRoute.geometry() != null) {
                        return false;
                    }
                } else if (!str7.equals(directionsRoute.geometry())) {
                    return false;
                }
                Double d7 = this.weight;
                if (d7 == null) {
                    if (directionsRoute.weight() != null) {
                        return false;
                    }
                } else if (!d7.equals(directionsRoute.weight())) {
                    return false;
                }
                Double d8 = this.weightTypical;
                if (d8 == null) {
                    if (directionsRoute.weightTypical() != null) {
                        return false;
                    }
                } else if (!d8.equals(directionsRoute.weightTypical())) {
                    return false;
                }
                String str8 = this.weightName;
                if (str8 == null) {
                    if (directionsRoute.weightName() != null) {
                        return false;
                    }
                } else if (!str8.equals(directionsRoute.weightName())) {
                    return false;
                }
                List<RouteLeg> list4 = this.legs;
                if (list4 == null) {
                    if (directionsRoute.legs() != null) {
                        return false;
                    }
                } else if (!list4.equals(directionsRoute.legs())) {
                    return false;
                }
                List<DirectionsWaypoint> list5 = this.waypoints;
                if (list5 == null) {
                    if (directionsRoute.waypoints() != null) {
                        return false;
                    }
                } else if (!list5.equals(directionsRoute.waypoints())) {
                    return false;
                }
                RouteOptions routeOptions2 = this.routeOptions;
                if (routeOptions2 == null) {
                    if (directionsRoute.routeOptions() != null) {
                        return false;
                    }
                } else if (!routeOptions2.equals(directionsRoute.routeOptions())) {
                    return false;
                }
                String str9 = this.voiceLanguage;
                if (str9 == null) {
                    if (directionsRoute.voiceLanguage() != null) {
                        return false;
                    }
                } else if (!str9.equals(directionsRoute.voiceLanguage())) {
                    return false;
                }
                String str10 = this.requestUuid;
                if (str10 == null) {
                    if (directionsRoute.requestUuid() != null) {
                        return false;
                    }
                } else if (!str10.equals(directionsRoute.requestUuid())) {
                    return false;
                }
                List<TollCost> list6 = this.tollCosts;
                if (list6 == null) {
                    if (directionsRoute.tollCosts() != null) {
                        return false;
                    }
                } else if (!list6.equals(directionsRoute.tollCosts())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("DirectionsRoute{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", routeIndex=");
                sb.append(this.routeIndex);
                sb.append(", distance=");
                sb.append(this.distance);
                sb.append(", duration=");
                sb.append(this.duration);
                sb.append(", durationTypical=");
                sb.append(this.durationTypical);
                sb.append(", geometry=");
                sb.append(this.geometry);
                sb.append(", weight=");
                sb.append(this.weight);
                sb.append(", weightTypical=");
                sb.append(this.weightTypical);
                sb.append(", weightName=");
                sb.append(this.weightName);
                sb.append(", legs=");
                sb.append(this.legs);
                sb.append(", waypoints=");
                sb.append(this.waypoints);
                sb.append(", routeOptions=");
                sb.append(this.routeOptions);
                sb.append(", voiceLanguage=");
                sb.append(this.voiceLanguage);
                sb.append(", requestUuid=");
                sb.append(this.requestUuid);
                sb.append(", tollCosts=");
                return MediaSessionCompatQueueItem.read(sb, this.tollCosts, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str6 = this.routeIndex;
                int iHashCode2 = str6 == null ? 0 : str6.hashCode();
                int iHashCode3 = this.distance.hashCode();
                int iHashCode4 = this.duration.hashCode();
                Double d6 = this.durationTypical;
                int iHashCode5 = d6 == null ? 0 : d6.hashCode();
                String str7 = this.geometry;
                int iHashCode6 = str7 == null ? 0 : str7.hashCode();
                Double d7 = this.weight;
                int iHashCode7 = d7 == null ? 0 : d7.hashCode();
                Double d8 = this.weightTypical;
                int iHashCode8 = d8 == null ? 0 : d8.hashCode();
                String str8 = this.weightName;
                int iHashCode9 = str8 == null ? 0 : str8.hashCode();
                List<RouteLeg> list4 = this.legs;
                int iHashCode10 = list4 == null ? 0 : list4.hashCode();
                List<DirectionsWaypoint> list5 = this.waypoints;
                int iHashCode11 = list5 == null ? 0 : list5.hashCode();
                RouteOptions routeOptions2 = this.routeOptions;
                int iHashCode12 = routeOptions2 == null ? 0 : routeOptions2.hashCode();
                String str9 = this.voiceLanguage;
                int iHashCode13 = str9 == null ? 0 : str9.hashCode();
                String str10 = this.requestUuid;
                int iHashCode14 = str10 == null ? 0 : str10.hashCode();
                List<TollCost> list6 = this.tollCosts;
                return ((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ (list6 == null ? 0 : list6.hashCode());
            }
        };
    }
}
