package com.mapbox.api.directions.v5.models;

import com.braze.models.inappmessage.InAppMessageBase;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxShield extends DirectionsJsonObject {

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder baseUrl(String str);

        public abstract MapboxShield build();

        public abstract Builder displayRef(String str);

        public abstract Builder name(String str);

        public abstract Builder textColor(String str);
    }

    @SerializedName("base_url")
    public abstract String baseUrl();

    @SerializedName("display_ref")
    public abstract String displayRef();

    public abstract String name();

    @SerializedName(InAppMessageBase.MESSAGE_TEXT_COLOR)
    public abstract String textColor();

    public static Builder builder() {
        return new C$AutoValue_MapboxShield.Builder();
    }

    public static TypeAdapter<MapboxShield> typeAdapter(Gson gson) {
        return new AutoValue_MapboxShield.GsonTypeAdapter(gson);
    }
}
