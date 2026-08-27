package com.mapbox.api.routetiles.v1.versions.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_RouteTileVersionsResponse {
    public final List availableVersions;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_RouteTileVersionsResponse> {
        public final Gson gson;
        public volatile TypeAdapter list__string_adapter;

        public final String toString() {
            return "TypeAdapter(RouteTileVersionsResponse)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_RouteTileVersionsResponse read2(JsonReader jsonReader) throws IOException {
            List list = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("availableVersions".equals(strNextName)) {
                        TypeAdapter adapter = this.list__string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                            this.list__string_adapter = adapter;
                        }
                        list = (List) adapter.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_RouteTileVersionsResponse(list);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_RouteTileVersionsResponse autoValue_RouteTileVersionsResponse) throws IOException {
            AutoValue_RouteTileVersionsResponse autoValue_RouteTileVersionsResponse2 = autoValue_RouteTileVersionsResponse;
            if (autoValue_RouteTileVersionsResponse2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("availableVersions");
            if (autoValue_RouteTileVersionsResponse2.availableVersions == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.list__string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_RouteTileVersionsResponse2.availableVersions);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        return this.availableVersions.hashCode() ^ 1000003;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_RouteTileVersionsResponse)) {
            return false;
        }
        return this.availableVersions.equals(((AutoValue_RouteTileVersionsResponse) obj).availableVersions);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("RouteTileVersionsResponse{availableVersions="), this.availableVersions, "}");
    }

    public AutoValue_RouteTileVersionsResponse(List list) {
        if (list != null) {
            this.availableVersions = list;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null availableVersions");
            throw null;
        }
    }
}
