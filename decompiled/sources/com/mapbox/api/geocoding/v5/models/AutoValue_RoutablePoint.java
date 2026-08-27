package com.mapbox.api.geocoding.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_RoutablePoint {
    public final String name;
    public final double[] rawCoordinate;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_RoutablePoint> {
        public volatile TypeAdapter array__double_adapter;
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(RoutablePoint)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_RoutablePoint read2(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            double[] dArr = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("name")) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = (String) adapter.read2(jsonReader);
                    } else if (strNextName.equals("coordinates")) {
                        TypeAdapter adapter2 = this.array__double_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(double[].class);
                            this.array__double_adapter = adapter2;
                        }
                        dArr = (double[]) adapter2.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_RoutablePoint(str, dArr);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_RoutablePoint autoValue_RoutablePoint) throws IOException {
            AutoValue_RoutablePoint autoValue_RoutablePoint2 = autoValue_RoutablePoint;
            if (autoValue_RoutablePoint2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("name");
            if (autoValue_RoutablePoint2.name == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_RoutablePoint2.name);
            }
            jsonWriter.name("coordinates");
            if (autoValue_RoutablePoint2.rawCoordinate == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.array__double_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_RoutablePoint2.rawCoordinate);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_RoutablePoint(String str, double[] dArr) {
        this.name = str;
        this.rawCoordinate = dArr;
    }

    public final boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_RoutablePoint)) {
            return false;
        }
        AutoValue_RoutablePoint autoValue_RoutablePoint = (AutoValue_RoutablePoint) obj;
        String str = this.name;
        if (str == null) {
            if (autoValue_RoutablePoint.name != null) {
                return false;
            }
        } else if (!str.equals(autoValue_RoutablePoint.name)) {
            return false;
        }
        if (autoValue_RoutablePoint instanceof AutoValue_RoutablePoint) {
            dArr = autoValue_RoutablePoint.rawCoordinate;
        } else {
            dArr = autoValue_RoutablePoint.rawCoordinate;
        }
        return Arrays.equals(this.rawCoordinate, dArr);
    }

    public final String toString() {
        return "RoutablePoint{name=" + this.name + ", rawCoordinate=" + Arrays.toString(this.rawCoordinate) + "}";
    }

    public final int hashCode() {
        String str = this.name;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rawCoordinate);
    }
}
