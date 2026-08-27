package com.mapbox.api.directions.v5.models;

import com.braze.models.inappmessage.InAppMessageBase;
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
final class AutoValue_MapboxShield extends C$AutoValue_MapboxShield {

    public static final class GsonTypeAdapter extends TypeAdapter<MapboxShield> {
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(MapboxShield)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, MapboxShield mapboxShield) throws IOException {
            if (mapboxShield == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (mapboxShield.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : mapboxShield.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("base_url");
            if (mapboxShield.baseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, mapboxShield.baseUrl());
            }
            jsonWriter.name("name");
            if (mapboxShield.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, mapboxShield.name());
            }
            jsonWriter.name(InAppMessageBase.MESSAGE_TEXT_COLOR);
            if (mapboxShield.textColor() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, mapboxShield.textColor());
            }
            jsonWriter.name("display_ref");
            if (mapboxShield.displayRef() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, mapboxShield.displayRef());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public MapboxShield read2(JsonReader jsonReader) throws IOException {
            byte b;
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
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -2115337775) {
                        if (iHashCode != -1721160959) {
                            if (iHashCode == 1714671510 && strNextName.equals("display_ref")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("base_url")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals(InAppMessageBase.MESSAGE_TEXT_COLOR)) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter<String> adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str3 = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<String> adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str4 = adapter3.read2(jsonReader);
                    } else if ("name".equals(strNextName)) {
                        TypeAdapter<String> adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str2 = adapter4.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = str == null ? " baseUrl" : "";
            if (str2 == null) {
                strConcat = strConcat.concat(" name");
            }
            if (str3 == null) {
                strConcat = strConcat.concat(" textColor");
            }
            if (str4 == null) {
                strConcat = strConcat.concat(" displayRef");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_MapboxShield(linkedHashMap, str, str2, str3, str4);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_MapboxShield(Map<String, SerializableJsonElement> map, String str, String str2, String str3, String str4) {
        super(map, str, str2, str3, str4);
    }
}
