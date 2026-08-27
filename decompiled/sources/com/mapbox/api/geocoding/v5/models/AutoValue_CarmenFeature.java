package com.mapbox.api.geocoding.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryAdapterFactory;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_CarmenFeature implements GeoJson {
    public final String address;
    public final BoundingBox bbox;
    public final List context;
    public final Geometry geometry;
    public final String id;
    public final String language;
    public final String matchingPlaceName;
    public final String matchingText;
    public final String placeName;
    public final List placeType;
    public final JsonObject properties;
    public final double[] rawCenter;
    public final Double relevance;
    public final AutoValue_RoutablePoints routablePoints;
    public final String text;
    public final String type;

    final class GsonTypeAdapter extends TypeAdapter<AutoValue_CarmenFeature> {
        public volatile TypeAdapter array__double_adapter;
        public volatile TypeAdapter boundingBox_adapter;
        public volatile TypeAdapter double__adapter;
        public volatile TypeAdapter geometry_adapter;
        public final Gson gson;
        public volatile TypeAdapter jsonObject_adapter;
        public volatile TypeAdapter list__carmenContext_adapter;
        public volatile TypeAdapter list__string_adapter;
        public volatile TypeAdapter routablePoints_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(CarmenFeature)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final AutoValue_CarmenFeature read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            JsonObject jsonObject = new JsonObject();
            String str = "Feature";
            BoundingBox boundingBox = null;
            String str2 = null;
            Geometry geometry = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            String str5 = null;
            double[] dArr = null;
            List list2 = null;
            Double d = null;
            String str6 = null;
            String str7 = null;
            AutoValue_RoutablePoints autoValue_RoutablePoints = null;
            String str8 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "center":
                            TypeAdapter adapter = this.array__double_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(double[].class);
                                this.array__double_adapter = adapter;
                            }
                            dArr = (double[]) adapter.read2(jsonReader);
                            break;
                        case "matching_text":
                            TypeAdapter adapter2 = this.string_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter2;
                            }
                            str6 = (String) adapter2.read2(jsonReader);
                            break;
                        case "matching_place_name":
                            TypeAdapter adapter3 = this.string_adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter3;
                            }
                            str7 = (String) adapter3.read2(jsonReader);
                            break;
                        case "place_name":
                            TypeAdapter adapter4 = this.string_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter4;
                            }
                            str4 = (String) adapter4.read2(jsonReader);
                            break;
                        case "place_type":
                            TypeAdapter adapter5 = this.list__string_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter5;
                            }
                            list = (List) adapter5.read2(jsonReader);
                            break;
                        case "type":
                            TypeAdapter adapter6 = this.string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter6;
                            }
                            String str9 = (String) adapter6.read2(jsonReader);
                            if (str9 == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                                return null;
                            }
                            str = str9;
                            break;
                            break;
                        case "routable_points":
                            TypeAdapter adapter7 = this.routablePoints_adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(AutoValue_RoutablePoints.class);
                                this.routablePoints_adapter = adapter7;
                            }
                            autoValue_RoutablePoints = (AutoValue_RoutablePoints) adapter7.read2(jsonReader);
                            break;
                        default:
                            if ("bbox".equals(strNextName)) {
                                TypeAdapter adapter8 = this.boundingBox_adapter;
                                if (adapter8 == null) {
                                    adapter8 = this.gson.getAdapter(BoundingBox.class);
                                    this.boundingBox_adapter = adapter8;
                                }
                                boundingBox = (BoundingBox) adapter8.read2(jsonReader);
                                break;
                            } else {
                                if ("id".equals(strNextName)) {
                                    TypeAdapter adapter9 = this.string_adapter;
                                    if (adapter9 == null) {
                                        adapter9 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter9;
                                    }
                                    str2 = (String) adapter9.read2(jsonReader);
                                } else if ("geometry".equals(strNextName)) {
                                    TypeAdapter adapter10 = this.geometry_adapter;
                                    if (adapter10 == null) {
                                        adapter10 = this.gson.getAdapter(Geometry.class);
                                        this.geometry_adapter = adapter10;
                                    }
                                    geometry = (Geometry) adapter10.read2(jsonReader);
                                } else if ("properties".equals(strNextName)) {
                                    TypeAdapter adapter11 = this.jsonObject_adapter;
                                    if (adapter11 == null) {
                                        adapter11 = this.gson.getAdapter(JsonObject.class);
                                        this.jsonObject_adapter = adapter11;
                                    }
                                    jsonObject = (JsonObject) adapter11.read2(jsonReader);
                                } else if ("text".equals(strNextName)) {
                                    TypeAdapter adapter12 = this.string_adapter;
                                    if (adapter12 == null) {
                                        adapter12 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter12;
                                    }
                                    str3 = (String) adapter12.read2(jsonReader);
                                } else if ("address".equals(strNextName)) {
                                    TypeAdapter adapter13 = this.string_adapter;
                                    if (adapter13 == null) {
                                        adapter13 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter13;
                                    }
                                    str5 = (String) adapter13.read2(jsonReader);
                                } else if ("context".equals(strNextName)) {
                                    TypeAdapter adapter14 = this.list__carmenContext_adapter;
                                    if (adapter14 == null) {
                                        adapter14 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_CarmenContext.class));
                                        this.list__carmenContext_adapter = adapter14;
                                    }
                                    list2 = (List) adapter14.read2(jsonReader);
                                } else if ("relevance".equals(strNextName)) {
                                    TypeAdapter adapter15 = this.double__adapter;
                                    if (adapter15 == null) {
                                        adapter15 = this.gson.getAdapter(Double.class);
                                        this.double__adapter = adapter15;
                                    }
                                    d = (Double) adapter15.read2(jsonReader);
                                } else if ("language".equals(strNextName)) {
                                    TypeAdapter adapter16 = this.string_adapter;
                                    if (adapter16 == null) {
                                        adapter16 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter16;
                                    }
                                    str8 = (String) adapter16.read2(jsonReader);
                                } else {
                                    jsonReader.skipValue();
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_CarmenFeature(str, boundingBox, str2, geometry, jsonObject, str3, str4, list, str5, dArr, list2, d, str6, str7, autoValue_RoutablePoints, str8);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, AutoValue_CarmenFeature autoValue_CarmenFeature) throws IOException {
            AutoValue_CarmenFeature autoValue_CarmenFeature2 = autoValue_CarmenFeature;
            if (autoValue_CarmenFeature2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("type");
            TypeAdapter adapter = this.string_adapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(String.class);
                this.string_adapter = adapter;
            }
            adapter.write(jsonWriter, autoValue_CarmenFeature2.type);
            jsonWriter.name("bbox");
            if (autoValue_CarmenFeature2.bbox == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter2 = this.boundingBox_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(BoundingBox.class);
                    this.boundingBox_adapter = adapter2;
                }
                adapter2.write(jsonWriter, autoValue_CarmenFeature2.bbox);
            }
            jsonWriter.name("id");
            if (autoValue_CarmenFeature2.id == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, autoValue_CarmenFeature2.id);
            }
            jsonWriter.name("geometry");
            if (autoValue_CarmenFeature2.geometry == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.geometry_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(Geometry.class);
                    this.geometry_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_CarmenFeature2.geometry);
            }
            jsonWriter.name("properties");
            if (autoValue_CarmenFeature2.properties == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter5 = this.jsonObject_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(JsonObject.class);
                    this.jsonObject_adapter = adapter5;
                }
                adapter5.write(jsonWriter, autoValue_CarmenFeature2.properties);
            }
            jsonWriter.name("text");
            if (autoValue_CarmenFeature2.text == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_CarmenFeature2.text);
            }
            jsonWriter.name("place_name");
            if (autoValue_CarmenFeature2.placeName == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter7 = this.string_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter7;
                }
                adapter7.write(jsonWriter, autoValue_CarmenFeature2.placeName);
            }
            jsonWriter.name("place_type");
            if (autoValue_CarmenFeature2.placeType == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter8 = this.list__string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, autoValue_CarmenFeature2.placeType);
            }
            jsonWriter.name("address");
            if (autoValue_CarmenFeature2.address == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter9 = this.string_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter9;
                }
                adapter9.write(jsonWriter, autoValue_CarmenFeature2.address);
            }
            jsonWriter.name("center");
            if (autoValue_CarmenFeature2.rawCenter == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter10 = this.array__double_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = adapter10;
                }
                adapter10.write(jsonWriter, autoValue_CarmenFeature2.rawCenter);
            }
            jsonWriter.name("context");
            if (autoValue_CarmenFeature2.context == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter11 = this.list__carmenContext_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(TypeToken.getParameterized(List.class, AutoValue_CarmenContext.class));
                    this.list__carmenContext_adapter = adapter11;
                }
                adapter11.write(jsonWriter, autoValue_CarmenFeature2.context);
            }
            jsonWriter.name("relevance");
            if (autoValue_CarmenFeature2.relevance == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter12 = this.double__adapter;
                if (adapter12 == null) {
                    adapter12 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter12;
                }
                adapter12.write(jsonWriter, autoValue_CarmenFeature2.relevance);
            }
            jsonWriter.name("matching_text");
            if (autoValue_CarmenFeature2.matchingText == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter13 = this.string_adapter;
                if (adapter13 == null) {
                    adapter13 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter13;
                }
                adapter13.write(jsonWriter, autoValue_CarmenFeature2.matchingText);
            }
            jsonWriter.name("matching_place_name");
            if (autoValue_CarmenFeature2.matchingPlaceName == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter14 = this.string_adapter;
                if (adapter14 == null) {
                    adapter14 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter14;
                }
                adapter14.write(jsonWriter, autoValue_CarmenFeature2.matchingPlaceName);
            }
            jsonWriter.name("routable_points");
            if (autoValue_CarmenFeature2.routablePoints == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter15 = this.routablePoints_adapter;
                if (adapter15 == null) {
                    adapter15 = this.gson.getAdapter(AutoValue_RoutablePoints.class);
                    this.routablePoints_adapter = adapter15;
                }
                adapter15.write(jsonWriter, autoValue_CarmenFeature2.routablePoints);
            }
            jsonWriter.name("language");
            if (autoValue_CarmenFeature2.language == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter16 = this.string_adapter;
                if (adapter16 == null) {
                    adapter16 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter16;
                }
                adapter16.write(jsonWriter, autoValue_CarmenFeature2.language);
            }
            jsonWriter.endObject();
        }
    }

    @Override // com.mapbox.geojson.GeoJson
    public final BoundingBox bbox() {
        return this.bbox;
    }

    @Override // com.mapbox.geojson.GeoJson
    public final String type() {
        return this.type;
    }

    public static TypeAdapter typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode();
        BoundingBox boundingBox = this.bbox;
        int iHashCode2 = boundingBox == null ? 0 : boundingBox.hashCode();
        String str = this.id;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Geometry geometry = this.geometry;
        int iHashCode4 = geometry == null ? 0 : geometry.hashCode();
        JsonObject jsonObject = this.properties;
        int iHashCode5 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str2 = this.text;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.placeName;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        List list = this.placeType;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        String str4 = this.address;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        int iHashCode10 = Arrays.hashCode(this.rawCenter);
        List list2 = this.context;
        int iHashCode11 = list2 == null ? 0 : list2.hashCode();
        Double d = this.relevance;
        int iHashCode12 = d == null ? 0 : d.hashCode();
        String str5 = this.matchingText;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.matchingPlaceName;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        AutoValue_RoutablePoints autoValue_RoutablePoints = this.routablePoints;
        int iHashCode15 = autoValue_RoutablePoints == null ? 0 : autoValue_RoutablePoints.hashCode();
        String str7 = this.language;
        return ((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ iHashCode15) * 1000003) ^ (str7 == null ? 0 : str7.hashCode());
    }

    public AutoValue_CarmenFeature(String str, BoundingBox boundingBox, String str2, Geometry geometry, JsonObject jsonObject, String str3, String str4, List list, String str5, double[] dArr, List list2, Double d, String str6, String str7, AutoValue_RoutablePoints autoValue_RoutablePoints, String str8) {
        this.type = str;
        this.bbox = boundingBox;
        this.id = str2;
        this.geometry = geometry;
        this.properties = jsonObject;
        this.text = str3;
        this.placeName = str4;
        this.placeType = list;
        this.address = str5;
        this.rawCenter = dArr;
        this.context = list2;
        this.relevance = d;
        this.matchingText = str6;
        this.matchingPlaceName = str7;
        this.routablePoints = autoValue_RoutablePoints;
        this.language = str8;
    }

    public final boolean equals(Object obj) {
        double[] dArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_CarmenFeature)) {
            return false;
        }
        AutoValue_CarmenFeature autoValue_CarmenFeature = (AutoValue_CarmenFeature) obj;
        if (!this.type.equals(autoValue_CarmenFeature.type)) {
            return false;
        }
        BoundingBox boundingBox = autoValue_CarmenFeature.bbox;
        BoundingBox boundingBox2 = this.bbox;
        if (boundingBox2 == null) {
            if (boundingBox != null) {
                return false;
            }
        } else if (!boundingBox2.equals(boundingBox)) {
            return false;
        }
        String str = autoValue_CarmenFeature.id;
        String str2 = this.id;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        Geometry geometry = autoValue_CarmenFeature.geometry;
        Geometry geometry2 = this.geometry;
        if (geometry2 == null) {
            if (geometry != null) {
                return false;
            }
        } else if (!geometry2.equals(geometry)) {
            return false;
        }
        JsonObject jsonObject = autoValue_CarmenFeature.properties;
        JsonObject jsonObject2 = this.properties;
        if (jsonObject2 == null) {
            if (jsonObject != null) {
                return false;
            }
        } else if (!jsonObject2.equals(jsonObject)) {
            return false;
        }
        String str3 = autoValue_CarmenFeature.text;
        String str4 = this.text;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = autoValue_CarmenFeature.placeName;
        String str6 = this.placeName;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        List list = autoValue_CarmenFeature.placeType;
        List list2 = this.placeType;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        String str7 = autoValue_CarmenFeature.address;
        String str8 = this.address;
        if (str8 == null) {
            if (str7 != null) {
                return false;
            }
        } else if (!str8.equals(str7)) {
            return false;
        }
        if (autoValue_CarmenFeature instanceof AutoValue_CarmenFeature) {
            dArr = autoValue_CarmenFeature.rawCenter;
        } else {
            dArr = autoValue_CarmenFeature.rawCenter;
        }
        if (!Arrays.equals(this.rawCenter, dArr)) {
            return false;
        }
        List list3 = autoValue_CarmenFeature.context;
        List list4 = this.context;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Double d = autoValue_CarmenFeature.relevance;
        Double d2 = this.relevance;
        if (d2 == null) {
            if (d != null) {
                return false;
            }
        } else if (!d2.equals(d)) {
            return false;
        }
        String str9 = autoValue_CarmenFeature.matchingText;
        String str10 = this.matchingText;
        if (str10 == null) {
            if (str9 != null) {
                return false;
            }
        } else if (!str10.equals(str9)) {
            return false;
        }
        String str11 = autoValue_CarmenFeature.matchingPlaceName;
        String str12 = this.matchingPlaceName;
        if (str12 == null) {
            if (str11 != null) {
                return false;
            }
        } else if (!str12.equals(str11)) {
            return false;
        }
        AutoValue_RoutablePoints autoValue_RoutablePoints = autoValue_CarmenFeature.routablePoints;
        AutoValue_RoutablePoints autoValue_RoutablePoints2 = this.routablePoints;
        if (autoValue_RoutablePoints2 == null) {
            if (autoValue_RoutablePoints != null) {
                return false;
            }
        } else if (!autoValue_RoutablePoints2.equals(autoValue_RoutablePoints)) {
            return false;
        }
        String str13 = autoValue_CarmenFeature.language;
        String str14 = this.language;
        if (str14 == null) {
            return str13 == null;
        }
        return str14.equals(str13);
    }

    @Override // com.mapbox.geojson.GeoJson
    public final String toJson() {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(GeometryAdapterFactory.create()).registerTypeAdapter(BoundingBox.class, new BoundingBoxTypeAdapter()).registerTypeAdapterFactory(new AutoValueGson_GeocodingAdapterFactory()).create();
        JsonObject jsonObject = this.properties;
        return gsonCreate.toJson((jsonObject == null || jsonObject.size() != 0) ? this : new AutoValue_CarmenFeature(this.type, this.bbox, this.id, this.geometry, null, this.text, this.placeName, this.placeType, this.address, this.rawCenter, this.context, this.relevance, this.matchingText, this.matchingPlaceName, this.routablePoints, this.language), AutoValue_CarmenFeature.class);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarmenFeature{type=");
        sb.append(this.type);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", geometry=");
        sb.append(this.geometry);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", placeName=");
        sb.append(this.placeName);
        sb.append(", placeType=");
        sb.append(this.placeType);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", rawCenter=");
        sb.append(Arrays.toString(this.rawCenter));
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", relevance=");
        sb.append(this.relevance);
        sb.append(", matchingText=");
        sb.append(this.matchingText);
        sb.append(", matchingPlaceName=");
        sb.append(this.matchingPlaceName);
        sb.append(", routablePoints=");
        sb.append(this.routablePoints);
        sb.append(", language=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.language, "}");
    }
}
