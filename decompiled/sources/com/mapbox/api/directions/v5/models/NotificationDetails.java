package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NotificationDetails extends DirectionsJsonObject {
    @SerializedName("actual_value")
    public abstract String actualValue();

    public abstract String message();

    @SerializedName("requested_value")
    public abstract String requestedValue();

    public abstract String unit();

    public static TypeAdapter<NotificationDetails> typeAdapter(Gson gson) {
        return new AutoValue_NotificationDetails.GsonTypeAdapter(gson);
    }
}
