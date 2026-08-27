package com.mapbox.api.geocoding.v5.models;

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
public final class AutoValue_RoutablePoints {
    public final List points;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_RoutablePoints> {
        public final Gson gson;
        public volatile TypeAdapter list__routablePoint_adapter;

        public final String toString() {
            return "TypeAdapter(RoutablePoints)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_RoutablePoints read2(JsonReader jsonReader) throws IOException {
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
                    if (strNextName.equals("points")) {
                        TypeAdapter adapter = this.list__routablePoint_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_RoutablePoint.class));
                            this.list__routablePoint_adapter = adapter;
                        }
                        list = (List) adapter.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_RoutablePoints(list);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_RoutablePoints autoValue_RoutablePoints) throws IOException {
            AutoValue_RoutablePoints autoValue_RoutablePoints2 = autoValue_RoutablePoints;
            if (autoValue_RoutablePoints2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("points");
            if (autoValue_RoutablePoints2.points == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.list__routablePoint_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_RoutablePoint.class));
                    this.list__routablePoint_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_RoutablePoints2.points);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_RoutablePoints(List list) {
        this.points = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_RoutablePoints)) {
            return false;
        }
        AutoValue_RoutablePoints autoValue_RoutablePoints = (AutoValue_RoutablePoints) obj;
        List list = this.points;
        if (list == null) {
            return autoValue_RoutablePoints.points == null;
        }
        return list.equals(autoValue_RoutablePoints.points);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("RoutablePoints{points="), this.points, "}");
    }

    public final int hashCode() {
        List list = this.points;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }
}
