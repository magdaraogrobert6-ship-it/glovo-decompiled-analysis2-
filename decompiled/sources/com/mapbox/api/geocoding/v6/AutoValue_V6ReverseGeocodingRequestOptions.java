package com.mapbox.api.geocoding.v6;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
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
public final class AutoValue_V6ReverseGeocodingRequestOptions {
    public final String country;
    public final String language;
    public final Double latitude;
    public final Integer limit;
    public final Double longitude;
    public final List types;
    public final String worldview;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6ReverseGeocodingRequestOptions> {
        public volatile TypeAdapter double__adapter;
        public final Gson gson;
        public volatile TypeAdapter integer_adapter;
        public volatile TypeAdapter list__string_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(V6ReverseGeocodingRequestOptions)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:43:0x0087  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6ReverseGeocodingRequestOptions read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Double d = null;
            Double d2 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            List list = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "language":
                            TypeAdapter adapter = this.string_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter;
                            }
                            str2 = (String) adapter.read2(jsonReader);
                            break;
                        case "latitude":
                            TypeAdapter adapter2 = this.double__adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter2;
                            }
                            d2 = (Double) adapter2.read2(jsonReader);
                            if (d2 == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null latitude");
                                return null;
                            }
                            break;
                            break;
                        case "limit":
                            TypeAdapter adapter3 = this.integer_adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = adapter3;
                            }
                            num = (Integer) adapter3.read2(jsonReader);
                            break;
                        case "types":
                            TypeAdapter adapter4 = this.list__string_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter4;
                            }
                            list = (List) adapter4.read2(jsonReader);
                            break;
                        case "longitude":
                            TypeAdapter adapter5 = this.double__adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter5;
                            }
                            d = (Double) adapter5.read2(jsonReader);
                            if (d == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null longitude");
                                return null;
                            }
                            break;
                            break;
                        case "country":
                            TypeAdapter adapter6 = this.string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter6;
                            }
                            str = (String) adapter6.read2(jsonReader);
                            break;
                        case "worldview":
                            TypeAdapter adapter7 = this.string_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter7;
                            }
                            str3 = (String) adapter7.read2(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            String strConcat = d == null ? " longitude" : "";
            if (d2 == null) {
                strConcat = strConcat.concat(" latitude");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_V6ReverseGeocodingRequestOptions(d, d2, str, str2, num, list, str3);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6ReverseGeocodingRequestOptions autoValue_V6ReverseGeocodingRequestOptions) throws IOException {
            AutoValue_V6ReverseGeocodingRequestOptions autoValue_V6ReverseGeocodingRequestOptions2 = autoValue_V6ReverseGeocodingRequestOptions;
            if (autoValue_V6ReverseGeocodingRequestOptions2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("longitude");
            if (autoValue_V6ReverseGeocodingRequestOptions2.longitude == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.double__adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6ReverseGeocodingRequestOptions2.longitude);
            }
            jsonWriter.name("latitude");
            if (autoValue_V6ReverseGeocodingRequestOptions2.latitude == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.double__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6ReverseGeocodingRequestOptions2.latitude);
            }
            jsonWriter.name(PushNotificationParserObj.COUNTRY_KEY);
            if (autoValue_V6ReverseGeocodingRequestOptions2.country == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6ReverseGeocodingRequestOptions2.country);
            }
            jsonWriter.name("language");
            if (autoValue_V6ReverseGeocodingRequestOptions2.language == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6ReverseGeocodingRequestOptions2.language);
            }
            jsonWriter.name(MapboxMap.QFE_LIMIT);
            if (autoValue_V6ReverseGeocodingRequestOptions2.limit == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.integer_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_V6ReverseGeocodingRequestOptions2.limit);
            }
            jsonWriter.name("types");
            if (autoValue_V6ReverseGeocodingRequestOptions2.types == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.list__string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_V6ReverseGeocodingRequestOptions2.types);
            }
            jsonWriter.name("worldview");
            if (autoValue_V6ReverseGeocodingRequestOptions2.worldview == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter7 = this.string_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter7;
                }
                adapter7.write(jsonWriter, autoValue_V6ReverseGeocodingRequestOptions2.worldview);
            }
            jsonWriter.endObject();
        }
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        int iHashCode = this.longitude.hashCode();
        int iHashCode2 = this.latitude.hashCode();
        String str = this.country;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.language;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.limit;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        List list = this.types;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str3 = this.worldview;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6ReverseGeocodingRequestOptions)) {
            return false;
        }
        AutoValue_V6ReverseGeocodingRequestOptions autoValue_V6ReverseGeocodingRequestOptions = (AutoValue_V6ReverseGeocodingRequestOptions) obj;
        if (!this.longitude.equals(autoValue_V6ReverseGeocodingRequestOptions.longitude) || !this.latitude.equals(autoValue_V6ReverseGeocodingRequestOptions.latitude)) {
            return false;
        }
        String str = autoValue_V6ReverseGeocodingRequestOptions.country;
        String str2 = this.country;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = autoValue_V6ReverseGeocodingRequestOptions.language;
        String str4 = this.language;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        Integer num = autoValue_V6ReverseGeocodingRequestOptions.limit;
        Integer num2 = this.limit;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        List list = autoValue_V6ReverseGeocodingRequestOptions.types;
        List list2 = this.types;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        String str5 = autoValue_V6ReverseGeocodingRequestOptions.worldview;
        String str6 = this.worldview;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V6ReverseGeocodingRequestOptions{longitude=");
        sb.append(this.longitude);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", types=");
        sb.append(this.types);
        sb.append(", worldview=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.worldview, "}");
    }

    public AutoValue_V6ReverseGeocodingRequestOptions(Double d, Double d2, String str, String str2, Integer num, List list, String str3) {
        if (d == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null longitude");
            throw null;
        }
        this.longitude = d;
        if (d2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null latitude");
            throw null;
        }
        this.latitude = d2;
        this.country = str;
        this.language = str2;
        this.limit = num;
        this.types = list;
        this.worldview = str3;
    }
}
