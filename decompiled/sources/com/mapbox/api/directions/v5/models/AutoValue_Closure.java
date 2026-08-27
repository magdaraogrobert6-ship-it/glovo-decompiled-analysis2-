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
import java.util.LinkedHashMap;
import java.util.Map;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Closure extends C$AutoValue_Closure {

    public static final class GsonTypeAdapter extends TypeAdapter<Closure> {
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;

        public String toString() {
            return "TypeAdapter(Closure)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Closure closure) throws IOException {
            if (closure == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (closure.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : closure.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("geometry_index_start");
            if (closure.geometryIndexStart() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter = this.integer_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter;
                }
                adapter.write(jsonWriter, closure.geometryIndexStart());
            }
            jsonWriter.name("geometry_index_end");
            if (closure.geometryIndexEnd() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter2 = this.integer_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter2;
                }
                adapter2.write(jsonWriter, closure.geometryIndexEnd());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Closure read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Integer num = null;
            Integer num2 = null;
            LinkedHashMap linkedHashMap = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("geometry_index_start")) {
                        TypeAdapter<Integer> adapter = this.integer_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter;
                        }
                        num = adapter.read2(jsonReader);
                    } else if (strNextName.equals("geometry_index_end")) {
                        TypeAdapter<Integer> adapter2 = this.integer_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter2;
                        }
                        num2 = adapter2.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = num == null ? " geometryIndexStart" : "";
            if (num2 == null) {
                strConcat = strConcat.concat(" geometryIndexEnd");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_Closure(linkedHashMap, num, num2);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_Closure(final Map<String, SerializableJsonElement> map, final Integer num, final Integer num2) {
        new Closure(map, num, num2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Closure
            private final Integer geometryIndexEnd;
            private final Integer geometryIndexStart;
            private final Map<String, SerializableJsonElement> unrecognized;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_Closure$Builder */
            public static class Builder extends Closure.Builder {
                private Integer geometryIndexEnd;
                private Integer geometryIndexStart;
                private Map<String, SerializableJsonElement> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.Closure.Builder
                public Closure.Builder geometryIndexEnd(Integer num) {
                    if (num != null) {
                        this.geometryIndexEnd = num;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometryIndexEnd");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.Closure.Builder
                public Closure.Builder geometryIndexStart(Integer num) {
                    if (num != null) {
                        this.geometryIndexStart = num;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometryIndexStart");
                    return null;
                }

                private Builder(Closure closure) {
                    this.unrecognized = closure.unrecognized();
                    this.geometryIndexStart = closure.geometryIndexStart();
                    this.geometryIndexEnd = closure.geometryIndexEnd();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public Closure.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.Closure.Builder
                public Closure build() {
                    String strConcat = this.geometryIndexStart == null ? " geometryIndexStart" : "";
                    if (this.geometryIndexEnd == null) {
                        strConcat = strConcat.concat(" geometryIndexEnd");
                    }
                    if (strConcat.isEmpty()) {
                        return new AutoValue_Closure(this.unrecognized, this.geometryIndexStart, this.geometryIndexEnd);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    return null;
                }
            }

            @Override // com.mapbox.api.directions.v5.models.Closure
            @SerializedName("geometry_index_end")
            public Integer geometryIndexEnd() {
                return this.geometryIndexEnd;
            }

            @Override // com.mapbox.api.directions.v5.models.Closure
            @SerializedName("geometry_index_start")
            public Integer geometryIndexStart() {
                return this.geometryIndexStart;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (num == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometryIndexStart");
                    throw null;
                }
                this.geometryIndexStart = num;
                if (num2 != null) {
                    this.geometryIndexEnd = num2;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometryIndexEnd");
                    throw null;
                }
            }

            @Override // com.mapbox.api.directions.v5.models.Closure
            public Closure.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Closure)) {
                    return false;
                }
                Closure closure = (Closure) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (closure.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(closure.unrecognized())) {
                    return false;
                }
                return this.geometryIndexStart.equals(closure.geometryIndexStart()) && this.geometryIndexEnd.equals(closure.geometryIndexEnd());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Closure{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", geometryIndexStart=");
                sb.append(this.geometryIndexStart);
                sb.append(", geometryIndexEnd=");
                return IconCompatParcelizer.write(this.geometryIndexEnd, "}", sb);
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                return (((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.geometryIndexStart.hashCode()) * 1000003) ^ this.geometryIndexEnd.hashCode();
            }
        };
    }
}
