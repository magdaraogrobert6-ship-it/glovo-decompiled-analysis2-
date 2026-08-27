package com.mapbox.api.geocoding.v6;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.maps.MapboxMap;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_V6ForwardGeocodingRequestOptions {
    public final String addressLine1;
    public final String addressNumber;
    public final Boolean autocomplete;
    public final List bbox;
    public final String block;
    public final String country;
    public final String language;
    public final Integer limit;
    public final String locality;
    public final String neighborhood;
    public final String place;
    public final String postcode;
    public final String proximity;
    public final String query;
    public final String region;
    public final String street;
    public final List types;
    public final String worldview;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6ForwardGeocodingRequestOptions> {
        public volatile TypeAdapter boolean__adapter;
        public final Gson gson;
        public volatile TypeAdapter integer_adapter;
        public volatile TypeAdapter list__double_adapter;
        public volatile TypeAdapter list__string_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6ForwardGeocodingRequestOptions)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:87:0x0136  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6ForwardGeocodingRequestOptions read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Boolean bool = null;
            List list = null;
            String str11 = null;
            String str12 = null;
            Integer num = null;
            String str13 = null;
            List list2 = null;
            String str14 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "language":
                            TypeAdapter adapter = this.string_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter;
                            }
                            str12 = (String) adapter.read2(jsonReader);
                            break;
                        case "region":
                            TypeAdapter adapter2 = this.string_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter2;
                            }
                            str7 = (String) adapter2.read2(jsonReader);
                            break;
                        case "street":
                            TypeAdapter adapter3 = this.string_adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter3;
                            }
                            str4 = (String) adapter3.read2(jsonReader);
                            break;
                        case "autocomplete":
                            TypeAdapter adapter4 = this.boolean__adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter4;
                            }
                            bool = (Boolean) adapter4.read2(jsonReader);
                            break;
                        case "proximity":
                            TypeAdapter adapter5 = this.string_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter5;
                            }
                            str13 = (String) adapter5.read2(jsonReader);
                            break;
                        case "address_line1":
                            TypeAdapter adapter6 = this.string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter6;
                            }
                            str2 = (String) adapter6.read2(jsonReader);
                            break;
                        case "q":
                            TypeAdapter adapter7 = this.string_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter7;
                            }
                            str = (String) adapter7.read2(jsonReader);
                            break;
                        case "bbox":
                            TypeAdapter adapter8 = this.list__double_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                this.list__double_adapter = adapter8;
                            }
                            list = (List) adapter8.read2(jsonReader);
                            break;
                        case "block":
                            TypeAdapter adapter9 = this.string_adapter;
                            if (adapter9 == null) {
                                adapter9 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter9;
                            }
                            str5 = (String) adapter9.read2(jsonReader);
                            break;
                        case "limit":
                            TypeAdapter adapter10 = this.integer_adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = adapter10;
                            }
                            num = (Integer) adapter10.read2(jsonReader);
                            break;
                        case "place":
                            TypeAdapter adapter11 = this.string_adapter;
                            if (adapter11 == null) {
                                adapter11 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter11;
                            }
                            str6 = (String) adapter11.read2(jsonReader);
                            break;
                        case "types":
                            TypeAdapter adapter12 = this.list__string_adapter;
                            if (adapter12 == null) {
                                adapter12 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter12;
                            }
                            list2 = (List) adapter12.read2(jsonReader);
                            break;
                        case "address_number":
                            TypeAdapter adapter13 = this.string_adapter;
                            if (adapter13 == null) {
                                adapter13 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter13;
                            }
                            str3 = (String) adapter13.read2(jsonReader);
                            break;
                        case "neighborhood":
                            TypeAdapter adapter14 = this.string_adapter;
                            if (adapter14 == null) {
                                adapter14 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter14;
                            }
                            str10 = (String) adapter14.read2(jsonReader);
                            break;
                        case "postcode":
                            TypeAdapter adapter15 = this.string_adapter;
                            if (adapter15 == null) {
                                adapter15 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter15;
                            }
                            str8 = (String) adapter15.read2(jsonReader);
                            break;
                        case "country":
                            TypeAdapter adapter16 = this.string_adapter;
                            if (adapter16 == null) {
                                adapter16 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter16;
                            }
                            str11 = (String) adapter16.read2(jsonReader);
                            break;
                        case "worldview":
                            TypeAdapter adapter17 = this.string_adapter;
                            if (adapter17 == null) {
                                adapter17 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter17;
                            }
                            str14 = (String) adapter17.read2(jsonReader);
                            break;
                        case "locality":
                            TypeAdapter adapter18 = this.string_adapter;
                            if (adapter18 == null) {
                                adapter18 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter18;
                            }
                            str9 = (String) adapter18.read2(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_V6ForwardGeocodingRequestOptions(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool, list, str11, str12, num, str13, list2, str14);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6ForwardGeocodingRequestOptions autoValue_V6ForwardGeocodingRequestOptions) throws IOException {
            AutoValue_V6ForwardGeocodingRequestOptions autoValue_V6ForwardGeocodingRequestOptions2 = autoValue_V6ForwardGeocodingRequestOptions;
            if (autoValue_V6ForwardGeocodingRequestOptions2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("q");
            if (autoValue_V6ForwardGeocodingRequestOptions2.query == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.query);
            }
            jsonWriter.name("address_line1");
            if (autoValue_V6ForwardGeocodingRequestOptions2.addressLine1 == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.addressLine1);
            }
            jsonWriter.name("address_number");
            if (autoValue_V6ForwardGeocodingRequestOptions2.addressNumber == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.addressNumber);
            }
            jsonWriter.name("street");
            if (autoValue_V6ForwardGeocodingRequestOptions2.street == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.street);
            }
            jsonWriter.name("block");
            if (autoValue_V6ForwardGeocodingRequestOptions2.block == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.block);
            }
            jsonWriter.name("place");
            if (autoValue_V6ForwardGeocodingRequestOptions2.place == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.place);
            }
            jsonWriter.name("region");
            if (autoValue_V6ForwardGeocodingRequestOptions2.region == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter7 = this.string_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter7;
                }
                adapter7.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.region);
            }
            jsonWriter.name("postcode");
            if (autoValue_V6ForwardGeocodingRequestOptions2.postcode == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.postcode);
            }
            jsonWriter.name("locality");
            if (autoValue_V6ForwardGeocodingRequestOptions2.locality == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter9 = this.string_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter9;
                }
                adapter9.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.locality);
            }
            jsonWriter.name("neighborhood");
            if (autoValue_V6ForwardGeocodingRequestOptions2.neighborhood == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter10 = this.string_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter10;
                }
                adapter10.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.neighborhood);
            }
            jsonWriter.name("autocomplete");
            if (autoValue_V6ForwardGeocodingRequestOptions2.autocomplete == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter11 = this.boolean__adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter11;
                }
                adapter11.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.autocomplete);
            }
            jsonWriter.name("bbox");
            if (autoValue_V6ForwardGeocodingRequestOptions2.bbox == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter12 = this.list__double_adapter;
                if (adapter12 == null) {
                    adapter12 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = adapter12;
                }
                adapter12.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.bbox);
            }
            jsonWriter.name(PushNotificationParserObj.COUNTRY_KEY);
            if (autoValue_V6ForwardGeocodingRequestOptions2.country == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter13 = this.string_adapter;
                if (adapter13 == null) {
                    adapter13 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter13;
                }
                adapter13.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.country);
            }
            jsonWriter.name("language");
            if (autoValue_V6ForwardGeocodingRequestOptions2.language == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter14 = this.string_adapter;
                if (adapter14 == null) {
                    adapter14 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter14;
                }
                adapter14.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.language);
            }
            jsonWriter.name(MapboxMap.QFE_LIMIT);
            if (autoValue_V6ForwardGeocodingRequestOptions2.limit == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter15 = this.integer_adapter;
                if (adapter15 == null) {
                    adapter15 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter15;
                }
                adapter15.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.limit);
            }
            jsonWriter.name("proximity");
            if (autoValue_V6ForwardGeocodingRequestOptions2.proximity == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter16 = this.string_adapter;
                if (adapter16 == null) {
                    adapter16 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter16;
                }
                adapter16.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.proximity);
            }
            jsonWriter.name("types");
            if (autoValue_V6ForwardGeocodingRequestOptions2.types == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter17 = this.list__string_adapter;
                if (adapter17 == null) {
                    adapter17 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter17;
                }
                adapter17.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.types);
            }
            jsonWriter.name("worldview");
            if (autoValue_V6ForwardGeocodingRequestOptions2.worldview == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter18 = this.string_adapter;
                if (adapter18 == null) {
                    adapter18 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter18;
                }
                adapter18.write(jsonWriter, autoValue_V6ForwardGeocodingRequestOptions2.worldview);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        String str = this.query;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.addressLine1;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addressNumber;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.street;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.block;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.place;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.region;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.postcode;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.locality;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.neighborhood;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        Boolean bool = this.autocomplete;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        List list = this.bbox;
        int iHashCode12 = list == null ? 0 : list.hashCode();
        String str11 = this.country;
        int iHashCode13 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.language;
        int iHashCode14 = str12 == null ? 0 : str12.hashCode();
        Integer num = this.limit;
        int iHashCode15 = num == null ? 0 : num.hashCode();
        String str13 = this.proximity;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        List list2 = this.types;
        int iHashCode17 = list2 == null ? 0 : list2.hashCode();
        String str14 = this.worldview;
        return ((((((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ iHashCode15) * 1000003) ^ iHashCode16) * 1000003) ^ iHashCode17) * 1000003) ^ (str14 == null ? 0 : str14.hashCode());
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_V6ForwardGeocodingRequestOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, List list, String str11, String str12, Integer num, String str13, List list2, String str14) {
        this.query = str;
        this.addressLine1 = str2;
        this.addressNumber = str3;
        this.street = str4;
        this.block = str5;
        this.place = str6;
        this.region = str7;
        this.postcode = str8;
        this.locality = str9;
        this.neighborhood = str10;
        this.autocomplete = bool;
        this.bbox = list;
        this.country = str11;
        this.language = str12;
        this.limit = num;
        this.proximity = str13;
        this.types = list2;
        this.worldview = str14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6ForwardGeocodingRequestOptions)) {
            return false;
        }
        AutoValue_V6ForwardGeocodingRequestOptions autoValue_V6ForwardGeocodingRequestOptions = (AutoValue_V6ForwardGeocodingRequestOptions) obj;
        String str = this.query;
        if (str == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.query != null) {
                return false;
            }
        } else if (!str.equals(autoValue_V6ForwardGeocodingRequestOptions.query)) {
            return false;
        }
        String str2 = this.addressLine1;
        if (str2 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.addressLine1 != null) {
                return false;
            }
        } else if (!str2.equals(autoValue_V6ForwardGeocodingRequestOptions.addressLine1)) {
            return false;
        }
        String str3 = this.addressNumber;
        if (str3 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.addressNumber != null) {
                return false;
            }
        } else if (!str3.equals(autoValue_V6ForwardGeocodingRequestOptions.addressNumber)) {
            return false;
        }
        String str4 = this.street;
        if (str4 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.street != null) {
                return false;
            }
        } else if (!str4.equals(autoValue_V6ForwardGeocodingRequestOptions.street)) {
            return false;
        }
        String str5 = this.block;
        if (str5 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.block != null) {
                return false;
            }
        } else if (!str5.equals(autoValue_V6ForwardGeocodingRequestOptions.block)) {
            return false;
        }
        String str6 = this.place;
        if (str6 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.place != null) {
                return false;
            }
        } else if (!str6.equals(autoValue_V6ForwardGeocodingRequestOptions.place)) {
            return false;
        }
        String str7 = this.region;
        if (str7 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.region != null) {
                return false;
            }
        } else if (!str7.equals(autoValue_V6ForwardGeocodingRequestOptions.region)) {
            return false;
        }
        String str8 = this.postcode;
        if (str8 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.postcode != null) {
                return false;
            }
        } else if (!str8.equals(autoValue_V6ForwardGeocodingRequestOptions.postcode)) {
            return false;
        }
        String str9 = this.locality;
        if (str9 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.locality != null) {
                return false;
            }
        } else if (!str9.equals(autoValue_V6ForwardGeocodingRequestOptions.locality)) {
            return false;
        }
        String str10 = this.neighborhood;
        if (str10 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.neighborhood != null) {
                return false;
            }
        } else if (!str10.equals(autoValue_V6ForwardGeocodingRequestOptions.neighborhood)) {
            return false;
        }
        Boolean bool = this.autocomplete;
        if (bool == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.autocomplete != null) {
                return false;
            }
        } else if (!bool.equals(autoValue_V6ForwardGeocodingRequestOptions.autocomplete)) {
            return false;
        }
        List list = this.bbox;
        if (list == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.bbox != null) {
                return false;
            }
        } else if (!list.equals(autoValue_V6ForwardGeocodingRequestOptions.bbox)) {
            return false;
        }
        String str11 = this.country;
        if (str11 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.country != null) {
                return false;
            }
        } else if (!str11.equals(autoValue_V6ForwardGeocodingRequestOptions.country)) {
            return false;
        }
        String str12 = this.language;
        if (str12 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.language != null) {
                return false;
            }
        } else if (!str12.equals(autoValue_V6ForwardGeocodingRequestOptions.language)) {
            return false;
        }
        Integer num = this.limit;
        if (num == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.limit != null) {
                return false;
            }
        } else if (!num.equals(autoValue_V6ForwardGeocodingRequestOptions.limit)) {
            return false;
        }
        String str13 = this.proximity;
        if (str13 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.proximity != null) {
                return false;
            }
        } else if (!str13.equals(autoValue_V6ForwardGeocodingRequestOptions.proximity)) {
            return false;
        }
        List list2 = this.types;
        if (list2 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.types != null) {
                return false;
            }
        } else if (!list2.equals(autoValue_V6ForwardGeocodingRequestOptions.types)) {
            return false;
        }
        String str14 = this.worldview;
        if (str14 == null) {
            if (autoValue_V6ForwardGeocodingRequestOptions.worldview != null) {
                return false;
            }
        } else if (!str14.equals(autoValue_V6ForwardGeocodingRequestOptions.worldview)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6ForwardGeocodingRequestOptions{query=");
        sb.append(this.query);
        sb.append(", addressLine1=");
        sb.append(this.addressLine1);
        sb.append(", addressNumber=");
        sb.append(this.addressNumber);
        sb.append(", street=");
        sb.append(this.street);
        sb.append(", block=");
        sb.append(this.block);
        sb.append(", place=");
        sb.append(this.place);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", postcode=");
        sb.append(this.postcode);
        sb.append(", locality=");
        sb.append(this.locality);
        sb.append(", neighborhood=");
        sb.append(this.neighborhood);
        sb.append(", autocomplete=");
        sb.append(this.autocomplete);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", proximity=");
        sb.append(this.proximity);
        sb.append(", types=");
        sb.append(this.types);
        sb.append(", worldview=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.worldview, "}");
    }
}
