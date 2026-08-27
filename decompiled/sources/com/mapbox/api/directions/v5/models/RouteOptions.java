package com.mapbox.api.directions.v5.models;

import bo.app.af$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.DirectionsCriteria$GeometriesCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsFlowCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$OverviewCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$ProfileCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$VoiceUnitCriteria;
import com.mapbox.api.directions.v5.utils.FormatUtils;
import com.mapbox.api.directions.v5.utils.ParseUtils;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RouteOptions extends DirectionsJsonObject {
    private static final Set<String> DEPRECATED_SERIALIZED_FIELDS = Collections.unmodifiableSet(new HashSet<String>() { // from class: com.mapbox.api.directions.v5.models.RouteOptions.1
        {
            add("access_token");
            add("uuid");
        }
    });

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder alleyBias(Double d);

        public abstract Builder alternatives(Boolean bool);

        public abstract Builder annotations(String str);

        public abstract Builder approaches(String str);

        public abstract Builder arriveBy(String str);

        public abstract Builder avoidManeuverRadius(Double d);

        public abstract Builder bannerInstructions(Boolean bool);

        public abstract Builder baseUrl(String str);

        public abstract Builder bearings(String str);

        public abstract RouteOptions build();

        public abstract Builder computeTollCost(Boolean bool);

        public abstract Builder continueStraight(Boolean bool);

        public abstract Builder coordinates(String str);

        public abstract Builder departAt(String str);

        public abstract Builder enableRefresh(Boolean bool);

        public abstract Builder exclude(String str);

        public abstract Builder geometries(String str);

        public abstract Builder include(String str);

        public abstract Builder intersectionLinkAccess(Boolean bool);

        public abstract Builder intersectionLinkBridge(Boolean bool);

        public abstract Builder intersectionLinkElevated(Boolean bool);

        public abstract Builder intersectionLinkFormOfWay(Boolean bool);

        public abstract Builder intersectionLinkGeometry(String str);

        public abstract Builder language(String str);

        public abstract Builder layers(String str);

        public abstract Builder maxHeight(Double d);

        public abstract Builder maxWeight(Double d);

        public abstract Builder maxWidth(Double d);

        public abstract Builder metadata(Boolean bool);

        public abstract Builder notifications(String str);

        public abstract Builder overview(String str);

        public abstract Builder paymentMethods(String str);

        public abstract Builder profile(String str);

        public abstract Builder radiuses(String str);

        public abstract Builder roundaboutExits(Boolean bool);

        public abstract Builder snappingIncludeClosures(String str);

        public abstract Builder snappingIncludeStaticClosures(String str);

        public abstract Builder steps(Boolean bool);

        public abstract Builder suppressVoiceInstructionLocalNames(Boolean bool);

        public abstract Builder user(String str);

        public abstract Builder voiceInstructions(Boolean bool);

        public abstract Builder voiceUnits(String str);

        public abstract Builder walkingSpeed(Double d);

        public abstract Builder walkwayBias(Double d);

        public abstract Builder waypointIndices(String str);

        public abstract Builder waypointNames(String str);

        public abstract Builder waypointTargets(String str);

        public abstract Builder waypointsPerRoute(Boolean bool);

        public Builder annotationsList(List<String> list) {
            annotations(FormatUtils.join(",", list));
            return this;
        }

        public Builder approachesList(List<String> list) {
            approaches(FormatUtils.join(";", list));
            return this;
        }

        public Builder excludeObject(Exclude exclude) {
            if (exclude != null) {
                exclude(exclude.toUrlQueryParameter());
                return this;
            }
            exclude(null);
            return this;
        }

        public Builder snappingIncludeClosuresList(List<Boolean> list) {
            snappingIncludeClosures(FormatUtils.join(";", list));
            return this;
        }

        public Builder snappingIncludeStaticClosuresList(List<Boolean> list) {
            snappingIncludeStaticClosures(FormatUtils.join(";", list));
            return this;
        }

        public Builder waypointIndicesList(List<Integer> list) {
            waypointIndices(FormatUtils.join(";", list));
            return this;
        }

        public Builder waypointNamesList(List<String> list) {
            waypointNames(FormatUtils.join(";", list));
            return this;
        }

        public Builder waypointTargetsList(List<Point> list) {
            waypointTargets(FormatUtils.formatPointsList(list));
            return this;
        }

        public Builder bearingsList(List<Bearing> list) {
            String strJoin = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Bearing bearing : list) {
                    if (bearing == null) {
                        arrayList.add(null);
                    } else {
                        double dAngle = bearing.angle();
                        double dDegrees = bearing.degrees();
                        Locale locale = Locale.US;
                        arrayList.add(FormatUtils.formatDouble(dAngle) + "," + FormatUtils.formatDouble(dDegrees));
                    }
                }
                strJoin = FormatUtils.join(";", arrayList);
            }
            bearings(strJoin);
            return this;
        }

        public Builder coordinatesList(List<Point> list) {
            String pointsList = FormatUtils.formatPointsList(list);
            if (pointsList == null) {
                pointsList = "";
            }
            coordinates(pointsList);
            return this;
        }

        public Builder layersList(List<Integer> list) {
            String strJoin = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    if (num == null) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(Integer.toString(num.intValue()));
                    }
                }
                strJoin = FormatUtils.join(";", arrayList);
            }
            layers(strJoin);
            return this;
        }

        public Builder radiusesList(List<Double> list) {
            String strJoin = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Double d : list) {
                    if (d == null) {
                        arrayList.add(null);
                    } else if (d.doubleValue() == Double.POSITIVE_INFINITY) {
                        arrayList.add("unlimited");
                    } else {
                        Locale locale = Locale.US;
                        arrayList.add(FormatUtils.formatDouble(d.doubleValue()));
                    }
                }
                strJoin = FormatUtils.join(";", arrayList);
            }
            radiuses(strJoin);
            return this;
        }
    }

    @SerializedName("alley_bias")
    public abstract Double alleyBias();

    public abstract Boolean alternatives();

    public abstract String annotations();

    public abstract String approaches();

    @SerializedName("arrive_by")
    public abstract String arriveBy();

    @SerializedName("avoid_maneuver_radius")
    public abstract Double avoidManeuverRadius();

    @SerializedName("banner_instructions")
    public abstract Boolean bannerInstructions();

    public abstract String baseUrl();

    public abstract String bearings();

    @SerializedName("compute_toll_cost")
    public abstract Boolean computeTollCost();

    @SerializedName("continue_straight")
    public abstract Boolean continueStraight();

    public abstract String coordinates();

    @SerializedName("depart_at")
    public abstract String departAt();

    @SerializedName("enable_refresh")
    public abstract Boolean enableRefresh();

    public abstract String exclude();

    @DirectionsCriteria$GeometriesCriteria
    public abstract String geometries();

    public abstract String include();

    @SerializedName("intersection_link_access")
    public abstract Boolean intersectionLinkAccess();

    @SerializedName("intersection_link_bridge")
    public abstract Boolean intersectionLinkBridge();

    @SerializedName("intersection_link_elevated")
    public abstract Boolean intersectionLinkElevated();

    @SerializedName("intersection_link_form_of_way")
    public abstract Boolean intersectionLinkFormOfWay();

    @SerializedName("intersection_link_geometry")
    public abstract String intersectionLinkGeometry();

    public abstract String language();

    public abstract String layers();

    @SerializedName("max_height")
    public abstract Double maxHeight();

    @SerializedName("max_weight")
    public abstract Double maxWeight();

    @SerializedName("max_width")
    public abstract Double maxWidth();

    @SerializedName("metadata")
    public abstract Boolean metadata();

    @DirectionsCriteria$NotificationsFlowCriteria
    public abstract String notifications();

    @DirectionsCriteria$OverviewCriteria
    public abstract String overview();

    @SerializedName("payment_methods")
    public abstract String paymentMethods();

    @DirectionsCriteria$ProfileCriteria
    public abstract String profile();

    public abstract String radiuses();

    @SerializedName("roundabout_exits")
    public abstract Boolean roundaboutExits();

    @SerializedName("snapping_include_closures")
    public abstract String snappingIncludeClosures();

    @SerializedName("snapping_include_static_closures")
    public abstract String snappingIncludeStaticClosures();

    public abstract Boolean steps();

    @SerializedName("suppress_voice_instruction_local_names")
    public abstract Boolean suppressVoiceInstructionLocalNames();

    public abstract Builder toBuilder();

    public abstract String user();

    @SerializedName("voice_instructions")
    public abstract Boolean voiceInstructions();

    @SerializedName("voice_units")
    @DirectionsCriteria$VoiceUnitCriteria
    public abstract String voiceUnits();

    @SerializedName("walking_speed")
    public abstract Double walkingSpeed();

    @SerializedName("walkway_bias")
    public abstract Double walkwayBias();

    @SerializedName("waypoints")
    public abstract String waypointIndices();

    @SerializedName("waypoint_names")
    public abstract String waypointNames();

    @SerializedName("waypoint_targets")
    public abstract String waypointTargets();

    @SerializedName("waypoints_per_route")
    public abstract Boolean waypointsPerRoute();

    public static Builder builder() {
        return new C$AutoValue_RouteOptions.Builder().baseUrl("https://api.mapbox.com").user("mapbox").geometries("polyline6");
    }

    private static String escape(String str) {
        try {
            return URLEncoder.encode(str, Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    private static RouteOptions fromJsonString(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.create());
        return (RouteOptions) gsonBuilder.create().fromJson(str, RouteOptions.class);
    }

    public static TypeAdapter<RouteOptions> typeAdapter(Gson gson) {
        return new AutoValue_RouteOptions.GsonTypeAdapter(gson);
    }

    public URL toUrl(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(baseUrl());
        if (!Character.valueOf(baseUrl().charAt(baseUrl().length() - 1)).equals('/')) {
            sb.append('/');
        }
        sb.append("directions/v5");
        sb.append("/" + user());
        sb.append("/" + profile());
        sb.append("/" + coordinates());
        sb.append("?access_token=" + str);
        sb.append("&geometries=" + geometries());
        appendQueryParameter(sb, "alternatives", alternatives());
        appendQueryParameter(sb, "overview", overview());
        appendQueryParameter(sb, "radiuses", radiuses());
        appendQueryParameter(sb, ContainerStep.STEPS, steps());
        appendQueryParameter(sb, "avoid_maneuver_radius", avoidManeuverRadius());
        appendQueryParameter(sb, "bearings", bearings());
        appendQueryParameter(sb, "layers", layers());
        appendQueryParameter(sb, "continue_straight", continueStraight());
        appendQueryParameter(sb, "annotations", annotations());
        appendQueryParameter(sb, "language", language());
        appendQueryParameter(sb, "roundabout_exits", roundaboutExits());
        appendQueryParameter(sb, "voice_instructions", voiceInstructions());
        appendQueryParameter(sb, "banner_instructions", bannerInstructions());
        appendQueryParameter(sb, "voice_units", voiceUnits());
        appendQueryParameter(sb, "exclude", exclude());
        appendQueryParameter(sb, "include", include());
        appendQueryParameter(sb, "approaches", approaches());
        appendQueryParameter(sb, "waypoints", waypointIndices());
        appendQueryParameter(sb, "waypoint_names", waypointNames());
        appendQueryParameter(sb, "waypoint_targets", waypointTargets());
        appendQueryParameter(sb, "enable_refresh", enableRefresh());
        appendQueryParameter(sb, "walking_speed", walkingSpeed());
        appendQueryParameter(sb, "walkway_bias", walkwayBias());
        appendQueryParameter(sb, "alley_bias", alleyBias());
        appendQueryParameter(sb, "snapping_include_closures", snappingIncludeClosures());
        appendQueryParameter(sb, "snapping_include_static_closures", snappingIncludeStaticClosures());
        appendQueryParameter(sb, "arrive_by", arriveBy());
        appendQueryParameter(sb, "depart_at", departAt());
        appendQueryParameter(sb, "max_height", maxHeight());
        appendQueryParameter(sb, "max_width", maxWidth());
        appendQueryParameter(sb, "max_weight", maxWeight());
        appendQueryParameter(sb, "compute_toll_cost", computeTollCost());
        appendQueryParameter(sb, "waypoints_per_route", waypointsPerRoute());
        appendQueryParameter(sb, "metadata", metadata());
        appendQueryParameter(sb, "payment_methods", paymentMethods());
        appendQueryParameter(sb, "notifications", notifications());
        appendQueryParameter(sb, "suppress_voice_instruction_local_names", suppressVoiceInstructionLocalNames());
        appendQueryParameter(sb, "intersection_link_form_of_way", intersectionLinkFormOfWay());
        appendQueryParameter(sb, "intersection_link_geometry", intersectionLinkGeometry());
        appendQueryParameter(sb, "intersection_link_access", intersectionLinkAccess());
        appendQueryParameter(sb, "intersection_link_elevated", intersectionLinkElevated());
        appendQueryParameter(sb, "intersection_link_bridge", intersectionLinkBridge());
        Map<String, SerializableJsonElement> mapUnrecognized = unrecognized();
        if (mapUnrecognized != null) {
            for (Map.Entry<String, SerializableJsonElement> entry : mapUnrecognized.entrySet()) {
                JsonElement jsonElement = entry.getValue().element;
                if (!DEPRECATED_SERIALIZED_FIELDS.contains(entry.getKey())) {
                    if (!jsonElement.isJsonPrimitive()) {
                        throw new IllegalStateException(String.format("RouteOptions.toUrl supports only primitive unrecognized properties. '%s' isn't a primitive value.", entry.getKey()));
                    }
                    appendQueryParameter(sb, entry.getKey(), jsonElement.getAsString());
                }
            }
        }
        try {
            return new URL(sb.toString());
        } catch (MalformedURLException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    public static RouteOptions fromUrl(URL url) {
        JsonObject jsonObject = new JsonObject();
        String str = url.getProtocol() + "://" + url.getHost();
        int port = url.getPort();
        if (port != -1) {
            str = str + ":" + port;
        }
        jsonObject.addProperty("baseUrl", str);
        try {
            String[] strArrSplit = url.getPath().split("/");
            jsonObject.addProperty(FeedbackEvent.UI, URLDecoder.decode(strArrSplit[3], Constants.ENCODING));
            jsonObject.addProperty("profile", URLDecoder.decode(strArrSplit[4], Constants.ENCODING));
            jsonObject.addProperty("coordinates", URLDecoder.decode(strArrSplit[5], Constants.ENCODING));
            for (String str2 : url.getQuery().split(ContainerUtils.FIELD_DELIMITER)) {
                int iIndexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                String strDecode = URLDecoder.decode(str2.substring(0, iIndexOf), Constants.ENCODING);
                String strDecode2 = URLDecoder.decode(str2.substring(iIndexOf + 1), Constants.ENCODING);
                if (!strDecode.equals("access_token")) {
                    jsonObject.addProperty(strDecode, strDecode2);
                }
            }
            return fromJsonString(jsonObject.toString());
        } catch (UnsupportedEncodingException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    public List<Bearing> bearingsList() {
        return ParseUtils.parseToList(bearings(), ParseUtils.BEARING_PARSER);
    }

    public List<Point> coordinatesList() {
        return ParseUtils.parseToList(coordinates(), ParseUtils.POINT_PARSER);
    }

    public List<Boolean> snappingIncludeClosuresList() {
        return ParseUtils.parseToList(snappingIncludeClosures(), ParseUtils.BOOLEAN_PARSER);
    }

    public List<Boolean> snappingIncludeStaticClosuresList() {
        return ParseUtils.parseToList(snappingIncludeStaticClosures(), ParseUtils.BOOLEAN_PARSER);
    }

    public List<Point> waypointTargetsList() {
        return ParseUtils.parseToList(waypointTargets(), ParseUtils.POINT_PARSER);
    }

    private static void appendQueryParameter(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            af$$ExternalSyntheticOutline0.m(sb, ContainerUtils.FIELD_DELIMITER, str, ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(escape(str2));
        }
    }

    public List<String> annotationsList() {
        String strAnnotations = annotations();
        if (strAnnotations == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strAnnotations.split(",", -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public List<String> approachesList() {
        String strApproaches = approaches();
        if (strApproaches == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strApproaches.split(";", -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public List<String> excludeList() {
        String strExclude = exclude();
        if (strExclude == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strExclude.split(",", -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public List<Integer> layersList() {
        String strLayers = layers();
        if (strLayers == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strLayers.split(";", -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(Integer.valueOf(str));
            }
        }
        return arrayList;
    }

    public List<Double> radiusesList() {
        String strRadiuses = radiuses();
        if (strRadiuses == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strRadiuses.split(";", -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str.equals("unlimited") ? Double.valueOf(Double.POSITIVE_INFINITY) : Double.valueOf(str));
            }
        }
        return arrayList;
    }

    public List<Integer> waypointIndicesList() {
        String strWaypointIndices = waypointIndices();
        if (strWaypointIndices == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strWaypointIndices.split(";", -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(Integer.valueOf(str));
            }
        }
        return arrayList;
    }

    public List<String> waypointNamesList() {
        String strWaypointNames = waypointNames();
        if (strWaypointNames == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strWaypointNames.split(";", -1)) {
            if (str.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static void appendQueryParameter(StringBuilder sb, String str, Boolean bool) {
        if (bool != null) {
            appendQueryParameter(sb, str, String.valueOf(bool));
        }
    }

    private static void appendQueryParameter(StringBuilder sb, String str, Number number) {
        if (number != null) {
            appendQueryParameter(sb, str, String.valueOf(number));
        }
    }
}
