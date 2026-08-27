package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SilentWaypoint extends DirectionsJsonObject {
    @SerializedName("distance_from_start")
    public abstract double distanceFromStart();

    @SerializedName("geometry_index")
    public abstract int geometryIndex();

    @SerializedName("waypoint_index")
    public abstract int waypointIndex();

    public static TypeAdapter<SilentWaypoint> typeAdapter(Gson gson) {
        return new AutoValue_SilentWaypoint.GsonTypeAdapter(gson);
    }
}
