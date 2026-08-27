package com.mapbox.api.directions.v5.models;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
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
final class AutoValue_RouteLeg extends C$AutoValue_RouteLeg {

    public static final class GsonTypeAdapter extends TypeAdapter<RouteLeg> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<LegAnnotation> legAnnotation_adapter;
        private volatile TypeAdapter<List<Admin>> list__admin_adapter;
        private volatile TypeAdapter<List<Closure>> list__closure_adapter;
        private volatile TypeAdapter<List<Incident>> list__incident_adapter;
        private volatile TypeAdapter<List<LegStep>> list__legStep_adapter;
        private volatile TypeAdapter<List<Notification>> list__notification_adapter;
        private volatile TypeAdapter<List<SilentWaypoint>> list__silentWaypoint_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(RouteLeg)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, RouteLeg routeLeg) throws IOException {
            if (routeLeg == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (routeLeg.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : routeLeg.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("via_waypoints");
            if (routeLeg.viaWaypoints() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<SilentWaypoint>> adapter = this.list__silentWaypoint_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, SilentWaypoint.class));
                    this.list__silentWaypoint_adapter = adapter;
                }
                adapter.write(jsonWriter, routeLeg.viaWaypoints());
            }
            jsonWriter.name("distance");
            if (routeLeg.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter2 = this.double__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter2;
                }
                adapter2.write(jsonWriter, routeLeg.distance());
            }
            jsonWriter.name(InAppMessageBase.DURATION);
            if (routeLeg.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter3 = this.double__adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter3;
                }
                adapter3.write(jsonWriter, routeLeg.duration());
            }
            jsonWriter.name("duration_typical");
            if (routeLeg.durationTypical() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter4 = this.double__adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter4;
                }
                adapter4.write(jsonWriter, routeLeg.durationTypical());
            }
            jsonWriter.name("summary");
            if (routeLeg.summary() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, routeLeg.summary());
            }
            jsonWriter.name("admins");
            if (routeLeg.admins() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Admin>> adapter6 = this.list__admin_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Admin.class));
                    this.list__admin_adapter = adapter6;
                }
                adapter6.write(jsonWriter, routeLeg.admins());
            }
            jsonWriter.name(ContainerStep.STEPS);
            if (routeLeg.steps() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<LegStep>> adapter7 = this.list__legStep_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, LegStep.class));
                    this.list__legStep_adapter = adapter7;
                }
                adapter7.write(jsonWriter, routeLeg.steps());
            }
            jsonWriter.name("incidents");
            if (routeLeg.incidents() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Incident>> adapter8 = this.list__incident_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                    this.list__incident_adapter = adapter8;
                }
                adapter8.write(jsonWriter, routeLeg.incidents());
            }
            jsonWriter.name("annotation");
            if (routeLeg.annotation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<LegAnnotation> adapter9 = this.legAnnotation_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(LegAnnotation.class);
                    this.legAnnotation_adapter = adapter9;
                }
                adapter9.write(jsonWriter, routeLeg.annotation());
            }
            jsonWriter.name("closures");
            if (routeLeg.closures() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Closure>> adapter10 = this.list__closure_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                    this.list__closure_adapter = adapter10;
                }
                adapter10.write(jsonWriter, routeLeg.closures());
            }
            jsonWriter.name("notifications");
            if (routeLeg.notifications() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Notification>> adapter11 = this.list__notification_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                    this.list__notification_adapter = adapter11;
                }
                adapter11.write(jsonWriter, routeLeg.notifications());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public RouteLeg read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            List<SilentWaypoint> list = null;
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            String str = null;
            List<Admin> list2 = null;
            List<LegStep> list3 = null;
            List<Incident> list4 = null;
            LegAnnotation legAnnotation = null;
            List<Closure> list5 = null;
            List<Notification> list6 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (!strNextName.equals("duration_typical")) {
                        if (!strNextName.equals("via_waypoints")) {
                            if ("distance".equals(strNextName)) {
                                TypeAdapter<Double> adapter = this.double__adapter;
                                if (adapter == null) {
                                    adapter = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter;
                                }
                                d = adapter.read2(jsonReader);
                            } else if (InAppMessageBase.DURATION.equals(strNextName)) {
                                TypeAdapter<Double> adapter2 = this.double__adapter;
                                if (adapter2 == null) {
                                    adapter2 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter2;
                                }
                                d2 = adapter2.read2(jsonReader);
                            } else if ("summary".equals(strNextName)) {
                                TypeAdapter<String> adapter3 = this.string_adapter;
                                if (adapter3 == null) {
                                    adapter3 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter3;
                                }
                                str = adapter3.read2(jsonReader);
                            } else if ("admins".equals(strNextName)) {
                                TypeAdapter<List<Admin>> adapter4 = this.list__admin_adapter;
                                if (adapter4 == null) {
                                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Admin.class));
                                    this.list__admin_adapter = adapter4;
                                }
                                list2 = adapter4.read2(jsonReader);
                            } else if (ContainerStep.STEPS.equals(strNextName)) {
                                TypeAdapter<List<LegStep>> adapter5 = this.list__legStep_adapter;
                                if (adapter5 == null) {
                                    adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, LegStep.class));
                                    this.list__legStep_adapter = adapter5;
                                }
                                list3 = adapter5.read2(jsonReader);
                            } else if ("incidents".equals(strNextName)) {
                                TypeAdapter<List<Incident>> adapter6 = this.list__incident_adapter;
                                if (adapter6 == null) {
                                    adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                                    this.list__incident_adapter = adapter6;
                                }
                                list4 = adapter6.read2(jsonReader);
                            } else if ("annotation".equals(strNextName)) {
                                TypeAdapter<LegAnnotation> adapter7 = this.legAnnotation_adapter;
                                if (adapter7 == null) {
                                    adapter7 = this.gson.getAdapter(LegAnnotation.class);
                                    this.legAnnotation_adapter = adapter7;
                                }
                                legAnnotation = adapter7.read2(jsonReader);
                            } else if ("closures".equals(strNextName)) {
                                TypeAdapter<List<Closure>> adapter8 = this.list__closure_adapter;
                                if (adapter8 == null) {
                                    adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                                    this.list__closure_adapter = adapter8;
                                }
                                list5 = adapter8.read2(jsonReader);
                            } else if ("notifications".equals(strNextName)) {
                                TypeAdapter<List<Notification>> adapter9 = this.list__notification_adapter;
                                if (adapter9 == null) {
                                    adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                                    this.list__notification_adapter = adapter9;
                                }
                                list6 = adapter9.read2(jsonReader);
                            } else {
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                }
                                SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                            }
                        } else {
                            TypeAdapter<List<SilentWaypoint>> adapter10 = this.list__silentWaypoint_adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, SilentWaypoint.class));
                                this.list__silentWaypoint_adapter = adapter10;
                            }
                            list = adapter10.read2(jsonReader);
                        }
                    } else {
                        TypeAdapter<Double> adapter11 = this.double__adapter;
                        if (adapter11 == null) {
                            adapter11 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter11;
                        }
                        d3 = adapter11.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_RouteLeg(linkedHashMap, list, d, d2, d3, str, list2, list3, list4, legAnnotation, list5, list6);
        }
    }

    public AutoValue_RouteLeg(Map<String, SerializableJsonElement> map, List<SilentWaypoint> list, Double d, Double d2, Double d3, String str, List<Admin> list2, List<LegStep> list3, List<Incident> list4, LegAnnotation legAnnotation, List<Closure> list5, List<Notification> list6) {
        new RouteLeg(map, list, d, d2, d3, str, list2, list3, list4, legAnnotation, list5, list6) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_RouteLeg
            private final List<Admin> admins;
            private final LegAnnotation annotation;
            private final List<Closure> closures;
            private final Double distance;
            private final Double duration;
            private final Double durationTypical;
            private final List<Incident> incidents;
            private final List<Notification> notifications;
            private final List<LegStep> steps;
            private final String summary;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final List<SilentWaypoint> viaWaypoints;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_RouteLeg$Builder */
            public static class Builder extends RouteLeg.Builder {
                private List<Admin> admins;
                private LegAnnotation annotation;
                private List<Closure> closures;
                private Double distance;
                private Double duration;
                private Double durationTypical;
                private List<Incident> incidents;
                private List<Notification> notifications;
                private List<LegStep> steps;
                private String summary;
                private Map<String, SerializableJsonElement> unrecognized;
                private List<SilentWaypoint> viaWaypoints;

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder annotation(LegAnnotation legAnnotation) {
                    this.annotation = legAnnotation;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder closures(List<Closure> list) {
                    this.closures = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder duration(Double d) {
                    this.duration = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder incidents(List<Incident> list) {
                    this.incidents = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder notifications(List<Notification> list) {
                    this.notifications = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg.Builder steps(List<LegStep> list) {
                    this.steps = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.RouteLeg.Builder
                public RouteLeg build() {
                    return new AutoValue_RouteLeg(this.unrecognized, this.viaWaypoints, this.distance, this.duration, this.durationTypical, this.summary, this.admins, this.steps, this.incidents, this.annotation, this.closures, this.notifications);
                }

                private Builder(RouteLeg routeLeg) {
                    this.unrecognized = routeLeg.unrecognized();
                    this.viaWaypoints = routeLeg.viaWaypoints();
                    this.distance = routeLeg.distance();
                    this.duration = routeLeg.duration();
                    this.durationTypical = routeLeg.durationTypical();
                    this.summary = routeLeg.summary();
                    this.admins = routeLeg.admins();
                    this.steps = routeLeg.steps();
                    this.incidents = routeLeg.incidents();
                    this.annotation = routeLeg.annotation();
                    this.closures = routeLeg.closures();
                    this.notifications = routeLeg.notifications();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public RouteLeg.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                public Builder() {
                }
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Admin> admins() {
                return this.admins;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public LegAnnotation annotation() {
                return this.annotation;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Closure> closures() {
                return this.closures;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public Double distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public Double duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            @SerializedName("duration_typical")
            public Double durationTypical() {
                return this.durationTypical;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Incident> incidents() {
                return this.incidents;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<Notification> notifications() {
                return this.notifications;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public List<LegStep> steps() {
                return this.steps;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public String summary() {
                return this.summary;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            @SerializedName("via_waypoints")
            public List<SilentWaypoint> viaWaypoints() {
                return this.viaWaypoints;
            }

            {
                this.unrecognized = map;
                this.viaWaypoints = list;
                this.distance = d;
                this.duration = d2;
                this.durationTypical = d3;
                this.summary = str;
                this.admins = list2;
                this.steps = list3;
                this.incidents = list4;
                this.annotation = legAnnotation;
                this.closures = list5;
                this.notifications = list6;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteLeg
            public RouteLeg.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RouteLeg)) {
                    return false;
                }
                RouteLeg routeLeg = (RouteLeg) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (routeLeg.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(routeLeg.unrecognized())) {
                    return false;
                }
                List<SilentWaypoint> list7 = this.viaWaypoints;
                if (list7 == null) {
                    if (routeLeg.viaWaypoints() != null) {
                        return false;
                    }
                } else if (!list7.equals(routeLeg.viaWaypoints())) {
                    return false;
                }
                Double d4 = this.distance;
                if (d4 == null) {
                    if (routeLeg.distance() != null) {
                        return false;
                    }
                } else if (!d4.equals(routeLeg.distance())) {
                    return false;
                }
                Double d5 = this.duration;
                if (d5 == null) {
                    if (routeLeg.duration() != null) {
                        return false;
                    }
                } else if (!d5.equals(routeLeg.duration())) {
                    return false;
                }
                Double d6 = this.durationTypical;
                if (d6 == null) {
                    if (routeLeg.durationTypical() != null) {
                        return false;
                    }
                } else if (!d6.equals(routeLeg.durationTypical())) {
                    return false;
                }
                String str2 = this.summary;
                if (str2 == null) {
                    if (routeLeg.summary() != null) {
                        return false;
                    }
                } else if (!str2.equals(routeLeg.summary())) {
                    return false;
                }
                List<Admin> list8 = this.admins;
                if (list8 == null) {
                    if (routeLeg.admins() != null) {
                        return false;
                    }
                } else if (!list8.equals(routeLeg.admins())) {
                    return false;
                }
                List<LegStep> list9 = this.steps;
                if (list9 == null) {
                    if (routeLeg.steps() != null) {
                        return false;
                    }
                } else if (!list9.equals(routeLeg.steps())) {
                    return false;
                }
                List<Incident> list10 = this.incidents;
                if (list10 == null) {
                    if (routeLeg.incidents() != null) {
                        return false;
                    }
                } else if (!list10.equals(routeLeg.incidents())) {
                    return false;
                }
                LegAnnotation legAnnotation2 = this.annotation;
                if (legAnnotation2 == null) {
                    if (routeLeg.annotation() != null) {
                        return false;
                    }
                } else if (!legAnnotation2.equals(routeLeg.annotation())) {
                    return false;
                }
                List<Closure> list11 = this.closures;
                if (list11 == null) {
                    if (routeLeg.closures() != null) {
                        return false;
                    }
                } else if (!list11.equals(routeLeg.closures())) {
                    return false;
                }
                List<Notification> list12 = this.notifications;
                if (list12 == null) {
                    if (routeLeg.notifications() != null) {
                        return false;
                    }
                } else if (!list12.equals(routeLeg.notifications())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("RouteLeg{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", viaWaypoints=");
                sb.append(this.viaWaypoints);
                sb.append(", distance=");
                sb.append(this.distance);
                sb.append(", duration=");
                sb.append(this.duration);
                sb.append(", durationTypical=");
                sb.append(this.durationTypical);
                sb.append(", summary=");
                sb.append(this.summary);
                sb.append(", admins=");
                sb.append(this.admins);
                sb.append(", steps=");
                sb.append(this.steps);
                sb.append(", incidents=");
                sb.append(this.incidents);
                sb.append(", annotation=");
                sb.append(this.annotation);
                sb.append(", closures=");
                sb.append(this.closures);
                sb.append(", notifications=");
                return MediaSessionCompatQueueItem.read(sb, this.notifications, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                List<SilentWaypoint> list7 = this.viaWaypoints;
                int iHashCode2 = list7 == null ? 0 : list7.hashCode();
                Double d4 = this.distance;
                int iHashCode3 = d4 == null ? 0 : d4.hashCode();
                Double d5 = this.duration;
                int iHashCode4 = d5 == null ? 0 : d5.hashCode();
                Double d6 = this.durationTypical;
                int iHashCode5 = d6 == null ? 0 : d6.hashCode();
                String str2 = this.summary;
                int iHashCode6 = str2 == null ? 0 : str2.hashCode();
                List<Admin> list8 = this.admins;
                int iHashCode7 = list8 == null ? 0 : list8.hashCode();
                List<LegStep> list9 = this.steps;
                int iHashCode8 = list9 == null ? 0 : list9.hashCode();
                List<Incident> list10 = this.incidents;
                int iHashCode9 = list10 == null ? 0 : list10.hashCode();
                LegAnnotation legAnnotation2 = this.annotation;
                int iHashCode10 = legAnnotation2 == null ? 0 : legAnnotation2.hashCode();
                List<Closure> list11 = this.closures;
                int iHashCode11 = list11 == null ? 0 : list11.hashCode();
                List<Notification> list12 = this.notifications;
                return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ (list12 != null ? list12.hashCode() : 0);
            }
        };
    }
}
