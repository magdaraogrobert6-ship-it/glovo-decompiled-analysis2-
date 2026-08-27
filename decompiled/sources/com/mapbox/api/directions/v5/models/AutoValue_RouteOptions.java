package com.mapbox.api.directions.v5.models;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.DirectionsCriteria$GeometriesCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsFlowCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$OverviewCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$ProfileCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$VoiceUnitCriteria;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RouteOptions extends C$AutoValue_RouteOptions {

    public static final class GsonTypeAdapter extends TypeAdapter<RouteOptions> {
        private volatile TypeAdapter<Boolean> boolean__adapter;
        private volatile TypeAdapter<Double> double__adapter;
        private final Gson gson;
        private volatile TypeAdapter<String> string_adapter;

        public String toString() {
            return "TypeAdapter(RouteOptions)";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, RouteOptions routeOptions) throws IOException {
            if (routeOptions == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            if (routeOptions.unrecognized() != null) {
                for (Map.Entry<String, SerializableJsonElement> entry : routeOptions.unrecognized().entrySet()) {
                    jsonWriter.name(entry.getKey());
                    JsonElement jsonElement = entry.getValue().element;
                    r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(jsonElement, this.gson, jsonWriter, jsonElement);
                }
            }
            jsonWriter.name("baseUrl");
            if (routeOptions.baseUrl() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter = this.string_adapter;
                if (adapter == null) {
                    adapter = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter;
                }
                adapter.write(jsonWriter, routeOptions.baseUrl());
            }
            jsonWriter.name(FeedbackEvent.UI);
            if (routeOptions.user() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter2 = this.string_adapter;
                if (adapter2 == null) {
                    adapter2 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter2;
                }
                adapter2.write(jsonWriter, routeOptions.user());
            }
            jsonWriter.name("profile");
            if (routeOptions.profile() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter3 = this.string_adapter;
                if (adapter3 == null) {
                    adapter3 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter3;
                }
                adapter3.write(jsonWriter, routeOptions.profile());
            }
            jsonWriter.name("coordinates");
            if (routeOptions.coordinates() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter4 = this.string_adapter;
                if (adapter4 == null) {
                    adapter4 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter4;
                }
                adapter4.write(jsonWriter, routeOptions.coordinates());
            }
            jsonWriter.name("alternatives");
            if (routeOptions.alternatives() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter5 = this.boolean__adapter;
                if (adapter5 == null) {
                    adapter5 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter5;
                }
                adapter5.write(jsonWriter, routeOptions.alternatives());
            }
            jsonWriter.name("language");
            if (routeOptions.language() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter6 = this.string_adapter;
                if (adapter6 == null) {
                    adapter6 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter6;
                }
                adapter6.write(jsonWriter, routeOptions.language());
            }
            jsonWriter.name("radiuses");
            if (routeOptions.radiuses() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter7 = this.string_adapter;
                if (adapter7 == null) {
                    adapter7 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter7;
                }
                adapter7.write(jsonWriter, routeOptions.radiuses());
            }
            jsonWriter.name("bearings");
            if (routeOptions.bearings() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter8 = this.string_adapter;
                if (adapter8 == null) {
                    adapter8 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter8;
                }
                adapter8.write(jsonWriter, routeOptions.bearings());
            }
            jsonWriter.name("avoid_maneuver_radius");
            if (routeOptions.avoidManeuverRadius() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter9 = this.double__adapter;
                if (adapter9 == null) {
                    adapter9 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter9;
                }
                adapter9.write(jsonWriter, routeOptions.avoidManeuverRadius());
            }
            jsonWriter.name("layers");
            if (routeOptions.layers() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter10 = this.string_adapter;
                if (adapter10 == null) {
                    adapter10 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter10;
                }
                adapter10.write(jsonWriter, routeOptions.layers());
            }
            jsonWriter.name("continue_straight");
            if (routeOptions.continueStraight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter11 = this.boolean__adapter;
                if (adapter11 == null) {
                    adapter11 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter11;
                }
                adapter11.write(jsonWriter, routeOptions.continueStraight());
            }
            jsonWriter.name("roundabout_exits");
            if (routeOptions.roundaboutExits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter12 = this.boolean__adapter;
                if (adapter12 == null) {
                    adapter12 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter12;
                }
                adapter12.write(jsonWriter, routeOptions.roundaboutExits());
            }
            jsonWriter.name("geometries");
            if (routeOptions.geometries() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter13 = this.string_adapter;
                if (adapter13 == null) {
                    adapter13 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter13;
                }
                adapter13.write(jsonWriter, routeOptions.geometries());
            }
            jsonWriter.name("overview");
            if (routeOptions.overview() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter14 = this.string_adapter;
                if (adapter14 == null) {
                    adapter14 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter14;
                }
                adapter14.write(jsonWriter, routeOptions.overview());
            }
            jsonWriter.name(ContainerStep.STEPS);
            if (routeOptions.steps() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter15 = this.boolean__adapter;
                if (adapter15 == null) {
                    adapter15 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter15;
                }
                adapter15.write(jsonWriter, routeOptions.steps());
            }
            jsonWriter.name("annotations");
            if (routeOptions.annotations() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter16 = this.string_adapter;
                if (adapter16 == null) {
                    adapter16 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter16;
                }
                adapter16.write(jsonWriter, routeOptions.annotations());
            }
            jsonWriter.name("exclude");
            if (routeOptions.exclude() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter17 = this.string_adapter;
                if (adapter17 == null) {
                    adapter17 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter17;
                }
                adapter17.write(jsonWriter, routeOptions.exclude());
            }
            jsonWriter.name("include");
            if (routeOptions.include() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter18 = this.string_adapter;
                if (adapter18 == null) {
                    adapter18 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter18;
                }
                adapter18.write(jsonWriter, routeOptions.include());
            }
            jsonWriter.name("voice_instructions");
            if (routeOptions.voiceInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter19 = this.boolean__adapter;
                if (adapter19 == null) {
                    adapter19 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter19;
                }
                adapter19.write(jsonWriter, routeOptions.voiceInstructions());
            }
            jsonWriter.name("banner_instructions");
            if (routeOptions.bannerInstructions() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter20 = this.boolean__adapter;
                if (adapter20 == null) {
                    adapter20 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter20;
                }
                adapter20.write(jsonWriter, routeOptions.bannerInstructions());
            }
            jsonWriter.name("voice_units");
            if (routeOptions.voiceUnits() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter21 = this.string_adapter;
                if (adapter21 == null) {
                    adapter21 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter21;
                }
                adapter21.write(jsonWriter, routeOptions.voiceUnits());
            }
            jsonWriter.name("approaches");
            if (routeOptions.approaches() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter22 = this.string_adapter;
                if (adapter22 == null) {
                    adapter22 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter22;
                }
                adapter22.write(jsonWriter, routeOptions.approaches());
            }
            jsonWriter.name("waypoints");
            if (routeOptions.waypointIndices() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter23 = this.string_adapter;
                if (adapter23 == null) {
                    adapter23 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter23;
                }
                adapter23.write(jsonWriter, routeOptions.waypointIndices());
            }
            jsonWriter.name("waypoint_names");
            if (routeOptions.waypointNames() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter24 = this.string_adapter;
                if (adapter24 == null) {
                    adapter24 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter24;
                }
                adapter24.write(jsonWriter, routeOptions.waypointNames());
            }
            jsonWriter.name("waypoint_targets");
            if (routeOptions.waypointTargets() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter25 = this.string_adapter;
                if (adapter25 == null) {
                    adapter25 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter25;
                }
                adapter25.write(jsonWriter, routeOptions.waypointTargets());
            }
            jsonWriter.name("waypoints_per_route");
            if (routeOptions.waypointsPerRoute() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter26 = this.boolean__adapter;
                if (adapter26 == null) {
                    adapter26 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter26;
                }
                adapter26.write(jsonWriter, routeOptions.waypointsPerRoute());
            }
            jsonWriter.name("alley_bias");
            if (routeOptions.alleyBias() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter27 = this.double__adapter;
                if (adapter27 == null) {
                    adapter27 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter27;
                }
                adapter27.write(jsonWriter, routeOptions.alleyBias());
            }
            jsonWriter.name("walking_speed");
            if (routeOptions.walkingSpeed() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter28 = this.double__adapter;
                if (adapter28 == null) {
                    adapter28 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter28;
                }
                adapter28.write(jsonWriter, routeOptions.walkingSpeed());
            }
            jsonWriter.name("walkway_bias");
            if (routeOptions.walkwayBias() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter29 = this.double__adapter;
                if (adapter29 == null) {
                    adapter29 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter29;
                }
                adapter29.write(jsonWriter, routeOptions.walkwayBias());
            }
            jsonWriter.name("snapping_include_closures");
            if (routeOptions.snappingIncludeClosures() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter30 = this.string_adapter;
                if (adapter30 == null) {
                    adapter30 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter30;
                }
                adapter30.write(jsonWriter, routeOptions.snappingIncludeClosures());
            }
            jsonWriter.name("snapping_include_static_closures");
            if (routeOptions.snappingIncludeStaticClosures() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter31 = this.string_adapter;
                if (adapter31 == null) {
                    adapter31 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter31;
                }
                adapter31.write(jsonWriter, routeOptions.snappingIncludeStaticClosures());
            }
            jsonWriter.name("arrive_by");
            if (routeOptions.arriveBy() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter32 = this.string_adapter;
                if (adapter32 == null) {
                    adapter32 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter32;
                }
                adapter32.write(jsonWriter, routeOptions.arriveBy());
            }
            jsonWriter.name("depart_at");
            if (routeOptions.departAt() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter33 = this.string_adapter;
                if (adapter33 == null) {
                    adapter33 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter33;
                }
                adapter33.write(jsonWriter, routeOptions.departAt());
            }
            jsonWriter.name("max_height");
            if (routeOptions.maxHeight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter34 = this.double__adapter;
                if (adapter34 == null) {
                    adapter34 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter34;
                }
                adapter34.write(jsonWriter, routeOptions.maxHeight());
            }
            jsonWriter.name("max_width");
            if (routeOptions.maxWidth() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter35 = this.double__adapter;
                if (adapter35 == null) {
                    adapter35 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter35;
                }
                adapter35.write(jsonWriter, routeOptions.maxWidth());
            }
            jsonWriter.name("max_weight");
            if (routeOptions.maxWeight() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Double> adapter36 = this.double__adapter;
                if (adapter36 == null) {
                    adapter36 = this.gson.getAdapter(Double.class);
                    this.double__adapter = adapter36;
                }
                adapter36.write(jsonWriter, routeOptions.maxWeight());
            }
            jsonWriter.name("enable_refresh");
            if (routeOptions.enableRefresh() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter37 = this.boolean__adapter;
                if (adapter37 == null) {
                    adapter37 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter37;
                }
                adapter37.write(jsonWriter, routeOptions.enableRefresh());
            }
            jsonWriter.name("compute_toll_cost");
            if (routeOptions.computeTollCost() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter38 = this.boolean__adapter;
                if (adapter38 == null) {
                    adapter38 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter38;
                }
                adapter38.write(jsonWriter, routeOptions.computeTollCost());
            }
            jsonWriter.name("metadata");
            if (routeOptions.metadata() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter39 = this.boolean__adapter;
                if (adapter39 == null) {
                    adapter39 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter39;
                }
                adapter39.write(jsonWriter, routeOptions.metadata());
            }
            jsonWriter.name("payment_methods");
            if (routeOptions.paymentMethods() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter40 = this.string_adapter;
                if (adapter40 == null) {
                    adapter40 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter40;
                }
                adapter40.write(jsonWriter, routeOptions.paymentMethods());
            }
            jsonWriter.name("suppress_voice_instruction_local_names");
            if (routeOptions.suppressVoiceInstructionLocalNames() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter41 = this.boolean__adapter;
                if (adapter41 == null) {
                    adapter41 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter41;
                }
                adapter41.write(jsonWriter, routeOptions.suppressVoiceInstructionLocalNames());
            }
            jsonWriter.name("intersection_link_form_of_way");
            if (routeOptions.intersectionLinkFormOfWay() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter42 = this.boolean__adapter;
                if (adapter42 == null) {
                    adapter42 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter42;
                }
                adapter42.write(jsonWriter, routeOptions.intersectionLinkFormOfWay());
            }
            jsonWriter.name("intersection_link_geometry");
            if (routeOptions.intersectionLinkGeometry() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter43 = this.string_adapter;
                if (adapter43 == null) {
                    adapter43 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter43;
                }
                adapter43.write(jsonWriter, routeOptions.intersectionLinkGeometry());
            }
            jsonWriter.name("intersection_link_access");
            if (routeOptions.intersectionLinkAccess() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter44 = this.boolean__adapter;
                if (adapter44 == null) {
                    adapter44 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter44;
                }
                adapter44.write(jsonWriter, routeOptions.intersectionLinkAccess());
            }
            jsonWriter.name("intersection_link_elevated");
            if (routeOptions.intersectionLinkElevated() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter45 = this.boolean__adapter;
                if (adapter45 == null) {
                    adapter45 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter45;
                }
                adapter45.write(jsonWriter, routeOptions.intersectionLinkElevated());
            }
            jsonWriter.name("intersection_link_bridge");
            if (routeOptions.intersectionLinkBridge() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> adapter46 = this.boolean__adapter;
                if (adapter46 == null) {
                    adapter46 = this.gson.getAdapter(Boolean.class);
                    this.boolean__adapter = adapter46;
                }
                adapter46.write(jsonWriter, routeOptions.intersectionLinkBridge());
            }
            jsonWriter.name("notifications");
            if (routeOptions.notifications() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> adapter47 = this.string_adapter;
                if (adapter47 == null) {
                    adapter47 = this.gson.getAdapter(String.class);
                    this.string_adapter = adapter47;
                }
                adapter47.write(jsonWriter, routeOptions.notifications());
            }
            jsonWriter.endObject();
        }

        public GsonTypeAdapter(Gson gson) {
            this.gson = gson;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code duplicated, block: B:135:0x01c2  */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public RouteOptions read2(JsonReader jsonReader) throws IOException {
            LinkedHashMap linkedHashMap = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            RouteOptions.Builder builder = RouteOptions.builder();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    strNextName.getClass();
                    switch (strNextName) {
                        case "banner_instructions":
                            TypeAdapter<Boolean> adapter = this.boolean__adapter;
                            if (adapter == null) {
                                adapter = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter;
                            }
                            builder.bannerInstructions(adapter.read2(jsonReader));
                            break;
                        case "payment_methods":
                            TypeAdapter<String> adapter2 = this.string_adapter;
                            if (adapter2 == null) {
                                adapter2 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter2;
                            }
                            builder.paymentMethods(adapter2.read2(jsonReader));
                            break;
                        case "alley_bias":
                            TypeAdapter<Double> adapter3 = this.double__adapter;
                            if (adapter3 == null) {
                                adapter3 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter3;
                            }
                            builder.alleyBias(adapter3.read2(jsonReader));
                            break;
                        case "voice_instructions":
                            TypeAdapter<Boolean> adapter4 = this.boolean__adapter;
                            if (adapter4 == null) {
                                adapter4 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter4;
                            }
                            builder.voiceInstructions(adapter4.read2(jsonReader));
                            break;
                        case "depart_at":
                            TypeAdapter<String> adapter5 = this.string_adapter;
                            if (adapter5 == null) {
                                adapter5 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter5;
                            }
                            builder.departAt(adapter5.read2(jsonReader));
                            break;
                        case "arrive_by":
                            TypeAdapter<String> adapter6 = this.string_adapter;
                            if (adapter6 == null) {
                                adapter6 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter6;
                            }
                            builder.arriveBy(adapter6.read2(jsonReader));
                            break;
                        case "avoid_maneuver_radius":
                            TypeAdapter<Double> adapter7 = this.double__adapter;
                            if (adapter7 == null) {
                                adapter7 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter7;
                            }
                            builder.avoidManeuverRadius(adapter7.read2(jsonReader));
                            break;
                        case "waypoint_targets":
                            TypeAdapter<String> adapter8 = this.string_adapter;
                            if (adapter8 == null) {
                                adapter8 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter8;
                            }
                            builder.waypointTargets(adapter8.read2(jsonReader));
                            break;
                        case "intersection_link_elevated":
                            TypeAdapter<Boolean> adapter9 = this.boolean__adapter;
                            if (adapter9 == null) {
                                adapter9 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter9;
                            }
                            builder.intersectionLinkElevated(adapter9.read2(jsonReader));
                            break;
                        case "suppress_voice_instruction_local_names":
                            TypeAdapter<Boolean> adapter10 = this.boolean__adapter;
                            if (adapter10 == null) {
                                adapter10 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter10;
                            }
                            builder.suppressVoiceInstructionLocalNames(adapter10.read2(jsonReader));
                            break;
                        case "enable_refresh":
                            TypeAdapter<Boolean> adapter11 = this.boolean__adapter;
                            if (adapter11 == null) {
                                adapter11 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter11;
                            }
                            builder.enableRefresh(adapter11.read2(jsonReader));
                            break;
                        case "metadata":
                            TypeAdapter<Boolean> adapter12 = this.boolean__adapter;
                            if (adapter12 == null) {
                                adapter12 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter12;
                            }
                            builder.metadata(adapter12.read2(jsonReader));
                            break;
                        case "max_width":
                            TypeAdapter<Double> adapter13 = this.double__adapter;
                            if (adapter13 == null) {
                                adapter13 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter13;
                            }
                            builder.maxWidth(adapter13.read2(jsonReader));
                            break;
                        case "continue_straight":
                            TypeAdapter<Boolean> adapter14 = this.boolean__adapter;
                            if (adapter14 == null) {
                                adapter14 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter14;
                            }
                            builder.continueStraight(adapter14.read2(jsonReader));
                            break;
                        case "snapping_include_closures":
                            TypeAdapter<String> adapter15 = this.string_adapter;
                            if (adapter15 == null) {
                                adapter15 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter15;
                            }
                            builder.snappingIncludeClosures(adapter15.read2(jsonReader));
                            break;
                        case "waypoints":
                            TypeAdapter<String> adapter16 = this.string_adapter;
                            if (adapter16 == null) {
                                adapter16 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter16;
                            }
                            builder.waypointIndices(adapter16.read2(jsonReader));
                            break;
                        case "voice_units":
                            TypeAdapter<String> adapter17 = this.string_adapter;
                            if (adapter17 == null) {
                                adapter17 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter17;
                            }
                            builder.voiceUnits(adapter17.read2(jsonReader));
                            break;
                        case "waypoints_per_route":
                            TypeAdapter<Boolean> adapter18 = this.boolean__adapter;
                            if (adapter18 == null) {
                                adapter18 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter18;
                            }
                            builder.waypointsPerRoute(adapter18.read2(jsonReader));
                            break;
                        case "walking_speed":
                            TypeAdapter<Double> adapter19 = this.double__adapter;
                            if (adapter19 == null) {
                                adapter19 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter19;
                            }
                            builder.walkingSpeed(adapter19.read2(jsonReader));
                            break;
                        case "waypoint_names":
                            TypeAdapter<String> adapter20 = this.string_adapter;
                            if (adapter20 == null) {
                                adapter20 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter20;
                            }
                            builder.waypointNames(adapter20.read2(jsonReader));
                            break;
                        case "walkway_bias":
                            TypeAdapter<Double> adapter21 = this.double__adapter;
                            if (adapter21 == null) {
                                adapter21 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter21;
                            }
                            builder.walkwayBias(adapter21.read2(jsonReader));
                            break;
                        case "intersection_link_geometry":
                            TypeAdapter<String> adapter22 = this.string_adapter;
                            if (adapter22 == null) {
                                adapter22 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter22;
                            }
                            builder.intersectionLinkGeometry(adapter22.read2(jsonReader));
                            break;
                        case "intersection_link_access":
                            TypeAdapter<Boolean> adapter23 = this.boolean__adapter;
                            if (adapter23 == null) {
                                adapter23 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter23;
                            }
                            builder.intersectionLinkAccess(adapter23.read2(jsonReader));
                            break;
                        case "max_height":
                            TypeAdapter<Double> adapter24 = this.double__adapter;
                            if (adapter24 == null) {
                                adapter24 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter24;
                            }
                            builder.maxHeight(adapter24.read2(jsonReader));
                            break;
                        case "intersection_link_bridge":
                            TypeAdapter<Boolean> adapter25 = this.boolean__adapter;
                            if (adapter25 == null) {
                                adapter25 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter25;
                            }
                            builder.intersectionLinkBridge(adapter25.read2(jsonReader));
                            break;
                        case "compute_toll_cost":
                            TypeAdapter<Boolean> adapter26 = this.boolean__adapter;
                            if (adapter26 == null) {
                                adapter26 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter26;
                            }
                            builder.computeTollCost(adapter26.read2(jsonReader));
                            break;
                        case "intersection_link_form_of_way":
                            TypeAdapter<Boolean> adapter27 = this.boolean__adapter;
                            if (adapter27 == null) {
                                adapter27 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter27;
                            }
                            builder.intersectionLinkFormOfWay(adapter27.read2(jsonReader));
                            break;
                        case "max_weight":
                            TypeAdapter<Double> adapter28 = this.double__adapter;
                            if (adapter28 == null) {
                                adapter28 = this.gson.getAdapter(Double.class);
                                this.double__adapter = adapter28;
                            }
                            builder.maxWeight(adapter28.read2(jsonReader));
                            break;
                        case "snapping_include_static_closures":
                            TypeAdapter<String> adapter29 = this.string_adapter;
                            if (adapter29 == null) {
                                adapter29 = this.gson.getAdapter(String.class);
                                this.string_adapter = adapter29;
                            }
                            builder.snappingIncludeStaticClosures(adapter29.read2(jsonReader));
                            break;
                        case "roundabout_exits":
                            TypeAdapter<Boolean> adapter30 = this.boolean__adapter;
                            if (adapter30 == null) {
                                adapter30 = this.gson.getAdapter(Boolean.class);
                                this.boolean__adapter = adapter30;
                            }
                            builder.roundaboutExits(adapter30.read2(jsonReader));
                            break;
                        default:
                            if ("baseUrl".equals(strNextName)) {
                                TypeAdapter<String> adapter31 = this.string_adapter;
                                if (adapter31 == null) {
                                    adapter31 = this.gson.getAdapter(String.class);
                                    this.string_adapter = adapter31;
                                }
                                builder.baseUrl(adapter31.read2(jsonReader));
                                break;
                            } else {
                                if (FeedbackEvent.UI.equals(strNextName)) {
                                    TypeAdapter<String> adapter32 = this.string_adapter;
                                    if (adapter32 == null) {
                                        adapter32 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter32;
                                    }
                                    builder.user(adapter32.read2(jsonReader));
                                } else if ("profile".equals(strNextName)) {
                                    TypeAdapter<String> adapter33 = this.string_adapter;
                                    if (adapter33 == null) {
                                        adapter33 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter33;
                                    }
                                    builder.profile(adapter33.read2(jsonReader));
                                } else if ("coordinates".equals(strNextName)) {
                                    TypeAdapter<String> adapter34 = this.string_adapter;
                                    if (adapter34 == null) {
                                        adapter34 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter34;
                                    }
                                    builder.coordinates(adapter34.read2(jsonReader));
                                } else if ("alternatives".equals(strNextName)) {
                                    TypeAdapter<Boolean> adapter35 = this.boolean__adapter;
                                    if (adapter35 == null) {
                                        adapter35 = this.gson.getAdapter(Boolean.class);
                                        this.boolean__adapter = adapter35;
                                    }
                                    builder.alternatives(adapter35.read2(jsonReader));
                                } else if ("language".equals(strNextName)) {
                                    TypeAdapter<String> adapter36 = this.string_adapter;
                                    if (adapter36 == null) {
                                        adapter36 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter36;
                                    }
                                    builder.language(adapter36.read2(jsonReader));
                                } else if ("radiuses".equals(strNextName)) {
                                    TypeAdapter<String> adapter37 = this.string_adapter;
                                    if (adapter37 == null) {
                                        adapter37 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter37;
                                    }
                                    builder.radiuses(adapter37.read2(jsonReader));
                                } else if ("bearings".equals(strNextName)) {
                                    TypeAdapter<String> adapter38 = this.string_adapter;
                                    if (adapter38 == null) {
                                        adapter38 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter38;
                                    }
                                    builder.bearings(adapter38.read2(jsonReader));
                                } else if ("layers".equals(strNextName)) {
                                    TypeAdapter<String> adapter39 = this.string_adapter;
                                    if (adapter39 == null) {
                                        adapter39 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter39;
                                    }
                                    builder.layers(adapter39.read2(jsonReader));
                                } else if ("geometries".equals(strNextName)) {
                                    TypeAdapter<String> adapter40 = this.string_adapter;
                                    if (adapter40 == null) {
                                        adapter40 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter40;
                                    }
                                    builder.geometries(adapter40.read2(jsonReader));
                                } else if ("overview".equals(strNextName)) {
                                    TypeAdapter<String> adapter41 = this.string_adapter;
                                    if (adapter41 == null) {
                                        adapter41 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter41;
                                    }
                                    builder.overview(adapter41.read2(jsonReader));
                                } else if (ContainerStep.STEPS.equals(strNextName)) {
                                    TypeAdapter<Boolean> adapter42 = this.boolean__adapter;
                                    if (adapter42 == null) {
                                        adapter42 = this.gson.getAdapter(Boolean.class);
                                        this.boolean__adapter = adapter42;
                                    }
                                    builder.steps(adapter42.read2(jsonReader));
                                } else if ("annotations".equals(strNextName)) {
                                    TypeAdapter<String> adapter43 = this.string_adapter;
                                    if (adapter43 == null) {
                                        adapter43 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter43;
                                    }
                                    builder.annotations(adapter43.read2(jsonReader));
                                } else if ("exclude".equals(strNextName)) {
                                    TypeAdapter<String> adapter44 = this.string_adapter;
                                    if (adapter44 == null) {
                                        adapter44 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter44;
                                    }
                                    builder.exclude(adapter44.read2(jsonReader));
                                } else if ("include".equals(strNextName)) {
                                    TypeAdapter<String> adapter45 = this.string_adapter;
                                    if (adapter45 == null) {
                                        adapter45 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter45;
                                    }
                                    builder.include(adapter45.read2(jsonReader));
                                } else if ("approaches".equals(strNextName)) {
                                    TypeAdapter<String> adapter46 = this.string_adapter;
                                    if (adapter46 == null) {
                                        adapter46 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter46;
                                    }
                                    builder.approaches(adapter46.read2(jsonReader));
                                } else if (!"notifications".equals(strNextName)) {
                                    if (linkedHashMap == null) {
                                        linkedHashMap = new LinkedHashMap();
                                        builder.unrecognized(linkedHashMap);
                                    }
                                    SweepGradientShader9KIMszodefault.serializer((JsonElement) this.gson.fromJson(jsonReader, JsonElement.class), linkedHashMap, strNextName);
                                } else {
                                    TypeAdapter<String> adapter47 = this.string_adapter;
                                    if (adapter47 == null) {
                                        adapter47 = this.gson.getAdapter(String.class);
                                        this.string_adapter = adapter47;
                                    }
                                    builder.notifications(adapter47.read2(jsonReader));
                                }
                                break;
                            }
                            break;
                    }
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
            return builder.build();
        }
    }

    public AutoValue_RouteOptions(final Map<String, SerializableJsonElement> map, final String str, final String str2, final String str3, final String str4, final Boolean bool, final String str5, final String str6, final String str7, final Double d, final String str8, final Boolean bool2, final Boolean bool3, final String str9, final String str10, final Boolean bool4, final String str11, final String str12, final String str13, final Boolean bool5, final Boolean bool6, final String str14, final String str15, final String str16, final String str17, final String str18, final Boolean bool7, final Double d2, final Double d3, final Double d4, final String str19, final String str20, final String str21, final String str22, final Double d5, final Double d6, final Double d7, final Boolean bool8, final Boolean bool9, final Boolean bool10, final String str23, final Boolean bool11, final Boolean bool12, final String str24, final Boolean bool13, final Boolean bool14, final Boolean bool15, final String str25) {
        new RouteOptions(map, str, str2, str3, str4, bool, str5, str6, str7, d, str8, bool2, bool3, str9, str10, bool4, str11, str12, str13, bool5, bool6, str14, str15, str16, str17, str18, bool7, d2, d3, d4, str19, str20, str21, str22, d5, d6, d7, bool8, bool9, bool10, str23, bool11, bool12, str24, bool13, bool14, bool15, str25) { // from class: com.mapbox.api.directions.v5.models.$AutoValue_RouteOptions
            private final Double alleyBias;
            private final Boolean alternatives;
            private final String annotations;
            private final String approaches;
            private final String arriveBy;
            private final Double avoidManeuverRadius;
            private final Boolean bannerInstructions;
            private final String baseUrl;
            private final String bearings;
            private final Boolean computeTollCost;
            private final Boolean continueStraight;
            private final String coordinates;
            private final String departAt;
            private final Boolean enableRefresh;
            private final String exclude;
            private final String geometries;
            private final String include;
            private final Boolean intersectionLinkAccess;
            private final Boolean intersectionLinkBridge;
            private final Boolean intersectionLinkElevated;
            private final Boolean intersectionLinkFormOfWay;
            private final String intersectionLinkGeometry;
            private final String language;
            private final String layers;
            private final Double maxHeight;
            private final Double maxWeight;
            private final Double maxWidth;
            private final Boolean metadata;
            private final String notifications;
            private final String overview;
            private final String paymentMethods;
            private final String profile;
            private final String radiuses;
            private final Boolean roundaboutExits;
            private final String snappingIncludeClosures;
            private final String snappingIncludeStaticClosures;
            private final Boolean steps;
            private final Boolean suppressVoiceInstructionLocalNames;
            private final Map<String, SerializableJsonElement> unrecognized;
            private final String user;
            private final Boolean voiceInstructions;
            private final String voiceUnits;
            private final Double walkingSpeed;
            private final Double walkwayBias;
            private final String waypointIndices;
            private final String waypointNames;
            private final String waypointTargets;
            private final Boolean waypointsPerRoute;

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_RouteOptions$Builder */
            public static class Builder extends RouteOptions.Builder {
                private Double alleyBias;
                private Boolean alternatives;
                private String annotations;
                private String approaches;
                private String arriveBy;
                private Double avoidManeuverRadius;
                private Boolean bannerInstructions;
                private String baseUrl;
                private String bearings;
                private Boolean computeTollCost;
                private Boolean continueStraight;
                private String coordinates;
                private String departAt;
                private Boolean enableRefresh;
                private String exclude;
                private String geometries;
                private String include;
                private Boolean intersectionLinkAccess;
                private Boolean intersectionLinkBridge;
                private Boolean intersectionLinkElevated;
                private Boolean intersectionLinkFormOfWay;
                private String intersectionLinkGeometry;
                private String language;
                private String layers;
                private Double maxHeight;
                private Double maxWeight;
                private Double maxWidth;
                private Boolean metadata;
                private String notifications;
                private String overview;
                private String paymentMethods;
                private String profile;
                private String radiuses;
                private Boolean roundaboutExits;
                private String snappingIncludeClosures;
                private String snappingIncludeStaticClosures;
                private Boolean steps;
                private Boolean suppressVoiceInstructionLocalNames;
                private Map<String, SerializableJsonElement> unrecognized;
                private String user;
                private Boolean voiceInstructions;
                private String voiceUnits;
                private Double walkingSpeed;
                private Double walkwayBias;
                private String waypointIndices;
                private String waypointNames;
                private String waypointTargets;
                private Boolean waypointsPerRoute;

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder alleyBias(Double d) {
                    this.alleyBias = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder alternatives(Boolean bool) {
                    this.alternatives = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder annotations(String str) {
                    this.annotations = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder approaches(String str) {
                    this.approaches = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder arriveBy(String str) {
                    this.arriveBy = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder avoidManeuverRadius(Double d) {
                    this.avoidManeuverRadius = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder bannerInstructions(Boolean bool) {
                    this.bannerInstructions = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder bearings(String str) {
                    this.bearings = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder computeTollCost(Boolean bool) {
                    this.computeTollCost = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder continueStraight(Boolean bool) {
                    this.continueStraight = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder departAt(String str) {
                    this.departAt = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder enableRefresh(Boolean bool) {
                    this.enableRefresh = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder exclude(String str) {
                    this.exclude = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder include(String str) {
                    this.include = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkAccess(Boolean bool) {
                    this.intersectionLinkAccess = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkBridge(Boolean bool) {
                    this.intersectionLinkBridge = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkElevated(Boolean bool) {
                    this.intersectionLinkElevated = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkFormOfWay(Boolean bool) {
                    this.intersectionLinkFormOfWay = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder intersectionLinkGeometry(String str) {
                    this.intersectionLinkGeometry = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder language(String str) {
                    this.language = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder layers(String str) {
                    this.layers = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder maxHeight(Double d) {
                    this.maxHeight = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder maxWeight(Double d) {
                    this.maxWeight = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder maxWidth(Double d) {
                    this.maxWidth = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder metadata(Boolean bool) {
                    this.metadata = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder notifications(String str) {
                    this.notifications = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder overview(String str) {
                    this.overview = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder paymentMethods(String str) {
                    this.paymentMethods = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder radiuses(String str) {
                    this.radiuses = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder roundaboutExits(Boolean bool) {
                    this.roundaboutExits = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder snappingIncludeClosures(String str) {
                    this.snappingIncludeClosures = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder snappingIncludeStaticClosures(String str) {
                    this.snappingIncludeStaticClosures = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder steps(Boolean bool) {
                    this.steps = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder suppressVoiceInstructionLocalNames(Boolean bool) {
                    this.suppressVoiceInstructionLocalNames = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public /* bridge */ /* synthetic */ DirectionsJsonObject.Builder unrecognized(Map map) {
                    return unrecognized((Map<String, SerializableJsonElement>) map);
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder voiceInstructions(Boolean bool) {
                    this.voiceInstructions = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder voiceUnits(String str) {
                    this.voiceUnits = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder walkingSpeed(Double d) {
                    this.walkingSpeed = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder walkwayBias(Double d) {
                    this.walkwayBias = d;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointIndices(String str) {
                    this.waypointIndices = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointNames(String str) {
                    this.waypointNames = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointTargets(String str) {
                    this.waypointTargets = str;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder waypointsPerRoute(Boolean bool) {
                    this.waypointsPerRoute = bool;
                    return this;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder baseUrl(String str) {
                    if (str != null) {
                        this.baseUrl = str;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null baseUrl");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions build() {
                    String strConcat = this.baseUrl == null ? " baseUrl" : "";
                    if (this.user == null) {
                        strConcat = strConcat.concat(" user");
                    }
                    if (this.profile == null) {
                        strConcat = strConcat.concat(" profile");
                    }
                    if (this.coordinates == null) {
                        strConcat = strConcat.concat(" coordinates");
                    }
                    if (this.geometries == null) {
                        strConcat = strConcat.concat(" geometries");
                    }
                    if (strConcat.isEmpty()) {
                        return new AutoValue_RouteOptions(this.unrecognized, this.baseUrl, this.user, this.profile, this.coordinates, this.alternatives, this.language, this.radiuses, this.bearings, this.avoidManeuverRadius, this.layers, this.continueStraight, this.roundaboutExits, this.geometries, this.overview, this.steps, this.annotations, this.exclude, this.include, this.voiceInstructions, this.bannerInstructions, this.voiceUnits, this.approaches, this.waypointIndices, this.waypointNames, this.waypointTargets, this.waypointsPerRoute, this.alleyBias, this.walkingSpeed, this.walkwayBias, this.snappingIncludeClosures, this.snappingIncludeStaticClosures, this.arriveBy, this.departAt, this.maxHeight, this.maxWidth, this.maxWeight, this.enableRefresh, this.computeTollCost, this.metadata, this.paymentMethods, this.suppressVoiceInstructionLocalNames, this.intersectionLinkFormOfWay, this.intersectionLinkGeometry, this.intersectionLinkAccess, this.intersectionLinkElevated, this.intersectionLinkBridge, this.notifications);
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder coordinates(String str) {
                    if (str != null) {
                        this.coordinates = str;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null coordinates");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder geometries(String str) {
                    if (str != null) {
                        this.geometries = str;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometries");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder profile(String str) {
                    if (str != null) {
                        this.profile = str;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null profile");
                    return null;
                }

                @Override // com.mapbox.api.directions.v5.models.RouteOptions.Builder
                public RouteOptions.Builder user(String str) {
                    if (str != null) {
                        this.user = str;
                        return this;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null user");
                    return null;
                }

                private Builder(RouteOptions routeOptions) {
                    this.unrecognized = routeOptions.unrecognized();
                    this.baseUrl = routeOptions.baseUrl();
                    this.user = routeOptions.user();
                    this.profile = routeOptions.profile();
                    this.coordinates = routeOptions.coordinates();
                    this.alternatives = routeOptions.alternatives();
                    this.language = routeOptions.language();
                    this.radiuses = routeOptions.radiuses();
                    this.bearings = routeOptions.bearings();
                    this.avoidManeuverRadius = routeOptions.avoidManeuverRadius();
                    this.layers = routeOptions.layers();
                    this.continueStraight = routeOptions.continueStraight();
                    this.roundaboutExits = routeOptions.roundaboutExits();
                    this.geometries = routeOptions.geometries();
                    this.overview = routeOptions.overview();
                    this.steps = routeOptions.steps();
                    this.annotations = routeOptions.annotations();
                    this.exclude = routeOptions.exclude();
                    this.include = routeOptions.include();
                    this.voiceInstructions = routeOptions.voiceInstructions();
                    this.bannerInstructions = routeOptions.bannerInstructions();
                    this.voiceUnits = routeOptions.voiceUnits();
                    this.approaches = routeOptions.approaches();
                    this.waypointIndices = routeOptions.waypointIndices();
                    this.waypointNames = routeOptions.waypointNames();
                    this.waypointTargets = routeOptions.waypointTargets();
                    this.waypointsPerRoute = routeOptions.waypointsPerRoute();
                    this.alleyBias = routeOptions.alleyBias();
                    this.walkingSpeed = routeOptions.walkingSpeed();
                    this.walkwayBias = routeOptions.walkwayBias();
                    this.snappingIncludeClosures = routeOptions.snappingIncludeClosures();
                    this.snappingIncludeStaticClosures = routeOptions.snappingIncludeStaticClosures();
                    this.arriveBy = routeOptions.arriveBy();
                    this.departAt = routeOptions.departAt();
                    this.maxHeight = routeOptions.maxHeight();
                    this.maxWidth = routeOptions.maxWidth();
                    this.maxWeight = routeOptions.maxWeight();
                    this.enableRefresh = routeOptions.enableRefresh();
                    this.computeTollCost = routeOptions.computeTollCost();
                    this.metadata = routeOptions.metadata();
                    this.paymentMethods = routeOptions.paymentMethods();
                    this.suppressVoiceInstructionLocalNames = routeOptions.suppressVoiceInstructionLocalNames();
                    this.intersectionLinkFormOfWay = routeOptions.intersectionLinkFormOfWay();
                    this.intersectionLinkGeometry = routeOptions.intersectionLinkGeometry();
                    this.intersectionLinkAccess = routeOptions.intersectionLinkAccess();
                    this.intersectionLinkElevated = routeOptions.intersectionLinkElevated();
                    this.intersectionLinkBridge = routeOptions.intersectionLinkBridge();
                    this.notifications = routeOptions.notifications();
                }

                @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject.Builder
                public RouteOptions.Builder unrecognized(Map<String, SerializableJsonElement> map) {
                    this.unrecognized = map;
                    return this;
                }

                public Builder() {
                }

                public /* synthetic */ Builder(RouteOptions routeOptions, AnonymousClass1 anonymousClass1) {
                    this(routeOptions);
                }
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("alley_bias")
            public Double alleyBias() {
                return this.alleyBias;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public Boolean alternatives() {
                return this.alternatives;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String annotations() {
                return this.annotations;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String approaches() {
                return this.approaches;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("arrive_by")
            public String arriveBy() {
                return this.arriveBy;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("avoid_maneuver_radius")
            public Double avoidManeuverRadius() {
                return this.avoidManeuverRadius;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("banner_instructions")
            public Boolean bannerInstructions() {
                return this.bannerInstructions;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String baseUrl() {
                return this.baseUrl;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String bearings() {
                return this.bearings;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("compute_toll_cost")
            public Boolean computeTollCost() {
                return this.computeTollCost;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("continue_straight")
            public Boolean continueStraight() {
                return this.continueStraight;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String coordinates() {
                return this.coordinates;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("depart_at")
            public String departAt() {
                return this.departAt;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("enable_refresh")
            public Boolean enableRefresh() {
                return this.enableRefresh;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String exclude() {
                return this.exclude;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @DirectionsCriteria$GeometriesCriteria
            public String geometries() {
                return this.geometries;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String include() {
                return this.include;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_access")
            public Boolean intersectionLinkAccess() {
                return this.intersectionLinkAccess;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_bridge")
            public Boolean intersectionLinkBridge() {
                return this.intersectionLinkBridge;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_elevated")
            public Boolean intersectionLinkElevated() {
                return this.intersectionLinkElevated;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_form_of_way")
            public Boolean intersectionLinkFormOfWay() {
                return this.intersectionLinkFormOfWay;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("intersection_link_geometry")
            public String intersectionLinkGeometry() {
                return this.intersectionLinkGeometry;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String language() {
                return this.language;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String layers() {
                return this.layers;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("max_height")
            public Double maxHeight() {
                return this.maxHeight;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("max_weight")
            public Double maxWeight() {
                return this.maxWeight;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("max_width")
            public Double maxWidth() {
                return this.maxWidth;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("metadata")
            public Boolean metadata() {
                return this.metadata;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @DirectionsCriteria$NotificationsFlowCriteria
            public String notifications() {
                return this.notifications;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @DirectionsCriteria$OverviewCriteria
            public String overview() {
                return this.overview;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("payment_methods")
            public String paymentMethods() {
                return this.paymentMethods;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @DirectionsCriteria$ProfileCriteria
            public String profile() {
                return this.profile;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String radiuses() {
                return this.radiuses;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("roundabout_exits")
            public Boolean roundaboutExits() {
                return this.roundaboutExits;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("snapping_include_closures")
            public String snappingIncludeClosures() {
                return this.snappingIncludeClosures;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("snapping_include_static_closures")
            public String snappingIncludeStaticClosures() {
                return this.snappingIncludeStaticClosures;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public Boolean steps() {
                return this.steps;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("suppress_voice_instruction_local_names")
            public Boolean suppressVoiceInstructionLocalNames() {
                return this.suppressVoiceInstructionLocalNames;
            }

            @Override // com.mapbox.api.directions.v5.models.DirectionsJsonObject
            public Map<String, SerializableJsonElement> unrecognized() {
                return this.unrecognized;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public String user() {
                return this.user;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("voice_instructions")
            public Boolean voiceInstructions() {
                return this.voiceInstructions;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("voice_units")
            @DirectionsCriteria$VoiceUnitCriteria
            public String voiceUnits() {
                return this.voiceUnits;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("walking_speed")
            public Double walkingSpeed() {
                return this.walkingSpeed;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("walkway_bias")
            public Double walkwayBias() {
                return this.walkwayBias;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoints")
            public String waypointIndices() {
                return this.waypointIndices;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoint_names")
            public String waypointNames() {
                return this.waypointNames;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoint_targets")
            public String waypointTargets() {
                return this.waypointTargets;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            @SerializedName("waypoints_per_route")
            public Boolean waypointsPerRoute() {
                return this.waypointsPerRoute;
            }

            {
                this.unrecognized = map;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null baseUrl");
                    throw null;
                }
                this.baseUrl = str;
                if (str2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null user");
                    throw null;
                }
                this.user = str2;
                if (str3 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null profile");
                    throw null;
                }
                this.profile = str3;
                if (str4 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null coordinates");
                    throw null;
                }
                this.coordinates = str4;
                this.alternatives = bool;
                this.language = str5;
                this.radiuses = str6;
                this.bearings = str7;
                this.avoidManeuverRadius = d;
                this.layers = str8;
                this.continueStraight = bool2;
                this.roundaboutExits = bool3;
                if (str9 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null geometries");
                    throw null;
                }
                this.geometries = str9;
                this.overview = str10;
                this.steps = bool4;
                this.annotations = str11;
                this.exclude = str12;
                this.include = str13;
                this.voiceInstructions = bool5;
                this.bannerInstructions = bool6;
                this.voiceUnits = str14;
                this.approaches = str15;
                this.waypointIndices = str16;
                this.waypointNames = str17;
                this.waypointTargets = str18;
                this.waypointsPerRoute = bool7;
                this.alleyBias = d2;
                this.walkingSpeed = d3;
                this.walkwayBias = d4;
                this.snappingIncludeClosures = str19;
                this.snappingIncludeStaticClosures = str20;
                this.arriveBy = str21;
                this.departAt = str22;
                this.maxHeight = d5;
                this.maxWidth = d6;
                this.maxWeight = d7;
                this.enableRefresh = bool8;
                this.computeTollCost = bool9;
                this.metadata = bool10;
                this.paymentMethods = str23;
                this.suppressVoiceInstructionLocalNames = bool11;
                this.intersectionLinkFormOfWay = bool12;
                this.intersectionLinkGeometry = str24;
                this.intersectionLinkAccess = bool13;
                this.intersectionLinkElevated = bool14;
                this.intersectionLinkBridge = bool15;
                this.notifications = str25;
            }

            @Override // com.mapbox.api.directions.v5.models.RouteOptions
            public RouteOptions.Builder toBuilder() {
                return new Builder(this, null);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RouteOptions)) {
                    return false;
                }
                RouteOptions routeOptions = (RouteOptions) obj;
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                if (map2 == null) {
                    if (routeOptions.unrecognized() != null) {
                        return false;
                    }
                } else if (!map2.equals(routeOptions.unrecognized())) {
                    return false;
                }
                if (!this.baseUrl.equals(routeOptions.baseUrl()) || !this.user.equals(routeOptions.user()) || !this.profile.equals(routeOptions.profile()) || !this.coordinates.equals(routeOptions.coordinates())) {
                    return false;
                }
                Boolean bool16 = this.alternatives;
                if (bool16 == null) {
                    if (routeOptions.alternatives() != null) {
                        return false;
                    }
                } else if (!bool16.equals(routeOptions.alternatives())) {
                    return false;
                }
                String str26 = this.language;
                if (str26 == null) {
                    if (routeOptions.language() != null) {
                        return false;
                    }
                } else if (!str26.equals(routeOptions.language())) {
                    return false;
                }
                String str27 = this.radiuses;
                if (str27 == null) {
                    if (routeOptions.radiuses() != null) {
                        return false;
                    }
                } else if (!str27.equals(routeOptions.radiuses())) {
                    return false;
                }
                String str28 = this.bearings;
                if (str28 == null) {
                    if (routeOptions.bearings() != null) {
                        return false;
                    }
                } else if (!str28.equals(routeOptions.bearings())) {
                    return false;
                }
                Double d8 = this.avoidManeuverRadius;
                if (d8 == null) {
                    if (routeOptions.avoidManeuverRadius() != null) {
                        return false;
                    }
                } else if (!d8.equals(routeOptions.avoidManeuverRadius())) {
                    return false;
                }
                String str29 = this.layers;
                if (str29 == null) {
                    if (routeOptions.layers() != null) {
                        return false;
                    }
                } else if (!str29.equals(routeOptions.layers())) {
                    return false;
                }
                Boolean bool17 = this.continueStraight;
                if (bool17 == null) {
                    if (routeOptions.continueStraight() != null) {
                        return false;
                    }
                } else if (!bool17.equals(routeOptions.continueStraight())) {
                    return false;
                }
                Boolean bool18 = this.roundaboutExits;
                if (bool18 == null) {
                    if (routeOptions.roundaboutExits() != null) {
                        return false;
                    }
                } else if (!bool18.equals(routeOptions.roundaboutExits())) {
                    return false;
                }
                if (!this.geometries.equals(routeOptions.geometries())) {
                    return false;
                }
                String str30 = this.overview;
                if (str30 == null) {
                    if (routeOptions.overview() != null) {
                        return false;
                    }
                } else if (!str30.equals(routeOptions.overview())) {
                    return false;
                }
                Boolean bool19 = this.steps;
                if (bool19 == null) {
                    if (routeOptions.steps() != null) {
                        return false;
                    }
                } else if (!bool19.equals(routeOptions.steps())) {
                    return false;
                }
                String str31 = this.annotations;
                if (str31 == null) {
                    if (routeOptions.annotations() != null) {
                        return false;
                    }
                } else if (!str31.equals(routeOptions.annotations())) {
                    return false;
                }
                String str32 = this.exclude;
                if (str32 == null) {
                    if (routeOptions.exclude() != null) {
                        return false;
                    }
                } else if (!str32.equals(routeOptions.exclude())) {
                    return false;
                }
                String str33 = this.include;
                if (str33 == null) {
                    if (routeOptions.include() != null) {
                        return false;
                    }
                } else if (!str33.equals(routeOptions.include())) {
                    return false;
                }
                Boolean bool20 = this.voiceInstructions;
                if (bool20 == null) {
                    if (routeOptions.voiceInstructions() != null) {
                        return false;
                    }
                } else if (!bool20.equals(routeOptions.voiceInstructions())) {
                    return false;
                }
                Boolean bool21 = this.bannerInstructions;
                if (bool21 == null) {
                    if (routeOptions.bannerInstructions() != null) {
                        return false;
                    }
                } else if (!bool21.equals(routeOptions.bannerInstructions())) {
                    return false;
                }
                String str34 = this.voiceUnits;
                if (str34 == null) {
                    if (routeOptions.voiceUnits() != null) {
                        return false;
                    }
                } else if (!str34.equals(routeOptions.voiceUnits())) {
                    return false;
                }
                String str35 = this.approaches;
                if (str35 == null) {
                    if (routeOptions.approaches() != null) {
                        return false;
                    }
                } else if (!str35.equals(routeOptions.approaches())) {
                    return false;
                }
                String str36 = this.waypointIndices;
                if (str36 == null) {
                    if (routeOptions.waypointIndices() != null) {
                        return false;
                    }
                } else if (!str36.equals(routeOptions.waypointIndices())) {
                    return false;
                }
                String str37 = this.waypointNames;
                if (str37 == null) {
                    if (routeOptions.waypointNames() != null) {
                        return false;
                    }
                } else if (!str37.equals(routeOptions.waypointNames())) {
                    return false;
                }
                String str38 = this.waypointTargets;
                if (str38 == null) {
                    if (routeOptions.waypointTargets() != null) {
                        return false;
                    }
                } else if (!str38.equals(routeOptions.waypointTargets())) {
                    return false;
                }
                Boolean bool22 = this.waypointsPerRoute;
                if (bool22 == null) {
                    if (routeOptions.waypointsPerRoute() != null) {
                        return false;
                    }
                } else if (!bool22.equals(routeOptions.waypointsPerRoute())) {
                    return false;
                }
                Double d9 = this.alleyBias;
                if (d9 == null) {
                    if (routeOptions.alleyBias() != null) {
                        return false;
                    }
                } else if (!d9.equals(routeOptions.alleyBias())) {
                    return false;
                }
                Double d10 = this.walkingSpeed;
                if (d10 == null) {
                    if (routeOptions.walkingSpeed() != null) {
                        return false;
                    }
                } else if (!d10.equals(routeOptions.walkingSpeed())) {
                    return false;
                }
                Double d11 = this.walkwayBias;
                if (d11 == null) {
                    if (routeOptions.walkwayBias() != null) {
                        return false;
                    }
                } else if (!d11.equals(routeOptions.walkwayBias())) {
                    return false;
                }
                String str39 = this.snappingIncludeClosures;
                if (str39 == null) {
                    if (routeOptions.snappingIncludeClosures() != null) {
                        return false;
                    }
                } else if (!str39.equals(routeOptions.snappingIncludeClosures())) {
                    return false;
                }
                String str40 = this.snappingIncludeStaticClosures;
                if (str40 == null) {
                    if (routeOptions.snappingIncludeStaticClosures() != null) {
                        return false;
                    }
                } else if (!str40.equals(routeOptions.snappingIncludeStaticClosures())) {
                    return false;
                }
                String str41 = this.arriveBy;
                if (str41 == null) {
                    if (routeOptions.arriveBy() != null) {
                        return false;
                    }
                } else if (!str41.equals(routeOptions.arriveBy())) {
                    return false;
                }
                String str42 = this.departAt;
                if (str42 == null) {
                    if (routeOptions.departAt() != null) {
                        return false;
                    }
                } else if (!str42.equals(routeOptions.departAt())) {
                    return false;
                }
                Double d12 = this.maxHeight;
                if (d12 == null) {
                    if (routeOptions.maxHeight() != null) {
                        return false;
                    }
                } else if (!d12.equals(routeOptions.maxHeight())) {
                    return false;
                }
                Double d13 = this.maxWidth;
                if (d13 == null) {
                    if (routeOptions.maxWidth() != null) {
                        return false;
                    }
                } else if (!d13.equals(routeOptions.maxWidth())) {
                    return false;
                }
                Double d14 = this.maxWeight;
                if (d14 == null) {
                    if (routeOptions.maxWeight() != null) {
                        return false;
                    }
                } else if (!d14.equals(routeOptions.maxWeight())) {
                    return false;
                }
                Boolean bool23 = this.enableRefresh;
                if (bool23 == null) {
                    if (routeOptions.enableRefresh() != null) {
                        return false;
                    }
                } else if (!bool23.equals(routeOptions.enableRefresh())) {
                    return false;
                }
                Boolean bool24 = this.computeTollCost;
                if (bool24 == null) {
                    if (routeOptions.computeTollCost() != null) {
                        return false;
                    }
                } else if (!bool24.equals(routeOptions.computeTollCost())) {
                    return false;
                }
                Boolean bool25 = this.metadata;
                if (bool25 == null) {
                    if (routeOptions.metadata() != null) {
                        return false;
                    }
                } else if (!bool25.equals(routeOptions.metadata())) {
                    return false;
                }
                String str43 = this.paymentMethods;
                if (str43 == null) {
                    if (routeOptions.paymentMethods() != null) {
                        return false;
                    }
                } else if (!str43.equals(routeOptions.paymentMethods())) {
                    return false;
                }
                Boolean bool26 = this.suppressVoiceInstructionLocalNames;
                if (bool26 == null) {
                    if (routeOptions.suppressVoiceInstructionLocalNames() != null) {
                        return false;
                    }
                } else if (!bool26.equals(routeOptions.suppressVoiceInstructionLocalNames())) {
                    return false;
                }
                Boolean bool27 = this.intersectionLinkFormOfWay;
                if (bool27 == null) {
                    if (routeOptions.intersectionLinkFormOfWay() != null) {
                        return false;
                    }
                } else if (!bool27.equals(routeOptions.intersectionLinkFormOfWay())) {
                    return false;
                }
                String str44 = this.intersectionLinkGeometry;
                if (str44 == null) {
                    if (routeOptions.intersectionLinkGeometry() != null) {
                        return false;
                    }
                } else if (!str44.equals(routeOptions.intersectionLinkGeometry())) {
                    return false;
                }
                Boolean bool28 = this.intersectionLinkAccess;
                if (bool28 == null) {
                    if (routeOptions.intersectionLinkAccess() != null) {
                        return false;
                    }
                } else if (!bool28.equals(routeOptions.intersectionLinkAccess())) {
                    return false;
                }
                Boolean bool29 = this.intersectionLinkElevated;
                if (bool29 == null) {
                    if (routeOptions.intersectionLinkElevated() != null) {
                        return false;
                    }
                } else if (!bool29.equals(routeOptions.intersectionLinkElevated())) {
                    return false;
                }
                Boolean bool30 = this.intersectionLinkBridge;
                if (bool30 == null) {
                    if (routeOptions.intersectionLinkBridge() != null) {
                        return false;
                    }
                } else if (!bool30.equals(routeOptions.intersectionLinkBridge())) {
                    return false;
                }
                String str45 = this.notifications;
                if (str45 == null) {
                    if (routeOptions.notifications() != null) {
                        return false;
                    }
                } else if (!str45.equals(routeOptions.notifications())) {
                    return false;
                }
                return true;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("RouteOptions{unrecognized=");
                sb.append(this.unrecognized);
                sb.append(", baseUrl=");
                sb.append(this.baseUrl);
                sb.append(", user=");
                sb.append(this.user);
                sb.append(", profile=");
                sb.append(this.profile);
                sb.append(", coordinates=");
                sb.append(this.coordinates);
                sb.append(", alternatives=");
                sb.append(this.alternatives);
                sb.append(", language=");
                sb.append(this.language);
                sb.append(", radiuses=");
                sb.append(this.radiuses);
                sb.append(", bearings=");
                sb.append(this.bearings);
                sb.append(", avoidManeuverRadius=");
                sb.append(this.avoidManeuverRadius);
                sb.append(", layers=");
                sb.append(this.layers);
                sb.append(", continueStraight=");
                sb.append(this.continueStraight);
                sb.append(", roundaboutExits=");
                sb.append(this.roundaboutExits);
                sb.append(", geometries=");
                sb.append(this.geometries);
                sb.append(", overview=");
                sb.append(this.overview);
                sb.append(", steps=");
                sb.append(this.steps);
                sb.append(", annotations=");
                sb.append(this.annotations);
                sb.append(", exclude=");
                sb.append(this.exclude);
                sb.append(", include=");
                sb.append(this.include);
                sb.append(", voiceInstructions=");
                sb.append(this.voiceInstructions);
                sb.append(", bannerInstructions=");
                sb.append(this.bannerInstructions);
                sb.append(", voiceUnits=");
                sb.append(this.voiceUnits);
                sb.append(", approaches=");
                sb.append(this.approaches);
                sb.append(", waypointIndices=");
                sb.append(this.waypointIndices);
                sb.append(", waypointNames=");
                sb.append(this.waypointNames);
                sb.append(", waypointTargets=");
                sb.append(this.waypointTargets);
                sb.append(", waypointsPerRoute=");
                sb.append(this.waypointsPerRoute);
                sb.append(", alleyBias=");
                sb.append(this.alleyBias);
                sb.append(", walkingSpeed=");
                sb.append(this.walkingSpeed);
                sb.append(", walkwayBias=");
                sb.append(this.walkwayBias);
                sb.append(", snappingIncludeClosures=");
                sb.append(this.snappingIncludeClosures);
                sb.append(", snappingIncludeStaticClosures=");
                sb.append(this.snappingIncludeStaticClosures);
                sb.append(", arriveBy=");
                sb.append(this.arriveBy);
                sb.append(", departAt=");
                sb.append(this.departAt);
                sb.append(", maxHeight=");
                sb.append(this.maxHeight);
                sb.append(", maxWidth=");
                sb.append(this.maxWidth);
                sb.append(", maxWeight=");
                sb.append(this.maxWeight);
                sb.append(", enableRefresh=");
                sb.append(this.enableRefresh);
                sb.append(", computeTollCost=");
                sb.append(this.computeTollCost);
                sb.append(", metadata=");
                sb.append(this.metadata);
                sb.append(", paymentMethods=");
                sb.append(this.paymentMethods);
                sb.append(", suppressVoiceInstructionLocalNames=");
                sb.append(this.suppressVoiceInstructionLocalNames);
                sb.append(", intersectionLinkFormOfWay=");
                sb.append(this.intersectionLinkFormOfWay);
                sb.append(", intersectionLinkGeometry=");
                sb.append(this.intersectionLinkGeometry);
                sb.append(", intersectionLinkAccess=");
                sb.append(this.intersectionLinkAccess);
                sb.append(", intersectionLinkElevated=");
                sb.append(this.intersectionLinkElevated);
                sb.append(", intersectionLinkBridge=");
                sb.append(this.intersectionLinkBridge);
                sb.append(", notifications=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.notifications, "}");
            }

            public int hashCode() {
                Map<String, SerializableJsonElement> map2 = this.unrecognized;
                int iHashCode = map2 == null ? 0 : map2.hashCode();
                int iHashCode2 = this.baseUrl.hashCode();
                int iHashCode3 = this.user.hashCode();
                int iHashCode4 = this.profile.hashCode();
                int iHashCode5 = this.coordinates.hashCode();
                Boolean bool16 = this.alternatives;
                int iHashCode6 = bool16 == null ? 0 : bool16.hashCode();
                String str26 = this.language;
                int iHashCode7 = str26 == null ? 0 : str26.hashCode();
                String str27 = this.radiuses;
                int iHashCode8 = str27 == null ? 0 : str27.hashCode();
                String str28 = this.bearings;
                int iHashCode9 = str28 == null ? 0 : str28.hashCode();
                Double d8 = this.avoidManeuverRadius;
                int iHashCode10 = d8 == null ? 0 : d8.hashCode();
                String str29 = this.layers;
                int iHashCode11 = str29 == null ? 0 : str29.hashCode();
                Boolean bool17 = this.continueStraight;
                int iHashCode12 = bool17 == null ? 0 : bool17.hashCode();
                Boolean bool18 = this.roundaboutExits;
                int iHashCode13 = bool18 == null ? 0 : bool18.hashCode();
                int iHashCode14 = this.geometries.hashCode();
                String str30 = this.overview;
                int iHashCode15 = str30 == null ? 0 : str30.hashCode();
                Boolean bool19 = this.steps;
                int iHashCode16 = bool19 == null ? 0 : bool19.hashCode();
                String str31 = this.annotations;
                int iHashCode17 = str31 == null ? 0 : str31.hashCode();
                String str32 = this.exclude;
                int iHashCode18 = str32 == null ? 0 : str32.hashCode();
                String str33 = this.include;
                int iHashCode19 = str33 == null ? 0 : str33.hashCode();
                Boolean bool20 = this.voiceInstructions;
                int iHashCode20 = bool20 == null ? 0 : bool20.hashCode();
                Boolean bool21 = this.bannerInstructions;
                int iHashCode21 = bool21 == null ? 0 : bool21.hashCode();
                String str34 = this.voiceUnits;
                int iHashCode22 = str34 == null ? 0 : str34.hashCode();
                String str35 = this.approaches;
                int iHashCode23 = str35 == null ? 0 : str35.hashCode();
                String str36 = this.waypointIndices;
                int iHashCode24 = str36 == null ? 0 : str36.hashCode();
                String str37 = this.waypointNames;
                int iHashCode25 = str37 == null ? 0 : str37.hashCode();
                String str38 = this.waypointTargets;
                int iHashCode26 = str38 == null ? 0 : str38.hashCode();
                Boolean bool22 = this.waypointsPerRoute;
                int iHashCode27 = bool22 == null ? 0 : bool22.hashCode();
                Double d9 = this.alleyBias;
                int iHashCode28 = d9 == null ? 0 : d9.hashCode();
                Double d10 = this.walkingSpeed;
                int iHashCode29 = d10 == null ? 0 : d10.hashCode();
                Double d11 = this.walkwayBias;
                int iHashCode30 = d11 == null ? 0 : d11.hashCode();
                String str39 = this.snappingIncludeClosures;
                int iHashCode31 = str39 == null ? 0 : str39.hashCode();
                String str40 = this.snappingIncludeStaticClosures;
                int iHashCode32 = str40 == null ? 0 : str40.hashCode();
                String str41 = this.arriveBy;
                int iHashCode33 = str41 == null ? 0 : str41.hashCode();
                String str42 = this.departAt;
                int iHashCode34 = str42 == null ? 0 : str42.hashCode();
                Double d12 = this.maxHeight;
                int iHashCode35 = d12 == null ? 0 : d12.hashCode();
                Double d13 = this.maxWidth;
                int iHashCode36 = d13 == null ? 0 : d13.hashCode();
                Double d14 = this.maxWeight;
                int iHashCode37 = d14 == null ? 0 : d14.hashCode();
                Boolean bool23 = this.enableRefresh;
                int iHashCode38 = bool23 == null ? 0 : bool23.hashCode();
                Boolean bool24 = this.computeTollCost;
                int iHashCode39 = bool24 == null ? 0 : bool24.hashCode();
                Boolean bool25 = this.metadata;
                int iHashCode40 = bool25 == null ? 0 : bool25.hashCode();
                String str43 = this.paymentMethods;
                int iHashCode41 = str43 == null ? 0 : str43.hashCode();
                Boolean bool26 = this.suppressVoiceInstructionLocalNames;
                int iHashCode42 = bool26 == null ? 0 : bool26.hashCode();
                Boolean bool27 = this.intersectionLinkFormOfWay;
                int iHashCode43 = bool27 == null ? 0 : bool27.hashCode();
                String str44 = this.intersectionLinkGeometry;
                int iHashCode44 = str44 == null ? 0 : str44.hashCode();
                Boolean bool28 = this.intersectionLinkAccess;
                int iHashCode45 = bool28 == null ? 0 : bool28.hashCode();
                Boolean bool29 = this.intersectionLinkElevated;
                int iHashCode46 = bool29 == null ? 0 : bool29.hashCode();
                Boolean bool30 = this.intersectionLinkBridge;
                int iHashCode47 = bool30 == null ? 0 : bool30.hashCode();
                String str45 = this.notifications;
                return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ iHashCode11) * 1000003) ^ iHashCode12) * 1000003) ^ iHashCode13) * 1000003) ^ iHashCode14) * 1000003) ^ iHashCode15) * 1000003) ^ iHashCode16) * 1000003) ^ iHashCode17) * 1000003) ^ iHashCode18) * 1000003) ^ iHashCode19) * 1000003) ^ iHashCode20) * 1000003) ^ iHashCode21) * 1000003) ^ iHashCode22) * 1000003) ^ iHashCode23) * 1000003) ^ iHashCode24) * 1000003) ^ iHashCode25) * 1000003) ^ iHashCode26) * 1000003) ^ iHashCode27) * 1000003) ^ iHashCode28) * 1000003) ^ iHashCode29) * 1000003) ^ iHashCode30) * 1000003) ^ iHashCode31) * 1000003) ^ iHashCode32) * 1000003) ^ iHashCode33) * 1000003) ^ iHashCode34) * 1000003) ^ iHashCode35) * 1000003) ^ iHashCode36) * 1000003) ^ iHashCode37) * 1000003) ^ iHashCode38) * 1000003) ^ iHashCode39) * 1000003) ^ iHashCode40) * 1000003) ^ iHashCode41) * 1000003) ^ iHashCode42) * 1000003) ^ iHashCode43) * 1000003) ^ iHashCode44) * 1000003) ^ iHashCode45) * 1000003) ^ iHashCode46) * 1000003) ^ iHashCode47) * 1000003) ^ (str45 == null ? 0 : str45.hashCode());
            }

            /* JADX INFO: renamed from: com.mapbox.api.directions.v5.models.$AutoValue_RouteOptions$1, reason: invalid class name */
            public static abstract /* synthetic */ class AnonymousClass1 {
                public static int RemoteActionCompatParcelizer;
                public static int write;

                public static int serializer() {
                    int i = write;
                    int i2 = i % 9759908;
                    write = i + 1;
                    if (i2 != 0) {
                        return RemoteActionCompatParcelizer;
                    }
                    int iNextInt = new Random().nextInt();
                    RemoteActionCompatParcelizer = iNextInt;
                    return iNextInt;
                }
            }
        };
    }
}
