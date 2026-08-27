package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsEvStationUnavailableReasonCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsRefreshTypeCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsSubtypeCriteria;
import com.mapbox.api.directions.v5.DirectionsCriteria$NotificationsTypeCriteria;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Notification extends DirectionsJsonObject {

    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Notification build();

        @SerializedName("geometry_index")
        public abstract Builder geometryIndex(Integer num);

        @SerializedName("geometry_index_end")
        public abstract Builder geometryIndexEnd(Integer num);

        @SerializedName("geometry_index_start")
        public abstract Builder geometryIndexStart(Integer num);
    }

    @SerializedName("station_id")
    public abstract String chargingStationId();

    public abstract NotificationDetails details();

    @SerializedName("geometry_index")
    public abstract Integer geometryIndex();

    @SerializedName("geometry_index_end")
    public abstract Integer geometryIndexEnd();

    @SerializedName("geometry_index_start")
    public abstract Integer geometryIndexStart();

    @DirectionsCriteria$NotificationsEvStationUnavailableReasonCriteria
    public abstract String reason();

    @SerializedName("refresh_type")
    @DirectionsCriteria$NotificationsRefreshTypeCriteria
    public abstract String refreshType();

    @DirectionsCriteria$NotificationsSubtypeCriteria
    public abstract String subtype();

    public abstract Builder toBuilder();

    @DirectionsCriteria$NotificationsTypeCriteria
    public abstract String type();

    public static TypeAdapter<Notification> typeAdapter(Gson gson) {
        return new AutoValue_Notification.GsonTypeAdapter(gson);
    }
}
