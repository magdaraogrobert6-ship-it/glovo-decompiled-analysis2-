package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxStreetsV8 extends DirectionsJsonObject {
    @SerializedName("class")
    public abstract String roadClass();

    public static TypeAdapter<MapboxStreetsV8> typeAdapter(Gson gson) {
        return new AutoValue_MapboxStreetsV8.GsonTypeAdapter(gson);
    }
}
