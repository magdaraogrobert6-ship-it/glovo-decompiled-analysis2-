package com.mapbox.api.directions.v5.models;

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
final class AutoValue_ShieldSprite extends C$AutoValue_ShieldSprite {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSprite> {
        private final Gson gson;
        private volatile TypeAdapter<ShieldSpriteAttribute> shieldSpriteAttribute_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(ShieldSprite)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ShieldSprite shieldSprite) throws IOException {
            if (shieldSprite == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSprite.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : shieldSprite.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("spriteName");
            if (shieldSprite.spriteName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, shieldSprite.spriteName());
            }
            jsonWriter.name("spriteAttributes");
            if (shieldSprite.spriteAttributes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<ShieldSpriteAttribute> adapter2 = this.shieldSpriteAttribute_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(ShieldSpriteAttribute.class);
                    this.shieldSpriteAttribute_adapter = adapter2;
                }
                adapter2.write(jsonWriter, shieldSprite.spriteAttributes());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public ShieldSprite read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            ShieldSpriteAttribute shieldSpriteAttribute = null;
            LinkedHashMap linkedHashMap = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("spriteName".equals(strNextName)) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str = adapter.read2(jsonReader);
                    } else if ("spriteAttributes".equals(strNextName)) {
                        TypeAdapter<ShieldSpriteAttribute> adapter2 = this.shieldSpriteAttribute_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(ShieldSpriteAttribute.class);
                            this.shieldSpriteAttribute_adapter = adapter2;
                        }
                        shieldSpriteAttribute = adapter2.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = str == null ? " spriteName" : "";
            if (shieldSpriteAttribute == null) {
                strConcat = strConcat.concat(" spriteAttributes");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_ShieldSprite(linkedHashMap, str, shieldSpriteAttribute);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_ShieldSprite(final Map<String, SerializableJsonElement> map, final String str, final ShieldSpriteAttribute shieldSpriteAttribute) {
        new ShieldSprite(map, str, shieldSpriteAttribute) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSprite
            private final ShieldSpriteAttribute spriteAttributes;
            private final String spriteName;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.ShieldSprite
            public ShieldSpriteAttribute spriteAttributes() {
                return this.spriteAttributes;
            }

            @Override // com.mapbox.api.directions.v5.models.ShieldSprite
            public String spriteName() {
                return this.spriteName;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null spriteName");
                    throw null;
                }
                this.spriteName = str;
                if (shieldSpriteAttribute != null) {
                    this.spriteAttributes = shieldSpriteAttribute;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null spriteAttributes");
                    throw null;
                }
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ShieldSprite)) {
                    return false;
                }
                ShieldSprite shieldSprite = (ShieldSprite) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (shieldSprite.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(shieldSprite.unrecognized())) {
                    return false;
                }
                return this.spriteName.equals(shieldSprite.spriteName()) && this.spriteAttributes.equals(shieldSprite.spriteAttributes());
            }

            public String toString() {
                return "ShieldSprite{unrecognized=" + this.unrecognized + ", spriteName=" + this.spriteName + ", spriteAttributes=" + this.spriteAttributes + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                return (((((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.spriteName.hashCode()) * 1000003) ^ this.spriteAttributes.hashCode();
            }
        };
    }
}
