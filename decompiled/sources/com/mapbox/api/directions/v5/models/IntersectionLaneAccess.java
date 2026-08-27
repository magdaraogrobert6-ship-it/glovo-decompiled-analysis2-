package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IntersectionLaneAccess extends DirectionsJsonObject {

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface LaneDesignatedVehicleType {
    }

    @SerializedName("designated")
    public abstract List<String> designated();

    public static TypeAdapter<IntersectionLaneAccess> typeAdapter(Gson gson) {
        return new AutoValue_IntersectionLaneAccess.GsonTypeAdapter(gson.newBuilder().registerTypeAdapter(String.class, new InterningStringAdapter()).create());
    }
}
