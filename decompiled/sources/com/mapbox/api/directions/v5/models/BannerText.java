package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BannerText extends DirectionsJsonObject {
    public abstract List<BannerComponents> components();

    public abstract Double degrees();

    @SerializedName("driving_side")
    public abstract String drivingSide();

    @ManeuverModifier$Type
    public abstract String modifier();

    public abstract String text();

    @StepManeuver.StepManeuverType
    public abstract String type();

    public static TypeAdapter<BannerText> typeAdapter(Gson gson) {
        return new AutoValue_BannerText.GsonTypeAdapter(gson);
    }
}
