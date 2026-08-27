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
final class AutoValue_VoiceInstructions extends C$AutoValue_VoiceInstructions {

    public static final class GsonTypeAdapter extends TypeAdapter<VoiceInstructions> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(VoiceInstructions)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, VoiceInstructions voiceInstructions) throws IOException {
            if (voiceInstructions == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (voiceInstructions.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : voiceInstructions.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("distanceAlongGeometry");
            if (voiceInstructions.distanceAlongGeometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter = this.double__adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter;
                }
                adapter.write(jsonWriter, voiceInstructions.distanceAlongGeometry());
            }
            jsonWriter.name("announcement");
            if (voiceInstructions.announcement() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, voiceInstructions.announcement());
            }
            jsonWriter.name("ssmlAnnouncement");
            if (voiceInstructions.ssmlAnnouncement() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, voiceInstructions.ssmlAnnouncement());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public VoiceInstructions read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Double d = null;
            String str = null;
            String str2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("distanceAlongGeometry".equals(strNextName)) {
                        TypeAdapter<Double> adapter = this.double__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter;
                        }
                        d = adapter.read2(jsonReader);
                    } else if ("announcement".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else if ("ssmlAnnouncement".equals(strNextName)) {
                        TypeAdapter<String> adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str2 = adapter3.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_VoiceInstructions(linkedHashMap, d, str, str2);
        }
    }

    public AutoValue_VoiceInstructions(final Map<String, SerializableJsonElement> map, final Double d, final String str, final String str2) {
        new VoiceInstructions(map, d, str, str2) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_VoiceInstructions
            private final String announcement;
            private final Double distanceAlongGeometry;
            private final String ssmlAnnouncement;
            private final Map<String, SerializableJsonElement> unrecognized;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_VoiceInstructions$Builder */
            /* JADX INFO: loaded from: classes4.dex */
            public static class Builder extends VoiceInstructions.Builder {
                private String announcement;
                private Double distanceAlongGeometry;
                private String ssmlAnnouncement;
                private Map<String, SerializableJsonElement> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions.Builder announcement(String str) {
                    this.announcement = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions.Builder distanceAlongGeometry(Double d) {
                    this.distanceAlongGeometry = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions.Builder ssmlAnnouncement(String str) {
                    this.ssmlAnnouncement = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.VoiceInstructions.Builder
                public VoiceInstructions build() {
                    return new AutoValue_VoiceInstructions(this.unrecognized, this.distanceAlongGeometry, this.announcement, this.ssmlAnnouncement);
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public VoiceInstructions.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            @Override // com.mapbox.api.directions.v5.models.VoiceInstructions
            public String announcement() {
                return this.announcement;
            }

            @Override // com.mapbox.api.directions.v5.models.VoiceInstructions
            public Double distanceAlongGeometry() {
                return this.distanceAlongGeometry;
            }

            @Override // com.mapbox.api.directions.v5.models.VoiceInstructions
            public String ssmlAnnouncement() {
                return this.ssmlAnnouncement;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                this.distanceAlongGeometry = d;
                this.announcement = str;
                this.ssmlAnnouncement = str2;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof VoiceInstructions)) {
                    return false;
                }
                VoiceInstructions voiceInstructions = (VoiceInstructions) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (voiceInstructions.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(voiceInstructions.unrecognized())) {
                    return false;
                }
                Double d2 = this.distanceAlongGeometry;
                if (d2 == null) {
                    if (voiceInstructions.distanceAlongGeometry() != null) {
                        return false;
                    }
                } else if (!d2.equals(voiceInstructions.distanceAlongGeometry())) {
                    return false;
                }
                String str3 = this.announcement;
                if (str3 == null) {
                    if (voiceInstructions.announcement() != null) {
                        return false;
                    }
                } else if (!str3.equals(voiceInstructions.announcement())) {
                    return false;
                }
                String str4 = this.ssmlAnnouncement;
                if (str4 == null) {
                    if (voiceInstructions.ssmlAnnouncement() != null) {
                        return false;
                    }
                } else if (!str4.equals(voiceInstructions.ssmlAnnouncement())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("VoiceInstructions{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", distanceAlongGeometry=");
                sb.append(this.distanceAlongGeometry);
                sb.append(", announcement=");
                sb.append(this.announcement);
                sb.append(", ssmlAnnouncement=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.ssmlAnnouncement, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                Double d2 = this.distanceAlongGeometry;
                int iHashCode2 = d2 == null ? 0 : d2.hashCode();
                String str3 = this.announcement;
                int iHashCode3 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.ssmlAnnouncement;
                return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
            }
        };
    }
}
