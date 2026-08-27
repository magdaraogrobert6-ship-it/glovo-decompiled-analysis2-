package com.mapbox.api.geocoding.v6.models;

import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
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
public final class AutoValue_V6Context extends ScrollAxisRange {
    public final AutoValue_V6ContextAddress address;
    public final AutoValue_V6ContextElement country;
    public final AutoValue_V6ContextElement neighborhood;
    public final AutoValue_V6ContextElement place;
    public final AutoValue_V6ContextElement postcode;
    public final AutoValue_V6ContextElement region;
    public final AutoValue_V6ContextElement street;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6Context> {
        public final Gson gson;
        public volatile TypeAdapter v6ContextAddress_adapter;
        public volatile TypeAdapter v6ContextElement_adapter;

        public final String toString() {
            return "TypeAdapter(V6Context)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:43:0x0086  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6Context read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap2 = null;
            AutoValue_V6ContextAddress autoValue_V6ContextAddress = null;
            AutoValue_V6ContextElement autoValue_V6ContextElement = null;
            AutoValue_V6ContextElement autoValue_V6ContextElement2 = null;
            AutoValue_V6ContextElement autoValue_V6ContextElement3 = null;
            AutoValue_V6ContextElement autoValue_V6ContextElement4 = null;
            AutoValue_V6ContextElement autoValue_V6ContextElement5 = null;
            AutoValue_V6ContextElement autoValue_V6ContextElement6 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "address":
                            TypeAdapter adapter = this.v6ContextAddress_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(AutoValue_V6ContextAddress.class);
                                this.v6ContextAddress_adapter = adapter;
                            }
                            autoValue_V6ContextAddress = (AutoValue_V6ContextAddress) adapter.read2(jsonReader);
                            break;
                        case "region":
                            TypeAdapter adapter2 = this.v6ContextElement_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                                this.v6ContextElement_adapter = adapter2;
                            }
                            autoValue_V6ContextElement5 = (AutoValue_V6ContextElement) adapter2.read2(jsonReader);
                            break;
                        case "street":
                            TypeAdapter adapter3 = this.v6ContextElement_adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                                this.v6ContextElement_adapter = adapter3;
                            }
                            autoValue_V6ContextElement = (AutoValue_V6ContextElement) adapter3.read2(jsonReader);
                            break;
                        case "place":
                            TypeAdapter adapter4 = this.v6ContextElement_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                                this.v6ContextElement_adapter = adapter4;
                            }
                            autoValue_V6ContextElement3 = (AutoValue_V6ContextElement) adapter4.read2(jsonReader);
                            break;
                        case "neighborhood":
                            TypeAdapter adapter5 = this.v6ContextElement_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                                this.v6ContextElement_adapter = adapter5;
                            }
                            autoValue_V6ContextElement2 = (AutoValue_V6ContextElement) adapter5.read2(jsonReader);
                            break;
                        case "postcode":
                            TypeAdapter adapter6 = this.v6ContextElement_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                                this.v6ContextElement_adapter = adapter6;
                            }
                            autoValue_V6ContextElement4 = (AutoValue_V6ContextElement) adapter6.read2(jsonReader);
                            break;
                        case "country":
                            TypeAdapter adapter7 = this.v6ContextElement_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                                this.v6ContextElement_adapter = adapter7;
                            }
                            autoValue_V6ContextElement6 = (AutoValue_V6ContextElement) adapter7.read2(jsonReader);
                            break;
                        default:
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                                linkedHashMap2 = linkedHashMap;
                            }
                            SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6Context(linkedHashMap2, autoValue_V6ContextAddress, autoValue_V6ContextElement, autoValue_V6ContextElement2, autoValue_V6ContextElement3, autoValue_V6ContextElement4, autoValue_V6ContextElement5, autoValue_V6ContextElement6);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6Context autoValue_V6Context) throws IOException {
            AutoValue_V6Context autoValue_V6Context2 = autoValue_V6Context;
            if (autoValue_V6Context2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_V6Context2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("address");
            if (autoValue_V6Context2.address == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.v6ContextAddress_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(AutoValue_V6ContextAddress.class);
                    this.v6ContextAddress_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6Context2.address);
            }
            jsonWriter.name("street");
            if (autoValue_V6Context2.street == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.v6ContextElement_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                    this.v6ContextElement_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6Context2.street);
            }
            jsonWriter.name("neighborhood");
            if (autoValue_V6Context2.neighborhood == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.v6ContextElement_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                    this.v6ContextElement_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6Context2.neighborhood);
            }
            jsonWriter.name("place");
            if (autoValue_V6Context2.place == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.v6ContextElement_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                    this.v6ContextElement_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6Context2.place);
            }
            jsonWriter.name("postcode");
            if (autoValue_V6Context2.postcode == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.v6ContextElement_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                    this.v6ContextElement_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_V6Context2.postcode);
            }
            jsonWriter.name("region");
            if (autoValue_V6Context2.region == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.v6ContextElement_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                    this.v6ContextElement_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_V6Context2.region);
            }
            jsonWriter.name(PushNotificationParserObj.COUNTRY_KEY);
            if (autoValue_V6Context2.country == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter7 = this.v6ContextElement_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(AutoValue_V6ContextElement.class);
                    this.v6ContextElement_adapter = adapter7;
                }
                adapter7.write(jsonWriter, autoValue_V6Context2.country);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        AutoValue_V6ContextAddress autoValue_V6ContextAddress = this.address;
        int iHashCode2 = autoValue_V6ContextAddress == null ? 0 : autoValue_V6ContextAddress.hashCode();
        AutoValue_V6ContextElement autoValue_V6ContextElement = this.street;
        int iHashCode3 = autoValue_V6ContextElement == null ? 0 : autoValue_V6ContextElement.hashCode();
        AutoValue_V6ContextElement autoValue_V6ContextElement2 = this.neighborhood;
        int iHashCode4 = autoValue_V6ContextElement2 == null ? 0 : autoValue_V6ContextElement2.hashCode();
        AutoValue_V6ContextElement autoValue_V6ContextElement3 = this.place;
        int iHashCode5 = autoValue_V6ContextElement3 == null ? 0 : autoValue_V6ContextElement3.hashCode();
        AutoValue_V6ContextElement autoValue_V6ContextElement4 = this.postcode;
        int iHashCode6 = autoValue_V6ContextElement4 == null ? 0 : autoValue_V6ContextElement4.hashCode();
        AutoValue_V6ContextElement autoValue_V6ContextElement5 = this.region;
        int iHashCode7 = autoValue_V6ContextElement5 == null ? 0 : autoValue_V6ContextElement5.hashCode();
        AutoValue_V6ContextElement autoValue_V6ContextElement6 = this.country;
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ (autoValue_V6ContextElement6 != null ? autoValue_V6ContextElement6.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_V6Context(LinkedHashMap linkedHashMap, AutoValue_V6ContextAddress autoValue_V6ContextAddress, AutoValue_V6ContextElement autoValue_V6ContextElement, AutoValue_V6ContextElement autoValue_V6ContextElement2, AutoValue_V6ContextElement autoValue_V6ContextElement3, AutoValue_V6ContextElement autoValue_V6ContextElement4, AutoValue_V6ContextElement autoValue_V6ContextElement5, AutoValue_V6ContextElement autoValue_V6ContextElement6) {
        this.unrecognized = linkedHashMap;
        this.address = autoValue_V6ContextAddress;
        this.street = autoValue_V6ContextElement;
        this.neighborhood = autoValue_V6ContextElement2;
        this.place = autoValue_V6ContextElement3;
        this.postcode = autoValue_V6ContextElement4;
        this.region = autoValue_V6ContextElement5;
        this.country = autoValue_V6ContextElement6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6Context)) {
            return false;
        }
        AutoValue_V6Context autoValue_V6Context = (AutoValue_V6Context) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_V6Context.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_V6Context.unrecognized)) {
            return false;
        }
        AutoValue_V6ContextAddress autoValue_V6ContextAddress = this.address;
        if (autoValue_V6ContextAddress == null) {
            if (autoValue_V6Context.address != null) {
                return false;
            }
        } else if (!autoValue_V6ContextAddress.equals(autoValue_V6Context.address)) {
            return false;
        }
        AutoValue_V6ContextElement autoValue_V6ContextElement = this.street;
        if (autoValue_V6ContextElement == null) {
            if (autoValue_V6Context.street != null) {
                return false;
            }
        } else if (!autoValue_V6ContextElement.equals(autoValue_V6Context.street)) {
            return false;
        }
        AutoValue_V6ContextElement autoValue_V6ContextElement2 = this.neighborhood;
        if (autoValue_V6ContextElement2 == null) {
            if (autoValue_V6Context.neighborhood != null) {
                return false;
            }
        } else if (!autoValue_V6ContextElement2.equals(autoValue_V6Context.neighborhood)) {
            return false;
        }
        AutoValue_V6ContextElement autoValue_V6ContextElement3 = this.place;
        if (autoValue_V6ContextElement3 == null) {
            if (autoValue_V6Context.place != null) {
                return false;
            }
        } else if (!autoValue_V6ContextElement3.equals(autoValue_V6Context.place)) {
            return false;
        }
        AutoValue_V6ContextElement autoValue_V6ContextElement4 = this.postcode;
        if (autoValue_V6ContextElement4 == null) {
            if (autoValue_V6Context.postcode != null) {
                return false;
            }
        } else if (!autoValue_V6ContextElement4.equals(autoValue_V6Context.postcode)) {
            return false;
        }
        AutoValue_V6ContextElement autoValue_V6ContextElement5 = this.region;
        if (autoValue_V6ContextElement5 == null) {
            if (autoValue_V6Context.region != null) {
                return false;
            }
        } else if (!autoValue_V6ContextElement5.equals(autoValue_V6Context.region)) {
            return false;
        }
        AutoValue_V6ContextElement autoValue_V6ContextElement6 = this.country;
        if (autoValue_V6ContextElement6 == null) {
            if (autoValue_V6Context.country != null) {
                return false;
            }
        } else if (!autoValue_V6ContextElement6.equals(autoValue_V6Context.country)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "V6Context{unrecognized=" + this.unrecognized + ", address=" + this.address + ", street=" + this.street + ", neighborhood=" + this.neighborhood + ", place=" + this.place + ", postcode=" + this.postcode + ", region=" + this.region + ", country=" + this.country + "}";
    }
}
