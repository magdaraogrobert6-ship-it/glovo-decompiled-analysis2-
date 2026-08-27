package com.mapbox.api.directions.v5.models;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StepManeuver extends C$AutoValue_StepManeuver {

    public static final class GsonTypeAdapter extends TypeAdapter<StepManeuver> {
        private volatile TypeAdapter<double[]> array__double_adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(StepManeuver)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, StepManeuver stepManeuver) throws IOException {
            if (stepManeuver == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (stepManeuver.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : stepManeuver.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("location");
            if (stepManeuver.rawLocation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> adapter = this.array__double_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = adapter;
                }
                adapter.write(jsonWriter, stepManeuver.rawLocation());
            }
            jsonWriter.name("bearing_before");
            if (stepManeuver.bearingBefore() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter2 = this.double__adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter2;
                }
                adapter2.write(jsonWriter, stepManeuver.bearingBefore());
            }
            jsonWriter.name("bearing_after");
            if (stepManeuver.bearingAfter() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter3 = this.double__adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter3;
                }
                adapter3.write(jsonWriter, stepManeuver.bearingAfter());
            }
            jsonWriter.name("instruction");
            if (stepManeuver.instruction() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, stepManeuver.instruction());
            }
            jsonWriter.name("type");
            if (stepManeuver.type() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter5 = this.string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, stepManeuver.type());
            }
            jsonWriter.name("modifier");
            if (stepManeuver.modifier() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, stepManeuver.modifier());
            }
            jsonWriter.name("exit");
            if (stepManeuver.exit() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter7 = this.integer_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter7;
                }
                adapter7.write(jsonWriter, stepManeuver.exit());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:29:0x0065  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public StepManeuver read2(JsonReader jsonReader) throws IOException {
            byte b;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            double[] dArr = null;
            Double d = null;
            Double d2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != -901094096) {
                        if (iHashCode != -307042805) {
                            if (iHashCode == 1901043637 && strNextName.equals("location")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("bearing_after")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("bearing_before")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        TypeAdapter<Double> adapter = this.double__adapter;
                        if (adapter == null) {
                            adapter = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter;
                        }
                        d = adapter.read2(jsonReader);
                    } else if (b == 1) {
                        TypeAdapter<Double> adapter2 = this.double__adapter;
                        if (adapter2 == null) {
                            adapter2 = this.gson.getAdapter(Double.class);
                            this.double__adapter = adapter2;
                        }
                        d2 = adapter2.read2(jsonReader);
                    } else if (b == 2) {
                        TypeAdapter<double[]> adapter3 = this.array__double_adapter;
                        if (adapter3 == null) {
                            adapter3 = this.gson.getAdapter(double[].class);
                            this.array__double_adapter = adapter3;
                        }
                        dArr = adapter3.read2(jsonReader);
                    } else if ("instruction".equals(strNextName)) {
                        TypeAdapter<String> adapter4 = this.string_adapter;
                        if (adapter4 == null) {
                            adapter4 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter4;
                        }
                        str = adapter4.read2(jsonReader);
                    } else if ("type".equals(strNextName)) {
                        TypeAdapter<String> adapter5 = this.string_adapter;
                        if (adapter5 == null) {
                            adapter5 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter5;
                        }
                        str2 = adapter5.read2(jsonReader);
                    } else if ("modifier".equals(strNextName)) {
                        TypeAdapter<String> adapter6 = this.string_adapter;
                        if (adapter6 == null) {
                            adapter6 = this.gson.getAdapter(String.class);
                            this.string_adapter = adapter6;
                        }
                        str3 = adapter6.read2(jsonReader);
                    } else if ("exit".equals(strNextName)) {
                        TypeAdapter<Integer> adapter7 = this.integer_adapter;
                        if (adapter7 == null) {
                            adapter7 = this.gson.getAdapter(Integer.class);
                            this.integer_adapter = adapter7;
                        }
                        num = adapter7.read2(jsonReader);
                    } else {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                    }
                }
            }
            jsonReader.endObject();
            String str4 = dArr == null ? " rawLocation" : "";
            if (str4.isEmpty()) {
                return new AutoValue_StepManeuver(linkedHashMap, dArr, d, d2, str, str2, str3, num);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str4));
            return null;
        }
    }

    public AutoValue_StepManeuver(Map<String, SerializableJsonElement> map, double[] dArr, Double d, Double d2, String str, String str2, String str3, Integer num) {
        new StepManeuver(map, dArr, d, d2, str, str2, str3, num) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_StepManeuver
            private final Double bearingAfter;
            private final Double bearingBefore;
            private final Integer exit;
            private final String instruction;
            private final String modifier;
            private final double[] rawLocation;
            private final String type;
            private final Map<String, SerializableJsonElement> unrecognized;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_StepManeuver$Builder */
            public static class Builder extends StepManeuver.Builder {
                private Double bearingAfter;
                private Double bearingBefore;
                private Integer exit;
                private String instruction;
                private String modifier;
                private double[] rawLocation;
                private String type;
                private Map<String, SerializableJsonElement> unrecognized;

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder bearingAfter(Double d) {
                    this.bearingAfter = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder bearingBefore(Double d) {
                    this.bearingBefore = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder exit(Integer num) {
                    this.exit = num;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder instruction(String str) {
                    this.instruction = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder modifier(String str) {
                    this.modifier = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder type(String str) {
                    this.type = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver.Builder rawLocation(double[] dArr) {
                    if (dArr != null) {
                        this.rawLocation = dArr;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rawLocation");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public StepManeuver.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.StepManeuver.Builder
                public StepManeuver build() {
                    String str = this.rawLocation == null ? " rawLocation" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_StepManeuver(this.unrecognized, this.rawLocation, this.bearingBefore, this.bearingAfter, this.instruction, this.type, this.modifier, this.exit);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(str));
                    return null;
                }
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            @SerializedName("bearing_after")
            public Double bearingAfter() {
                return this.bearingAfter;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            @SerializedName("bearing_before")
            public Double bearingBefore() {
                return this.bearingBefore;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            public Integer exit() {
                return this.exit;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            public String instruction() {
                return this.instruction;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            public String modifier() {
                return this.modifier;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            @SerializedName("location")
            public double[] rawLocation() {
                return this.rawLocation;
            }

            @Override // com.mapbox.api.directions.v5.models.StepManeuver
            @StepManeuver.StepManeuverType
            public String type() {
                return this.type;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            {
                this.unrecognized = map;
                if (dArr == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rawLocation");
                    throw null;
                }
                this.rawLocation = dArr;
                this.bearingBefore = d;
                this.bearingAfter = d2;
                this.instruction = str;
                this.type = str2;
                this.modifier = str3;
                this.exit = num;
            }

            public boolean equals(Object obj) {
                double[] dArrRawLocation;
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StepManeuver)) {
                    return false;
                }
                StepManeuver stepManeuver = (StepManeuver) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (stepManeuver.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(stepManeuver.unrecognized())) {
                    return false;
                }
                double[] dArr2 = this.rawLocation;
                if (stepManeuver instanceof C$AutoValue_StepManeuver) {
                    dArrRawLocation = ((C$AutoValue_StepManeuver) stepManeuver).rawLocation;
                } else {
                    dArrRawLocation = stepManeuver.rawLocation();
                }
                if (!Arrays.equals(dArr2, dArrRawLocation)) {
                    return false;
                }
                Double d3 = this.bearingBefore;
                if (d3 == null) {
                    if (stepManeuver.bearingBefore() != null) {
                        return false;
                    }
                } else if (!d3.equals(stepManeuver.bearingBefore())) {
                    return false;
                }
                Double d4 = this.bearingAfter;
                if (d4 == null) {
                    if (stepManeuver.bearingAfter() != null) {
                        return false;
                    }
                } else if (!d4.equals(stepManeuver.bearingAfter())) {
                    return false;
                }
                String str4 = this.instruction;
                if (str4 == null) {
                    if (stepManeuver.instruction() != null) {
                        return false;
                    }
                } else if (!str4.equals(stepManeuver.instruction())) {
                    return false;
                }
                String str5 = this.type;
                if (str5 == null) {
                    if (stepManeuver.type() != null) {
                        return false;
                    }
                } else if (!str5.equals(stepManeuver.type())) {
                    return false;
                }
                String str6 = this.modifier;
                if (str6 == null) {
                    if (stepManeuver.modifier() != null) {
                        return false;
                    }
                } else if (!str6.equals(stepManeuver.modifier())) {
                    return false;
                }
                Integer num2 = this.exit;
                if (num2 == null) {
                    if (stepManeuver.exit() != null) {
                        return false;
                    }
                } else if (!num2.equals(stepManeuver.exit())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("StepManeuver{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", rawLocation=");
                sb.append(Arrays.toString(this.rawLocation));
                sb.append(", bearingBefore=");
                sb.append(this.bearingBefore);
                sb.append(", bearingAfter=");
                sb.append(this.bearingAfter);
                sb.append(", instruction=");
                sb.append(this.instruction);
                sb.append(", type=");
                sb.append(this.type);
                sb.append(", modifier=");
                sb.append(this.modifier);
                sb.append(", exit=");
                return IconCompatParcelizer.write(this.exit, "}", sb);
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = Arrays.hashCode(this.rawLocation);
                Double d3 = this.bearingBefore;
                int iHashCode3 = d3 == null ? 0 : d3.hashCode();
                Double d4 = this.bearingAfter;
                int iHashCode4 = d4 == null ? 0 : d4.hashCode();
                String str4 = this.instruction;
                int iHashCode5 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.type;
                int iHashCode6 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.modifier;
                int iHashCode7 = str6 == null ? 0 : str6.hashCode();
                Integer num2 = this.exit;
                return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ (num2 != null ? num2.hashCode() : 0);
            }
        };
    }
}
