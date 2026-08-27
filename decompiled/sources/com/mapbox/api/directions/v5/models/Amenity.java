package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsCriteria$AmenityTypeCriteria;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Amenity extends DirectionsJsonObject {
    public abstract String brand();

    public abstract String name();

    @DirectionsCriteria$AmenityTypeCriteria
    public abstract String type();

    public static TypeAdapter<Amenity> typeAdapter(Gson gson) {
        return new AutoValue_Amenity.GsonTypeAdapter(gson);
    }
}
