package com.mapbox.api.geocoding.v6.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_V6RoutablePoint implements Serializable {
    public final Double latitude;
    public final Double longitude;
    public final String name;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6RoutablePoint> {
        public volatile TypeAdapter double__adapter;
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6RoutablePoint)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6RoutablePoint read2(JsonReader jsonReader) throws IOException {
            byte b;
            Double d = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Double d2 = null;
            String str = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -1439978388) {
                        if (iHashCode != 3373707) {
                            if (iHashCode == 137365935 && strNextName.equals("longitude")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("name")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("latitude")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter adapter = this.double__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter;
                        }
                        d2 = (Double) adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = (String) adapter2.read2(jsonReader);
                    } else if (b != 2) {
                        jsonReader.skipValue();
                    } else {
                        TypeAdapter adapter3 = this.double__adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter3;
                        }
                        d = (Double) adapter3.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6RoutablePoint(d, d2, str);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6RoutablePoint autoValue_V6RoutablePoint) throws IOException {
            AutoValue_V6RoutablePoint autoValue_V6RoutablePoint2 = autoValue_V6RoutablePoint;
            if (autoValue_V6RoutablePoint2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("longitude");
            if (autoValue_V6RoutablePoint2.longitude == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.double__adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6RoutablePoint2.longitude);
            }
            jsonWriter.name("latitude");
            if (autoValue_V6RoutablePoint2.latitude == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.double__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6RoutablePoint2.latitude);
            }
            jsonWriter.name("name");
            if (autoValue_V6RoutablePoint2.name == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6RoutablePoint2.name);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        int iHashCode = this.longitude.hashCode();
        int iHashCode2 = this.latitude.hashCode();
        String str = this.name;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6RoutablePoint)) {
            return false;
        }
        AutoValue_V6RoutablePoint autoValue_V6RoutablePoint = (AutoValue_V6RoutablePoint) obj;
        if (!this.longitude.equals(autoValue_V6RoutablePoint.longitude) || !this.latitude.equals(autoValue_V6RoutablePoint.latitude)) {
            return false;
        }
        String str = autoValue_V6RoutablePoint.name;
        String str2 = this.name;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6RoutablePoint{longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", name=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.name, "}");
    }

    public AutoValue_V6RoutablePoint(Double d, Double d2, String str) {
        if (d == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null longitude");
            throw null;
        }
        this.longitude = d;
        if (d2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null latitude");
            throw null;
        }
        this.latitude = d2;
        this.name = str;
    }
}
