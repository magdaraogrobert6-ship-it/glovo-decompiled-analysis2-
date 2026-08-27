package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BannerView extends DirectionsJsonObject {
    public abstract List<BannerComponents> components();

    @ManeuverModifier$Type
    public abstract String modifier();

    public abstract String text();

    @StepManeuver.StepManeuverType
    public abstract String type();

    public static TypeAdapter<BannerView> typeAdapter(Gson gson) {
        return new AutoValue_BannerView.GsonTypeAdapter(gson);
    }
}
