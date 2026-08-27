package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
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
final class AutoValue_Admin extends C$AutoValue_Admin {

    public static final class GsonTypeAdapter extends TypeAdapter<Admin> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(Admin)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Admin admin) throws IOException {
            if (admin == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (admin.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : admin.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("iso_3166_1");
            if (admin.countryCode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, admin.countryCode());
            }
            jsonWriter.name("iso_3166_1_alpha3");
            if (admin.countryCodeAlpha3() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, admin.countryCodeAlpha3());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Admin read2(JsonReader jsonReader) throws IOException {
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
                    if (strNextName.equals("iso_3166_1")) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if (strNextName.equals("iso_3166_1_alpha3")) {
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
            return new AutoValue_Admin(linkedHashMap, str, str2);
        }
    }

    public AutoValue_Admin(final Map<String, SerializableJsonElement> map, final String str, final String str2) {
        new Admin(map, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_Admin
            private final String countryCode;
            private final String countryCodeAlpha3;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.Admin
            @SerializedName("iso_3166_1")
            public String countryCode() {
                return this.countryCode;
            }

            @Override // com.mapbox.api.directions.v5.models.Admin
            @SerializedName("iso_3166_1_alpha3")
            public String countryCodeAlpha3() {
                return this.countryCodeAlpha3;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.countryCode = str;
                this.countryCodeAlpha3 = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Admin)) {
                    return false;
                }
                Admin admin = (Admin) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (admin.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(admin.unrecognized())) {
                    return false;
                }
                String str3 = this.countryCode;
                if (str3 == null) {
                    if (admin.countryCode() != null) {
                        return false;
                    }
                } else if (!str3.equals(admin.countryCode())) {
                    return false;
                }
                String str4 = this.countryCodeAlpha3;
                if (str4 == null) {
                    if (admin.countryCodeAlpha3() != null) {
                        return false;
                    }
                } else if (!str4.equals(admin.countryCodeAlpha3())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Admin{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", countryCode=");
                sb.append(this.countryCode);
                sb.append(", countryCodeAlpha3=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.countryCodeAlpha3, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str3 = this.countryCode;
                int iHashCode2 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.countryCodeAlpha3;
                return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }
        };
    }
}
