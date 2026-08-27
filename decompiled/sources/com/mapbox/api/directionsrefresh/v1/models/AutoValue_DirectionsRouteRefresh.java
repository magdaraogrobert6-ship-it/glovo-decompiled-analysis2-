package com.mapbox.api.directionsrefresh.v1.models;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
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
import o.getReverseScrolling;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoValue_DirectionsRouteRefresh extends getReverseScrolling {
    public final List legs;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_DirectionsRouteRefresh> {
        public final Gson gson;
        public volatile TypeAdapter list__routeLegRefresh_adapter;

        public final String toString() {
            return "TypeAdapter(DirectionsRouteRefresh)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_DirectionsRouteRefresh read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List list = null;
            LinkedHashMap linkedHashMap2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("legs".equals(strNextName)) {
                        TypeAdapter adapter = this.list__routeLegRefresh_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_RouteLegRefresh.class));
                            this.list__routeLegRefresh_adapter = adapter;
                        }
                        list = (List) adapter.read2(jsonReader);
                    } else {
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap = linkedHashMap2;
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap2, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_DirectionsRouteRefresh(linkedHashMap, list);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh) throws IOException {
            AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh2 = autoValue_DirectionsRouteRefresh;
            if (autoValue_DirectionsRouteRefresh2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_DirectionsRouteRefresh2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("legs");
            if (autoValue_DirectionsRouteRefresh2.legs == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.list__routeLegRefresh_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_RouteLegRefresh.class));
                    this.list__routeLegRefresh_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_DirectionsRouteRefresh2.legs);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        List list = this.legs;
        return ((iHashCode ^ 1000003) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_DirectionsRouteRefresh(Map map, List list) {
        this.unrecognized = map;
        this.legs = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_DirectionsRouteRefresh)) {
            return false;
        }
        AutoValue_DirectionsRouteRefresh autoValue_DirectionsRouteRefresh = (AutoValue_DirectionsRouteRefresh) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_DirectionsRouteRefresh.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_DirectionsRouteRefresh.unrecognized)) {
            return false;
        }
        List list = this.legs;
        if (list == null) {
            if (autoValue_DirectionsRouteRefresh.legs != null) {
                return false;
            }
        } else if (!list.equals(autoValue_DirectionsRouteRefresh.legs)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectionsRouteRefresh{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", legs=");
        return MediaSessionCompatQueueItem.read(sb, this.legs, "}");
    }
}
