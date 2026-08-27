package com.mapbox.api.geocoding.v6.models;

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
import o.ScrollAxisRange;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_V6Properties extends ScrollAxisRange {
    public final List bbox;
    public final AutoValue_V6Context context;
    public final AutoValue_V6Coordinates coordinates;
    public final String featureType;
    public final String fullAddress;
    public final String mapboxId;
    public final AutoValue_V6MatchCode matchCode;
    public final String name;
    public final String namePreferred;
    public final String placeFormatted;
    public final Map unrecognized;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_V6Properties> {
        public final Gson gson;
        public volatile TypeAdapter list__double_adapter;
        public volatile TypeAdapter string_adapter;
        public volatile TypeAdapter v6Context_adapter;
        public volatile TypeAdapter v6Coordinates_adapter;
        public volatile TypeAdapter v6MatchCode_adapter;

        public final String toString() {
            return "TypeAdapter(V6Properties)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_V6Properties read2(JsonReader jsonReader) throws IOException {
            String strConcat;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            LinkedHashMap linkedHashMap2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            AutoValue_V6Context autoValue_V6Context = null;
            AutoValue_V6Coordinates autoValue_V6Coordinates = null;
            List list = null;
            AutoValue_V6MatchCode autoValue_V6MatchCode = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "place_formatted":
                            TypeAdapter adapter = this.string_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter;
                            }
                            str5 = (String) adapter.read2(jsonReader);
                            break;
                        case "name_preferred":
                            TypeAdapter adapter2 = this.string_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter2;
                            }
                            str4 = (String) adapter2.read2(jsonReader);
                            break;
                        case "bbox":
                            TypeAdapter adapter3 = this.list__double_adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                                this.list__double_adapter = adapter3;
                            }
                            list = (List) adapter3.read2(jsonReader);
                            break;
                        case "name":
                            TypeAdapter adapter4 = this.string_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter4;
                            }
                            str3 = (String) adapter4.read2(jsonReader);
                            break;
                        case "full_address":
                            TypeAdapter adapter5 = this.string_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter5;
                            }
                            str6 = (String) adapter5.read2(jsonReader);
                            break;
                        case "context":
                            TypeAdapter adapter6 = this.v6Context_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(AutoValue_V6Context.class);
                                this.v6Context_adapter = adapter6;
                            }
                            autoValue_V6Context = (AutoValue_V6Context) adapter6.read2(jsonReader);
                            break;
                        case "feature_type":
                            TypeAdapter adapter7 = this.string_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter7;
                            }
                            str2 = (String) adapter7.read2(jsonReader);
                            if (str2 == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null featureType");
                                return null;
                            }
                            break;
                            break;
                        case "mapbox_id":
                            TypeAdapter adapter8 = this.string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter8;
                            }
                            str = (String) adapter8.read2(jsonReader);
                            if (str == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null mapboxId");
                                return null;
                            }
                            break;
                            break;
                        case "match_code":
                            TypeAdapter adapter9 = this.v6MatchCode_adapter;
                            if (adapter9 == null) {
                                adapter9 = this.gson.getAdapter(AutoValue_V6MatchCode.class);
                                this.v6MatchCode_adapter = adapter9;
                            }
                            autoValue_V6MatchCode = (AutoValue_V6MatchCode) adapter9.read2(jsonReader);
                            break;
                        case "coordinates":
                            TypeAdapter adapter10 = this.v6Coordinates_adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(AutoValue_V6Coordinates.class);
                                this.v6Coordinates_adapter = adapter10;
                            }
                            autoValue_V6Coordinates = (AutoValue_V6Coordinates) adapter10.read2(jsonReader);
                            break;
                        default:
                            if (linkedHashMap == null) {
                                linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap = linkedHashMap2;
                            }
                            SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                            break;
                    }
                }
            }
            jsonReader.endObject();
            if (str == null) {
                strConcat = " mapboxId";
            } else {
                strConcat = "";
            }
            if (str2 == null) {
                strConcat = strConcat.concat(" featureType");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_V6Properties(linkedHashMap2, str, str2, str3, str4, str5, str6, autoValue_V6Context, autoValue_V6Coordinates, list, autoValue_V6MatchCode);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_V6Properties autoValue_V6Properties) throws IOException {
            AutoValue_V6Properties autoValue_V6Properties2 = autoValue_V6Properties;
            if (autoValue_V6Properties2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            Map map = autoValue_V6Properties2.unrecognized;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jsonWriter.name((String) entry.getKey());
                    JsonElement jsonElement = ((SerializableJsonElement) entry.getValue()).element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("mapbox_id");
            if (autoValue_V6Properties2.mapboxId == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_V6Properties2.mapboxId);
            }
            jsonWriter.name("feature_type");
            if (autoValue_V6Properties2.featureType == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_V6Properties2.featureType);
            }
            jsonWriter.name("name");
            if (autoValue_V6Properties2.name == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_V6Properties2.name);
            }
            jsonWriter.name("name_preferred");
            if (autoValue_V6Properties2.namePreferred == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_V6Properties2.namePreferred);
            }
            jsonWriter.name("place_formatted");
            if (autoValue_V6Properties2.placeFormatted == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_V6Properties2.placeFormatted);
            }
            jsonWriter.name("full_address");
            if (autoValue_V6Properties2.fullAddress == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_V6Properties2.fullAddress);
            }
            jsonWriter.name("context");
            if (autoValue_V6Properties2.context == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter7 = this.v6Context_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(AutoValue_V6Context.class);
                    this.v6Context_adapter = adapter7;
                }
                adapter7.write(jsonWriter, autoValue_V6Properties2.context);
            }
            jsonWriter.name("coordinates");
            if (autoValue_V6Properties2.coordinates == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter8 = this.v6Coordinates_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(AutoValue_V6Coordinates.class);
                    this.v6Coordinates_adapter = adapter8;
                }
                adapter8.write(jsonWriter, autoValue_V6Properties2.coordinates);
            }
            jsonWriter.name("bbox");
            if (autoValue_V6Properties2.bbox == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter9 = this.list__double_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Double.class));
                    this.list__double_adapter = adapter9;
                }
                adapter9.write(jsonWriter, autoValue_V6Properties2.bbox);
            }
            jsonWriter.name("match_code");
            if (autoValue_V6Properties2.matchCode == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter10 = this.v6MatchCode_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(AutoValue_V6MatchCode.class);
                    this.v6MatchCode_adapter = adapter10;
                }
                adapter10.write(jsonWriter, autoValue_V6Properties2.matchCode);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        Map map = this.unrecognized;
        int iHashCode = map == null ? 0 : map.hashCode();
        int iHashCode2 = this.mapboxId.hashCode();
        int iHashCode3 = this.featureType.hashCode();
        String str = this.name;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.namePreferred;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.placeFormatted;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fullAddress;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        AutoValue_V6Context autoValue_V6Context = this.context;
        int iHashCode8 = autoValue_V6Context == null ? 0 : autoValue_V6Context.hashCode();
        AutoValue_V6Coordinates autoValue_V6Coordinates = this.coordinates;
        int iHashCode9 = autoValue_V6Coordinates == null ? 0 : autoValue_V6Coordinates.hashCode();
        List list = this.bbox;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        AutoValue_V6MatchCode autoValue_V6MatchCode = this.matchCode;
        return ((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ (autoValue_V6MatchCode != null ? autoValue_V6MatchCode.hashCode() : 0);
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public AutoValue_V6Properties(LinkedHashMap linkedHashMap, String str, String str2, String str3, String str4, String str5, String str6, AutoValue_V6Context autoValue_V6Context, AutoValue_V6Coordinates autoValue_V6Coordinates, List list, AutoValue_V6MatchCode autoValue_V6MatchCode) {
        this.unrecognized = linkedHashMap;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null mapboxId");
            throw null;
        }
        this.mapboxId = str;
        if (str2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null featureType");
            throw null;
        }
        this.featureType = str2;
        this.name = str3;
        this.namePreferred = str4;
        this.placeFormatted = str5;
        this.fullAddress = str6;
        this.context = autoValue_V6Context;
        this.coordinates = autoValue_V6Coordinates;
        this.bbox = list;
        this.matchCode = autoValue_V6MatchCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_V6Properties)) {
            return false;
        }
        AutoValue_V6Properties autoValue_V6Properties = (AutoValue_V6Properties) obj;
        Map map = this.unrecognized;
        if (map == null) {
            if (autoValue_V6Properties.unrecognized != null) {
                return false;
            }
        } else if (!map.equals(autoValue_V6Properties.unrecognized)) {
            return false;
        }
        if (!this.mapboxId.equals(autoValue_V6Properties.mapboxId) || !this.featureType.equals(autoValue_V6Properties.featureType)) {
            return false;
        }
        String str = autoValue_V6Properties.name;
        String str2 = this.name;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = autoValue_V6Properties.namePreferred;
        String str4 = this.namePreferred;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = autoValue_V6Properties.placeFormatted;
        String str6 = this.placeFormatted;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        String str7 = autoValue_V6Properties.fullAddress;
        String str8 = this.fullAddress;
        if (str8 == null) {
            if (str7 != null) {
                return false;
            }
        } else if (!str8.equals(str7)) {
            return false;
        }
        AutoValue_V6Context autoValue_V6Context = autoValue_V6Properties.context;
        AutoValue_V6Context autoValue_V6Context2 = this.context;
        if (autoValue_V6Context2 == null) {
            if (autoValue_V6Context != null) {
                return false;
            }
        } else if (!autoValue_V6Context2.equals(autoValue_V6Context)) {
            return false;
        }
        AutoValue_V6Coordinates autoValue_V6Coordinates = autoValue_V6Properties.coordinates;
        AutoValue_V6Coordinates autoValue_V6Coordinates2 = this.coordinates;
        if (autoValue_V6Coordinates2 == null) {
            if (autoValue_V6Coordinates != null) {
                return false;
            }
        } else if (!autoValue_V6Coordinates2.equals(autoValue_V6Coordinates)) {
            return false;
        }
        List list = autoValue_V6Properties.bbox;
        List list2 = this.bbox;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        AutoValue_V6MatchCode autoValue_V6MatchCode = autoValue_V6Properties.matchCode;
        AutoValue_V6MatchCode autoValue_V6MatchCode2 = this.matchCode;
        if (autoValue_V6MatchCode2 == null) {
            if (autoValue_V6MatchCode != null) {
                return false;
            }
        } else if (!autoValue_V6MatchCode2.equals(autoValue_V6MatchCode)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "V6Properties{unrecognized=" + this.unrecognized + ", mapboxId=" + this.mapboxId + ", featureType=" + this.featureType + ", name=" + this.name + ", namePreferred=" + this.namePreferred + ", placeFormatted=" + this.placeFormatted + ", fullAddress=" + this.fullAddress + ", context=" + this.context + ", coordinates=" + this.coordinates + ", bbox=" + this.bbox + ", matchCode=" + this.matchCode + "}";
    }
}
