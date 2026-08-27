package com.mapbox.api.geocoding.v6.models;

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
public final class AutoValue_V6BatchResponse implements Serializable {
    public final List responses;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6BatchResponse> {
        public final Gson gson;
        public volatile TypeAdapter list__v6Response_adapter;

        public final String toString() {
            return "TypeAdapter(V6BatchResponse)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6BatchResponse read2(JsonReader jsonReader) throws IOException {
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
                    if (strNextName.equals("batch")) {
                        TypeAdapter adapter = this.list__v6Response_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_V6Response.class));
                            this.list__v6Response_adapter = adapter;
                        }
                        list = (List) adapter.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6BatchResponse(list);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6BatchResponse autoValue_V6BatchResponse) throws IOException {
            AutoValue_V6BatchResponse autoValue_V6BatchResponse2 = autoValue_V6BatchResponse;
            if (autoValue_V6BatchResponse2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("batch");
            if (autoValue_V6BatchResponse2.responses == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.list__v6Response_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_V6Response.class));
                    this.list__v6Response_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6BatchResponse2.responses);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        return this.responses.hashCode() ^ 1000003;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6BatchResponse)) {
            return false;
        }
        return this.responses.equals(((AutoValue_V6BatchResponse) obj).responses);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("V6BatchResponse{responses="), this.responses, "}");
    }

    public AutoValue_V6BatchResponse(List list) {
        if (list != null) {
            this.responses = list;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null responses");
            throw null;
        }
    }
}
