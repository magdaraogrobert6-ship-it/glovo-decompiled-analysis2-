package com.mapbox.api.directions.v5.models;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
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
final class AutoValue_Congestion extends C$AutoValue_Congestion {

    public static final class GsonTypeAdapter extends TypeAdapter<Congestion> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> int__adapter;

        public String toString() {
            return "TypeAdapter(Congestion)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Congestion congestion) throws IOException {
            if (congestion == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (congestion.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : congestion.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("value");
            TypeAdapter<Integer> adapter = this.int__adapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(Integer.class);
                this.int__adapter = adapter;
            }
            adapter.write(jsonWriter, Integer.valueOf(congestion.value()));
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Congestion read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = true;
            int iIntValue = 0;
            LinkedHashMap linkedHashMap = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("value".equals(strNextName)) {
                        TypeAdapter<Integer> adapter = this.int__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Integer.class);
                            this.int__adapter = adapter;
                        }
                        iIntValue = adapter.read2(jsonReader).intValue();
                        z = false;
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str = z ? " value" : "";
            if (str.isEmpty()) {
                return new AutoValue_Congestion(linkedHashMap, iIntValue);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str));
            return null;
        }
    }

    public AutoValue_Congestion(final Map<String, SerializableJsonElement> map, final int i) {
        new Congestion(map, i) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Congestion
            private final Map<String, SerializableJsonElement> unrecognized;
            private final int value;

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.Congestion
            public int value() {
                return this.value;
            }

            {
                this.unrecognized = map;
                this.value = i;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Congestion)) {
                    return false;
                }
                Congestion congestion = (Congestion) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (congestion.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(congestion.unrecognized())) {
                    return false;
                }
                return this.value == congestion.value();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Congestion{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", value=");
                return af$$ExternalSyntheticOutline0.m(this.value, "}", sb);
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                return (((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.value;
            }
        };
    }
}
