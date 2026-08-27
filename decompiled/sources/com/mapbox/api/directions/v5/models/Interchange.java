package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Interchange extends DirectionsJsonObject {
    public abstract String name();

    public static TypeAdapter<Interchange> typeAdapter(Gson gson) {
        return new AutoValue_Interchange.GsonTypeAdapter(gson);
    }
}
