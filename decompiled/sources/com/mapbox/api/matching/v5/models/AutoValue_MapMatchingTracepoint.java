package com.mapbox.api.matching.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_MapMatchingTracepoint implements Serializable {
    public final Integer alternativesCount;
    public final Integer matchingsIndex;
    public final String name;
    public final double[] rawLocation;
    public final Integer waypointIndex;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_MapMatchingTracepoint> {
        public volatile TypeAdapter array__double_adapter;
        public final Gson gson;
        public volatile TypeAdapter integer_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(MapMatchingTracepoint)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:31:0x0065  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_MapMatchingTracepoint read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            double[] dArr = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "matchings_index":
                            b = 0;
                            break;
                        case "alternatives_count":
                            b = 1;
                            break;
                        case "waypoint_index":
                            b = 2;
                            break;
                        case "location":
                            b = 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter adapter = this.integer_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter;
                        }
                        num = (Integer) adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter adapter2 = this.integer_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter2;
                        }
                        num2 = (Integer) adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter adapter3 = this.integer_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter3;
                        }
                        num3 = (Integer) adapter3.read2(jsonReader);
                    } else if (b == 3) {
                        TypeAdapter adapter4 = this.array__double_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(double[].class);
                            this.array__double_adapter = adapter4;
                        }
                        dArr = (double[]) adapter4.read2(jsonReader);
                    } else if ("name".equals(strNextName)) {
                        TypeAdapter adapter5 = this.string_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter5;
                        }
                        str = (String) adapter5.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_MapMatchingTracepoint(num, num2, num3, str, dArr);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_MapMatchingTracepoint autoValue_MapMatchingTracepoint) throws IOException {
            AutoValue_MapMatchingTracepoint autoValue_MapMatchingTracepoint2 = autoValue_MapMatchingTracepoint;
            if (autoValue_MapMatchingTracepoint2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("matchings_index");
            if (autoValue_MapMatchingTracepoint2.matchingsIndex == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.integer_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_MapMatchingTracepoint2.matchingsIndex);
            }
            jsonWriter.name("alternatives_count");
            if (autoValue_MapMatchingTracepoint2.alternativesCount == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.integer_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_MapMatchingTracepoint2.alternativesCount);
            }
            jsonWriter.name("waypoint_index");
            if (autoValue_MapMatchingTracepoint2.waypointIndex == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.integer_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_MapMatchingTracepoint2.waypointIndex);
            }
            jsonWriter.name("name");
            if (autoValue_MapMatchingTracepoint2.name == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_MapMatchingTracepoint2.name);
            }
            jsonWriter.name("location");
            if (autoValue_MapMatchingTracepoint2.rawLocation == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.array__double_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_MapMatchingTracepoint2.rawLocation);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Integer num = this.matchingsIndex;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.alternativesCount;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.waypointIndex;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        String str = this.name;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.rawLocation);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_MapMatchingTracepoint(Integer num, Integer num2, Integer num3, String str, double[] dArr) {
        this.matchingsIndex = num;
        this.alternativesCount = num2;
        this.waypointIndex = num3;
        this.name = str;
        this.rawLocation = dArr;
    }

    public final boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_MapMatchingTracepoint)) {
            return false;
        }
        AutoValue_MapMatchingTracepoint autoValue_MapMatchingTracepoint = (AutoValue_MapMatchingTracepoint) obj;
        Integer num = this.matchingsIndex;
        if (num == null) {
            if (autoValue_MapMatchingTracepoint.matchingsIndex != null) {
                return false;
            }
        } else if (!num.equals(autoValue_MapMatchingTracepoint.matchingsIndex)) {
            return false;
        }
        Integer num2 = this.alternativesCount;
        if (num2 == null) {
            if (autoValue_MapMatchingTracepoint.alternativesCount != null) {
                return false;
            }
        } else if (!num2.equals(autoValue_MapMatchingTracepoint.alternativesCount)) {
            return false;
        }
        Integer num3 = this.waypointIndex;
        if (num3 == null) {
            if (autoValue_MapMatchingTracepoint.waypointIndex != null) {
                return false;
            }
        } else if (!num3.equals(autoValue_MapMatchingTracepoint.waypointIndex)) {
            return false;
        }
        String str = this.name;
        if (str == null) {
            if (autoValue_MapMatchingTracepoint.name != null) {
                return false;
            }
        } else if (!str.equals(autoValue_MapMatchingTracepoint.name)) {
            return false;
        }
        if (autoValue_MapMatchingTracepoint instanceof AutoValue_MapMatchingTracepoint) {
            dArr = autoValue_MapMatchingTracepoint.rawLocation;
        } else {
            dArr = autoValue_MapMatchingTracepoint.rawLocation;
        }
        return Arrays.equals(this.rawLocation, dArr);
    }

    public final String toString() {
        return "MapMatchingTracepoint{matchingsIndex=" + this.matchingsIndex + ", alternativesCount=" + this.alternativesCount + ", waypointIndex=" + this.waypointIndex + ", name=" + this.name + ", rawLocation=" + Arrays.toString(this.rawLocation) + "}";
    }
}
