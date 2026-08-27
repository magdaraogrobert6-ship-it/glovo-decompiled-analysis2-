package com.mapbox.api.directions.v5.models;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_SilentWaypoint extends C$AutoValue_SilentWaypoint {

    public static final class GsonTypeAdapter extends TypeAdapter<SilentWaypoint> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> int__adapter;

        public String toString() {
            return "TypeAdapter(SilentWaypoint)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, SilentWaypoint silentWaypoint) throws IOException {
            if (silentWaypoint == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (silentWaypoint.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : silentWaypoint.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("waypoint_index");
            TypeAdapter<Integer> adapter = this.int__adapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(Integer.class);
                this.int__adapter = adapter;
            }
            adapter.write(jsonWriter, Integer.valueOf(silentWaypoint.waypointIndex()));
            jsonWriter.name("distance_from_start");
            TypeAdapter<Double> adapter2 = this.double__adapter;
            if (adapter2 == null) {
                adapter2 = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter2;
            }
            adapter2.write(jsonWriter, Double.valueOf(silentWaypoint.distanceFromStart()));
            jsonWriter.name("geometry_index");
            TypeAdapter<Integer> adapter3 = this.int__adapter;
            if (adapter3 == null) {
                adapter3 = this.gson.getAdapter(Integer.class);
                this.int__adapter = adapter3;
            }
            adapter3.write(jsonWriter, Integer.valueOf(silentWaypoint.geometryIndex()));
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:29:0x006a  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public SilentWaypoint read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = true;
            LinkedHashMap linkedHashMap = null;
            double dDoubleValue = 0.0d;
            int iIntValue = 0;
            int iIntValue2 = 0;
            boolean z2 = true;
            boolean z3 = true;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -1645705705) {
                        if (iHashCode != 601411348) {
                            if (iHashCode == 813692613 && strNextName.equals("geometry_index")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("waypoint_index")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("distance_from_start")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter<Double> adapter = this.double__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter;
                        }
                        dDoubleValue = adapter.read2(jsonReader).doubleValue();
                        z3 = false;
                    } else if (b == 1) {
                        TypeAdapter<Integer> adapter2 = this.int__adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Integer.class);
                            this.int__adapter = adapter2;
                        }
                        iIntValue = adapter2.read2(jsonReader).intValue();
                        z2 = false;
                    } else if (b != 2) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    } else {
                        TypeAdapter<Integer> adapter3 = this.int__adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Integer.class);
                            this.int__adapter = adapter3;
                        }
                        iIntValue2 = adapter3.read2(jsonReader).intValue();
                        z = false;
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = z2 ? " waypointIndex" : "";
            if (z3) {
                strConcat = strConcat.concat(" distanceFromStart");
            }
            if (z) {
                strConcat = strConcat.concat(" geometryIndex");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_SilentWaypoint(linkedHashMap, iIntValue, dDoubleValue, iIntValue2);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_SilentWaypoint(final Map<String, SerializableJsonElement> map, final int i, final double d, final int i2) {
        new SilentWaypoint(map, i, d, i2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_SilentWaypoint
            private final double distanceFromStart;
            private final int geometryIndex;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final int waypointIndex;

            @Override // com.mapbox.api.directions.v5.models.SilentWaypoint
            @SerializedName("distance_from_start")
            public double distanceFromStart() {
                return this.distanceFromStart;
            }

            @Override // com.mapbox.api.directions.v5.models.SilentWaypoint
            @SerializedName("geometry_index")
            public int geometryIndex() {
                return this.geometryIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.SilentWaypoint
            @SerializedName("waypoint_index")
            public int waypointIndex() {
                return this.waypointIndex;
            }

            {
                this.unrecognized = map;
                this.waypointIndex = i;
                this.distanceFromStart = d;
                this.geometryIndex = i2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SilentWaypoint)) {
                    return false;
                }
                SilentWaypoint silentWaypoint = (SilentWaypoint) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (silentWaypoint.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(silentWaypoint.unrecognized())) {
                    return false;
                }
                return this.waypointIndex == silentWaypoint.waypointIndex() && Double.doubleToLongBits(this.distanceFromStart) == Double.doubleToLongBits(silentWaypoint.distanceFromStart()) && this.geometryIndex == silentWaypoint.geometryIndex();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SilentWaypoint{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", waypointIndex=");
                sb.append(this.waypointIndex);
                sb.append(", distanceFromStart=");
                sb.append(this.distanceFromStart);
                sb.append(", geometryIndex=");
                return af$$ExternalSyntheticOutline0.m(this.geometryIndex, "}", sb);
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                return ((((((iHashCode ^ 1000003) * 1000003) ^ this.waypointIndex) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.distanceFromStart) >>> 32) ^ Double.doubleToLongBits(this.distanceFromStart)))) * 1000003) ^ this.geometryIndex;
            }
        };
    }
}
