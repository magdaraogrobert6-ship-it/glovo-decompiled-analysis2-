package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.DirectionsCriteria$AmenityTypeCriteria;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_Amenity extends C$AutoValue_Amenity {

    public static final class GsonTypeAdapter extends TypeAdapter<Amenity> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(Amenity)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Amenity amenity) throws IOException {
            if (amenity == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (amenity.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : amenity.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("type");
            if (amenity.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, amenity.type());
            }
            jsonWriter.name("name");
            if (amenity.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, amenity.name());
            }
            jsonWriter.name("brand");
            if (amenity.brand() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, amenity.brand());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Amenity read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            LinkedHashMap linkedHashMap = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("type".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if ("name".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = adapter2.read2(jsonReader);
                    } else if ("brand".equals(strNextName)) {
                        TypeAdapter<String> adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str3 = adapter3.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str4 = str == null ? " type" : "";
            if (str4.isEmpty()) {
                return new AutoValue_Amenity(linkedHashMap, str, str2, str3);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str4));
            return null;
        }
    }

    public AutoValue_Amenity(final Map<String, SerializableJsonElement> map, final String str, final String str2, final String str3) {
        new Amenity(map, str, str2, str3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Amenity
            private final String brand;
            private final String name;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.Amenity
            public String brand() {
                return this.brand;
            }

            @Override // com.mapbox.api.directions.v5.models.Amenity
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.Amenity
            @DirectionsCriteria$AmenityTypeCriteria
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                    throw null;
                }
                this.type = str;
                this.name = str2;
                this.brand = str3;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Amenity)) {
                    return false;
                }
                Amenity amenity = (Amenity) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (amenity.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(amenity.unrecognized())) {
                    return false;
                }
                if (!this.type.equals(amenity.type())) {
                    return false;
                }
                String str4 = this.name;
                if (str4 == null) {
                    if (amenity.name() != null) {
                        return false;
                    }
                } else if (!str4.equals(amenity.name())) {
                    return false;
                }
                String str5 = this.brand;
                if (str5 == null) {
                    if (amenity.brand() != null) {
                        return false;
                    }
                } else if (!str5.equals(amenity.brand())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Amenity{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", brand=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.brand, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.type.hashCode();
                String str4 = this.name;
                int iHashCode3 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.brand;
                return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (str5 != null ? str5.hashCode() : 0);
            }
        };
    }
}
