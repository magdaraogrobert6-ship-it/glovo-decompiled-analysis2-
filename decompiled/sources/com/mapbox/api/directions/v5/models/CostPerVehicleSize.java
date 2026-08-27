package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CostPerVehicleSize extends DirectionsJsonObject {
    public abstract Double jumbo();

    public abstract Double large();

    public abstract Double middle();

    public abstract Double small();

    public abstract Double standard();

    public static TypeAdapter<CostPerVehicleSize> typeAdapter(Gson gson) {
        return new AutoValue_CostPerVehicleSize.GsonTypeAdapter(gson);
    }
}
