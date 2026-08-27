package com.mapbox.api.directions.v5.models;

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
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StepIntersection extends C$AutoValue_StepIntersection {

    public static final class GsonTypeAdapter extends TypeAdapter<StepIntersection> {
        private volatile TypeAdapter<double[]> array__double_adapter;
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<Integer> integer_adapter;
        private volatile TypeAdapter<Interchange> interchange_adapter;
        private volatile TypeAdapter<Junction> junction_adapter;
        private volatile TypeAdapter<List<Boolean>> list__boolean_adapter;
        private volatile TypeAdapter<List<Integer>> list__integer_adapter;
        private volatile TypeAdapter<List<IntersectionLanes>> list__intersectionLanes_adapter;
        private volatile TypeAdapter<List<String>> list__string_adapter;
        private volatile TypeAdapter<MapboxStreetsV8> mapboxStreetsV8_adapter;
        private volatile TypeAdapter<MergingArea> mergingArea_adapter;
        private volatile TypeAdapter<RestStop> restStop_adapter;
        private volatile TypeAdapter<String> string_adapter;
        private volatile TypeAdapter<TollCollection> tollCollection_adapter;

        public String toString() {
            return "TypeAdapter(StepIntersection)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, StepIntersection stepIntersection) throws IOException {
            if (stepIntersection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (stepIntersection.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : stepIntersection.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("location");
            if (stepIntersection.rawLocation() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<double[]> adapter = this.array__double_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(double[].class);
                    this.array__double_adapter = adapter;
                }
                adapter.write(jsonWriter, stepIntersection.rawLocation());
            }
            jsonWriter.name("bearings");
            if (stepIntersection.bearings() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> adapter2 = this.list__integer_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = adapter2;
                }
                adapter2.write(jsonWriter, stepIntersection.bearings());
            }
            jsonWriter.name("classes");
            if (stepIntersection.classes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter3 = this.list__string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, stepIntersection.classes());
            }
            jsonWriter.name("entry");
            if (stepIntersection.entry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Boolean>> adapter4 = this.list__boolean_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                    this.list__boolean_adapter = adapter4;
                }
                adapter4.write(jsonWriter, stepIntersection.entry());
            }
            jsonWriter.name("form_of_way");
            if (stepIntersection.formOfWay() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter5 = this.list__string_adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter5;
                }
                adapter5.write(jsonWriter, stepIntersection.formOfWay());
            }
            jsonWriter.name("geometries");
            if (stepIntersection.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<String>> adapter6 = this.list__string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.list__string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, stepIntersection.geometries());
            }
            jsonWriter.name("access");
            if (stepIntersection.access() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Integer>> adapter7 = this.list__integer_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.list__integer_adapter = adapter7;
                }
                adapter7.write(jsonWriter, stepIntersection.access());
            }
            jsonWriter.name("elevated");
            if (stepIntersection.elevated() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Boolean>> adapter8 = this.list__boolean_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                    this.list__boolean_adapter = adapter8;
                }
                adapter8.write(jsonWriter, stepIntersection.elevated());
            }
            jsonWriter.name("bridges");
            if (stepIntersection.bridges() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<Boolean>> adapter9 = this.list__boolean_adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                    this.list__boolean_adapter = adapter9;
                }
                adapter9.write(jsonWriter, stepIntersection.bridges());
            }
            jsonWriter.name("in");
            if (stepIntersection.in() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter10 = this.integer_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter10;
                }
                adapter10.write(jsonWriter, stepIntersection.in());
            }
            jsonWriter.name("out");
            if (stepIntersection.out() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter11 = this.integer_adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter11;
                }
                adapter11.write(jsonWriter, stepIntersection.out());
            }
            jsonWriter.name("lanes");
            if (stepIntersection.lanes() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<IntersectionLanes>> adapter12 = this.list__intersectionLanes_adapter;
                if (adapter12 == null) {
                    adapter12 = this.gson.getAdapter(TypeToken.getParameterized(List.class, IntersectionLanes.class));
                    this.list__intersectionLanes_adapter = adapter12;
                }
                adapter12.write(jsonWriter, stepIntersection.lanes());
            }
            jsonWriter.name("geometry_index");
            if (stepIntersection.geometryIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter13 = this.integer_adapter;
                if (adapter13 == null) {
                    adapter13 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter13;
                }
                adapter13.write(jsonWriter, stepIntersection.geometryIndex());
            }
            jsonWriter.name("is_urban");
            if (stepIntersection.isUrban() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter14 = this.boolean__adapter;
                if (adapter14 == null) {
                    adapter14 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter14;
                }
                adapter14.write(jsonWriter, stepIntersection.isUrban());
            }
            jsonWriter.name("admin_index");
            if (stepIntersection.adminIndex() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> adapter15 = this.integer_adapter;
                if (adapter15 == null) {
                    adapter15 = this.gson.getAdapter(Integer.class);
                    this.integer_adapter = adapter15;
                }
                adapter15.write(jsonWriter, stepIntersection.adminIndex());
            }
            jsonWriter.name("rest_stop");
            if (stepIntersection.restStop() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<RestStop> adapter16 = this.restStop_adapter;
                if (adapter16 == null) {
                    adapter16 = this.gson.getAdapter(RestStop.class);
                    this.restStop_adapter = adapter16;
                }
                adapter16.write(jsonWriter, stepIntersection.restStop());
            }
            jsonWriter.name("toll_collection");
            if (stepIntersection.tollCollection() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<TollCollection> adapter17 = this.tollCollection_adapter;
                if (adapter17 == null) {
                    adapter17 = this.gson.getAdapter(TollCollection.class);
                    this.tollCollection_adapter = adapter17;
                }
                adapter17.write(jsonWriter, stepIntersection.tollCollection());
            }
            jsonWriter.name("mapbox_streets_v8");
            if (stepIntersection.mapboxStreetsV8() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<MapboxStreetsV8> adapter18 = this.mapboxStreetsV8_adapter;
                if (adapter18 == null) {
                    adapter18 = this.gson.getAdapter(MapboxStreetsV8.class);
                    this.mapboxStreetsV8_adapter = adapter18;
                }
                adapter18.write(jsonWriter, stepIntersection.mapboxStreetsV8());
            }
            jsonWriter.name("tunnel_name");
            if (stepIntersection.tunnelName() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter19 = this.string_adapter;
                if (adapter19 == null) {
                    adapter19 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter19;
                }
                adapter19.write(jsonWriter, stepIntersection.tunnelName());
            }
            jsonWriter.name("railway_crossing");
            if (stepIntersection.railwayCrossing() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter20 = this.boolean__adapter;
                if (adapter20 == null) {
                    adapter20 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter20;
                }
                adapter20.write(jsonWriter, stepIntersection.railwayCrossing());
            }
            jsonWriter.name("traffic_signal");
            if (stepIntersection.trafficSignal() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter21 = this.boolean__adapter;
                if (adapter21 == null) {
                    adapter21 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter21;
                }
                adapter21.write(jsonWriter, stepIntersection.trafficSignal());
            }
            jsonWriter.name("stop_sign");
            if (stepIntersection.stopSign() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter22 = this.boolean__adapter;
                if (adapter22 == null) {
                    adapter22 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter22;
                }
                adapter22.write(jsonWriter, stepIntersection.stopSign());
            }
            jsonWriter.name("yield_sign");
            if (stepIntersection.yieldSign() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter23 = this.boolean__adapter;
                if (adapter23 == null) {
                    adapter23 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter23;
                }
                adapter23.write(jsonWriter, stepIntersection.yieldSign());
            }
            jsonWriter.name("ic");
            if (stepIntersection.interchange() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Interchange> adapter24 = this.interchange_adapter;
                if (adapter24 == null) {
                    adapter24 = this.gson.getAdapter(Interchange.class);
                    this.interchange_adapter = adapter24;
                }
                adapter24.write(jsonWriter, stepIntersection.interchange());
            }
            jsonWriter.name("jct");
            if (stepIntersection.junction() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Junction> adapter25 = this.junction_adapter;
                if (adapter25 == null) {
                    adapter25 = this.gson.getAdapter(Junction.class);
                    this.junction_adapter = adapter25;
                }
                adapter25.write(jsonWriter, stepIntersection.junction());
            }
            jsonWriter.name("merging_area");
            if (stepIntersection.mergingArea() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<MergingArea> adapter26 = this.mergingArea_adapter;
                if (adapter26 == null) {
                    adapter26 = this.gson.getAdapter(MergingArea.class);
                    this.mergingArea_adapter = adapter26;
                }
                adapter26.write(jsonWriter, stepIntersection.mergingArea());
            }
            jsonWriter.name(InAppMessageBase.DURATION);
            if (stepIntersection.duration() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter27 = this.double__adapter;
                if (adapter27 == null) {
                    adapter27 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter27;
                }
                adapter27.write(jsonWriter, stepIntersection.duration());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:99:0x0176  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public StepIntersection read2(JsonReader jsonReader) throws IOException {
            String str;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            LinkedHashMap linkedHashMap = null;
            double[] dArr = null;
            List<Integer> list = null;
            List<String> list2 = null;
            List<Boolean> list3 = null;
            List<String> list4 = null;
            List<String> list5 = null;
            List<Integer> list6 = null;
            List<Boolean> list7 = null;
            List<Boolean> list8 = null;
            Integer num = null;
            Integer num2 = null;
            List<IntersectionLanes> list9 = null;
            Integer num3 = null;
            Boolean bool = null;
            Integer num4 = null;
            RestStop restStop = null;
            TollCollection tollCollection = null;
            MapboxStreetsV8 mapboxStreetsV8 = null;
            String str2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Interchange interchange = null;
            Junction junction = null;
            MergingArea mergingArea = null;
            Double d = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "merging_area":
                            TypeAdapter<MergingArea> adapter = this.mergingArea_adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(MergingArea.class);
                                this.mergingArea_adapter = adapter;
                            }
                            mergingArea = adapter.read2(jsonReader);
                            break;
                        case "duration":
                            TypeAdapter<Double> adapter2 = this.double__adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter2;
                            }
                            d = adapter2.read2(jsonReader);
                            break;
                        case "traffic_signal":
                            TypeAdapter<Boolean> adapter3 = this.boolean__adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter3;
                            }
                            bool3 = adapter3.read2(jsonReader);
                            break;
                        case "rest_stop":
                            TypeAdapter<RestStop> adapter4 = this.restStop_adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(RestStop.class);
                                this.restStop_adapter = adapter4;
                            }
                            restStop = adapter4.read2(jsonReader);
                            break;
                        case "mapbox_streets_v8":
                            TypeAdapter<MapboxStreetsV8> adapter5 = this.mapboxStreetsV8_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(MapboxStreetsV8.class);
                                this.mapboxStreetsV8_adapter = adapter5;
                            }
                            mapboxStreetsV8 = adapter5.read2(jsonReader);
                            break;
                        case "access":
                            TypeAdapter<List<Integer>> adapter6 = this.list__integer_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                this.list__integer_adapter = adapter6;
                            }
                            list6 = adapter6.read2(jsonReader);
                            break;
                        case "railway_crossing":
                            TypeAdapter<Boolean> adapter7 = this.boolean__adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter7;
                            }
                            bool2 = adapter7.read2(jsonReader);
                            break;
                        case "form_of_way":
                            TypeAdapter<List<String>> adapter8 = this.list__string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter8;
                            }
                            list4 = adapter8.read2(jsonReader);
                            break;
                        case "admin_index":
                            TypeAdapter<Integer> adapter9 = this.integer_adapter;
                            if (adapter9 == null) {
                                adapter9 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = adapter9;
                            }
                            num4 = adapter9.read2(jsonReader);
                            break;
                        case "elevated":
                            TypeAdapter<List<Boolean>> adapter10 = this.list__boolean_adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                                this.list__boolean_adapter = adapter10;
                            }
                            list7 = adapter10.read2(jsonReader);
                            break;
                        case "ic":
                            TypeAdapter<Interchange> adapter11 = this.interchange_adapter;
                            if (adapter11 == null) {
                                adapter11 = this.gson.getAdapter(Interchange.class);
                                this.interchange_adapter = adapter11;
                            }
                            interchange = adapter11.read2(jsonReader);
                            break;
                        case "jct":
                            TypeAdapter<Junction> adapter12 = this.junction_adapter;
                            if (adapter12 == null) {
                                adapter12 = this.gson.getAdapter(Junction.class);
                                this.junction_adapter = adapter12;
                            }
                            junction = adapter12.read2(jsonReader);
                            break;
                        case "is_urban":
                            TypeAdapter<Boolean> adapter13 = this.boolean__adapter;
                            if (adapter13 == null) {
                                adapter13 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter13;
                            }
                            bool = adapter13.read2(jsonReader);
                            break;
                        case "bridges":
                            TypeAdapter<List<Boolean>> adapter14 = this.list__boolean_adapter;
                            if (adapter14 == null) {
                                adapter14 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                                this.list__boolean_adapter = adapter14;
                            }
                            list8 = adapter14.read2(jsonReader);
                            break;
                        case "geometries":
                            TypeAdapter<List<String>> adapter15 = this.list__string_adapter;
                            if (adapter15 == null) {
                                adapter15 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                this.list__string_adapter = adapter15;
                            }
                            list5 = adapter15.read2(jsonReader);
                            break;
                        case "tunnel_name":
                            TypeAdapter<String> adapter16 = this.string_adapter;
                            if (adapter16 == null) {
                                adapter16 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter16;
                            }
                            str2 = adapter16.read2(jsonReader);
                            break;
                        case "geometry_index":
                            TypeAdapter<Integer> adapter17 = this.integer_adapter;
                            if (adapter17 == null) {
                                adapter17 = this.gson.getAdapter(Integer.class);
                                this.integer_adapter = adapter17;
                            }
                            num3 = adapter17.read2(jsonReader);
                            break;
                        case "yield_sign":
                            TypeAdapter<Boolean> adapter18 = this.boolean__adapter;
                            if (adapter18 == null) {
                                adapter18 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter18;
                            }
                            bool5 = adapter18.read2(jsonReader);
                            break;
                        case "toll_collection":
                            TypeAdapter<TollCollection> adapter19 = this.tollCollection_adapter;
                            if (adapter19 == null) {
                                adapter19 = this.gson.getAdapter(TollCollection.class);
                                this.tollCollection_adapter = adapter19;
                            }
                            tollCollection = adapter19.read2(jsonReader);
                            break;
                        case "stop_sign":
                            TypeAdapter<Boolean> adapter20 = this.boolean__adapter;
                            if (adapter20 == null) {
                                adapter20 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter20;
                            }
                            bool4 = adapter20.read2(jsonReader);
                            break;
                        case "location":
                            TypeAdapter<double[]> adapter21 = this.array__double_adapter;
                            if (adapter21 == null) {
                                adapter21 = this.gson.getAdapter(double[].class);
                                this.array__double_adapter = adapter21;
                            }
                            dArr = adapter21.read2(jsonReader);
                            break;
                        default:
                            if ("bearings".equals(strNextName)) {
                                TypeAdapter<List<Integer>> adapter22 = this.list__integer_adapter;
                                if (adapter22 == null) {
                                    adapter22 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                                    this.list__integer_adapter = adapter22;
                                }
                                list = adapter22.read2(jsonReader);
                                break;
                            } else {
                                if ("classes".equals(strNextName)) {
                                    TypeAdapter<List<String>> adapter23 = this.list__string_adapter;
                                    if (adapter23 == null) {
                                        adapter23 = this.gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                                        this.list__string_adapter = adapter23;
                                    }
                                    list2 = adapter23.read2(jsonReader);
                                } else if ("entry".equals(strNextName)) {
                                    TypeAdapter<List<Boolean>> adapter24 = this.list__boolean_adapter;
                                    if (adapter24 == null) {
                                        adapter24 = this.gson.getAdapter(TypeToken.getParameterized(List.class, Boolean.class));
                                        this.list__boolean_adapter = adapter24;
                                    }
                                    list3 = adapter24.read2(jsonReader);
                                } else if ("in".equals(strNextName)) {
                                    TypeAdapter<Integer> adapter25 = this.integer_adapter;
                                    if (adapter25 == null) {
                                        adapter25 = this.gson.getAdapter(Integer.class);
                                        this.integer_adapter = adapter25;
                                    }
                                    num = adapter25.read2(jsonReader);
                                } else if ("out".equals(strNextName)) {
                                    TypeAdapter<Integer> adapter26 = this.integer_adapter;
                                    if (adapter26 == null) {
                                        adapter26 = this.gson.getAdapter(Integer.class);
                                        this.integer_adapter = adapter26;
                                    }
                                    num2 = adapter26.read2(jsonReader);
                                } else if ("lanes".equals(strNextName)) {
                                    TypeAdapter<List<IntersectionLanes>> adapter27 = this.list__intersectionLanes_adapter;
                                    if (adapter27 == null) {
                                        adapter27 = this.gson.getAdapter(TypeToken.getParameterized(List.class, IntersectionLanes.class));
                                        this.list__intersectionLanes_adapter = adapter27;
                                    }
                                    list9 = adapter27.read2(jsonReader);
                                } else {
                                    if (linkedHashMap == null) {
                                        linkedHashMap = new LinkedHashMap();
                                    }
                                    SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            jsonReader.endObject();
            if (dArr == null) {
                str = " rawLocation";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new AutoValue_StepIntersection(linkedHashMap, dArr, list, list2, list3, list4, list5, list6, list7, list8, num, num2, list9, num3, bool, num4, restStop, tollCollection, mapboxStreetsV8, str2, bool2, bool3, bool4, bool5, interchange, junction, mergingArea, d);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: ".concat(str));
            return null;
        }
    }

    public AutoValue_StepIntersection(final Map<String, SerializableJsonElement> map, final double[] dArr, final List<Integer> list, final List<String> list2, final List<Boolean> list3, final List<String> list4, final List<String> list5, final List<Integer> list6, final List<Boolean> list7, final List<Boolean> list8, final Integer num, final Integer num2, final List<IntersectionLanes> list9, final Integer num3, final Boolean bool, final Integer num4, final RestStop restStop, final TollCollection tollCollection, final MapboxStreetsV8 mapboxStreetsV8, final String str, final Boolean bool2, final Boolean bool3, final Boolean bool4, final Boolean bool5, final Interchange interchange, final Junction junction, final MergingArea mergingArea, final Double d) {
        new StepIntersection(map, dArr, list, list2, list3, list4, list5, list6, list7, list8, num, num2, list9, num3, bool, num4, restStop, tollCollection, mapboxStreetsV8, str, bool2, bool3, bool4, bool5, interchange, junction, mergingArea, d) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_StepIntersection
            private final List<Integer> access;
            private final Integer adminIndex;
            private final List<Integer> bearings;
            private final List<Boolean> bridges;
            private final List<String> classes;
            private final Double duration;
            private final List<Boolean> elevated;
            private final List<Boolean> entry;
            private final List<String> formOfWay;
            private final List<String> geometries;
            private final Integer geometryIndex;
            private final Integer in;
            private final Interchange interchange;
            private final Boolean isUrban;
            private final Junction junction;
            private final List<IntersectionLanes> lanes;
            private final MapboxStreetsV8 mapboxStreetsV8;
            private final MergingArea mergingArea;
            private final Integer out;
            private final Boolean railwayCrossing;
            private final double[] rawLocation;
            private final RestStop restStop;
            private final Boolean stopSign;
            private final TollCollection tollCollection;
            private final Boolean trafficSignal;
            private final String tunnelName;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final Boolean yieldSign;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_StepIntersection$Builder */
            public static class Builder extends StepIntersection.Builder {
                private List<Integer> access;
                private Integer adminIndex;
                private List<Integer> bearings;
                private List<Boolean> bridges;
                private List<String> classes;
                private Double duration;
                private List<Boolean> elevated;
                private List<Boolean> entry;
                private List<String> formOfWay;
                private List<String> geometries;
                private Integer geometryIndex;
                private Integer in;
                private Interchange interchange;
                private Boolean isUrban;
                private Junction junction;
                private List<IntersectionLanes> lanes;
                private MapboxStreetsV8 mapboxStreetsV8;
                private MergingArea mergingArea;
                private Integer out;
                private Boolean railwayCrossing;
                private double[] rawLocation;
                private RestStop restStop;
                private Boolean stopSign;
                private TollCollection tollCollection;
                private Boolean trafficSignal;
                private String tunnelName;
                private Map<String, SerializableJsonElement> unrecognized;
                private Boolean yieldSign;

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection build() {
                    String str = this.rawLocation == null ? " rawLocation" : "";
                    if (str.isEmpty()) {
                        return new AutoValue_StepIntersection(this.unrecognized, this.rawLocation, this.bearings, this.classes, this.entry, this.formOfWay, this.geometries, this.access, this.elevated, this.bridges, this.in, this.out, this.lanes, this.geometryIndex, this.isUrban, this.adminIndex, this.restStop, this.tollCollection, this.mapboxStreetsV8, this.tunnelName, this.railwayCrossing, this.trafficSignal, this.stopSign, this.yieldSign, this.interchange, this.junction, this.mergingArea, this.duration);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(str));
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.StepIntersection.Builder
                public StepIntersection.Builder rawLocation(double[] dArr) {
                    if (dArr != null) {
                        this.rawLocation = dArr;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rawLocation");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public StepIntersection.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("access")
            public List<Integer> access() {
                return this.access;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("admin_index")
            public Integer adminIndex() {
                return this.adminIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<Integer> bearings() {
                return this.bearings;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("bridges")
            public List<Boolean> bridges() {
                return this.bridges;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<String> classes() {
                return this.classes;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName(InAppMessageBase.DURATION)
            public Double duration() {
                return this.duration;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("elevated")
            public List<Boolean> elevated() {
                return this.elevated;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<Boolean> entry() {
                return this.entry;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("form_of_way")
            public List<String> formOfWay() {
                return this.formOfWay;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("geometries")
            public List<String> geometries() {
                return this.geometries;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("geometry_index")
            public Integer geometryIndex() {
                return this.geometryIndex;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public Integer in() {
                return this.in;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("ic")
            public Interchange interchange() {
                return this.interchange;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("is_urban")
            public Boolean isUrban() {
                return this.isUrban;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("jct")
            public Junction junction() {
                return this.junction;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public List<IntersectionLanes> lanes() {
                return this.lanes;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("mapbox_streets_v8")
            public MapboxStreetsV8 mapboxStreetsV8() {
                return this.mapboxStreetsV8;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("merging_area")
            public MergingArea mergingArea() {
                return this.mergingArea;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            public Integer out() {
                return this.out;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("railway_crossing")
            public Boolean railwayCrossing() {
                return this.railwayCrossing;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("location")
            public double[] rawLocation() {
                return this.rawLocation;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("rest_stop")
            public RestStop restStop() {
                return this.restStop;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("stop_sign")
            public Boolean stopSign() {
                return this.stopSign;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("toll_collection")
            public TollCollection tollCollection() {
                return this.tollCollection;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("traffic_signal")
            public Boolean trafficSignal() {
                return this.trafficSignal;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("tunnel_name")
            public String tunnelName() {
                return this.tunnelName;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.StepIntersection
            @SerializedName("yield_sign")
            public Boolean yieldSign() {
                return this.yieldSign;
            }

            {
                this.unrecognized = map;
                if (dArr == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null rawLocation");
                    throw null;
                }
                this.rawLocation = dArr;
                this.bearings = list;
                this.classes = list2;
                this.entry = list3;
                this.formOfWay = list4;
                this.geometries = list5;
                this.access = list6;
                this.elevated = list7;
                this.bridges = list8;
                this.in = num;
                this.out = num2;
                this.lanes = list9;
                this.geometryIndex = num3;
                this.isUrban = bool;
                this.adminIndex = num4;
                this.restStop = restStop;
                this.tollCollection = tollCollection;
                this.mapboxStreetsV8 = mapboxStreetsV8;
                this.tunnelName = str;
                this.railwayCrossing = bool2;
                this.trafficSignal = bool3;
                this.stopSign = bool4;
                this.yieldSign = bool5;
                this.interchange = interchange;
                this.junction = junction;
                this.mergingArea = mergingArea;
                this.duration = d;
            }

            public boolean equals(Object obj) {
                double[] dArrRawLocation;
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StepIntersection)) {
                    return false;
                }
                StepIntersection stepIntersection = (StepIntersection) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (stepIntersection.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(stepIntersection.unrecognized())) {
                    return false;
                }
                double[] dArr2 = this.rawLocation;
                if (stepIntersection instanceof C$AutoValue_StepIntersection) {
                    dArrRawLocation = ((C$AutoValue_StepIntersection) stepIntersection).rawLocation;
                } else {
                    dArrRawLocation = stepIntersection.rawLocation();
                }
                if (!Arrays.equals(dArr2, dArrRawLocation)) {
                    return false;
                }
                List<Integer> list10 = this.bearings;
                if (list10 == null) {
                    if (stepIntersection.bearings() != null) {
                        return false;
                    }
                } else if (!list10.equals(stepIntersection.bearings())) {
                    return false;
                }
                List<String> list11 = this.classes;
                if (list11 == null) {
                    if (stepIntersection.classes() != null) {
                        return false;
                    }
                } else if (!list11.equals(stepIntersection.classes())) {
                    return false;
                }
                List<Boolean> list12 = this.entry;
                if (list12 == null) {
                    if (stepIntersection.entry() != null) {
                        return false;
                    }
                } else if (!list12.equals(stepIntersection.entry())) {
                    return false;
                }
                List<String> list13 = this.formOfWay;
                if (list13 == null) {
                    if (stepIntersection.formOfWay() != null) {
                        return false;
                    }
                } else if (!list13.equals(stepIntersection.formOfWay())) {
                    return false;
                }
                List<String> list14 = this.geometries;
                if (list14 == null) {
                    if (stepIntersection.geometries() != null) {
                        return false;
                    }
                } else if (!list14.equals(stepIntersection.geometries())) {
                    return false;
                }
                List<Integer> list15 = this.access;
                if (list15 == null) {
                    if (stepIntersection.access() != null) {
                        return false;
                    }
                } else if (!list15.equals(stepIntersection.access())) {
                    return false;
                }
                List<Boolean> list16 = this.elevated;
                if (list16 == null) {
                    if (stepIntersection.elevated() != null) {
                        return false;
                    }
                } else if (!list16.equals(stepIntersection.elevated())) {
                    return false;
                }
                List<Boolean> list17 = this.bridges;
                if (list17 == null) {
                    if (stepIntersection.bridges() != null) {
                        return false;
                    }
                } else if (!list17.equals(stepIntersection.bridges())) {
                    return false;
                }
                Integer num5 = this.in;
                if (num5 == null) {
                    if (stepIntersection.in() != null) {
                        return false;
                    }
                } else if (!num5.equals(stepIntersection.in())) {
                    return false;
                }
                Integer num6 = this.out;
                if (num6 == null) {
                    if (stepIntersection.out() != null) {
                        return false;
                    }
                } else if (!num6.equals(stepIntersection.out())) {
                    return false;
                }
                List<IntersectionLanes> list18 = this.lanes;
                if (list18 == null) {
                    if (stepIntersection.lanes() != null) {
                        return false;
                    }
                } else if (!list18.equals(stepIntersection.lanes())) {
                    return false;
                }
                Integer num7 = this.geometryIndex;
                if (num7 == null) {
                    if (stepIntersection.geometryIndex() != null) {
                        return false;
                    }
                } else if (!num7.equals(stepIntersection.geometryIndex())) {
                    return false;
                }
                Boolean bool6 = this.isUrban;
                if (bool6 == null) {
                    if (stepIntersection.isUrban() != null) {
                        return false;
                    }
                } else if (!bool6.equals(stepIntersection.isUrban())) {
                    return false;
                }
                Integer num8 = this.adminIndex;
                if (num8 == null) {
                    if (stepIntersection.adminIndex() != null) {
                        return false;
                    }
                } else if (!num8.equals(stepIntersection.adminIndex())) {
                    return false;
                }
                RestStop restStop2 = this.restStop;
                if (restStop2 == null) {
                    if (stepIntersection.restStop() != null) {
                        return false;
                    }
                } else if (!restStop2.equals(stepIntersection.restStop())) {
                    return false;
                }
                TollCollection tollCollection2 = this.tollCollection;
                if (tollCollection2 == null) {
                    if (stepIntersection.tollCollection() != null) {
                        return false;
                    }
                } else if (!tollCollection2.equals(stepIntersection.tollCollection())) {
                    return false;
                }
                MapboxStreetsV8 mapboxStreetsV9 = this.mapboxStreetsV8;
                if (mapboxStreetsV9 == null) {
                    if (stepIntersection.mapboxStreetsV8() != null) {
                        return false;
                    }
                } else if (!mapboxStreetsV9.equals(stepIntersection.mapboxStreetsV8())) {
                    return false;
                }
                String str2 = this.tunnelName;
                if (str2 == null) {
                    if (stepIntersection.tunnelName() != null) {
                        return false;
                    }
                } else if (!str2.equals(stepIntersection.tunnelName())) {
                    return false;
                }
                Boolean bool7 = this.railwayCrossing;
                if (bool7 == null) {
                    if (stepIntersection.railwayCrossing() != null) {
                        return false;
                    }
                } else if (!bool7.equals(stepIntersection.railwayCrossing())) {
                    return false;
                }
                Boolean bool8 = this.trafficSignal;
                if (bool8 == null) {
                    if (stepIntersection.trafficSignal() != null) {
                        return false;
                    }
                } else if (!bool8.equals(stepIntersection.trafficSignal())) {
                    return false;
                }
                Boolean bool9 = this.stopSign;
                if (bool9 == null) {
                    if (stepIntersection.stopSign() != null) {
                        return false;
                    }
                } else if (!bool9.equals(stepIntersection.stopSign())) {
                    return false;
                }
                Boolean bool10 = this.yieldSign;
                if (bool10 == null) {
                    if (stepIntersection.yieldSign() != null) {
                        return false;
                    }
                } else if (!bool10.equals(stepIntersection.yieldSign())) {
                    return false;
                }
                Interchange interchange2 = this.interchange;
                if (interchange2 == null) {
                    if (stepIntersection.interchange() != null) {
                        return false;
                    }
                } else if (!interchange2.equals(stepIntersection.interchange())) {
                    return false;
                }
                Junction junction2 = this.junction;
                if (junction2 == null) {
                    if (stepIntersection.junction() != null) {
                        return false;
                    }
                } else if (!junction2.equals(stepIntersection.junction())) {
                    return false;
                }
                MergingArea mergingArea2 = this.mergingArea;
                if (mergingArea2 == null) {
                    if (stepIntersection.mergingArea() != null) {
                        return false;
                    }
                } else if (!mergingArea2.equals(stepIntersection.mergingArea())) {
                    return false;
                }
                Double d2 = this.duration;
                if (d2 == null) {
                    if (stepIntersection.duration() != null) {
                        return false;
                    }
                } else if (!d2.equals(stepIntersection.duration())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                return "StepIntersection{unrecognized=" + this.unrecognized + ", rawLocation=" + Arrays.toString(this.rawLocation) + ", bearings=" + this.bearings + ", classes=" + this.classes + ", entry=" + this.entry + ", formOfWay=" + this.formOfWay + ", geometries=" + this.geometries + ", access=" + this.access + ", elevated=" + this.elevated + ", bridges=" + this.bridges + ", in=" + this.in + ", out=" + this.out + ", lanes=" + this.lanes + ", geometryIndex=" + this.geometryIndex + ", isUrban=" + this.isUrban + ", adminIndex=" + this.adminIndex + ", restStop=" + this.restStop + ", tollCollection=" + this.tollCollection + ", mapboxStreetsV8=" + this.mapboxStreetsV8 + ", tunnelName=" + this.tunnelName + ", railwayCrossing=" + this.railwayCrossing + ", trafficSignal=" + this.trafficSignal + ", stopSign=" + this.stopSign + ", yieldSign=" + this.yieldSign + ", interchange=" + this.interchange + ", junction=" + this.junction + ", mergingArea=" + this.mergingArea + ", duration=" + this.duration + "}";
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = Arrays.hashCode(this.rawLocation);
                List<Integer> list10 = this.bearings;
                int iHashCode3 = list10 == null ? 0 : list10.hashCode();
                List<String> list11 = this.classes;
                int iHashCode4 = list11 == null ? 0 : list11.hashCode();
                List<Boolean> list12 = this.entry;
                int iHashCode5 = list12 == null ? 0 : list12.hashCode();
                List<String> list13 = this.formOfWay;
                int iHashCode6 = list13 == null ? 0 : list13.hashCode();
                List<String> list14 = this.geometries;
                int iHashCode7 = list14 == null ? 0 : list14.hashCode();
                List<Integer> list15 = this.access;
                int iHashCode8 = list15 == null ? 0 : list15.hashCode();
                List<Boolean> list16 = this.elevated;
                int iHashCode9 = list16 == null ? 0 : list16.hashCode();
                List<Boolean> list17 = this.bridges;
                int iHashCode10 = list17 == null ? 0 : list17.hashCode();
                Integer num5 = this.in;
                int iHashCode11 = num5 == null ? 0 : num5.hashCode();
                Integer num6 = this.out;
                int iHashCode12 = num6 == null ? 0 : num6.hashCode();
                List<IntersectionLanes> list18 = this.lanes;
                int iHashCode13 = list18 == null ? 0 : list18.hashCode();
                Integer num7 = this.geometryIndex;
                int iHashCode14 = num7 == null ? 0 : num7.hashCode();
                Boolean bool6 = this.isUrban;
                int iHashCode15 = bool6 == null ? 0 : bool6.hashCode();
                Integer num8 = this.adminIndex;
                int iHashCode16 = num8 == null ? 0 : num8.hashCode();
                RestStop restStop2 = this.restStop;
                int iHashCode17 = restStop2 == null ? 0 : restStop2.hashCode();
                TollCollection tollCollection2 = this.tollCollection;
                int iHashCode18 = tollCollection2 == null ? 0 : tollCollection2.hashCode();
                MapboxStreetsV8 mapboxStreetsV9 = this.mapboxStreetsV8;
                int iHashCode19 = mapboxStreetsV9 == null ? 0 : mapboxStreetsV9.hashCode();
                String str2 = this.tunnelName;
                int iHashCode20 = str2 == null ? 0 : str2.hashCode();
                Boolean bool7 = this.railwayCrossing;
                int iHashCode21 = bool7 == null ? 0 : bool7.hashCode();
                Boolean bool8 = this.trafficSignal;
                int iHashCode22 = bool8 == null ? 0 : bool8.hashCode();
                Boolean bool9 = this.stopSign;
                int iHashCode23 = bool9 == null ? 0 : bool9.hashCode();
                Boolean bool10 = this.yieldSign;
                int iHashCode24 = bool10 == null ? 0 : bool10.hashCode();
                Interchange interchange2 = this.interchange;
                int iHashCode25 = interchange2 == null ? 0 : interchange2.hashCode();
                Junction junction2 = this.junction;
                int iHashCode26 = junction2 == null ? 0 : junction2.hashCode();
                MergingArea mergingArea2 = this.mergingArea;
                int iHashCode27 = mergingArea2 == null ? 0 : mergingArea2.hashCode();
                Double d2 = this.duration;
                return ((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ iHashCode15) * 1000003) ^ iHashCode16) * 1000003) ^ iHashCode17) * 1000003) ^ iHashCode18) * 1000003) ^ iHashCode19) * 1000003) ^ iHashCode20) * 1000003) ^ iHashCode21) * 1000003) ^ iHashCode22) * 1000003) ^ iHashCode23) * 1000003) ^ iHashCode24) * 1000003) ^ iHashCode25) * 1000003) ^ iHashCode26) * 1000003) ^ iHashCode27) * 1000003) ^ (d2 == null ? 0 : d2.hashCode());
            }
        };
    }
}
