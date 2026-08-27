package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PaymentMethods extends DirectionsJsonObject {
    public abstract CostPerVehicleSize cash();

    public abstract CostPerVehicleSize etc();

    public abstract CostPerVehicleSize etc2();

    public static TypeAdapter<PaymentMethods> typeAdapter(Gson gson) {
        return new AutoValue_PaymentMethods.GsonTypeAdapter(gson);
    }
}
