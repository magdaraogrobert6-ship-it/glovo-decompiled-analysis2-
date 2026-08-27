package com.mapbox.api.directions.v5.models;

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
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_DirectionsWaypoint extends C$AutoValue_DirectionsWaypoint {

    public static final class GsonTypeAdapter extends TypeAdapter<DirectionsWaypoint> {
        private volatile TypeAdapter<double[]> array__double_adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(DirectionsWaypoint)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, DirectionsWaypoint directionsWaypoint) throws IOException {
            if (directionsWaypoint == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (directionsWaypoint.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : directionsWaypoint.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("name");
            if (directionsWaypoint.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, directionsWaypoint.name());
            }
            jsonWriter.name("location");
            if (directionsWaypoint.rawLocation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> adapter2 = this.array__double_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = adapter2;
                }
                adapter2.write(jsonWriter, directionsWaypoint.rawLocation());
            }
            jsonWriter.name("distance");
            if (directionsWaypoint.distance() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter3 = this.double__adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter3;
                }
                adapter3.write(jsonWriter, directionsWaypoint.distance());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public DirectionsWaypoint read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            double[] dArr = null;
            LinkedHashMap linkedHashMap = null;
            Double d = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("location")) {
                        TypeAdapter<double[]> adapter = this.array__double_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(double[].class);
                            this.array__double_adapter = adapter;
                        }
                        dArr = adapter.read2(jsonReader);
                    } else if ("name".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else if ("distance".equals(strNextName)) {
                        TypeAdapter<Double> adapter3 = this.double__adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter3;
                        }
                        d = adapter3.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = str == null ? " name" : "";
            if (dArr == null) {
                strConcat = strConcat.concat(" rawLocation");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_DirectionsWaypoint(linkedHashMap, str, dArr, d);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_DirectionsWaypoint(final Map<String, SerializableJsonElement> map, final String str, final double[] dArr, final Double d) {
        new DirectionsWaypoint(map, str, dArr, d) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsWaypoint
            private final Double distance;
            private final String name;
            private final double[] rawLocation;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint
            public Double distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsWaypoint
            @SerializedName("location")
            public double[] rawLocation() {
                return this.rawLocation;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
                    throw null;
                }
                this.name = str;
                if (dArr == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rawLocation");
                    throw null;
                }
                this.rawLocation = dArr;
                this.distance = d;
            }

            public boolean equals(Object obj) {
                double[] dArrRawLocation;
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectionsWaypoint)) {
                    return false;
                }
                DirectionsWaypoint directionsWaypoint = (DirectionsWaypoint) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (directionsWaypoint.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(directionsWaypoint.unrecognized())) {
                    return false;
                }
                if (!this.name.equals(directionsWaypoint.name())) {
                    return false;
                }
                double[] dArr2 = this.rawLocation;
                if (directionsWaypoint instanceof C$AutoValue_DirectionsWaypoint) {
                    dArrRawLocation = ((C$AutoValue_DirectionsWaypoint) directionsWaypoint).rawLocation;
                } else {
                    dArrRawLocation = directionsWaypoint.rawLocation();
                }
                if (!Arrays.equals(dArr2, dArrRawLocation)) {
                    return false;
                }
                Double d2 = this.distance;
                if (d2 == null) {
                    if (directionsWaypoint.distance() != null) {
                        return false;
                    }
                } else if (!d2.equals(directionsWaypoint.distance())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "DirectionsWaypoint{unrecognized=" + this.unrecognized + ", name=" + this.name + ", rawLocation=" + Arrays.toString(this.rawLocation) + ", distance=" + this.distance + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.name.hashCode();
                int iHashCode3 = Arrays.hashCode(this.rawLocation);
                Double d2 = this.distance;
                return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (d2 != null ? d2.hashCode() : 0);
            }
        };
    }
}
