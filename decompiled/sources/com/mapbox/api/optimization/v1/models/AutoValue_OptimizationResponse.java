package com.mapbox.api.optimization.v1.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_OptimizationResponse implements Serializable {
    public final String code;
    public final List trips;
    public final List waypoints;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_OptimizationResponse> {
        public final Gson gson;
        public volatile TypeAdapter list__directionsRoute_adapter;
        public volatile TypeAdapter list__optimizationWaypoint_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(OptimizationResponse)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_OptimizationResponse read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List list = null;
            List list2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("code".equals(strNextName)) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = (String) adapter.read2(jsonReader);
                    } else if ("waypoints".equals(strNextName)) {
                        TypeAdapter adapter2 = this.list__optimizationWaypoint_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_OptimizationWaypoint.class));
                            this.list__optimizationWaypoint_adapter = adapter2;
                        }
                        list = (List) adapter2.read2(jsonReader);
                    } else if ("trips".equals(strNextName)) {
                        TypeAdapter adapter3 = this.list__directionsRoute_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
                            this.list__directionsRoute_adapter = adapter3;
                        }
                        list2 = (List) adapter3.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_OptimizationResponse(str, list, list2);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_OptimizationResponse autoValue_OptimizationResponse) throws IOException {
            AutoValue_OptimizationResponse autoValue_OptimizationResponse2 = autoValue_OptimizationResponse;
            if (autoValue_OptimizationResponse2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (autoValue_OptimizationResponse2.code == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_OptimizationResponse2.code);
            }
            jsonWriter.name("waypoints");
            if (autoValue_OptimizationResponse2.waypoints == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.list__optimizationWaypoint_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_OptimizationWaypoint.class));
                    this.list__optimizationWaypoint_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_OptimizationResponse2.waypoints);
            }
            jsonWriter.name("trips");
            if (autoValue_OptimizationResponse2.trips == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.list__directionsRoute_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsRoute.class));
                    this.list__directionsRoute_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_OptimizationResponse2.trips);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        List list = this.waypoints;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List list2 = this.trips;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_OptimizationResponse(String str, List list, List list2) {
        this.code = str;
        this.waypoints = list;
        this.trips = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_OptimizationResponse)) {
            return false;
        }
        AutoValue_OptimizationResponse autoValue_OptimizationResponse = (AutoValue_OptimizationResponse) obj;
        String str = this.code;
        if (str == null) {
            if (autoValue_OptimizationResponse.code != null) {
                return false;
            }
        } else if (!str.equals(autoValue_OptimizationResponse.code)) {
            return false;
        }
        List list = this.waypoints;
        if (list == null) {
            if (autoValue_OptimizationResponse.waypoints != null) {
                return false;
            }
        } else if (!list.equals(autoValue_OptimizationResponse.waypoints)) {
            return false;
        }
        List list2 = this.trips;
        if (list2 == null) {
            if (autoValue_OptimizationResponse.trips != null) {
                return false;
            }
        } else if (!list2.equals(autoValue_OptimizationResponse.trips)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptimizationResponse{code=");
        sb.append(this.code);
        sb.append(", waypoints=");
        sb.append(this.waypoints);
        sb.append(", trips=");
        return MediaSessionCompatQueueItem.read(sb, this.trips, "}");
    }
}
