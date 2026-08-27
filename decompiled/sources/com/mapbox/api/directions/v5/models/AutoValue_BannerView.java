package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
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
final class AutoValue_BannerView extends C$AutoValue_BannerView {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerView> {
        private final Gson gson;
        private volatile TypeAdapter<List<BannerComponents>> list__bannerComponents_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(BannerView)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BannerView bannerView) throws IOException {
            if (bannerView == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerView.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : bannerView.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("text");
            if (bannerView.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, bannerView.text());
            }
            jsonWriter.name("components");
            if (bannerView.components() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<BannerComponents>> adapter2 = this.list__bannerComponents_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                    this.list__bannerComponents_adapter = adapter2;
                }
                adapter2.write(jsonWriter, bannerView.components());
            }
            jsonWriter.name("type");
            if (bannerView.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, bannerView.type());
            }
            jsonWriter.name("modifier");
            if (bannerView.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, bannerView.modifier());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public BannerView read2(JsonReader jsonReader) throws IOException {
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
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("text".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if ("components".equals(strNextName)) {
                        TypeAdapter<List<BannerComponents>> adapter2 = this.list__bannerComponents_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerComponents.class));
                            this.list__bannerComponents_adapter = adapter2;
                        }
                        list = adapter2.read2(jsonReader);
                    } else if ("type".equals(strNextName)) {
                        TypeAdapter<String> adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str2 = adapter3.read2(jsonReader);
                    } else if ("modifier".equals(strNextName)) {
                        TypeAdapter<String> adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str3 = adapter4.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str4 = str == null ? " text" : "";
            if (str4.isEmpty()) {
                return new AutoValue_BannerView(linkedHashMap, str, list, str2, str3);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str4));
            return null;
        }
    }

    public AutoValue_BannerView(final Map<String, SerializableJsonElement> map, final String str, final List<BannerComponents> list, final String str2, final String str3) {
        new BannerView(map, str, list, str2, str3) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerView
            private final List<BannerComponents> components;
            private final String modifier;
            private final String text;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.BannerView
            public List<BannerComponents> components() {
                return this.components;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerView
            @ManeuverModifier$Type
            public String modifier() {
                return this.modifier;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerView
            public String text() {
                return this.text;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerView
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
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BannerView)) {
                    return false;
                }
                BannerView bannerView = (BannerView) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (bannerView.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(bannerView.unrecognized())) {
                    return false;
                }
                if (!this.text.equals(bannerView.text())) {
                    return false;
                }
                List<BannerComponents> list2 = this.components;
                if (list2 == null) {
                    if (bannerView.components() != null) {
                        return false;
                    }
                } else if (!list2.equals(bannerView.components())) {
                    return false;
                }
                String str4 = this.type;
                if (str4 == null) {
                    if (bannerView.type() != null) {
                        return false;
                    }
                } else if (!str4.equals(bannerView.type())) {
                    return false;
                }
                String str5 = this.modifier;
                if (str5 == null) {
                    if (bannerView.modifier() != null) {
                        return false;
                    }
                } else if (!str5.equals(bannerView.modifier())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("BannerView{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", components=");
                sb.append(this.components);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", modifier=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.modifier, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.text.hashCode();
                List<BannerComponents> list2 = this.components;
                int iHashCode3 = list2 == null ? 0 : list2.hashCode();
                String str4 = this.type;
                int iHashCode4 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.modifier;
                return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (str5 != null ? str5.hashCode() : 0);
            }
        };
    }
}
