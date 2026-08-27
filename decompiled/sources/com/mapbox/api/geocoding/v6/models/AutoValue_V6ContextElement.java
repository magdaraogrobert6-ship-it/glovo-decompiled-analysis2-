package com.mapbox.api.geocoding.v6.models;

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
import o.ScrollAxisRange;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_V6ContextElement extends ScrollAxisRange {
    public final String mapboxId;
    public final String name;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6ContextElement> {
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6ContextElement)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6ContextElement read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            LinkedHashMap linkedHashMap2 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (strNextName.equals("name")) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str2 = (String) adapter.read2(jsonReader);
                    } else if (strNextName.equals("mapbox_id")) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = (String) adapter2.read2(jsonReader);
                    } else {
                        if (linkedHashMap2 == null) {
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap2 = linkedHashMap;
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap2, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6ContextElement(linkedHashMap, str, str2);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6ContextElement autoValue_V6ContextElement) throws IOException {
            AutoValue_V6ContextElement autoValue_V6ContextElement2 = autoValue_V6ContextElement;
            if (autoValue_V6ContextElement2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_V6ContextElement2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("mapbox_id");
            if (autoValue_V6ContextElement2.mapboxId == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6ContextElement2.mapboxId);
            }
            jsonWriter.name("name");
            if (autoValue_V6ContextElement2.name == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6ContextElement2.name);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        String str = this.mapboxId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_V6ContextElement(LinkedHashMap linkedHashMap, String str, String str2) {
        this.unrecognized = linkedHashMap;
        this.mapboxId = str;
        this.name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6ContextElement)) {
            return false;
        }
        AutoValue_V6ContextElement autoValue_V6ContextElement = (AutoValue_V6ContextElement) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_V6ContextElement.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_V6ContextElement.unrecognized)) {
            return false;
        }
        String str = this.mapboxId;
        if (str == null) {
            if (autoValue_V6ContextElement.mapboxId != null) {
                return false;
            }
        } else if (!str.equals(autoValue_V6ContextElement.mapboxId)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null) {
            if (autoValue_V6ContextElement.name != null) {
                return false;
            }
        } else if (!str2.equals(autoValue_V6ContextElement.name)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6ContextElement{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", mapboxId=");
        sb.append(this.mapboxId);
        sb.append(", name=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.name, "}");
    }
}
