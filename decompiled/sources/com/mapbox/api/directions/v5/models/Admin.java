package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Admin extends DirectionsJsonObject {
    @SerializedName("iso_3166_1")
    public abstract String countryCode();

    @SerializedName("iso_3166_1_alpha3")
    public abstract String countryCodeAlpha3();

    public static TypeAdapter<Admin> typeAdapter(Gson gson) {
        return new AutoValue_Admin.GsonTypeAdapter(gson);
    }
}
