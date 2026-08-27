package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MaxSpeed extends DirectionsJsonObject {
    public abstract Boolean none();

    public abstract Integer speed();

    @SpeedLimit$Unit
    public abstract String unit();

    public abstract Boolean unknown();

    public static TypeAdapter<MaxSpeed> typeAdapter(Gson gson) {
        return new AutoValue_MaxSpeed.GsonTypeAdapter(gson.newBuilder().registerTypeAdapter(String.class, new InterningStringAdapter()).create());
    }
}
