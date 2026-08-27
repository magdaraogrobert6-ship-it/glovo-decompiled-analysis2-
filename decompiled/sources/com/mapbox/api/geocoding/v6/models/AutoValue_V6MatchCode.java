package com.mapbox.api.geocoding.v6.models;

import bo.app.ff$$ExternalSyntheticOutline0;
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
public final class AutoValue_V6MatchCode extends ScrollAxisRange {
    public final String addressNumber;
    public final String confidence;
    public final String country;
    public final String locality;
    public final String place;
    public final String postcode;
    public final String region;
    public final String street;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6MatchCode> {
        public final Gson gson;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6MatchCode)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:47:0x0093  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6MatchCode read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "region":
                            TypeAdapter adapter = this.string_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter;
                            }
                            str6 = (String) adapter.read2(jsonReader);
                            break;
                        case "street":
                            TypeAdapter adapter2 = this.string_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter2;
                            }
                            str2 = (String) adapter2.read2(jsonReader);
                            break;
                        case "place":
                            TypeAdapter adapter3 = this.string_adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter3;
                            }
                            str4 = (String) adapter3.read2(jsonReader);
                            break;
                        case "address_number":
                            TypeAdapter adapter4 = this.string_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter4;
                            }
                            str = (String) adapter4.read2(jsonReader);
                            break;
                        case "postcode":
                            TypeAdapter adapter5 = this.string_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter5;
                            }
                            str5 = (String) adapter5.read2(jsonReader);
                            break;
                        case "confidence":
                            TypeAdapter adapter6 = this.string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter6;
                            }
                            str8 = (String) adapter6.read2(jsonReader);
                            break;
                        case "country":
                            TypeAdapter adapter7 = this.string_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter7;
                            }
                            str7 = (String) adapter7.read2(jsonReader);
                            break;
                        case "locality":
                            TypeAdapter adapter8 = this.string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter8;
                            }
                            str3 = (String) adapter8.read2(jsonReader);
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
            return new AutoValue_V6MatchCode(linkedHashMap2, str, str2, str3, str4, str5, str6, str7, str8);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6MatchCode autoValue_V6MatchCode) throws IOException {
            AutoValue_V6MatchCode autoValue_V6MatchCode2 = autoValue_V6MatchCode;
            if (autoValue_V6MatchCode2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_V6MatchCode2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("address_number");
            if (autoValue_V6MatchCode2.addressNumber == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6MatchCode2.addressNumber);
            }
            jsonWriter.name("street");
            if (autoValue_V6MatchCode2.street == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6MatchCode2.street);
            }
            jsonWriter.name("locality");
            if (autoValue_V6MatchCode2.locality == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6MatchCode2.locality);
            }
            jsonWriter.name("place");
            if (autoValue_V6MatchCode2.place == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6MatchCode2.place);
            }
            jsonWriter.name("postcode");
            if (autoValue_V6MatchCode2.postcode == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_V6MatchCode2.postcode);
            }
            jsonWriter.name("region");
            if (autoValue_V6MatchCode2.region == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_V6MatchCode2.region);
            }
            jsonWriter.name(PushNotificationParserObj.COUNTRY_KEY);
            if (autoValue_V6MatchCode2.country == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter7 = this.string_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter7;
                }
                adapter7.write(jsonWriter, autoValue_V6MatchCode2.country);
            }
            jsonWriter.name("confidence");
            if (autoValue_V6MatchCode2.confidence == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, autoValue_V6MatchCode2.confidence);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        String str = this.addressNumber;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.street;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.locality;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.place;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.postcode;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.region;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.country;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.confidence;
        return ((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ (str8 != null ? str8.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_V6MatchCode(LinkedHashMap linkedHashMap, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.unrecognized = linkedHashMap;
        this.addressNumber = str;
        this.street = str2;
        this.locality = str3;
        this.place = str4;
        this.postcode = str5;
        this.region = str6;
        this.country = str7;
        this.confidence = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6MatchCode)) {
            return false;
        }
        AutoValue_V6MatchCode autoValue_V6MatchCode = (AutoValue_V6MatchCode) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_V6MatchCode.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_V6MatchCode.unrecognized)) {
            return false;
        }
        String str = this.addressNumber;
        if (str == null) {
            if (autoValue_V6MatchCode.addressNumber != null) {
                return false;
            }
        } else if (!str.equals(autoValue_V6MatchCode.addressNumber)) {
            return false;
        }
        String str2 = this.street;
        if (str2 == null) {
            if (autoValue_V6MatchCode.street != null) {
                return false;
            }
        } else if (!str2.equals(autoValue_V6MatchCode.street)) {
            return false;
        }
        String str3 = this.locality;
        if (str3 == null) {
            if (autoValue_V6MatchCode.locality != null) {
                return false;
            }
        } else if (!str3.equals(autoValue_V6MatchCode.locality)) {
            return false;
        }
        String str4 = this.place;
        if (str4 == null) {
            if (autoValue_V6MatchCode.place != null) {
                return false;
            }
        } else if (!str4.equals(autoValue_V6MatchCode.place)) {
            return false;
        }
        String str5 = this.postcode;
        if (str5 == null) {
            if (autoValue_V6MatchCode.postcode != null) {
                return false;
            }
        } else if (!str5.equals(autoValue_V6MatchCode.postcode)) {
            return false;
        }
        String str6 = this.region;
        if (str6 == null) {
            if (autoValue_V6MatchCode.region != null) {
                return false;
            }
        } else if (!str6.equals(autoValue_V6MatchCode.region)) {
            return false;
        }
        String str7 = this.country;
        if (str7 == null) {
            if (autoValue_V6MatchCode.country != null) {
                return false;
            }
        } else if (!str7.equals(autoValue_V6MatchCode.country)) {
            return false;
        }
        String str8 = this.confidence;
        if (str8 == null) {
            if (autoValue_V6MatchCode.confidence != null) {
                return false;
            }
        } else if (!str8.equals(autoValue_V6MatchCode.confidence)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6MatchCode{unrecognized=");
        sb.append(this.unrecognized);
        sb.append(", addressNumber=");
        sb.append(this.addressNumber);
        sb.append(", street=");
        sb.append(this.street);
        sb.append(", locality=");
        sb.append(this.locality);
        sb.append(", place=");
        sb.append(this.place);
        sb.append(", postcode=");
        sb.append(this.postcode);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", confidence=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.confidence, "}");
    }
}
