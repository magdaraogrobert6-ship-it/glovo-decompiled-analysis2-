package com.mapbox.api.geocoding.v6.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import com.mapbox.geojson.Geometry;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import o.ScrollAxisRange;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_V6Feature extends ScrollAxisRange {
    public final Geometry geometry;
    public final String id;
    public final AutoValue_V6Properties properties;
    public final String type;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6Feature> {
        public volatile TypeAdapter geometry_adapter;
        public final Gson gson;
        public volatile TypeAdapter string_adapter;
        public volatile TypeAdapter v6Properties_adapter;

        public final String toString() {
            return "TypeAdapter(V6Feature)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0073  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6Feature read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            LinkedHashMap linkedHashMap2 = null;
            String str = null;
            String str2 = null;
            Geometry geometry = null;
            AutoValue_V6Properties autoValue_V6Properties = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -926053069) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3575610) {
                                if (iHashCode == 1846020210 && strNextName.equals("geometry")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                            } else if (strNextName.equals("type")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("id")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("properties")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter adapter = this.v6Properties_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(AutoValue_V6Properties.class);
                            this.v6Properties_adapter = adapter;
                        }
                        autoValue_V6Properties = (AutoValue_V6Properties) adapter.read2(jsonReader);
                        if (autoValue_V6Properties == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null properties");
                            return null;
                        }
                    } else if (b == 1) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str = (String) adapter2.read2(jsonReader);
                        if (str == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null id");
                            return null;
                        }
                    } else if (b == 2) {
                        TypeAdapter adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str2 = (String) adapter3.read2(jsonReader);
                        if (str2 == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                            return null;
                        }
                    } else if (b != 3) {
                        if (linkedHashMap == null) {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap = linkedHashMap2;
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    } else {
                        TypeAdapter adapter4 = this.geometry_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(Geometry.class);
                            this.geometry_adapter = adapter4;
                        }
                        geometry = (Geometry) adapter4.read2(jsonReader);
                        if (geometry == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometry");
                            return null;
                        }
                    }
                }
            }
            jsonReader.endObject();
            String strConcat = str == null ? " id" : "";
            if (str2 == null) {
                strConcat = strConcat.concat(" type");
            }
            if (geometry == null) {
                strConcat = strConcat.concat(" geometry");
            }
            if (autoValue_V6Properties == null) {
                strConcat = strConcat.concat(" properties");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_V6Feature(linkedHashMap2, str, str2, geometry, autoValue_V6Properties);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6Feature autoValue_V6Feature) throws IOException {
            AutoValue_V6Feature autoValue_V6Feature2 = autoValue_V6Feature;
            if (autoValue_V6Feature2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_V6Feature2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("id");
            if (autoValue_V6Feature2.id == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6Feature2.id);
            }
            jsonWriter.name("type");
            if (autoValue_V6Feature2.type == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6Feature2.type);
            }
            jsonWriter.name("geometry");
            if (autoValue_V6Feature2.geometry == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.geometry_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Geometry.class);
                    this.geometry_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6Feature2.geometry);
            }
            jsonWriter.name("properties");
            if (autoValue_V6Feature2.properties == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.v6Properties_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(AutoValue_V6Properties.class);
                    this.v6Properties_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6Feature2.properties);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_V6Feature(LinkedHashMap linkedHashMap, String str, String str2, Geometry geometry, AutoValue_V6Properties autoValue_V6Properties) {
        this.unrecognized = linkedHashMap;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null id");
            throw null;
        }
        this.id = str;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        this.type = str2;
        if (geometry == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometry");
            throw null;
        }
        this.geometry = geometry;
        if (autoValue_V6Properties != null) {
            this.properties = autoValue_V6Properties;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null properties");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6Feature)) {
            return false;
        }
        AutoValue_V6Feature autoValue_V6Feature = (AutoValue_V6Feature) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_V6Feature.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_V6Feature.unrecognized)) {
            return false;
        }
        return this.id.equals(autoValue_V6Feature.id) && this.type.equals(autoValue_V6Feature.type) && this.geometry.equals(autoValue_V6Feature.geometry) && this.properties.equals(autoValue_V6Feature.properties);
    }

    public final String toString() {
        return "V6Feature{unrecognized=" + this.unrecognized + ", id=" + this.id + ", type=" + this.type + ", geometry=" + this.geometry + ", properties=" + this.properties + "}";
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        int iHashCode2 = this.id.hashCode();
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.geometry.hashCode()) * 1000003) ^ this.properties.hashCode();
    }
}
