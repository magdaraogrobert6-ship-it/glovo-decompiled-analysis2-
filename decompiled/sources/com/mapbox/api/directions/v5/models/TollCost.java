package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TollCost extends DirectionsJsonObject {
    public abstract String currency();

    @SerializedName("payment_methods")
    public abstract PaymentMethods paymentMethods();

    public static TypeAdapter<TollCost> typeAdapter(Gson gson) {
        return new AutoValue_TollCost.GsonTypeAdapter(gson);
    }
}
