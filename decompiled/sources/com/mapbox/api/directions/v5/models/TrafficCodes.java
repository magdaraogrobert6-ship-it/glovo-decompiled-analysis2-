package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TrafficCodes extends DirectionsJsonObject {
    @SerializedName("jartic_cause_code")
    public abstract Integer jarticCauseCode();

    @SerializedName("jartic_regulation_code")
    public abstract Integer jarticRegulationCode();

    public static TypeAdapter<TrafficCodes> typeAdapter(Gson gson) {
        return new AutoValue_TrafficCodes.GsonTypeAdapter(gson);
    }
}
