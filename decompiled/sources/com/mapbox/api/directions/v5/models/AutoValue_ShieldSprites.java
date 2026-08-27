package com.mapbox.api.directions.v5.models;

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
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ShieldSprites extends C$AutoValue_ShieldSprites {

    public static final class GsonTypeAdapter extends TypeAdapter<ShieldSprites> {
        private final Gson gson;
        private volatile TypeAdapter<List<ShieldSprite>> list__shieldSprite_adapter;

        public String toString() {
            return "TypeAdapter(ShieldSprites)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, ShieldSprites shieldSprites) throws IOException {
            if (shieldSprites == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (shieldSprites.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : shieldSprites.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("sprites");
            if (shieldSprites.sprites() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<ShieldSprite>> adapter = this.list__shieldSprite_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, ShieldSprite.class));
                    this.list__shieldSprite_adapter = adapter;
                }
                adapter.write(jsonWriter, shieldSprites.sprites());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public ShieldSprites read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            List<ShieldSprite> list = null;
            LinkedHashMap linkedHashMap = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if ("sprites".equals(strNextName)) {
                        TypeAdapter<List<ShieldSprite>> adapter = this.list__shieldSprite_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(TypeToken.getParameterized(List.class, ShieldSprite.class));
                            this.list__shieldSprite_adapter = adapter;
                        }
                        list = adapter.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str = list == null ? " sprites" : "";
            if (str.isEmpty()) {
                return new AutoValue_ShieldSprites(linkedHashMap, list);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str));
            return null;
        }
    }

    public AutoValue_ShieldSprites(final Map<String, SerializableJsonElement> map, final List<ShieldSprite> list) {
        new ShieldSprites(map, list) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_ShieldSprites
            private final List<ShieldSprite> sprites;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.ShieldSprites
            public List<ShieldSprite> sprites() {
                return this.sprites;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (list != null) {
                    this.sprites = list;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sprites");
                    throw null;
                }
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ShieldSprites)) {
                    return false;
                }
                ShieldSprites shieldSprites = (ShieldSprites) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (shieldSprites.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(shieldSprites.unrecognized())) {
                    return false;
                }
                return this.sprites.equals(shieldSprites.sprites());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ShieldSprites{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", sprites=");
                return MediaSessionCompatQueueItem.read(sb, this.sprites, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                return (((map2 == null ? 0 : map2.hashCode()) ^ 1000003) * 1000003) ^ this.sprites.hashCode();
            }
        };
    }
}
