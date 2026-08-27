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
final class AutoValue_NotificationDetails extends C$AutoValue_NotificationDetails {

    public static final class GsonTypeAdapter extends TypeAdapter<NotificationDetails> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(NotificationDetails)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, NotificationDetails notificationDetails) throws IOException {
            if (notificationDetails == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (notificationDetails.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : notificationDetails.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("requested_value");
            if (notificationDetails.requestedValue() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, notificationDetails.requestedValue());
            }
            jsonWriter.name("actual_value");
            if (notificationDetails.actualValue() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, notificationDetails.actualValue());
            }
            jsonWriter.name("unit");
            if (notificationDetails.unit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, notificationDetails.unit());
            }
            jsonWriter.name("message");
            if (notificationDetails.message() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, notificationDetails.message());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public NotificationDetails read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("requested_value")) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if (strNextName.equals("actual_value")) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str2 = adapter2.read2(jsonReader);
                    } else if ("unit".equals(strNextName)) {
                        TypeAdapter<String> adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str3 = adapter3.read2(jsonReader);
                    } else if ("message".equals(strNextName)) {
                        TypeAdapter<String> adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str4 = adapter4.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_NotificationDetails(linkedHashMap, str, str2, str3, str4);
        }
    }

    public AutoValue_NotificationDetails(final Map<String, SerializableJsonElement> map, final String str, final String str2, final String str3, final String str4) {
        new NotificationDetails(map, str, str2, str3, str4) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_NotificationDetails
            private final String actualValue;
            private final String message;
            private final String requestedValue;
            private final String unit;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            @SerializedName("actual_value")
            public String actualValue() {
                return this.actualValue;
            }

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            public String message() {
                return this.message;
            }

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            @SerializedName("requested_value")
            public String requestedValue() {
                return this.requestedValue;
            }

            @Override // com.mapbox.api.directions.v5.models.NotificationDetails
            public String unit() {
                return this.unit;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.requestedValue = str;
                this.actualValue = str2;
                this.unit = str3;
                this.message = str4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NotificationDetails)) {
                    return false;
                }
                NotificationDetails notificationDetails = (NotificationDetails) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (notificationDetails.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(notificationDetails.unrecognized())) {
                    return false;
                }
                String str5 = this.requestedValue;
                if (str5 == null) {
                    if (notificationDetails.requestedValue() != null) {
                        return false;
                    }
                } else if (!str5.equals(notificationDetails.requestedValue())) {
                    return false;
                }
                String str6 = this.actualValue;
                if (str6 == null) {
                    if (notificationDetails.actualValue() != null) {
                        return false;
                    }
                } else if (!str6.equals(notificationDetails.actualValue())) {
                    return false;
                }
                String str7 = this.unit;
                if (str7 == null) {
                    if (notificationDetails.unit() != null) {
                        return false;
                    }
                } else if (!str7.equals(notificationDetails.unit())) {
                    return false;
                }
                String str8 = this.message;
                if (str8 == null) {
                    if (notificationDetails.message() != null) {
                        return false;
                    }
                } else if (!str8.equals(notificationDetails.message())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("NotificationDetails{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", requestedValue=");
                sb.append(this.requestedValue);
                sb.append(", actualValue=");
                sb.append(this.actualValue);
                sb.append(", unit=");
                sb.append(this.unit);
                sb.append(", message=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.message, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                String str5 = this.requestedValue;
                int iHashCode2 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.actualValue;
                int iHashCode3 = str6 == null ? 0 : str6.hashCode();
                String str7 = this.unit;
                int iHashCode4 = str7 == null ? 0 : str7.hashCode();
                String str8 = this.message;
                return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (str8 != null ? str8.hashCode() : 0);
            }
        };
    }
}
