package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsWaypoint extends DirectionsJsonObject {
    public abstract Double distance();

    public abstract String name();

    @SerializedName("location")
    public abstract double[] rawLocation();

    public static DirectionsWaypoint fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.create());
        return (DirectionsWaypoint) gsonBuilder.create().fromJson(str, DirectionsWaypoint.class);
    }

    public static TypeAdapter<DirectionsWaypoint> typeAdapter(Gson gson) {
        return new AutoValue_DirectionsWaypoint.GsonTypeAdapter(gson);
    }

    public Point location() {
        return Point.fromLngLat(rawLocation()[0], rawLocation()[1]);
    }
}
