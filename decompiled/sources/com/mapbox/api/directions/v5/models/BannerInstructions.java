package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BannerInstructions extends DirectionsJsonObject {

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract BannerInstructions build();

        public abstract Builder distanceAlongGeometry(double d);

        public abstract Builder primary(BannerText bannerText);

        public abstract Builder secondary(BannerText bannerText);

        public abstract Builder sub(BannerText bannerText);

        public abstract Builder view(BannerView bannerView);
    }

    public abstract double distanceAlongGeometry();

    public abstract BannerText primary();

    public abstract BannerText secondary();

    public abstract BannerText sub();

    public abstract Builder toBuilder();

    public abstract BannerView view();

    public static Builder builder() {
        return new C$AutoValue_BannerInstructions.Builder();
    }

    public static TypeAdapter<BannerInstructions> typeAdapter(Gson gson) {
        return new AutoValue_BannerInstructions.GsonTypeAdapter(gson);
    }
}
