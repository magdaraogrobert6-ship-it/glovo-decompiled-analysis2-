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
public final class AutoValue_V6ContextAddress extends ScrollAxisRange {
    public final String addressNumber;
    public final String mapboxId;
    public final String name;
    public final String streetName;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6ContextAddress> {
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6ContextAddress)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:31:0x0065  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6ContextAddress read2(JsonReader jsonReader) throws IOException {
            byte b;
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            LinkedHashMap linkedHashMap2 = null;
            String str3 = null;
            String str4 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "name":
                            b = 0;
                            break;
                        case "address_number":
                            b = 1;
                            break;
                        case "street_name":
                            b = 2;
                            break;
                        case "mapbox_id":
                            b = 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter adapter = this.string_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter;
                        }
                        str2 = (String) adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str3 = (String) adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter adapter3 = this.string_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter3;
                        }
                        str4 = (String) adapter3.read2(jsonReader);
                    } else if (b != 3) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap2 = linkedHashMap;
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    } else {
                        TypeAdapter adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str = (String) adapter4.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6ContextAddress(str, str2, linkedHashMap2, str3, str4);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6ContextAddress autoValue_V6ContextAddress) throws IOException {
            AutoValue_V6ContextAddress autoValue_V6ContextAddress2 = autoValue_V6ContextAddress;
            if (autoValue_V6ContextAddress2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_V6ContextAddress2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("mapbox_id");
            if (autoValue_V6ContextAddress2.mapboxId == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6ContextAddress2.mapboxId);
            }
            jsonWriter.name("name");
            if (autoValue_V6ContextAddress2.name == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6ContextAddress2.name);
            }
            jsonWriter.name("address_number");
            if (autoValue_V6ContextAddress2.addressNumber == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6ContextAddress2.addressNumber);
            }
            jsonWriter.name("street_name");
            if (autoValue_V6ContextAddress2.streetName == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6ContextAddress2.streetName);
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
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addressNumber;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.streetName;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_V6ContextAddress(String str, String str2, LinkedHashMap linkedHashMap, String str3, String str4) {
        this.unrecognized = linkedHashMap;
        this.mapboxId = str;
        this.name = str2;
        this.addressNumber = str3;
        this.streetName = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6ContextAddress)) {
            return false;
        }
        AutoValue_V6ContextAddress autoValue_V6ContextAddress = (AutoValue_V6ContextAddress) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_V6ContextAddress.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_V6ContextAddress.unrecognized)) {
            return false;
        }
        String str = this.mapboxId;
        if (str == null) {
            if (autoValue_V6ContextAddress.mapboxId != null) {
                return false;
            }
        } else if (!str.equals(autoValue_V6ContextAddress.mapboxId)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null) {
            if (autoValue_V6ContextAddress.name != null) {
                return false;
            }
        } else if (!str2.equals(autoValue_V6ContextAddress.name)) {
            return false;
        }
        String str3 = this.addressNumber;
        if (str3 == null) {
            if (autoValue_V6ContextAddress.addressNumber != null) {
                return false;
            }
        } else if (!str3.equals(autoValue_V6ContextAddress.addressNumber)) {
            return false;
        }
        String str4 = this.streetName;
        if (str4 == null) {
            if (autoValue_V6ContextAddress.streetName != null) {
                return false;
            }
        } else if (!str4.equals(autoValue_V6ContextAddress.streetName)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6ContextAddress{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", mapboxId=");
        sb.append(this.mapboxId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", addressNumber=");
        sb.append(this.addressNumber);
        sb.append(", streetName=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.streetName, "}");
    }
}
