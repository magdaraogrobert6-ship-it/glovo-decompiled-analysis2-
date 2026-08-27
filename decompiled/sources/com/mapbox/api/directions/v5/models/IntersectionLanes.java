package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IntersectionLanes extends DirectionsJsonObject {
    @SerializedName("access")
    public abstract IntersectionLaneAccess access();

    public abstract Boolean active();

    public abstract List<String> indications();

    @SerializedName("payment_methods")
    public abstract List<String> paymentMethods();

    public abstract Boolean valid();

    @SerializedName("valid_indication")
    public abstract String validIndication();

    public static TypeAdapter<IntersectionLanes> typeAdapter(Gson gson) {
        return new AutoValue_IntersectionLanes.GsonTypeAdapter(gson.newBuilder().registerTypeAdapter(String.class, new InterningStringAdapter()).create());
    }
}
