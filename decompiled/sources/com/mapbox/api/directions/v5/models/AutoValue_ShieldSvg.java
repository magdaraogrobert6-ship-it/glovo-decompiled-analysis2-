package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
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
final class AutoValue_ShieldSvg extends C$AutoValue_ShieldSvg {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSvg> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(ShieldSvg)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ShieldSvg shieldSvg) throws IOException {
            if (shieldSvg == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSvg.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : shieldSvg.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("svg");
            if (shieldSvg.svg() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, shieldSvg.svg());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public ShieldSvg read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            LinkedHashMap linkedHashMap = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("svg".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str2 = str == null ? " svg" : "";
            if (str2.isEmpty()) {
                return new AutoValue_ShieldSvg(linkedHashMap, str);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str2));
            return null;
        }
    }

    public AutoValue_ShieldSvg(final Map<String, SerializableJsonElement> map, final String str) {
        new ShieldSvg(map, str) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSvg
            private final String svg;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.ShieldSvg
            public String svg() {
                return this.svg;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (str != null) {
                    this.svg = str;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null svg");
                    throw null;
                }
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ShieldSvg)) {
                    return false;
                }
                ShieldSvg shieldSvg = (ShieldSvg) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (shieldSvg.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(shieldSvg.unrecognized())) {
                    return false;
                }
                return this.svg.equals(shieldSvg.svg());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ShieldSvg{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", svg=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.svg, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                return (((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.svg.hashCode();
            }
        };
    }
}
