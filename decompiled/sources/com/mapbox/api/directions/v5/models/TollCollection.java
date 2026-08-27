package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TollCollection extends DirectionsJsonObject {
    public abstract String name();

    public abstract String type();

    public static TypeAdapter<TollCollection> typeAdapter(Gson gson) {
        return new AutoValue_TollCollection.GsonTypeAdapter(gson);
    }
}
