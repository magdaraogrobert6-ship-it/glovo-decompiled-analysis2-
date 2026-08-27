package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsRoute extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract DirectionsRoute build();

        public abstract Builder distance(Double d);

        public abstract Builder duration(Double d);

        public abstract Builder legs(List<RouteLeg> list);

        public abstract Builder requestUuid(String str);

        public abstract Builder routeIndex(String str);

        public abstract Builder routeOptions(RouteOptions routeOptions);

        public abstract Builder waypoints(List<DirectionsWaypoint> list);
    }

    public abstract Double distance();

    public abstract Double duration();

    @SerializedName("duration_typical")
    public abstract Double durationTypical();

    public abstract String geometry();

    public abstract List<RouteLeg> legs();

    public abstract String requestUuid();

    public abstract String routeIndex();

    public abstract RouteOptions routeOptions();

    public abstract Builder toBuilder();

    @SerializedName("toll_costs")
    public abstract List<TollCost> tollCosts();

    @SerializedName("voiceLocale")
    public abstract String voiceLanguage();

    public abstract List<DirectionsWaypoint> waypoints();

    public abstract Double weight();

    @SerializedName("weight_name")
    public abstract String weightName();

    @SerializedName("weight_typical")
    public abstract Double weightTypical();

    public static Builder builder() {
        return new C$AutoValue_DirectionsRoute.Builder();
    }

    public static TypeAdapter<DirectionsRoute> typeAdapter(Gson gson) {
        return new AutoValue_DirectionsRoute.GsonTypeAdapter(gson);
    }
}
