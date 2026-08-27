package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RouteLeg extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder annotation(LegAnnotation legAnnotation);

        public abstract RouteLeg build();

        public abstract Builder closures(List<Closure> list);

        public abstract Builder duration(Double d);

        public abstract Builder incidents(List<Incident> list);

        public abstract Builder notifications(List<Notification> list);

        public abstract Builder steps(List<LegStep> list);
    }

    public abstract List<Admin> admins();

    public abstract LegAnnotation annotation();

    public abstract List<Closure> closures();

    public abstract Double distance();

    public abstract Double duration();

    @SerializedName("duration_typical")
    public abstract Double durationTypical();

    public abstract List<Incident> incidents();

    public abstract List<Notification> notifications();

    public abstract List<LegStep> steps();

    public abstract String summary();

    public abstract Builder toBuilder();

    @SerializedName("via_waypoints")
    public abstract List<SilentWaypoint> viaWaypoints();

    public static Builder builder() {
        return new C$AutoValue_RouteLeg.Builder();
    }

    public static TypeAdapter<RouteLeg> typeAdapter(Gson gson) {
        return new AutoValue_RouteLeg.GsonTypeAdapter(gson);
    }
}
