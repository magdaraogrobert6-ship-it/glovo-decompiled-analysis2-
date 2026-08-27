package com.mapbox.api.directionsrefresh.v1.models;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.Notification;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.getReverseScrolling;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoValue_RouteLegRefresh extends getReverseScrolling {
    public final LegAnnotation annotation;
    public final List closures;
    public final List incidents;
    public final List notifications;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_RouteLegRefresh> {
        public final Gson gson;
        public volatile TypeAdapter legAnnotation_adapter;
        public volatile TypeAdapter list__closure_adapter;
        public volatile TypeAdapter list__incident_adapter;
        public volatile TypeAdapter list__notification_adapter;

        public final String toString() {
            return "TypeAdapter(RouteLegRefresh)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_RouteLegRefresh read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap2 = null;
            List list = null;
            LegAnnotation legAnnotation = null;
            List list2 = null;
            List list3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("incidents".equals(strNextName)) {
                        TypeAdapter adapter = this.list__incident_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                            this.list__incident_adapter = adapter;
                        }
                        list = (List) adapter.read2(jsonReader);
                    } else if ("annotation".equals(strNextName)) {
                        TypeAdapter adapter2 = this.legAnnotation_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(LegAnnotation.class);
                            this.legAnnotation_adapter = adapter2;
                        }
                        legAnnotation = (LegAnnotation) adapter2.read2(jsonReader);
                    } else if ("closures".equals(strNextName)) {
                        TypeAdapter adapter3 = this.list__closure_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                            this.list__closure_adapter = adapter3;
                        }
                        list2 = (List) adapter3.read2(jsonReader);
                    } else if ("notifications".equals(strNextName)) {
                        TypeAdapter adapter4 = this.list__notification_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                            this.list__notification_adapter = adapter4;
                        }
                        list3 = (List) adapter4.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap2 = linkedHashMap;
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_RouteLegRefresh(linkedHashMap2, list, legAnnotation, list2, list3);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_RouteLegRefresh autoValue_RouteLegRefresh) throws IOException {
            AutoValue_RouteLegRefresh autoValue_RouteLegRefresh2 = autoValue_RouteLegRefresh;
            if (autoValue_RouteLegRefresh2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_RouteLegRefresh2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("incidents");
            if (autoValue_RouteLegRefresh2.incidents == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.list__incident_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, Incident.class));
                    this.list__incident_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_RouteLegRefresh2.incidents);
            }
            jsonWriter.name("annotation");
            if (autoValue_RouteLegRefresh2.annotation == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.legAnnotation_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(LegAnnotation.class);
                    this.legAnnotation_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_RouteLegRefresh2.annotation);
            }
            jsonWriter.name("closures");
            if (autoValue_RouteLegRefresh2.closures == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.list__closure_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Closure.class));
                    this.list__closure_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_RouteLegRefresh2.closures);
            }
            jsonWriter.name("notifications");
            if (autoValue_RouteLegRefresh2.notifications == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.list__notification_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Notification.class));
                    this.list__notification_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_RouteLegRefresh2.notifications);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        List list = this.incidents;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        LegAnnotation legAnnotation = this.annotation;
        int iHashCode3 = legAnnotation == null ? 0 : legAnnotation.hashCode();
        List list2 = this.closures;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.notifications;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (list3 != null ? list3.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_RouteLegRefresh(Map map, List list, LegAnnotation legAnnotation, List list2, List list3) {
        this.unrecognized = map;
        this.incidents = list;
        this.annotation = legAnnotation;
        this.closures = list2;
        this.notifications = list3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_RouteLegRefresh)) {
            return false;
        }
        AutoValue_RouteLegRefresh autoValue_RouteLegRefresh = (AutoValue_RouteLegRefresh) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_RouteLegRefresh.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_RouteLegRefresh.unrecognized)) {
            return false;
        }
        List list = this.incidents;
        if (list == null) {
            if (autoValue_RouteLegRefresh.incidents != null) {
                return false;
            }
        } else if (!list.equals(autoValue_RouteLegRefresh.incidents)) {
            return false;
        }
        LegAnnotation legAnnotation = this.annotation;
        if (legAnnotation == null) {
            if (autoValue_RouteLegRefresh.annotation != null) {
                return false;
            }
        } else if (!legAnnotation.equals(autoValue_RouteLegRefresh.annotation)) {
            return false;
        }
        List list2 = this.closures;
        if (list2 == null) {
            if (autoValue_RouteLegRefresh.closures != null) {
                return false;
            }
        } else if (!list2.equals(autoValue_RouteLegRefresh.closures)) {
            return false;
        }
        List list3 = this.notifications;
        if (list3 == null) {
            if (autoValue_RouteLegRefresh.notifications != null) {
                return false;
            }
        } else if (!list3.equals(autoValue_RouteLegRefresh.notifications)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteLegRefresh{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", incidents=");
        sb.append(this.incidents);
        sb.append(", annotation=");
        sb.append(this.annotation);
        sb.append(", closures=");
        sb.append(this.closures);
        sb.append(", notifications=");
        return MediaSessionCompatQueueItem.read(sb, this.notifications, "}");
    }
}
