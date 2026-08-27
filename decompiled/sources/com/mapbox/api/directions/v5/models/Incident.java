package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Incident extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Incident build();

        public abstract Builder geometryIndexEnd(Integer num);

        public abstract Builder geometryIndexStart(Integer num);
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface ImpactType {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface IncidentType {
    }

    @SerializedName("affected_road_names")
    public abstract List<String> affectedRoadNames();

    @SerializedName("alertc_codes")
    public abstract List<Integer> alertcCodes();

    public abstract Boolean closed();

    public abstract Congestion congestion();

    @SerializedName("iso_3166_1_alpha2")
    public abstract String countryCodeAlpha2();

    @SerializedName("iso_3166_1_alpha3")
    public abstract String countryCodeAlpha3();

    @SerializedName("creation_time")
    public abstract String creationTime();

    public abstract String description();

    @SerializedName("end_time")
    public abstract String endTime();

    @SerializedName("geometry_index_end")
    public abstract Integer geometryIndexEnd();

    @SerializedName("geometry_index_start")
    public abstract Integer geometryIndexStart();

    public abstract String id();

    @ImpactType
    public abstract String impact();

    @SerializedName("lanes_blocked")
    public abstract List<String> lanesBlocked();

    @SerializedName("long_description")
    public abstract String longDescription();

    @SerializedName("num_lanes_blocked")
    public abstract Integer numLanesBlocked();

    @SerializedName("start_time")
    public abstract String startTime();

    @SerializedName("sub_type")
    public abstract String subType();

    @SerializedName("sub_type_description")
    public abstract String subTypeDescription();

    public abstract Builder toBuilder();

    @SerializedName("traffic_codes")
    public abstract TrafficCodes trafficCodes();

    @IncidentType
    public abstract String type();

    public static TypeAdapter<Incident> typeAdapter(Gson gson) {
        return new AutoValue_Incident.GsonTypeAdapter(gson);
    }
}
