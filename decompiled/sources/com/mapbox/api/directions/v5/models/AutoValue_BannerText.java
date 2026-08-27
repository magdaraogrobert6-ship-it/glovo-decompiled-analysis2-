package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_BannerText extends C$AutoValue_BannerText {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerText> {
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<List<BannerComponents>> list__bannerComponents_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(BannerText)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BannerText bannerText) throws IOException {
            if (bannerText == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerText.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : bannerText.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("text");
            if (bannerText.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, bannerText.text());
            }
            jsonWriter.name("components");
            if (bannerText.components() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<BannerComponents>> adapter2 = this.list__bannerComponents_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                    this.list__bannerComponents_adapter = adapter2;
                }
                adapter2.write(jsonWriter, bannerText.components());
            }
            jsonWriter.name("type");
            if (bannerText.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, bannerText.type());
            }
            jsonWriter.name("modifier");
            if (bannerText.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, bannerText.modifier());
            }
            jsonWriter.name("degrees");
            if (bannerText.degrees() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter5 = this.double__adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter5;
                }
                adapter5.write(jsonWriter, bannerText.degrees());
            }
            jsonWriter.name("driving_side");
            if (bannerText.drivingSide() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, bannerText.drivingSide());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public BannerText read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            String str = null;
            List<BannerComponents> list = null;
            String str2 = null;
            String str3 = null;
            Double d = null;
            String str4 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("driving_side")) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str4 = adapter.read2(jsonReader);
                    } else if ("text".equals(strNextName)) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else if ("components".equals(strNextName)) {
                        TypeAdapter<List<BannerComponents>> adapter3 = this.list__bannerComponents_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                            this.list__bannerComponents_adapter = adapter3;
                        }
                        list = adapter3.read2(jsonReader);
                    } else if ("type".equals(strNextName)) {
                        TypeAdapter<String> adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str2 = adapter4.read2(jsonReader);
                    } else if ("modifier".equals(strNextName)) {
                        TypeAdapter<String> adapter5 = this.string_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter5;
                        }
                        str3 = adapter5.read2(jsonReader);
                    } else if ("degrees".equals(strNextName)) {
                        TypeAdapter<Double> adapter6 = this.double__adapter;
                        if (adapter6 == null) {
                            adapter6 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter6;
                        }
                        d = adapter6.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str5 = str == null ? " text" : "";
            if (str5.isEmpty()) {
                return new AutoValue_BannerText(linkedHashMap, str, list, str2, str3, d, str4);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str5));
            return null;
        }
    }

    public AutoValue_BannerText(final Map<String, SerializableJsonElement> map, final String str, final List<BannerComponents> list, final String str2, final String str3, final Double d, final String str4) {
        new BannerText(map, str, list, str2, str3, d, str4) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerText
            private final List<BannerComponents> components;
            private final Double degrees;
            private final String drivingSide;
            private final String modifier;
            private final String text;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.BannerText
            public List<BannerComponents> components() {
                return this.components;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            public Double degrees() {
                return this.degrees;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            @SerializedName("driving_side")
            public String drivingSide() {
                return this.drivingSide;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            @ManeuverModifier$Type
            public String modifier() {
                return this.modifier;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            public String text() {
                return this.text;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerText
            @StepManeuver.StepManeuverType
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
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null text");
                    throw null;
                }
                this.text = str;
                this.components = list;
                this.type = str2;
                this.modifier = str3;
                this.degrees = d;
                this.drivingSide = str4;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BannerText)) {
                    return false;
                }
                BannerText bannerText = (BannerText) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (bannerText.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(bannerText.unrecognized())) {
                    return false;
                }
                if (!this.text.equals(bannerText.text())) {
                    return false;
                }
                List<BannerComponents> list2 = this.components;
                if (list2 == null) {
                    if (bannerText.components() != null) {
                        return false;
                    }
                } else if (!list2.equals(bannerText.components())) {
                    return false;
                }
                String str5 = this.type;
                if (str5 == null) {
                    if (bannerText.type() != null) {
                        return false;
                    }
                } else if (!str5.equals(bannerText.type())) {
                    return false;
                }
                String str6 = this.modifier;
                if (str6 == null) {
                    if (bannerText.modifier() != null) {
                        return false;
                    }
                } else if (!str6.equals(bannerText.modifier())) {
                    return false;
                }
                Double d2 = this.degrees;
                if (d2 == null) {
                    if (bannerText.degrees() != null) {
                        return false;
                    }
                } else if (!d2.equals(bannerText.degrees())) {
                    return false;
                }
                String str7 = this.drivingSide;
                if (str7 == null) {
                    if (bannerText.drivingSide() != null) {
                        return false;
                    }
                } else if (!str7.equals(bannerText.drivingSide())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("BannerText{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", components=");
                sb.append(this.components);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", modifier=");
                sb.append(this.modifier);
                sb.append(", degrees=");
                sb.append(this.degrees);
                sb.append(", drivingSide=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.drivingSide, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.text.hashCode();
                List<BannerComponents> list2 = this.components;
                int iHashCode3 = list2 == null ? 0 : list2.hashCode();
                String str5 = this.type;
                int iHashCode4 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.modifier;
                int iHashCode5 = str6 == null ? 0 : str6.hashCode();
                Double d2 = this.degrees;
                int iHashCode6 = d2 == null ? 0 : d2.hashCode();
                String str7 = this.drivingSide;
                return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (str7 != null ? str7.hashCode() : 0);
            }
        };
    }
}
