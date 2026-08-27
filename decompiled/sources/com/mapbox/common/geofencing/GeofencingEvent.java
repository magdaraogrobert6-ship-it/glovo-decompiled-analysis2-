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
public final class GeofencingEvent implements Serializable {
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

        public Builder(Feature feature, Date date) {
            feature.getClass();
            date.getClass();
            this.feature = feature;
            this.timestamp = date;
        }

        /* JADX INFO: renamed from: setFeature, reason: collision with other method in class */
        public final /* synthetic */ void m4550setFeature(Feature feature) {
            feature.getClass();
            this.feature = feature;
        }

        /* JADX INFO: renamed from: setTimestamp, reason: collision with other method in class */
        public final /* synthetic */ void m4551setTimestamp(Date date) {
            date.getClass();
            this.timestamp = date;
        }

        public final GeofencingEvent build() {
            Feature feature = this.feature;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (feature == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of GeofencingEvent through GeofencingEvent.Builder because feature was null.");
                return null;
            }
            if (this.timestamp == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Could not build an instance of GeofencingEvent through GeofencingEvent.Builder because timestamp was null.");
                return null;
            }
            feature.getClass();
            Date date = this.timestamp;
            date.getClass();
            return new GeofencingEvent(feature, date, defaultConstructorMarker);
        }

        public final Builder setFeature(Feature feature) {
            feature.getClass();
            this.feature = feature;
            return this;
        }

        public final Builder setTimestamp(Date date) {
            date.getClass();
            this.timestamp = date;
            return this;
        }
    }

    public int hashCode() {
        return Objects.hash(this.feature, this.timestamp);
    }

    public final Builder toBuilder() {
        return new Builder(this.feature, this.timestamp).setFeature(this.feature).setTimestamp(this.timestamp);
    }

    private GeofencingEvent(Feature feature, Date date) {
        this.feature = feature;
        this.timestamp = date;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeofencingEvent)) {
            return false;
        }
        GeofencingEvent geofencingEvent = (GeofencingEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.feature, geofencingEvent.feature}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, geofencingEvent.timestamp}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "GeofencingEvent(feature=" + this.feature + ", timestamp=" + this.timestamp + ')';
    }

    public /* synthetic */ GeofencingEvent(Feature feature, Date date, DefaultConstructorMarker defaultConstructorMarker) {
        this(feature, date);
    }
}
