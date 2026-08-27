package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RestStop extends DirectionsJsonObject {
    public abstract List<Amenity> amenities();

    @SerializedName("guidemap")
    public abstract String guideMap();

    public abstract String name();

    public abstract String type();

    public static TypeAdapter<RestStop> typeAdapter(Gson gson) {
        return new AutoValue_RestStop.GsonTypeAdapter(gson);
    }
}
