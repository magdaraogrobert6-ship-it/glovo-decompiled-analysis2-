package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import com.mapbox.common.MapboxServices;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_BannerComponents extends C$AutoValue_BannerComponents {

    public static final class GsonTypeAdapter extends TypeAdapter<BannerComponents> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<MapboxShield> mapboxShield_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(BannerComponents)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BannerComponents bannerComponents) throws IOException {
            if (bannerComponents == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (bannerComponents.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : bannerComponents.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("text");
            if (bannerComponents.text() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, bannerComponents.text());
            }
            jsonWriter.name("type");
            if (bannerComponents.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, bannerComponents.type());
            }
            jsonWriter.name("subType");
            if (bannerComponents.subType() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, bannerComponents.subType());
            }
            jsonWriter.name("abbr");
            if (bannerComponents.abbreviation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, bannerComponents.abbreviation());
            }
            jsonWriter.name("abbr_priority");
            if (bannerComponents.abbreviationPriority() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter5 = this.integer_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter5;
                }
                adapter5.write(jsonWriter, bannerComponents.abbreviationPriority());
            }
            jsonWriter.name("imageBaseURL");
            if (bannerComponents.imageBaseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, bannerComponents.imageBaseUrl());
            }
            jsonWriter.name("mapbox_shield");
            if (bannerComponents.mapboxShield() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<MapboxShield> adapter7 = this.mapboxShield_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(MapboxShield.class);
                    this.mapboxShield_adapter = adapter7;
                }
                adapter7.write(jsonWriter, bannerComponents.mapboxShield());
            }
            jsonWriter.name("imageURL");
            if (bannerComponents.imageUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, bannerComponents.imageUrl());
            }
            jsonWriter.name(MapboxServices.DIRECTIONS);
            if (bannerComponents.directions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter9 = this.list__string_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter9;
                }
                adapter9.write(jsonWriter, bannerComponents.directions());
            }
            jsonWriter.name("active");
            if (bannerComponents.active() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter10 = this.boolean__adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter10;
                }
                adapter10.write(jsonWriter, bannerComponents.active());
            }
            jsonWriter.name("active_direction");
            if (bannerComponents.activeDirection() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter11 = this.string_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter11;
                }
                adapter11.write(jsonWriter, bannerComponents.activeDirection());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:39:0x008a  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public BannerComponents read2(JsonReader jsonReader) throws IOException {
            String strConcat;
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
            Integer num = null;
            String str5 = null;
            MapboxShield mapboxShield = null;
            String str6 = null;
            List<String> list = null;
            Boolean bool = null;
            String str7 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "mapbox_shield":
                            b = 0;
                            break;
                        case "imageURL":
                            b = 1;
                            break;
                        case "abbr_priority":
                            b = 2;
                            break;
                        case "abbr":
                            b = 3;
                            break;
                        case "imageBaseURL":
                            b = 4;
                            break;
                        case "active_direction":
                            b = 5;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        TypeAdapter<MapboxShield> adapter = this.mapboxShield_adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(MapboxShield.class);
                            this.mapboxShield_adapter = adapter;
                        }
                        mapboxShield = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<String> adapter2 = this.string_adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter2;
                        }
                        str6 = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<Integer> adapter3 = this.integer_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter3;
                        }
                        num = adapter3.read2(jsonReader);
                    } else if (b == 3) {
                        TypeAdapter<String> adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str4 = adapter4.read2(jsonReader);
                    } else if (b == 4) {
                        TypeAdapter<String> adapter5 = this.string_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter5;
                        }
                        str5 = adapter5.read2(jsonReader);
                    } else if (b != 5) {
                        if ("text".equals(strNextName)) {
                            TypeAdapter<String> adapter6 = this.string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter6;
                            }
                            str = adapter6.read2(jsonReader);
                        } else if ("type".equals(strNextName)) {
                            TypeAdapter<String> adapter7 = this.string_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter7;
                            }
                            str2 = adapter7.read2(jsonReader);
                        } else if ("subType".equals(strNextName)) {
                            TypeAdapter<String> adapter8 = this.string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter8;
                            }
                            str3 = adapter8.read2(jsonReader);
                        } else if (MapboxServices.DIRECTIONS.equals(strNextName)) {
                            TypeAdapter<List<String>> adapter9 = this.list__string_adapter;
                            if (adapter9 == null) {
                                adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter9;
                            }
                            list = adapter9.read2(jsonReader);
                        } else if ("active".equals(strNextName)) {
                            TypeAdapter<Boolean> adapter10 = this.boolean__adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter10;
                            }
                            bool = adapter10.read2(jsonReader);
                        } else {
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                        }
                    } else {
                        TypeAdapter<String> adapter11 = this.string_adapter;
                        if (adapter11 == null) {
                            adapter11 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter11;
                        }
                        str7 = adapter11.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            if (str == null) {
                strConcat = " text";
            } else {
                strConcat = "";
            }
            if (str2 == null) {
                strConcat = strConcat.concat(" type");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_BannerComponents(linkedHashMap, str, str2, str3, str4, num, str5, mapboxShield, str6, list, bool, str7);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_BannerComponents(final Map<String, SerializableJsonElement> map, final String str, final String str2, final String str3, final String str4, final Integer num, final String str5, final MapboxShield mapboxShield, final String str6, final List<String> list, final Boolean bool, final String str7) {
        new BannerComponents(map, str, str2, str3, str4, num, str5, mapboxShield, str6, list, bool, str7) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_BannerComponents
            private final String abbreviation;
            private final Integer abbreviationPriority;
            private final Boolean active;
            private final String activeDirection;
            private final List<String> directions;
            private final String imageBaseUrl;
            private final String imageUrl;
            private final MapboxShield mapboxShield;
            private final String subType;
            private final String text;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("abbr")
            public String abbreviation() {
                return this.abbreviation;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("abbr_priority")
            public Integer abbreviationPriority() {
                return this.abbreviationPriority;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            public Boolean active() {
                return this.active;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("active_direction")
            public String activeDirection() {
                return this.activeDirection;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            public List<String> directions() {
                return this.directions;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("imageBaseURL")
            public String imageBaseUrl() {
                return this.imageBaseUrl;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("imageURL")
            public String imageUrl() {
                return this.imageUrl;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @SerializedName("mapbox_shield")
            public MapboxShield mapboxShield() {
                return this.mapboxShield;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @BannerComponents.BannerComponentsSubType
            public String subType() {
                return this.subType;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            public String text() {
                return this.text;
            }

            @Override // com.mapbox.api.directions.v5.models.BannerComponents
            @BannerComponents.BannerComponentsType
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null text");
                    throw null;
                }
                this.text = str;
                if (str2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                    throw null;
                }
                this.type = str2;
                this.subType = str3;
                this.abbreviation = str4;
                this.abbreviationPriority = num;
                this.imageBaseUrl = str5;
                this.mapboxShield = mapboxShield;
                this.imageUrl = str6;
                this.directions = list;
                this.active = bool;
                this.activeDirection = str7;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BannerComponents)) {
                    return false;
                }
                BannerComponents bannerComponents = (BannerComponents) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (bannerComponents.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(bannerComponents.unrecognized())) {
                    return false;
                }
                if (!this.text.equals(bannerComponents.text()) || !this.type.equals(bannerComponents.type())) {
                    return false;
                }
                String str8 = this.subType;
                if (str8 == null) {
                    if (bannerComponents.subType() != null) {
                        return false;
                    }
                } else if (!str8.equals(bannerComponents.subType())) {
                    return false;
                }
                String str9 = this.abbreviation;
                if (str9 == null) {
                    if (bannerComponents.abbreviation() != null) {
                        return false;
                    }
                } else if (!str9.equals(bannerComponents.abbreviation())) {
                    return false;
                }
                Integer num2 = this.abbreviationPriority;
                if (num2 == null) {
                    if (bannerComponents.abbreviationPriority() != null) {
                        return false;
                    }
                } else if (!num2.equals(bannerComponents.abbreviationPriority())) {
                    return false;
                }
                String str10 = this.imageBaseUrl;
                if (str10 == null) {
                    if (bannerComponents.imageBaseUrl() != null) {
                        return false;
                    }
                } else if (!str10.equals(bannerComponents.imageBaseUrl())) {
                    return false;
                }
                MapboxShield mapboxShield2 = this.mapboxShield;
                if (mapboxShield2 == null) {
                    if (bannerComponents.mapboxShield() != null) {
                        return false;
                    }
                } else if (!mapboxShield2.equals(bannerComponents.mapboxShield())) {
                    return false;
                }
                String str11 = this.imageUrl;
                if (str11 == null) {
                    if (bannerComponents.imageUrl() != null) {
                        return false;
                    }
                } else if (!str11.equals(bannerComponents.imageUrl())) {
                    return false;
                }
                List<String> list2 = this.directions;
                if (list2 == null) {
                    if (bannerComponents.directions() != null) {
                        return false;
                    }
                } else if (!list2.equals(bannerComponents.directions())) {
                    return false;
                }
                Boolean bool2 = this.active;
                if (bool2 == null) {
                    if (bannerComponents.active() != null) {
                        return false;
                    }
                } else if (!bool2.equals(bannerComponents.active())) {
                    return false;
                }
                String str12 = this.activeDirection;
                if (str12 == null) {
                    if (bannerComponents.activeDirection() != null) {
                        return false;
                    }
                } else if (!str12.equals(bannerComponents.activeDirection())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("BannerComponents{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", text=");
                sb.append(this.text);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", subType=");
                sb.append(this.subType);
                sb.append(", abbreviation=");
                sb.append(this.abbreviation);
                sb.append(", abbreviationPriority=");
                sb.append(this.abbreviationPriority);
                sb.append(", imageBaseUrl=");
                sb.append(this.imageBaseUrl);
                sb.append(", mapboxShield=");
                sb.append(this.mapboxShield);
                sb.append(", imageUrl=");
                sb.append(this.imageUrl);
                sb.append(", directions=");
                sb.append(this.directions);
                sb.append(", active=");
                sb.append(this.active);
                sb.append(", activeDirection=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.activeDirection, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.text.hashCode();
                int iHashCode3 = this.type.hashCode();
                String str8 = this.subType;
                int iHashCode4 = str8 == null ? 0 : str8.hashCode();
                String str9 = this.abbreviation;
                int iHashCode5 = str9 == null ? 0 : str9.hashCode();
                Integer num2 = this.abbreviationPriority;
                int iHashCode6 = num2 == null ? 0 : num2.hashCode();
                String str10 = this.imageBaseUrl;
                int iHashCode7 = str10 == null ? 0 : str10.hashCode();
                MapboxShield mapboxShield2 = this.mapboxShield;
                int iHashCode8 = mapboxShield2 == null ? 0 : mapboxShield2.hashCode();
                String str11 = this.imageUrl;
                int iHashCode9 = str11 == null ? 0 : str11.hashCode();
                List<String> list2 = this.directions;
                int iHashCode10 = list2 == null ? 0 : list2.hashCode();
                Boolean bool2 = this.active;
                int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
                String str12 = this.activeDirection;
                return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ (str12 != null ? str12.hashCode() : 0);
            }
        };
    }
}
