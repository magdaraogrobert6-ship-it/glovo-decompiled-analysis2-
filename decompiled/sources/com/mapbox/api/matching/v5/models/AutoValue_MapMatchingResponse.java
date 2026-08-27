package com.mapbox.api.matching.v5.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_MapMatchingResponse implements Serializable {
    public final String code;
    public final List matchings;
    public final String message;
    public final List tracepoints;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_MapMatchingResponse> {
        public final Gson gson;
        public volatile TypeAdapter list__mapMatchingMatching_adapter;
        public volatile TypeAdapter list__mapMatchingTracepoint_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(MapMatchingResponse)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_MapMatchingResponse read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            List list = null;
            List list2 = null;
            String str2 = null;
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
                    } else if ("message".equals(strNextName)) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = (String) adapter2.read2(jsonReader);
                    } else if ("matchings".equals(strNextName)) {
                        TypeAdapter adapter3 = this.list__mapMatchingMatching_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, MapMatchingMatching.class));
                            this.list__mapMatchingMatching_adapter = adapter3;
                        }
                        list = (List) adapter3.read2(jsonReader);
                    } else if ("tracepoints".equals(strNextName)) {
                        TypeAdapter adapter4 = this.list__mapMatchingTracepoint_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_MapMatchingTracepoint.class));
                            this.list__mapMatchingTracepoint_adapter = adapter4;
                        }
                        list2 = (List) adapter4.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            String str3 = str == null ? " code" : "";
            if (str3.isEmpty()) {
                return new AutoValue_MapMatchingResponse(list, str, list2, str2);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(str3));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_MapMatchingResponse autoValue_MapMatchingResponse) throws IOException {
            AutoValue_MapMatchingResponse autoValue_MapMatchingResponse2 = autoValue_MapMatchingResponse;
            if (autoValue_MapMatchingResponse2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("code");
            if (autoValue_MapMatchingResponse2.code == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_MapMatchingResponse2.code);
            }
            jsonWriter.name("message");
            if (autoValue_MapMatchingResponse2.message == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_MapMatchingResponse2.message);
            }
            jsonWriter.name("matchings");
            if (autoValue_MapMatchingResponse2.matchings == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.list__mapMatchingMatching_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, MapMatchingMatching.class));
                    this.list__mapMatchingMatching_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_MapMatchingResponse2.matchings);
            }
            jsonWriter.name("tracepoints");
            if (autoValue_MapMatchingResponse2.tracepoints == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.list__mapMatchingTracepoint_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_MapMatchingTracepoint.class));
                    this.list__mapMatchingTracepoint_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_MapMatchingResponse2.tracepoints);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        int iHashCode = this.code.hashCode();
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List list = this.matchings;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List list2 = this.tracepoints;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_MapMatchingResponse)) {
            return false;
        }
        AutoValue_MapMatchingResponse autoValue_MapMatchingResponse = (AutoValue_MapMatchingResponse) obj;
        if (!this.code.equals(autoValue_MapMatchingResponse.code)) {
            return false;
        }
        String str = autoValue_MapMatchingResponse.message;
        String str2 = this.message;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        List list = autoValue_MapMatchingResponse.matchings;
        List list2 = this.matchings;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = autoValue_MapMatchingResponse.tracepoints;
        List list4 = this.tracepoints;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapMatchingResponse{code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", matchings=");
        sb.append(this.matchings);
        sb.append(", tracepoints=");
        return MediaSessionCompatQueueItem.read(sb, this.tracepoints, "}");
    }

    public AutoValue_MapMatchingResponse(List list, String str, List list2, String str2) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null code");
            throw null;
        }
        this.code = str;
        this.message = str2;
        this.matchings = list;
        this.tracepoints = list2;
    }
}
