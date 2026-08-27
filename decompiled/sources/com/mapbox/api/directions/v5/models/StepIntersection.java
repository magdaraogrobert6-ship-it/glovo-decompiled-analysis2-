package com.mapbox.api.directions.v5.models;

import com.braze.models.inappmessage.InAppMessageBase;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.geojson.Point;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StepIntersection extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract StepIntersection build();

        public abstract Builder rawLocation(double[] dArr);
    }

    @SerializedName("access")
    public abstract List<Integer> access();

    @SerializedName("admin_index")
    public abstract Integer adminIndex();

    public abstract List<Integer> bearings();

    @SerializedName("bridges")
    public abstract List<Boolean> bridges();

    public abstract List<String> classes();

    @SerializedName(InAppMessageBase.DURATION)
    public abstract Double duration();

    @SerializedName("elevated")
    public abstract List<Boolean> elevated();

    public abstract List<Boolean> entry();

    @SerializedName("form_of_way")
    public abstract List<String> formOfWay();

    @SerializedName("geometries")
    public abstract List<String> geometries();

    @SerializedName("geometry_index")
    public abstract Integer geometryIndex();

    public abstract Integer in();

    @SerializedName("ic")
    public abstract Interchange interchange();

    @SerializedName("is_urban")
    public abstract Boolean isUrban();

    @SerializedName("jct")
    public abstract Junction junction();

    public abstract List<IntersectionLanes> lanes();

    @SerializedName("mapbox_streets_v8")
    public abstract MapboxStreetsV8 mapboxStreetsV8();

    @SerializedName("merging_area")
    public abstract MergingArea mergingArea();

    public abstract Integer out();

    @SerializedName("railway_crossing")
    public abstract Boolean railwayCrossing();

    @SerializedName("location")
    public abstract double[] rawLocation();

    @SerializedName("rest_stop")
    public abstract RestStop restStop();

    @SerializedName("stop_sign")
    public abstract Boolean stopSign();

    @SerializedName("toll_collection")
    public abstract TollCollection tollCollection();

    @SerializedName("traffic_signal")
    public abstract Boolean trafficSignal();

    @SerializedName("tunnel_name")
    public abstract String tunnelName();

    @SerializedName("yield_sign")
    public abstract Boolean yieldSign();

    public static Builder builder() {
        return new C$AutoValue_StepIntersection.Builder();
    }

    public static TypeAdapter<StepIntersection> typeAdapter(Gson gson) {
        return new AutoValue_StepIntersection.GsonTypeAdapter(gson);
    }

    public Point location() {
        return Point.fromLngLat(rawLocation()[0], rawLocation()[1]);
    }
}
