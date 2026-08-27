package com.mapbox.api.directions.v5.models;

import bo.app.c8$$ExternalSyntheticOutline0;
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
final class AutoValue_ShieldSpriteAttribute extends C$AutoValue_ShieldSpriteAttribute {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSpriteAttribute> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<List<Double>> list__double_adapter;

        public String toString() {
            return "TypeAdapter(ShieldSpriteAttribute)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ShieldSpriteAttribute shieldSpriteAttribute) throws IOException {
            if (shieldSpriteAttribute == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSpriteAttribute.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : shieldSpriteAttribute.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("width");
            if (shieldSpriteAttribute.width() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter = this.integer_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter;
                }
                adapter.write(jsonWriter, shieldSpriteAttribute.width());
            }
            jsonWriter.name("height");
            if (shieldSpriteAttribute.height() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter2 = this.integer_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter2;
                }
                adapter2.write(jsonWriter, shieldSpriteAttribute.height());
            }
            jsonWriter.name("x");
            if (shieldSpriteAttribute.x() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter3 = this.integer_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter3;
                }
                adapter3.write(jsonWriter, shieldSpriteAttribute.x());
            }
            jsonWriter.name("y");
            if (shieldSpriteAttribute.y() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter4 = this.integer_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter4;
                }
                adapter4.write(jsonWriter, shieldSpriteAttribute.y());
            }
            jsonWriter.name("pixelRatio");
            if (shieldSpriteAttribute.pixelRatio() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter5 = this.integer_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter5;
                }
                adapter5.write(jsonWriter, shieldSpriteAttribute.pixelRatio());
            }
            jsonWriter.name("placeholder");
            if (shieldSpriteAttribute.placeholder() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Double>> adapter6 = this.list__double_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = adapter6;
                }
                adapter6.write(jsonWriter, shieldSpriteAttribute.placeholder());
            }
            jsonWriter.name("visible");
            if (shieldSpriteAttribute.visible() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter7 = this.boolean__adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter7;
                }
                adapter7.write(jsonWriter, shieldSpriteAttribute.visible());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public ShieldSpriteAttribute read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            List<Double> list = null;
            Boolean bool = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("width".equals(strNextName)) {
                        TypeAdapter<Integer> adapter = this.integer_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter;
                        }
                        num = adapter.read2(jsonReader);
                    } else if ("height".equals(strNextName)) {
                        TypeAdapter<Integer> adapter2 = this.integer_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter2;
                        }
                        num2 = adapter2.read2(jsonReader);
                    } else if ("x".equals(strNextName)) {
                        TypeAdapter<Integer> adapter3 = this.integer_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter3;
                        }
                        num3 = adapter3.read2(jsonReader);
                    } else if ("y".equals(strNextName)) {
                        TypeAdapter<Integer> adapter4 = this.integer_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter4;
                        }
                        num4 = adapter4.read2(jsonReader);
                    } else if ("pixelRatio".equals(strNextName)) {
                        TypeAdapter<Integer> adapter5 = this.integer_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter5;
                        }
                        num5 = adapter5.read2(jsonReader);
                    } else if ("placeholder".equals(strNextName)) {
                        TypeAdapter<List<Double>> adapter6 = this.list__double_adapter;
                        if (adapter6 == null) {
                            adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                            this.list__double_adapter = adapter6;
                        }
                        list = adapter6.read2(jsonReader);
                    } else if ("visible".equals(strNextName)) {
                        TypeAdapter<Boolean> adapter7 = this.boolean__adapter;
                        if (adapter7 == null) {
                            adapter7 = this.gson.getAdapter(Boolean.class);
                            this.boolean__adapter = adapter7;
                        }
                        bool = adapter7.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = num == null ? " width" : "";
            if (num2 == null) {
                strConcat = strConcat.concat(" height");
            }
            if (num3 == null) {
                strConcat = strConcat.concat(" x");
            }
            if (num4 == null) {
                strConcat = strConcat.concat(" y");
            }
            if (num5 == null) {
                strConcat = strConcat.concat(" pixelRatio");
            }
            if (bool == null) {
                strConcat = strConcat.concat(" visible");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_ShieldSpriteAttribute(linkedHashMap, num, num2, num3, num4, num5, list, bool);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_ShieldSpriteAttribute(final Map<String, SerializableJsonElement> map, final Integer num, final Integer num2, final Integer num3, final Integer num4, final Integer num5, final List<Double> list, final Boolean bool) {
        new ShieldSpriteAttribute(map, num, num2, num3, num4, num5, list, bool) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSpriteAttribute
            private final Integer height;
            private final Integer pixelRatio;
            private final List<Double> placeholder;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final Boolean visible;
            private final Integer width;
            private final Integer x;
            private final Integer y;

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer height() {
                return this.height;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer pixelRatio() {
                return this.pixelRatio;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public List<Double> placeholder() {
                return this.placeholder;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Boolean visible() {
                return this.visible;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer width() {
                return this.width;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer x() {
                return this.x;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSpriteAttribute
            public Integer y() {
                return this.y;
            }

            {
                this.unrecognized = map;
                if (num == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null width");
                    throw null;
                }
                this.width = num;
                if (num2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null height");
                    throw null;
                }
                this.height = num2;
                if (num3 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null x");
                    throw null;
                }
                this.x = num3;
                if (num4 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null y");
                    throw null;
                }
                this.y = num4;
                if (num5 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null pixelRatio");
                    throw null;
                }
                this.pixelRatio = num5;
                this.placeholder = list;
                if (bool != null) {
                    this.visible = bool;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null visible");
                    throw null;
                }
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ShieldSpriteAttribute)) {
                    return false;
                }
                ShieldSpriteAttribute shieldSpriteAttribute = (ShieldSpriteAttribute) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (shieldSpriteAttribute.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(shieldSpriteAttribute.unrecognized())) {
                    return false;
                }
                if (!this.width.equals(shieldSpriteAttribute.width()) || !this.height.equals(shieldSpriteAttribute.height()) || !this.x.equals(shieldSpriteAttribute.x()) || !this.y.equals(shieldSpriteAttribute.y()) || !this.pixelRatio.equals(shieldSpriteAttribute.pixelRatio())) {
                    return false;
                }
                List<Double> list2 = this.placeholder;
                if (list2 == null) {
                    if (shieldSpriteAttribute.placeholder() != null) {
                        return false;
                    }
                } else if (!list2.equals(shieldSpriteAttribute.placeholder())) {
                    return false;
                }
                return this.visible.equals(shieldSpriteAttribute.visible());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ShieldSpriteAttribute{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", width=");
                sb.append(this.width);
                sb.append(", height=");
                sb.append(this.height);
                sb.append(", x=");
                sb.append(this.x);
                sb.append(", y=");
                sb.append(this.y);
                sb.append(", pixelRatio=");
                sb.append(this.pixelRatio);
                sb.append(", placeholder=");
                sb.append(this.placeholder);
                sb.append(", visible=");
                return c8$$ExternalSyntheticOutline0.m(sb, "}", this.visible);
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.width.hashCode();
                int iHashCode3 = this.height.hashCode();
                int iHashCode4 = this.x.hashCode();
                int iHashCode5 = this.y.hashCode();
                int iHashCode6 = this.pixelRatio.hashCode();
                List<Double> list2 = this.placeholder;
                return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.visible.hashCode();
            }
        };
    }
}
