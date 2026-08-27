package com.mapbox.api.directions.v5.models;

import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
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
final class AutoValue_CostPerVehicleSize extends C$AutoValue_CostPerVehicleSize {

    public static final class GsonTypeAdapter extends TypeAdapter<CostPerVehicleSize> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;

        public String toString() {
            return "TypeAdapter(CostPerVehicleSize)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, CostPerVehicleSize costPerVehicleSize) throws IOException {
            if (costPerVehicleSize == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (costPerVehicleSize.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : costPerVehicleSize.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name(Constants.SMALL);
            if (costPerVehicleSize.small() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter = this.double__adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter;
                }
                adapter.write(jsonWriter, costPerVehicleSize.small());
            }
            jsonWriter.name("standard");
            if (costPerVehicleSize.standard() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter2 = this.double__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter2;
                }
                adapter2.write(jsonWriter, costPerVehicleSize.standard());
            }
            jsonWriter.name("middle");
            if (costPerVehicleSize.middle() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter3 = this.double__adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter3;
                }
                adapter3.write(jsonWriter, costPerVehicleSize.middle());
            }
            jsonWriter.name(Constants.LARGE);
            if (costPerVehicleSize.large() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter4 = this.double__adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter4;
                }
                adapter4.write(jsonWriter, costPerVehicleSize.large());
            }
            jsonWriter.name("jumbo");
            if (costPerVehicleSize.jumbo() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter5 = this.double__adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter5;
                }
                adapter5.write(jsonWriter, costPerVehicleSize.jumbo());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public CostPerVehicleSize read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Double d4 = null;
            Double d5 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (Constants.SMALL.equals(strNextName)) {
                        TypeAdapter<Double> adapter = this.double__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter;
                        }
                        d = adapter.read2(jsonReader);
                    } else if ("standard".equals(strNextName)) {
                        TypeAdapter<Double> adapter2 = this.double__adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter2;
                        }
                        d2 = adapter2.read2(jsonReader);
                    } else if ("middle".equals(strNextName)) {
                        TypeAdapter<Double> adapter3 = this.double__adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter3;
                        }
                        d3 = adapter3.read2(jsonReader);
                    } else if (Constants.LARGE.equals(strNextName)) {
                        TypeAdapter<Double> adapter4 = this.double__adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter4;
                        }
                        d4 = adapter4.read2(jsonReader);
                    } else if ("jumbo".equals(strNextName)) {
                        TypeAdapter<Double> adapter5 = this.double__adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter5;
                        }
                        d5 = adapter5.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_CostPerVehicleSize(linkedHashMap, d, d2, d3, d4, d5);
        }
    }

    public AutoValue_CostPerVehicleSize(final Map<String, SerializableJsonElement> map, final Double d, final Double d2, final Double d3, final Double d4, final Double d5) {
        new CostPerVehicleSize(map, d, d2, d3, d4, d5) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_CostPerVehicleSize
            private final Double jumbo;
            private final Double large;
            private final Double middle;
            private final Double small;
            private final Double standard;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double jumbo() {
                return this.jumbo;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double large() {
                return this.large;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double middle() {
                return this.middle;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double small() {
                return this.small;
            }

            @Override // com.mapbox.api.directions.v5.models.CostPerVehicleSize
            public Double standard() {
                return this.standard;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.small = d;
                this.standard = d2;
                this.middle = d3;
                this.large = d4;
                this.jumbo = d5;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CostPerVehicleSize)) {
                    return false;
                }
                CostPerVehicleSize costPerVehicleSize = (CostPerVehicleSize) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (costPerVehicleSize.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(costPerVehicleSize.unrecognized())) {
                    return false;
                }
                Double d6 = this.small;
                if (d6 == null) {
                    if (costPerVehicleSize.small() != null) {
                        return false;
                    }
                } else if (!d6.equals(costPerVehicleSize.small())) {
                    return false;
                }
                Double d7 = this.standard;
                if (d7 == null) {
                    if (costPerVehicleSize.standard() != null) {
                        return false;
                    }
                } else if (!d7.equals(costPerVehicleSize.standard())) {
                    return false;
                }
                Double d8 = this.middle;
                if (d8 == null) {
                    if (costPerVehicleSize.middle() != null) {
                        return false;
                    }
                } else if (!d8.equals(costPerVehicleSize.middle())) {
                    return false;
                }
                Double d9 = this.large;
                if (d9 == null) {
                    if (costPerVehicleSize.large() != null) {
                        return false;
                    }
                } else if (!d9.equals(costPerVehicleSize.large())) {
                    return false;
                }
                Double d10 = this.jumbo;
                if (d10 == null) {
                    if (costPerVehicleSize.jumbo() != null) {
                        return false;
                    }
                } else if (!d10.equals(costPerVehicleSize.jumbo())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "CostPerVehicleSize{unrecognized=" + this.unrecognized + ", small=" + this.small + ", standard=" + this.standard + ", middle=" + this.middle + ", large=" + this.large + ", jumbo=" + this.jumbo + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                Double d6 = this.small;
                int iHashCode2 = d6 == null ? 0 : d6.hashCode();
                Double d7 = this.standard;
                int iHashCode3 = d7 == null ? 0 : d7.hashCode();
                Double d8 = this.middle;
                int iHashCode4 = d8 == null ? 0 : d8.hashCode();
                Double d9 = this.large;
                int iHashCode5 = d9 == null ? 0 : d9.hashCode();
                Double d10 = this.jumbo;
                return ((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (d10 != null ? d10.hashCode() : 0);
            }
        };
    }
}
