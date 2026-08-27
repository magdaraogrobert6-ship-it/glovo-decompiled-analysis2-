package com.mapbox.common.geofencing;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Feature;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofenceState implements Serializable {
    private final Feature feature;
    private final Date timestamp;

    public final Feature getFeature() {
        return this.feature;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Feature feature;
        private Date timestamp;

        public final Feature getFeature() {
            return this.feature;
        }

        public final Date getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: setTimestamp, reason: collision with other method in class */
        public final /* synthetic */ void m4547setTimestamp(Date date) {
            this.timestamp = date;
        }

        public Builder(Feature feature) {
            feature.getClass();
            this.feature = feature;
        }

        /* JADX INFO: renamed from: setFeature, reason: collision with other method in class */
        public final /* synthetic */ void m4546setFeature(Feature feature) {
            feature.getClass();
            this.feature = feature;
        }

        public final Builder setTimestamp(Date date) {
            this.timestamp = date;
            return this;
        }

        public final Builder setFeature(Feature feature) {
            feature.getClass();
            this.feature = feature;
            return this;
        }

        public final GeofenceState build() {
            Feature feature = this.feature;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (feature != null) {
                feature.getClass();
                return new GeofenceState(feature, this.timestamp, defaultConstructorMarker);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of GeofenceState through GeofenceState.Builder because feature was null.");
            return null;
        }
    }

    public int hashCode() {
        return Objects.hash(this.feature, this.timestamp);
    }

    public final Builder toBuilder() {
        return new Builder(this.feature).setFeature(this.feature).setTimestamp(this.timestamp);
    }

    private GeofenceState(Feature feature, Date date) {
        this.feature = feature;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeofenceState)) {
            return false;
        }
        GeofenceState geofenceState = (GeofenceState) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.feature, geofenceState.feature}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, geofenceState.timestamp}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "GeofenceState(feature=" + this.feature + ", timestamp=" + this.timestamp + ')';
    }

    public /* synthetic */ GeofenceState(Feature feature, Date date, DefaultConstructorMarker defaultConstructorMarker) {
        this(feature, date);
    }
}
