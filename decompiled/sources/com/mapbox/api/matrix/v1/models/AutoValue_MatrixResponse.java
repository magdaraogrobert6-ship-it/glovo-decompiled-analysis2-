package com.mapbox.api.matrix.v1.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_MatrixResponse implements Serializable {
    public final String code;
    public final List destinations;
    public final List distances;
    public final List durations;
    public final List sources;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_MatrixResponse> {
        public final Gson gson;
        public volatile TypeAdapter list__array__double_adapter;
        public volatile TypeAdapter list__directionsWaypoint_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(MatrixResponse)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_MatrixResponse read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            List list = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
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
                        if (str == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null code");
                            return null;
                        }
                    } else if ("destinations".equals(strNextName)) {
                        TypeAdapter adapter2 = this.list__directionsWaypoint_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                            this.list__directionsWaypoint_adapter = adapter2;
                        }
                        list = (List) adapter2.read2(jsonReader);
                    } else if ("sources".equals(strNextName)) {
                        TypeAdapter adapter3 = this.list__directionsWaypoint_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                            this.list__directionsWaypoint_adapter = adapter3;
                        }
                        list2 = (List) adapter3.read2(jsonReader);
                    } else if ("durations".equals(strNextName)) {
                        TypeAdapter adapter4 = this.list__array__double_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                            this.list__array__double_adapter = adapter4;
                        }
                        list3 = (List) adapter4.read2(jsonReader);
                    } else if ("distances".equals(strNextName)) {
                        TypeAdapter adapter5 = this.list__array__double_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                            this.list__array__double_adapter = adapter5;
                        }
                        list4 = (List) adapter5.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            String str2 = str == null ? " code" : "";
            if (str2.isEmpty()) {
                return new AutoValue_MatrixResponse(str, list, list2, list3, list4);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(str2));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_MatrixResponse autoValue_MatrixResponse) throws IOException {
            AutoValue_MatrixResponse autoValue_MatrixResponse2 = autoValue_MatrixResponse;
            if (autoValue_MatrixResponse2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (autoValue_MatrixResponse2.code == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_MatrixResponse2.code);
            }
            jsonWriter.name("destinations");
            if (autoValue_MatrixResponse2.destinations == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.list__directionsWaypoint_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                    this.list__directionsWaypoint_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_MatrixResponse2.destinations);
            }
            jsonWriter.name("sources");
            if (autoValue_MatrixResponse2.sources == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.list__directionsWaypoint_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, DirectionsWaypoint.class));
                    this.list__directionsWaypoint_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_MatrixResponse2.sources);
            }
            jsonWriter.name("durations");
            if (autoValue_MatrixResponse2.durations == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.list__array__double_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                    this.list__array__double_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_MatrixResponse2.durations);
            }
            jsonWriter.name("distances");
            if (autoValue_MatrixResponse2.distances == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.list__array__double_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double[].class));
                    this.list__array__double_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_MatrixResponse2.distances);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        int iHashCode = this.code.hashCode();
        List list = this.destinations;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List list2 = this.sources;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List list3 = this.durations;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        List list4 = this.distances;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (list4 != null ? list4.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_MatrixResponse)) {
            return false;
        }
        AutoValue_MatrixResponse autoValue_MatrixResponse = (AutoValue_MatrixResponse) obj;
        if (!this.code.equals(autoValue_MatrixResponse.code)) {
            return false;
        }
        List list = autoValue_MatrixResponse.destinations;
        List list2 = this.destinations;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = autoValue_MatrixResponse.sources;
        List list4 = this.sources;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = autoValue_MatrixResponse.durations;
        List list6 = this.durations;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        List list7 = autoValue_MatrixResponse.distances;
        List list8 = this.distances;
        if (list8 == null) {
            if (list7 != null) {
                return false;
            }
        } else if (!list8.equals(list7)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatrixResponse{code=");
        sb.append(this.code);
        sb.append(", destinations=");
        sb.append(this.destinations);
        sb.append(", sources=");
        sb.append(this.sources);
        sb.append(", durations=");
        sb.append(this.durations);
        sb.append(", distances=");
        return MediaSessionCompatQueueItem.read(sb, this.distances, "}");
    }

    public AutoValue_MatrixResponse(String str, List list, List list2, List list3, List list4) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null code");
            throw null;
        }
        this.code = str;
        this.destinations = list;
        this.sources = list2;
        this.durations = list3;
        this.distances = list4;
    }
}
