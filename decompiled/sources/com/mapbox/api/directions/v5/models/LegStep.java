package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LegStep extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract LegStep build();

        public abstract Builder distance(double d);

        public abstract Builder duration(double d);

        public abstract Builder geometry(String str);

        public abstract Builder intersections(List<StepIntersection> list);

        public abstract Builder maneuver(StepManeuver stepManeuver);

        public abstract Builder mode(String str);

        public abstract Builder weight(double d);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface SpeedLimitSign {
    }

    public abstract List<BannerInstructions> bannerInstructions();

    public abstract String destinations();

    public abstract double distance();

    @SerializedName("driving_side")
    public abstract String drivingSide();

    public abstract double duration();

    @SerializedName("duration_typical")
    public abstract Double durationTypical();

    public abstract String exits();

    public abstract String geometry();

    public abstract List<StepIntersection> intersections();

    public abstract StepManeuver maneuver();

    public abstract String mode();

    public abstract String name();

    public abstract String pronunciation();

    public abstract String ref();

    @SerializedName("rotary_name")
    public abstract String rotaryName();

    @SerializedName("rotary_pronunciation")
    public abstract String rotaryPronunciation();

    @SpeedLimitSign
    public abstract String speedLimitSign();

    @SpeedLimit$Unit
    public abstract String speedLimitUnit();

    public abstract Builder toBuilder();

    public abstract List<VoiceInstructions> voiceInstructions();

    public abstract double weight();

    public static Builder builder() {
        return new C$AutoValue_LegStep.Builder();
    }

    public static TypeAdapter<LegStep> typeAdapter(Gson gson) {
        return new AutoValue_LegStep.GsonTypeAdapter(gson);
    }
}
