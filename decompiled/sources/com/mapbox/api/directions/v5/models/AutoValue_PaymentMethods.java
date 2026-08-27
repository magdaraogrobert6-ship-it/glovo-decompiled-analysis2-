package com.mapbox.api.directions.v5.models;

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
final class AutoValue_PaymentMethods extends C$AutoValue_PaymentMethods {

    public static final class GsonTypeAdapter extends TypeAdapter<PaymentMethods> {
        private volatile TypeAdapter<CostPerVehicleSize> costPerVehicleSize_adapter;
        private final Gson gson;

        public String toString() {
            return "TypeAdapter(PaymentMethods)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, PaymentMethods paymentMethods) throws IOException {
            if (paymentMethods == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (paymentMethods.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : paymentMethods.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("etc");
            if (paymentMethods.etc() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<CostPerVehicleSize> adapter = this.costPerVehicleSize_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(CostPerVehicleSize.class);
                    this.costPerVehicleSize_adapter = adapter;
                }
                adapter.write(jsonWriter, paymentMethods.etc());
            }
            jsonWriter.name("etc2");
            if (paymentMethods.etc2() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<CostPerVehicleSize> adapter2 = this.costPerVehicleSize_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(CostPerVehicleSize.class);
                    this.costPerVehicleSize_adapter = adapter2;
                }
                adapter2.write(jsonWriter, paymentMethods.etc2());
            }
            jsonWriter.name("cash");
            if (paymentMethods.cash() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<CostPerVehicleSize> adapter3 = this.costPerVehicleSize_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(CostPerVehicleSize.class);
                    this.costPerVehicleSize_adapter = adapter3;
                }
                adapter3.write(jsonWriter, paymentMethods.cash());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public PaymentMethods read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            CostPerVehicleSize costPerVehicleSize = null;
            CostPerVehicleSize costPerVehicleSize2 = null;
            CostPerVehicleSize costPerVehicleSize3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("etc".equals(strNextName)) {
                        TypeAdapter<CostPerVehicleSize> adapter = this.costPerVehicleSize_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(CostPerVehicleSize.class);
                            this.costPerVehicleSize_adapter = adapter;
                        }
                        costPerVehicleSize = adapter.read2(jsonReader);
                    } else if ("etc2".equals(strNextName)) {
                        TypeAdapter<CostPerVehicleSize> adapter2 = this.costPerVehicleSize_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(CostPerVehicleSize.class);
                            this.costPerVehicleSize_adapter = adapter2;
                        }
                        costPerVehicleSize2 = adapter2.read2(jsonReader);
                    } else if ("cash".equals(strNextName)) {
                        TypeAdapter<CostPerVehicleSize> adapter3 = this.costPerVehicleSize_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(CostPerVehicleSize.class);
                            this.costPerVehicleSize_adapter = adapter3;
                        }
                        costPerVehicleSize3 = adapter3.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_PaymentMethods(linkedHashMap, costPerVehicleSize, costPerVehicleSize2, costPerVehicleSize3);
        }
    }

    public AutoValue_PaymentMethods(final Map<String, SerializableJsonElement> map, final CostPerVehicleSize costPerVehicleSize, final CostPerVehicleSize costPerVehicleSize2, final CostPerVehicleSize costPerVehicleSize3) {
        new PaymentMethods(map, costPerVehicleSize, costPerVehicleSize2, costPerVehicleSize3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_PaymentMethods
            private final CostPerVehicleSize cash;
            private final CostPerVehicleSize etc;
            private final CostPerVehicleSize etc2;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.PaymentMethods
            public CostPerVehicleSize cash() {
                return this.cash;
            }

            @Override // com.mapbox.api.directions.v5.models.PaymentMethods
            public CostPerVehicleSize etc() {
                return this.etc;
            }

            @Override // com.mapbox.api.directions.v5.models.PaymentMethods
            public CostPerVehicleSize etc2() {
                return this.etc2;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.etc = costPerVehicleSize;
                this.etc2 = costPerVehicleSize2;
                this.cash = costPerVehicleSize3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PaymentMethods)) {
                    return false;
                }
                PaymentMethods paymentMethods = (PaymentMethods) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (paymentMethods.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(paymentMethods.unrecognized())) {
                    return false;
                }
                CostPerVehicleSize costPerVehicleSize4 = this.etc;
                if (costPerVehicleSize4 == null) {
                    if (paymentMethods.etc() != null) {
                        return false;
                    }
                } else if (!costPerVehicleSize4.equals(paymentMethods.etc())) {
                    return false;
                }
                CostPerVehicleSize costPerVehicleSize5 = this.etc2;
                if (costPerVehicleSize5 == null) {
                    if (paymentMethods.etc2() != null) {
                        return false;
                    }
                } else if (!costPerVehicleSize5.equals(paymentMethods.etc2())) {
                    return false;
                }
                CostPerVehicleSize costPerVehicleSize6 = this.cash;
                if (costPerVehicleSize6 == null) {
                    if (paymentMethods.cash() != null) {
                        return false;
                    }
                } else if (!costPerVehicleSize6.equals(paymentMethods.cash())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "PaymentMethods{unrecognized=" + this.unrecognized + ", etc=" + this.etc + ", etc2=" + this.etc2 + ", cash=" + this.cash + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                CostPerVehicleSize costPerVehicleSize4 = this.etc;
                int iHashCode2 = costPerVehicleSize4 == null ? 0 : costPerVehicleSize4.hashCode();
                CostPerVehicleSize costPerVehicleSize5 = this.etc2;
                int iHashCode3 = costPerVehicleSize5 == null ? 0 : costPerVehicleSize5.hashCode();
                CostPerVehicleSize costPerVehicleSize6 = this.cash;
                return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (costPerVehicleSize6 != null ? costPerVehicleSize6.hashCode() : 0);
            }
        };
    }
}
