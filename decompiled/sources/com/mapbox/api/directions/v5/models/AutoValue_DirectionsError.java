package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
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
final class AutoValue_DirectionsError extends C$AutoValue_DirectionsError {

    public static final class GsonTypeAdapter extends TypeAdapter<DirectionsError> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(DirectionsError)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, DirectionsError directionsError) throws IOException {
            if (directionsError == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (directionsError.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : directionsError.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("code");
            if (directionsError.code() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, directionsError.code());
            }
            jsonWriter.name("message");
            if (directionsError.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, directionsError.message());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public DirectionsError read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("code".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if ("message".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = adapter2.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_DirectionsError(linkedHashMap, str, str2);
        }
    }

    public AutoValue_DirectionsError(final Map<String, SerializableJsonElement> map, final String str, final String str2) {
        new DirectionsError(map, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_DirectionsError
            private final String code;
            private final String message;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.DirectionsError
            public String code() {
                return this.code;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsError
            public String message() {
                return this.message;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.code = str;
                this.message = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectionsError)) {
                    return false;
                }
                DirectionsError directionsError = (DirectionsError) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (directionsError.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(directionsError.unrecognized())) {
                    return false;
                }
                String str3 = this.code;
                if (str3 == null) {
                    if (directionsError.code() != null) {
                        return false;
                    }
                } else if (!str3.equals(directionsError.code())) {
                    return false;
                }
                String str4 = this.message;
                if (str4 == null) {
                    if (directionsError.message() != null) {
                        return false;
                    }
                } else if (!str4.equals(directionsError.message())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("DirectionsError{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", code=");
                sb.append(this.code);
                sb.append(", message=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.message, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str3 = this.code;
                int iHashCode2 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.message;
                return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }
        };
    }
}
