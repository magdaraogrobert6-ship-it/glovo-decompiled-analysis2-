package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StepManeuver extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder bearingAfter(Double d);

        public abstract Builder bearingBefore(Double d);

        public abstract StepManeuver build();

        public abstract Builder exit(Integer num);

        public abstract Builder instruction(String str);

        public abstract Builder modifier(String str);

        public abstract Builder rawLocation(double[] dArr);

        public abstract Builder type(String str);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface StepManeuverType {
    }

    @SerializedName("bearing_after")
    public abstract Double bearingAfter();

    @SerializedName("bearing_before")
    public abstract Double bearingBefore();

    public abstract Integer exit();

    public abstract String instruction();

    public abstract String modifier();

    @SerializedName("location")
    public abstract double[] rawLocation();

    @StepManeuverType
    public abstract String type();

    public static Builder builder() {
        return new C$AutoValue_StepManeuver.Builder();
    }

    public static TypeAdapter<StepManeuver> typeAdapter(Gson gson) {
        return new StepManeuverTypeAdapter(new AutoValue_StepManeuver.GsonTypeAdapter(gson));
    }
}
