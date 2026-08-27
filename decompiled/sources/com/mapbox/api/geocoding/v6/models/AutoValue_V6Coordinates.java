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
public final class AutoValue_V6Coordinates implements Serializable {
    public final String accuracy;
    public final Double latitude;
    public final Double longitude;
    public final List routablePoints;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6Coordinates> {
        public volatile TypeAdapter double__adapter;
        public final Gson gson;
        public volatile TypeAdapter list__v6RoutablePoint_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6Coordinates)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:31:0x0064  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6Coordinates read2(JsonReader jsonReader) throws IOException {
            byte b;
            Double d = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Double d2 = null;
            String str = null;
            List list = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "accuracy":
                            b = 0;
                            break;
                        case "latitude":
                            b = 1;
                            break;
                        case "longitude":
                            b = 2;
                            break;
                        case "routable_points":
                            b = 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = (String) adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter adapter2 = this.double__adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter2;
                        }
                        d2 = (Double) adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter adapter3 = this.double__adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter3;
                        }
                        d = (Double) adapter3.read2(jsonReader);
                    } else if (b != 3) {
                        jsonReader.skipValue();
                    } else {
                        TypeAdapter adapter4 = this.list__v6RoutablePoint_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_V6RoutablePoint.class));
                            this.list__v6RoutablePoint_adapter = adapter4;
                        }
                        list = (List) adapter4.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6Coordinates(d, d2, str, list);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6Coordinates autoValue_V6Coordinates) throws IOException {
            AutoValue_V6Coordinates autoValue_V6Coordinates2 = autoValue_V6Coordinates;
            if (autoValue_V6Coordinates2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("longitude");
            if (autoValue_V6Coordinates2.longitude == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.double__adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6Coordinates2.longitude);
            }
            jsonWriter.name("latitude");
            if (autoValue_V6Coordinates2.latitude == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.double__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6Coordinates2.latitude);
            }
            jsonWriter.name("accuracy");
            if (autoValue_V6Coordinates2.accuracy == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6Coordinates2.accuracy);
            }
            jsonWriter.name("routable_points");
            if (autoValue_V6Coordinates2.routablePoints == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.list__v6RoutablePoint_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_V6RoutablePoint.class));
                    this.list__v6RoutablePoint_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6Coordinates2.routablePoints);
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
        String str = this.accuracy;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List list = this.routablePoints;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6Coordinates)) {
            return false;
        }
        AutoValue_V6Coordinates autoValue_V6Coordinates = (AutoValue_V6Coordinates) obj;
        if (!this.longitude.equals(autoValue_V6Coordinates.longitude) || !this.latitude.equals(autoValue_V6Coordinates.latitude)) {
            return false;
        }
        String str = autoValue_V6Coordinates.accuracy;
        String str2 = this.accuracy;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        List list = autoValue_V6Coordinates.routablePoints;
        List list2 = this.routablePoints;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6Coordinates{longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", accuracy=");
        sb.append(this.accuracy);
        sb.append(", routablePoints=");
        return MediaSessionCompatQueueItem.read(sb, this.routablePoints, "}");
    }

    public AutoValue_V6Coordinates(Double d, Double d2, String str, List list) {
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
        this.accuracy = str;
        this.routablePoints = list;
    }
}
