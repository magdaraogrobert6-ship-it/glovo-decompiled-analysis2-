package com.mapbox.api.directions.v5.models;

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
final class AutoValue_TollCost extends C$AutoValue_TollCost {

    public static final class GsonTypeAdapter extends TypeAdapter<TollCost> {
        private final Gson gson;
        private volatile TypeAdapter<PaymentMethods> paymentMethods_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(TollCost)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, TollCost tollCost) throws IOException {
            if (tollCost == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (tollCost.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : tollCost.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("currency");
            if (tollCost.currency() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, tollCost.currency());
            }
            jsonWriter.name("payment_methods");
            if (tollCost.paymentMethods() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<PaymentMethods> adapter2 = this.paymentMethods_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(PaymentMethods.class);
                    this.paymentMethods_adapter = adapter2;
                }
                adapter2.write(jsonWriter, tollCost.paymentMethods());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public TollCost read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            PaymentMethods paymentMethods = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("payment_methods")) {
                        TypeAdapter<PaymentMethods> adapter = this.paymentMethods_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(PaymentMethods.class);
                            this.paymentMethods_adapter = adapter;
                        }
                        paymentMethods = adapter.read2(jsonReader);
                    } else if ("currency".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_TollCost(linkedHashMap, str, paymentMethods);
        }
    }

    public AutoValue_TollCost(final Map<String, SerializableJsonElement> map, final String str, final PaymentMethods paymentMethods) {
        new TollCost(map, str, paymentMethods) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_TollCost
            private final String currency;
            private final PaymentMethods paymentMethods;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.TollCost
            public String currency() {
                return this.currency;
            }

            @Override // com.mapbox.api.directions.v5.models.TollCost
            @SerializedName("payment_methods")
            public PaymentMethods paymentMethods() {
                return this.paymentMethods;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.currency = str;
                this.paymentMethods = paymentMethods;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TollCost)) {
                    return false;
                }
                TollCost tollCost = (TollCost) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (tollCost.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(tollCost.unrecognized())) {
                    return false;
                }
                String str2 = this.currency;
                if (str2 == null) {
                    if (tollCost.currency() != null) {
                        return false;
                    }
                } else if (!str2.equals(tollCost.currency())) {
                    return false;
                }
                PaymentMethods paymentMethods2 = this.paymentMethods;
                if (paymentMethods2 == null) {
                    if (tollCost.paymentMethods() != null) {
                        return false;
                    }
                } else if (!paymentMethods2.equals(tollCost.paymentMethods())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "TollCost{unrecognized=" + this.unrecognized + ", currency=" + this.currency + ", paymentMethods=" + this.paymentMethods + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str2 = this.currency;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                PaymentMethods paymentMethods2 = this.paymentMethods;
                return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (paymentMethods2 != null ? paymentMethods2.hashCode() : 0);
            }
        };
    }
}
