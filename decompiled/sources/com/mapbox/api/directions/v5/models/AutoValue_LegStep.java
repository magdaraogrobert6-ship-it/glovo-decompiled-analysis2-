package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageBase;
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
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_LegStep extends C$AutoValue_LegStep {

    public static final class GsonTypeAdapter extends TypeAdapter<LegStep> {
        private volatile TypeAdapter<Double> double___adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<List<BannerInstructions>> list__bannerInstructions_adapter;
        private volatile TypeAdapter<List<StepIntersection>> list__stepIntersection_adapter;
        private volatile TypeAdapter<List<VoiceInstructions>> list__voiceInstructions_adapter;
        private volatile TypeAdapter<StepManeuver> stepManeuver_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(LegStep)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, LegStep legStep) throws IOException {
            if (legStep == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (legStep.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : legStep.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("distance");
            TypeAdapter<Double> adapter = this.double__adapter;
            if (adapter == null) {
                adapter = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter;
            }
            adapter.write(jsonWriter, Double.valueOf(legStep.distance()));
            jsonWriter.name(InAppMessageBase.DURATION);
            TypeAdapter<Double> adapter2 = this.double__adapter;
            if (adapter2 == null) {
                adapter2 = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter2;
            }
            adapter2.write(jsonWriter, Double.valueOf(legStep.duration()));
            jsonWriter.name("duration_typical");
            if (legStep.durationTypical() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter3 = this.double___adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Double.class);
                    this.double___adapter = adapter3;
                }
                adapter3.write(jsonWriter, legStep.durationTypical());
            }
            jsonWriter.name("speedLimitUnit");
            if (legStep.speedLimitUnit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, legStep.speedLimitUnit());
            }
            jsonWriter.name("speedLimitSign");
            if (legStep.speedLimitSign() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, legStep.speedLimitSign());
            }
            jsonWriter.name("geometry");
            if (legStep.geometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, legStep.geometry());
            }
            jsonWriter.name("name");
            if (legStep.name() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter7 = this.string_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter7;
                }
                adapter7.write(jsonWriter, legStep.name());
            }
            jsonWriter.name("ref");
            if (legStep.ref() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, legStep.ref());
            }
            jsonWriter.name("destinations");
            if (legStep.destinations() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter9 = this.string_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter9;
                }
                adapter9.write(jsonWriter, legStep.destinations());
            }
            jsonWriter.name("mode");
            if (legStep.mode() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter10 = this.string_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter10;
                }
                adapter10.write(jsonWriter, legStep.mode());
            }
            jsonWriter.name("pronunciation");
            if (legStep.pronunciation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter11 = this.string_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter11;
                }
                adapter11.write(jsonWriter, legStep.pronunciation());
            }
            jsonWriter.name("rotary_name");
            if (legStep.rotaryName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter12 = this.string_adapter;
                if (adapter12 == null) {
                    adapter12 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter12;
                }
                adapter12.write(jsonWriter, legStep.rotaryName());
            }
            jsonWriter.name("rotary_pronunciation");
            if (legStep.rotaryPronunciation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter13 = this.string_adapter;
                if (adapter13 == null) {
                    adapter13 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter13;
                }
                adapter13.write(jsonWriter, legStep.rotaryPronunciation());
            }
            jsonWriter.name("maneuver");
            if (legStep.maneuver() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<StepManeuver> adapter14 = this.stepManeuver_adapter;
                if (adapter14 == null) {
                    adapter14 = this.gson.getAdapter(StepManeuver.class);
                    this.stepManeuver_adapter = adapter14;
                }
                adapter14.write(jsonWriter, legStep.maneuver());
            }
            jsonWriter.name("voiceInstructions");
            if (legStep.voiceInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<VoiceInstructions>> adapter15 = this.list__voiceInstructions_adapter;
                if (adapter15 == null) {
                    adapter15 = this.gson.getAdapter(TypeToken.getParameterized(List.class, VoiceInstructions.class));
                    this.list__voiceInstructions_adapter = adapter15;
                }
                adapter15.write(jsonWriter, legStep.voiceInstructions());
            }
            jsonWriter.name("bannerInstructions");
            if (legStep.bannerInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<BannerInstructions>> adapter16 = this.list__bannerInstructions_adapter;
                if (adapter16 == null) {
                    adapter16 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerInstructions.class));
                    this.list__bannerInstructions_adapter = adapter16;
                }
                adapter16.write(jsonWriter, legStep.bannerInstructions());
            }
            jsonWriter.name("driving_side");
            if (legStep.drivingSide() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter17 = this.string_adapter;
                if (adapter17 == null) {
                    adapter17 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter17;
                }
                adapter17.write(jsonWriter, legStep.drivingSide());
            }
            jsonWriter.name("weight");
            TypeAdapter<Double> adapter18 = this.double__adapter;
            if (adapter18 == null) {
                adapter18 = this.gson.getAdapter(Double.class);
                this.double__adapter = adapter18;
            }
            adapter18.write(jsonWriter, Double.valueOf(legStep.weight()));
            jsonWriter.name("intersections");
            if (legStep.intersections() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<StepIntersection>> adapter19 = this.list__stepIntersection_adapter;
                if (adapter19 == null) {
                    adapter19 = this.gson.getAdapter(TypeToken.getParameterized(List.class, StepIntersection.class));
                    this.list__stepIntersection_adapter = adapter19;
                }
                adapter19.write(jsonWriter, legStep.intersections());
            }
            jsonWriter.name("exits");
            if (legStep.exits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter20 = this.string_adapter;
                if (adapter20 == null) {
                    adapter20 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter20;
                }
                adapter20.write(jsonWriter, legStep.exits());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:32:0x008f  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public LegStep read2(JsonReader jsonReader) throws IOException {
            String strConcat;
            byte b;
            String str;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            Double d = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            StepManeuver stepManeuver = null;
            List<VoiceInstructions> list = null;
            List<BannerInstructions> list2 = null;
            String str12 = null;
            List<StepIntersection> list3 = null;
            String str13 = null;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = 0.0d;
            double dDoubleValue3 = 0.0d;
            boolean z = true;
            boolean z2 = true;
            boolean z3 = true;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "rotary_pronunciation":
                            b = 0;
                            break;
                        case "duration_typical":
                            b = 1;
                            break;
                        case "driving_side":
                            b = 2;
                            break;
                        case "rotary_name":
                            b = 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b != 0) {
                        str = str3;
                        if (b == 1) {
                            TypeAdapter<Double> adapter = this.double___adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(Double.class);
                                this.double___adapter = adapter;
                            }
                            d = adapter.read2(jsonReader);
                        } else if (b == 2) {
                            TypeAdapter<String> adapter2 = this.string_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter2;
                            }
                            str12 = adapter2.read2(jsonReader);
                        } else if (b != 3) {
                            if ("distance".equals(strNextName)) {
                                TypeAdapter<Double> adapter3 = this.double__adapter;
                                if (adapter3 == null) {
                                    adapter3 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter3;
                                }
                                dDoubleValue = adapter3.read2(jsonReader).doubleValue();
                                z = false;
                            } else if (InAppMessageBase.DURATION.equals(strNextName)) {
                                TypeAdapter<Double> adapter4 = this.double__adapter;
                                if (adapter4 == null) {
                                    adapter4 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter4;
                                }
                                dDoubleValue2 = adapter4.read2(jsonReader).doubleValue();
                                z2 = false;
                            } else if ("speedLimitUnit".equals(strNextName)) {
                                TypeAdapter<String> adapter5 = this.string_adapter;
                                if (adapter5 == null) {
                                    adapter5 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter5;
                                }
                                str2 = adapter5.read2(jsonReader);
                            } else if ("speedLimitSign".equals(strNextName)) {
                                TypeAdapter<String> adapter6 = this.string_adapter;
                                if (adapter6 == null) {
                                    adapter6 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter6;
                                }
                                str3 = adapter6.read2(jsonReader);
                            } else if ("geometry".equals(strNextName)) {
                                TypeAdapter<String> adapter7 = this.string_adapter;
                                if (adapter7 == null) {
                                    adapter7 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter7;
                                }
                                str4 = adapter7.read2(jsonReader);
                            } else if ("name".equals(strNextName)) {
                                TypeAdapter<String> adapter8 = this.string_adapter;
                                if (adapter8 == null) {
                                    adapter8 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter8;
                                }
                                str5 = adapter8.read2(jsonReader);
                            } else if ("ref".equals(strNextName)) {
                                TypeAdapter<String> adapter9 = this.string_adapter;
                                if (adapter9 == null) {
                                    adapter9 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter9;
                                }
                                str6 = adapter9.read2(jsonReader);
                            } else if ("destinations".equals(strNextName)) {
                                TypeAdapter<String> adapter10 = this.string_adapter;
                                if (adapter10 == null) {
                                    adapter10 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter10;
                                }
                                str7 = adapter10.read2(jsonReader);
                            } else if ("mode".equals(strNextName)) {
                                TypeAdapter<String> adapter11 = this.string_adapter;
                                if (adapter11 == null) {
                                    adapter11 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter11;
                                }
                                str8 = adapter11.read2(jsonReader);
                            } else if ("pronunciation".equals(strNextName)) {
                                TypeAdapter<String> adapter12 = this.string_adapter;
                                if (adapter12 == null) {
                                    adapter12 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter12;
                                }
                                str9 = adapter12.read2(jsonReader);
                            } else if ("maneuver".equals(strNextName)) {
                                TypeAdapter<StepManeuver> adapter13 = this.stepManeuver_adapter;
                                if (adapter13 == null) {
                                    adapter13 = this.gson.getAdapter(StepManeuver.class);
                                    this.stepManeuver_adapter = adapter13;
                                }
                                stepManeuver = adapter13.read2(jsonReader);
                            } else if ("voiceInstructions".equals(strNextName)) {
                                TypeAdapter<List<VoiceInstructions>> adapter14 = this.list__voiceInstructions_adapter;
                                if (adapter14 == null) {
                                    adapter14 = this.gson.getAdapter(TypeToken.getParameterized(List.class, VoiceInstructions.class));
                                    this.list__voiceInstructions_adapter = adapter14;
                                }
                                list = adapter14.read2(jsonReader);
                            } else if ("bannerInstructions".equals(strNextName)) {
                                TypeAdapter<List<BannerInstructions>> adapter15 = this.list__bannerInstructions_adapter;
                                if (adapter15 == null) {
                                    adapter15 = this.gson.getAdapter(TypeToken.getParameterized(List.class, BannerInstructions.class));
                                    this.list__bannerInstructions_adapter = adapter15;
                                }
                                list2 = adapter15.read2(jsonReader);
                            } else if ("weight".equals(strNextName)) {
                                TypeAdapter<Double> adapter16 = this.double__adapter;
                                if (adapter16 == null) {
                                    adapter16 = this.gson.getAdapter(Double.class);
                                    this.double__adapter = adapter16;
                                }
                                dDoubleValue3 = adapter16.read2(jsonReader).doubleValue();
                                z3 = false;
                            } else if ("intersections".equals(strNextName)) {
                                TypeAdapter<List<StepIntersection>> adapter17 = this.list__stepIntersection_adapter;
                                if (adapter17 == null) {
                                    adapter17 = this.gson.getAdapter(TypeToken.getParameterized(List.class, StepIntersection.class));
                                    this.list__stepIntersection_adapter = adapter17;
                                }
                                list3 = adapter17.read2(jsonReader);
                            } else if ("exits".equals(strNextName)) {
                                TypeAdapter<String> adapter18 = this.string_adapter;
                                if (adapter18 == null) {
                                    adapter18 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter18;
                                }
                                str13 = adapter18.read2(jsonReader);
                            } else {
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                }
                                SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                            }
                        } else {
                            TypeAdapter<String> adapter19 = this.string_adapter;
                            if (adapter19 == null) {
                                adapter19 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter19;
                            }
                            str10 = adapter19.read2(jsonReader);
                        }
                    } else {
                        str = str3;
                        TypeAdapter<String> adapter20 = this.string_adapter;
                        if (adapter20 == null) {
                            adapter20 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter20;
                        }
                        str11 = adapter20.read2(jsonReader);
                    }
                    str3 = str;
                }
            }
            String str14 = str3;
            jsonReader.endObject();
            if (z) {
                strConcat = " distance";
            } else {
                strConcat = "";
            }
            if (z2) {
                strConcat = strConcat.concat(" duration");
            }
            if (str8 == null) {
                strConcat = strConcat.concat(" mode");
            }
            if (stepManeuver == null) {
                strConcat = strConcat.concat(" maneuver");
            }
            if (z3) {
                strConcat = strConcat.concat(" weight");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_LegStep(linkedHashMap, dDoubleValue, dDoubleValue2, d, str2, str14, str4, str5, str6, str7, str8, str9, str10, str11, stepManeuver, list, list2, str12, dDoubleValue3, list3, str13);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(strConcat));
            return null;
        }
    }

    public AutoValue_LegStep(Map<String, SerializableJsonElement> map, double d, double d2, Double d3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, StepManeuver stepManeuver, List<VoiceInstructions> list, List<BannerInstructions> list2, String str11, double d4, List<StepIntersection> list3, String str12) {
        new LegStep(map, d, d2, d3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, stepManeuver, list, list2, str11, d4, list3, str12) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_LegStep
            private final List<BannerInstructions> bannerInstructions;
            private final String destinations;
            private final double distance;
            private final String drivingSide;
            private final double duration;
            private final Double durationTypical;
            private final String exits;
            private final String geometry;
            private final List<StepIntersection> intersections;
            private final StepManeuver maneuver;
            private final String mode;
            private final String name;
            private final String pronunciation;
            private final String ref;
            private final String rotaryName;
            private final String rotaryPronunciation;
            private final String speedLimitSign;
            private final String speedLimitUnit;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final List<VoiceInstructions> voiceInstructions;
            private final double weight;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_LegStep$Builder */
            public static class Builder extends LegStep.Builder {
                private List<BannerInstructions> bannerInstructions;
                private String destinations;
                private Double distance;
                private String drivingSide;
                private Double duration;
                private Double durationTypical;
                private String exits;
                private String geometry;
                private List<StepIntersection> intersections;
                private StepManeuver maneuver;
                private String mode;
                private String name;
                private String pronunciation;
                private String ref;
                private String rotaryName;
                private String rotaryPronunciation;
                private String speedLimitSign;
                private String speedLimitUnit;
                private Map<String, SerializableJsonElement> unrecognized;
                private List<VoiceInstructions> voiceInstructions;
                private Double weight;

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep.Builder geometry(String str) {
                    this.geometry = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep.Builder intersections(List<StepIntersection> list) {
                    this.intersections = list;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep build() {
                    String strConcat = this.distance == null ? " distance" : "";
                    if (this.duration == null) {
                        strConcat = strConcat.concat(" duration");
                    }
                    if (this.mode == null) {
                        strConcat = strConcat.concat(" mode");
                    }
                    if (this.maneuver == null) {
                        strConcat = strConcat.concat(" maneuver");
                    }
                    if (this.weight == null) {
                        strConcat = strConcat.concat(" weight");
                    }
                    if (strConcat.isEmpty()) {
                        return new AutoValue_LegStep(this.unrecognized, this.distance.doubleValue(), this.duration.doubleValue(), this.durationTypical, this.speedLimitUnit, this.speedLimitSign, this.geometry, this.name, this.ref, this.destinations, this.mode, this.pronunciation, this.rotaryName, this.rotaryPronunciation, this.maneuver, this.voiceInstructions, this.bannerInstructions, this.drivingSide, this.weight.doubleValue(), this.intersections, this.exits);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep.Builder maneuver(StepManeuver stepManeuver) {
                    if (stepManeuver != null) {
                        this.maneuver = stepManeuver;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null maneuver");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep.Builder mode(String str) {
                    if (str != null) {
                        this.mode = str;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null mode");
                    return null;
                }

                private Builder(LegStep legStep) {
                    this.unrecognized = legStep.unrecognized();
                    this.distance = Double.valueOf(legStep.distance());
                    this.duration = Double.valueOf(legStep.duration());
                    this.durationTypical = legStep.durationTypical();
                    this.speedLimitUnit = legStep.speedLimitUnit();
                    this.speedLimitSign = legStep.speedLimitSign();
                    this.geometry = legStep.geometry();
                    this.name = legStep.name();
                    this.ref = legStep.ref();
                    this.destinations = legStep.destinations();
                    this.mode = legStep.mode();
                    this.pronunciation = legStep.pronunciation();
                    this.rotaryName = legStep.rotaryName();
                    this.rotaryPronunciation = legStep.rotaryPronunciation();
                    this.maneuver = legStep.maneuver();
                    this.voiceInstructions = legStep.voiceInstructions();
                    this.bannerInstructions = legStep.bannerInstructions();
                    this.drivingSide = legStep.drivingSide();
                    this.weight = Double.valueOf(legStep.weight());
                    this.intersections = legStep.intersections();
                    this.exits = legStep.exits();
                }

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep.Builder distance(double d) {
                    this.distance = Double.valueOf(d);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep.Builder duration(double d) {
                    this.duration = Double.valueOf(d);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.LegStep.Builder
                public LegStep.Builder weight(double d) {
                    this.weight = Double.valueOf(d);
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public LegStep.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                public Builder() {
                }
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public List<BannerInstructions> bannerInstructions() {
                return this.bannerInstructions;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public String destinations() {
                return this.destinations;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public double distance() {
                return this.distance;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            @SerializedName("driving_side")
            public String drivingSide() {
                return this.drivingSide;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public double duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            @SerializedName("duration_typical")
            public Double durationTypical() {
                return this.durationTypical;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public String exits() {
                return this.exits;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public String geometry() {
                return this.geometry;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public List<StepIntersection> intersections() {
                return this.intersections;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public StepManeuver maneuver() {
                return this.maneuver;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public String mode() {
                return this.mode;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public String name() {
                return this.name;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public String pronunciation() {
                return this.pronunciation;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public String ref() {
                return this.ref;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            @SerializedName("rotary_name")
            public String rotaryName() {
                return this.rotaryName;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            @SerializedName("rotary_pronunciation")
            public String rotaryPronunciation() {
                return this.rotaryPronunciation;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            @LegStep.SpeedLimitSign
            public String speedLimitSign() {
                return this.speedLimitSign;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            @SpeedLimit$Unit
            public String speedLimitUnit() {
                return this.speedLimitUnit;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public List<VoiceInstructions> voiceInstructions() {
                return this.voiceInstructions;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public double weight() {
                return this.weight;
            }

            {
                this.unrecognized = map;
                this.distance = d;
                this.duration = d2;
                this.durationTypical = d3;
                this.speedLimitUnit = str;
                this.speedLimitSign = str2;
                this.geometry = str3;
                this.name = str4;
                this.ref = str5;
                this.destinations = str6;
                if (str7 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null mode");
                    throw null;
                }
                this.mode = str7;
                this.pronunciation = str8;
                this.rotaryName = str9;
                this.rotaryPronunciation = str10;
                if (stepManeuver == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null maneuver");
                    throw null;
                }
                this.maneuver = stepManeuver;
                this.voiceInstructions = list;
                this.bannerInstructions = list2;
                this.drivingSide = str11;
                this.weight = d4;
                this.intersections = list3;
                this.exits = str12;
            }

            @Override // com.mapbox.api.directions.v5.models.LegStep
            public LegStep.Builder toBuilder() {
                return new Builder(this);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LegStep)) {
                    return false;
                }
                LegStep legStep = (LegStep) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (legStep.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(legStep.unrecognized())) {
                    return false;
                }
                if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(legStep.distance()) || Double.doubleToLongBits(this.duration) != Double.doubleToLongBits(legStep.duration())) {
                    return false;
                }
                Double d5 = this.durationTypical;
                if (d5 == null) {
                    if (legStep.durationTypical() != null) {
                        return false;
                    }
                } else if (!d5.equals(legStep.durationTypical())) {
                    return false;
                }
                String str13 = this.speedLimitUnit;
                if (str13 == null) {
                    if (legStep.speedLimitUnit() != null) {
                        return false;
                    }
                } else if (!str13.equals(legStep.speedLimitUnit())) {
                    return false;
                }
                String str14 = this.speedLimitSign;
                if (str14 == null) {
                    if (legStep.speedLimitSign() != null) {
                        return false;
                    }
                } else if (!str14.equals(legStep.speedLimitSign())) {
                    return false;
                }
                String str15 = this.geometry;
                if (str15 == null) {
                    if (legStep.geometry() != null) {
                        return false;
                    }
                } else if (!str15.equals(legStep.geometry())) {
                    return false;
                }
                String str16 = this.name;
                if (str16 == null) {
                    if (legStep.name() != null) {
                        return false;
                    }
                } else if (!str16.equals(legStep.name())) {
                    return false;
                }
                String str17 = this.ref;
                if (str17 == null) {
                    if (legStep.ref() != null) {
                        return false;
                    }
                } else if (!str17.equals(legStep.ref())) {
                    return false;
                }
                String str18 = this.destinations;
                if (str18 == null) {
                    if (legStep.destinations() != null) {
                        return false;
                    }
                } else if (!str18.equals(legStep.destinations())) {
                    return false;
                }
                if (!this.mode.equals(legStep.mode())) {
                    return false;
                }
                String str19 = this.pronunciation;
                if (str19 == null) {
                    if (legStep.pronunciation() != null) {
                        return false;
                    }
                } else if (!str19.equals(legStep.pronunciation())) {
                    return false;
                }
                String str20 = this.rotaryName;
                if (str20 == null) {
                    if (legStep.rotaryName() != null) {
                        return false;
                    }
                } else if (!str20.equals(legStep.rotaryName())) {
                    return false;
                }
                String str21 = this.rotaryPronunciation;
                if (str21 == null) {
                    if (legStep.rotaryPronunciation() != null) {
                        return false;
                    }
                } else if (!str21.equals(legStep.rotaryPronunciation())) {
                    return false;
                }
                if (!this.maneuver.equals(legStep.maneuver())) {
                    return false;
                }
                List<VoiceInstructions> list4 = this.voiceInstructions;
                if (list4 == null) {
                    if (legStep.voiceInstructions() != null) {
                        return false;
                    }
                } else if (!list4.equals(legStep.voiceInstructions())) {
                    return false;
                }
                List<BannerInstructions> list5 = this.bannerInstructions;
                if (list5 == null) {
                    if (legStep.bannerInstructions() != null) {
                        return false;
                    }
                } else if (!list5.equals(legStep.bannerInstructions())) {
                    return false;
                }
                String str22 = this.drivingSide;
                if (str22 == null) {
                    if (legStep.drivingSide() != null) {
                        return false;
                    }
                } else if (!str22.equals(legStep.drivingSide())) {
                    return false;
                }
                if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(legStep.weight())) {
                    return false;
                }
                List<StepIntersection> list6 = this.intersections;
                if (list6 == null) {
                    if (legStep.intersections() != null) {
                        return false;
                    }
                } else if (!list6.equals(legStep.intersections())) {
                    return false;
                }
                String str23 = this.exits;
                if (str23 == null) {
                    if (legStep.exits() != null) {
                        return false;
                    }
                } else if (!str23.equals(legStep.exits())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("LegStep{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", distance=");
                sb.append(this.distance);
                sb.append(", duration=");
                sb.append(this.duration);
                sb.append(", durationTypical=");
                sb.append(this.durationTypical);
                sb.append(", speedLimitUnit=");
                sb.append(this.speedLimitUnit);
                sb.append(", speedLimitSign=");
                sb.append(this.speedLimitSign);
                sb.append(", geometry=");
                sb.append(this.geometry);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", ref=");
                sb.append(this.ref);
                sb.append(", destinations=");
                sb.append(this.destinations);
                sb.append(", mode=");
                sb.append(this.mode);
                sb.append(", pronunciation=");
                sb.append(this.pronunciation);
                sb.append(", rotaryName=");
                sb.append(this.rotaryName);
                sb.append(", rotaryPronunciation=");
                sb.append(this.rotaryPronunciation);
                sb.append(", maneuver=");
                sb.append(this.maneuver);
                sb.append(", voiceInstructions=");
                sb.append(this.voiceInstructions);
                sb.append(", bannerInstructions=");
                sb.append(this.bannerInstructions);
                sb.append(", drivingSide=");
                sb.append(this.drivingSide);
                sb.append(", weight=");
                sb.append(this.weight);
                sb.append(", intersections=");
                sb.append(this.intersections);
                sb.append(", exits=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.exits, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iDoubleToLongBits = (int) ((Double.doubleToLongBits(this.distance) >>> 32) ^ Double.doubleToLongBits(this.distance));
                int iDoubleToLongBits2 = (int) ((Double.doubleToLongBits(this.duration) >>> 32) ^ Double.doubleToLongBits(this.duration));
                Double d5 = this.durationTypical;
                int iHashCode2 = d5 == null ? 0 : d5.hashCode();
                String str13 = this.speedLimitUnit;
                int iHashCode3 = str13 == null ? 0 : str13.hashCode();
                String str14 = this.speedLimitSign;
                int iHashCode4 = str14 == null ? 0 : str14.hashCode();
                String str15 = this.geometry;
                int iHashCode5 = str15 == null ? 0 : str15.hashCode();
                String str16 = this.name;
                int iHashCode6 = str16 == null ? 0 : str16.hashCode();
                String str17 = this.ref;
                int iHashCode7 = str17 == null ? 0 : str17.hashCode();
                String str18 = this.destinations;
                int iHashCode8 = str18 == null ? 0 : str18.hashCode();
                int iHashCode9 = this.mode.hashCode();
                String str19 = this.pronunciation;
                int iHashCode10 = str19 == null ? 0 : str19.hashCode();
                String str20 = this.rotaryName;
                int iHashCode11 = str20 == null ? 0 : str20.hashCode();
                String str21 = this.rotaryPronunciation;
                int iHashCode12 = str21 == null ? 0 : str21.hashCode();
                int iHashCode13 = this.maneuver.hashCode();
                List<VoiceInstructions> list4 = this.voiceInstructions;
                int iHashCode14 = list4 == null ? 0 : list4.hashCode();
                List<BannerInstructions> list5 = this.bannerInstructions;
                int iHashCode15 = list5 == null ? 0 : list5.hashCode();
                String str22 = this.drivingSide;
                int iHashCode16 = str22 == null ? 0 : str22.hashCode();
                int i = iHashCode8;
                int iDoubleToLongBits3 = (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
                List<StepIntersection> list6 = this.intersections;
                int iHashCode17 = list6 == null ? 0 : list6.hashCode();
                String str23 = this.exits;
                return ((((((((((((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iDoubleToLongBits) * 1000003) ^ iDoubleToLongBits2) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ i) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ iHashCode15) * 1000003) ^ iHashCode16) * 1000003) ^ iDoubleToLongBits3) * 1000003) ^ iHashCode17) * 1000003) ^ (str23 == null ? 0 : str23.hashCode());
            }
        };
    }
}
