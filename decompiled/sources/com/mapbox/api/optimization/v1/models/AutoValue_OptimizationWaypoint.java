package com.mapbox.api.optimization.v1.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_OptimizationWaypoint implements Serializable {
    public final String name;
    public final double[] rawLocation;
    public final int tripsIndex;
    public final int waypointIndex;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_OptimizationWaypoint> {
        public volatile TypeAdapter array__double_adapter;
        public final Gson gson;
        public volatile TypeAdapter int__adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(OptimizationWaypoint)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0061  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_OptimizationWaypoint read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Integer num = null;
            Integer num2 = null;
            String str = null;
            double[] dArr = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -294735295) {
                        if (iHashCode != 601411348) {
                            if (iHashCode == 1901043637 && strNextName.equals("location")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("waypoint_index")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("trips_index")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter adapter = this.int__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Integer.class);
                            this.int__adapter = adapter;
                        }
                        num2 = (Integer) adapter.read2(jsonReader);
                        num2.getClass();
                    } else if (b == 1) {
                        TypeAdapter adapter2 = this.int__adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Integer.class);
                            this.int__adapter = adapter2;
                        }
                        num = (Integer) adapter2.read2(jsonReader);
                        num.getClass();
                    } else if (b == 2) {
                        TypeAdapter adapter3 = this.array__double_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(double[].class);
                            this.array__double_adapter = adapter3;
                        }
                        dArr = (double[]) adapter3.read2(jsonReader);
                    } else if ("name".equals(strNextName)) {
                        TypeAdapter adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str = (String) adapter4.read2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = num == null ? " waypointIndex" : "";
            if (num2 == null) {
                strConcat = strConcat.concat(" tripsIndex");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_OptimizationWaypoint(num.intValue(), num2.intValue(), str, dArr);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_OptimizationWaypoint autoValue_OptimizationWaypoint) throws IOException {
            AutoValue_OptimizationWaypoint autoValue_OptimizationWaypoint2 = autoValue_OptimizationWaypoint;
            if (autoValue_OptimizationWaypoint2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("waypoint_index");
            TypeAdapter adapter = this.int__adapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(Integer.class);
                this.int__adapter = adapter;
            }
            adapter.write(jsonWriter, Integer.valueOf(autoValue_OptimizationWaypoint2.waypointIndex));
            jsonWriter.name("trips_index");
            TypeAdapter adapter2 = this.int__adapter;
            if (adapter2 == null) {
                adapter2 = this.gson.getAdapter(Integer.class);
                this.int__adapter = adapter2;
            }
            adapter2.write(jsonWriter, Integer.valueOf(autoValue_OptimizationWaypoint2.tripsIndex));
            jsonWriter.name("name");
            if (autoValue_OptimizationWaypoint2.name == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_OptimizationWaypoint2.name);
            }
            jsonWriter.name("location");
            if (autoValue_OptimizationWaypoint2.rawLocation == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.array__double_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_OptimizationWaypoint2.rawLocation);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_OptimizationWaypoint(int i, int i2, String str, double[] dArr) {
        this.waypointIndex = i;
        this.tripsIndex = i2;
        this.name = str;
        this.rawLocation = dArr;
    }

    public final boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_OptimizationWaypoint)) {
            return false;
        }
        AutoValue_OptimizationWaypoint autoValue_OptimizationWaypoint = (AutoValue_OptimizationWaypoint) obj;
        if (this.waypointIndex != autoValue_OptimizationWaypoint.waypointIndex || this.tripsIndex != autoValue_OptimizationWaypoint.tripsIndex) {
            return false;
        }
        String str = autoValue_OptimizationWaypoint.name;
        String str2 = this.name;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (autoValue_OptimizationWaypoint instanceof AutoValue_OptimizationWaypoint) {
            dArr = autoValue_OptimizationWaypoint.rawLocation;
        } else {
            dArr = autoValue_OptimizationWaypoint.rawLocation;
        }
        return Arrays.equals(this.rawLocation, dArr);
    }

    public final String toString() {
        return "OptimizationWaypoint{waypointIndex=" + this.waypointIndex + ", tripsIndex=" + this.tripsIndex + ", name=" + this.name + ", rawLocation=" + Arrays.toString(this.rawLocation) + "}";
    }

    public final int hashCode() {
        int i = this.waypointIndex;
        int i2 = this.tripsIndex;
        String str = this.name;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.rawLocation);
    }
}
