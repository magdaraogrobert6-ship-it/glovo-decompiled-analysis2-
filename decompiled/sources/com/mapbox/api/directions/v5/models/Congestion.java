package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Congestion extends DirectionsJsonObject {
    public abstract int value();

    public static TypeAdapter<Congestion> typeAdapter(Gson gson) {
        return new AutoValue_Congestion.GsonTypeAdapter(gson);
    }
}
