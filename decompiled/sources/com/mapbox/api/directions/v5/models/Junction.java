package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Junction extends DirectionsJsonObject {
    public abstract String name();

    public static TypeAdapter<Junction> typeAdapter(Gson gson) {
        return new AutoValue_Junction.GsonTypeAdapter(gson);
    }
}
