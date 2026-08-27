package com.mapbox.api.matching.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_MapMatchingMatching extends MapMatchingMatching {
    public final double confidence;
    public final double distance;
    public final double duration;
    public final String geometry;
    public final List legs;
    public final String requestUuid;
    public final String routeIndex;
    public final RouteOptions routeOptions;
    public final String voiceLanguage;
    public final double weight;
    public final String weightName;

    final class GsonTypeAdapter extends TypeAdapter<MapMatchingMatching> {
        public volatile TypeAdapter double__adapter;
        public final Gson gson;
        public volatile TypeAdapter list__routeLeg_adapter;
        public volatile TypeAdapter routeOptions_adapter;
        public volatile TypeAdapter string_adapter;

        public final String toString() {
            return "TypeAdapter(MapMatchingMatching)";
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final MapMatchingMatching read2(JsonReader jsonReader) throws IOException {
            String strConcat;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Double d4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            RouteOptions routeOptions = null;
            String str4 = null;
            String str5 = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    if (!strNextName.equals("voiceLocale")) {
                        if (!strNextName.equals("weight_name")) {
                            if ("routeIndex".equals(strNextName)) {
                                TypeAdapter adapter = this.string_adapter;
                                if (adapter == null) {
                                    adapter = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter;
                                }
                                str = (String) adapter.read2(jsonReader);
                            } else if ("distance".equals(strNextName)) {
                                TypeAdapter adapter2 = this.double__adapter;
                                if (adapter2 == null) {
                                    adapter2 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter2;
                                }
                                d = (Double) adapter2.read2(jsonReader);
                                d.getClass();
                            } else if (InAppMessageBase.DURATION.equals(strNextName)) {
                                TypeAdapter adapter3 = this.double__adapter;
                                if (adapter3 == null) {
                                    adapter3 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter3;
                                }
                                d2 = (Double) adapter3.read2(jsonReader);
                                d2.getClass();
                            } else if ("geometry".equals(strNextName)) {
                                TypeAdapter adapter4 = this.string_adapter;
                                if (adapter4 == null) {
                                    adapter4 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter4;
                                }
                                str2 = (String) adapter4.read2(jsonReader);
                            } else if ("weight".equals(strNextName)) {
                                TypeAdapter adapter5 = this.double__adapter;
                                if (adapter5 == null) {
                                    adapter5 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter5;
                                }
                                d3 = (Double) adapter5.read2(jsonReader);
                                d3.getClass();
                            } else if ("legs".equals(strNextName)) {
                                TypeAdapter adapter6 = this.list__routeLeg_adapter;
                                if (adapter6 == null) {
                                    adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                                    this.list__routeLeg_adapter = adapter6;
                                }
                                list = (List) adapter6.read2(jsonReader);
                                if (list == null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null legs");
                                    return null;
                                }
                            } else if ("confidence".equals(strNextName)) {
                                TypeAdapter adapter7 = this.double__adapter;
                                if (adapter7 == null) {
                                    adapter7 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter7;
                                }
                                d4 = (Double) adapter7.read2(jsonReader);
                                d4.getClass();
                            } else if ("routeOptions".equals(strNextName)) {
                                TypeAdapter adapter8 = this.routeOptions_adapter;
                                if (adapter8 == null) {
                                    adapter8 = this.gson.getAdapter(RouteOptions.class);
                                    this.routeOptions_adapter = adapter8;
                                }
                                routeOptions = (RouteOptions) adapter8.read2(jsonReader);
                            } else if ("requestUuid".equals(strNextName)) {
                                TypeAdapter adapter9 = this.string_adapter;
                                if (adapter9 == null) {
                                    adapter9 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter9;
                                }
                                str5 = (String) adapter9.read2(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            TypeAdapter adapter10 = this.string_adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter10;
                            }
                            str3 = (String) adapter10.read2(jsonReader);
                            if (str3 == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null weightName");
                                return null;
                            }
                        }
                    } else {
                        TypeAdapter adapter11 = this.string_adapter;
                        if (adapter11 == null) {
                            adapter11 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter11;
                        }
                        str4 = (String) adapter11.read2(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            if (d == null) {
                strConcat = " distance";
            } else {
                strConcat = "";
            }
            if (d2 == null) {
                strConcat = strConcat.concat(" duration");
            }
            if (d3 == null) {
                strConcat = strConcat.concat(" weight");
            }
            if (str3 == null) {
                strConcat = strConcat.concat(" weightName");
            }
            if (list == null) {
                strConcat = strConcat.concat(" legs");
            }
            if (d4 == null) {
                strConcat = strConcat.concat(" confidence");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_MapMatchingMatching(str, d.doubleValue(), d2.doubleValue(), str2, d3.doubleValue(), str3, list, d4.doubleValue(), routeOptions, str4, str5);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, MapMatchingMatching mapMatchingMatching) throws IOException {
            MapMatchingMatching mapMatchingMatching2 = mapMatchingMatching;
            if (mapMatchingMatching2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("routeIndex");
            AutoValue_MapMatchingMatching autoValue_MapMatchingMatching = (AutoValue_MapMatchingMatching) mapMatchingMatching2;
            if (autoValue_MapMatchingMatching.routeIndex == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, autoValue_MapMatchingMatching.routeIndex);
            }
            jsonWriter.name("distance");
            TypeAdapter adapter2 = this.double__adapter;
            if (adapter2 == null) {
                adapter2 = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter2;
            }
            adapter2.write(jsonWriter, Double.valueOf(autoValue_MapMatchingMatching.distance));
            jsonWriter.name(InAppMessageBase.DURATION);
            TypeAdapter adapter3 = this.double__adapter;
            if (adapter3 == null) {
                adapter3 = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter3;
            }
            adapter3.write(jsonWriter, Double.valueOf(autoValue_MapMatchingMatching.duration));
            jsonWriter.name("geometry");
            if (autoValue_MapMatchingMatching.geometry == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, autoValue_MapMatchingMatching.geometry);
            }
            jsonWriter.name("weight");
            TypeAdapter adapter5 = this.double__adapter;
            if (adapter5 == null) {
                adapter5 = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter5;
            }
            adapter5.write(jsonWriter, Double.valueOf(autoValue_MapMatchingMatching.weight));
            jsonWriter.name("weight_name");
            if (autoValue_MapMatchingMatching.weightName == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, autoValue_MapMatchingMatching.weightName);
            }
            jsonWriter.name("legs");
            if (autoValue_MapMatchingMatching.legs == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter7 = this.list__routeLeg_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, RouteLeg.class));
                    this.list__routeLeg_adapter = adapter7;
                }
                adapter7.write(jsonWriter, autoValue_MapMatchingMatching.legs);
            }
            jsonWriter.name("confidence");
            TypeAdapter adapter8 = this.double__adapter;
            if (adapter8 == null) {
                adapter8 = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter8;
            }
            adapter8.write(jsonWriter, Double.valueOf(autoValue_MapMatchingMatching.confidence));
            jsonWriter.name("routeOptions");
            if (autoValue_MapMatchingMatching.routeOptions == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter9 = this.routeOptions_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(RouteOptions.class);
                    this.routeOptions_adapter = adapter9;
                }
                adapter9.write(jsonWriter, autoValue_MapMatchingMatching.routeOptions);
            }
            jsonWriter.name("voiceLocale");
            if (autoValue_MapMatchingMatching.voiceLanguage == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter10 = this.string_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter10;
                }
                adapter10.write(jsonWriter, autoValue_MapMatchingMatching.voiceLanguage);
            }
            jsonWriter.name("requestUuid");
            if (autoValue_MapMatchingMatching.requestUuid == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter adapter11 = this.string_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter11;
                }
                adapter11.write(jsonWriter, autoValue_MapMatchingMatching.requestUuid);
            }
            jsonWriter.endObject();
        }
    }

    public final int hashCode() {
        String str = this.routeIndex;
        int iHashCode = str == null ? 0 : str.hashCode();
        double d = this.distance;
        int iDoubleToLongBits = (int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32));
        double d2 = this.duration;
        int iDoubleToLongBits2 = (int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32));
        String str2 = this.geometry;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        double d3 = this.weight;
        int iDoubleToLongBits3 = (int) (Double.doubleToLongBits(d3) ^ (Double.doubleToLongBits(d3) >>> 32));
        int iHashCode3 = this.weightName.hashCode();
        int iHashCode4 = this.legs.hashCode();
        double d4 = this.confidence;
        int iDoubleToLongBits4 = (int) (Double.doubleToLongBits(d4) ^ (Double.doubleToLongBits(d4) >>> 32));
        RouteOptions routeOptions = this.routeOptions;
        int iHashCode5 = routeOptions == null ? 0 : routeOptions.hashCode();
        String str3 = this.voiceLanguage;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.requestUuid;
        return ((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iDoubleToLongBits) * 1000003) ^ iDoubleToLongBits2) * 1000003) ^ iHashCode2) * 1000003) ^ iDoubleToLongBits3) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iDoubleToLongBits4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    public AutoValue_MapMatchingMatching(String str, double d, double d2, String str2, double d3, String str3, List list, double d4, RouteOptions routeOptions, String str4, String str5) {
        this.routeIndex = str;
        this.distance = d;
        this.duration = d2;
        this.geometry = str2;
        this.weight = d3;
        if (str3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null weightName");
            throw null;
        }
        this.weightName = str3;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null legs");
            throw null;
        }
        this.legs = list;
        this.confidence = d4;
        this.routeOptions = routeOptions;
        this.voiceLanguage = str4;
        this.requestUuid = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapMatchingMatching)) {
            return false;
        }
        MapMatchingMatching mapMatchingMatching = (MapMatchingMatching) obj;
        String str = this.routeIndex;
        if (str == null) {
            if (((AutoValue_MapMatchingMatching) mapMatchingMatching).routeIndex != null) {
                return false;
            }
        } else if (!str.equals(((AutoValue_MapMatchingMatching) mapMatchingMatching).routeIndex)) {
            return false;
        }
        AutoValue_MapMatchingMatching autoValue_MapMatchingMatching = (AutoValue_MapMatchingMatching) mapMatchingMatching;
        if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(autoValue_MapMatchingMatching.distance) || Double.doubleToLongBits(this.duration) != Double.doubleToLongBits(autoValue_MapMatchingMatching.duration)) {
            return false;
        }
        String str2 = autoValue_MapMatchingMatching.geometry;
        String str3 = this.geometry;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(autoValue_MapMatchingMatching.weight) || !this.weightName.equals(autoValue_MapMatchingMatching.weightName) || !this.legs.equals(autoValue_MapMatchingMatching.legs) || Double.doubleToLongBits(this.confidence) != Double.doubleToLongBits(autoValue_MapMatchingMatching.confidence)) {
            return false;
        }
        RouteOptions routeOptions = autoValue_MapMatchingMatching.routeOptions;
        RouteOptions routeOptions2 = this.routeOptions;
        if (routeOptions2 == null) {
            if (routeOptions != null) {
                return false;
            }
        } else if (!routeOptions2.equals(routeOptions)) {
            return false;
        }
        String str4 = autoValue_MapMatchingMatching.voiceLanguage;
        String str5 = this.voiceLanguage;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        String str6 = autoValue_MapMatchingMatching.requestUuid;
        String str7 = this.requestUuid;
        if (str7 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str7.equals(str6)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapMatchingMatching{routeIndex=");
        sb.append(this.routeIndex);
        sb.append(", distance=");
        sb.append(this.distance);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", geometry=");
        sb.append(this.geometry);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", weightName=");
        sb.append(this.weightName);
        sb.append(", legs=");
        sb.append(this.legs);
        sb.append(", confidence=");
        sb.append(this.confidence);
        sb.append(", routeOptions=");
        sb.append(this.routeOptions);
        sb.append(", voiceLanguage=");
        sb.append(this.voiceLanguage);
        sb.append(", requestUuid=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.requestUuid, "}");
    }
}
