package com.mapbox.common.geofencing;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofencingOptions implements Serializable {
    private final int maximumMonitoredFeatures;

    public final int getMaximumMonitoredFeatures() {
        return this.maximumMonitoredFeatures;
    }

    public static final class Builder {
        private int maximumMonitoredFeatures = AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;

        public final int getMaximumMonitoredFeatures() {
            return this.maximumMonitoredFeatures;
        }

        /* JADX INFO: renamed from: setMaximumMonitoredFeatures, reason: collision with other method in class */
        public final /* synthetic */ void m4553setMaximumMonitoredFeatures(int i) {
            this.maximumMonitoredFeatures = i;
        }

        public final Builder setMaximumMonitoredFeatures(int i) {
            this.maximumMonitoredFeatures = i;
            return this;
        }

        public final GeofencingOptions build() {
            return new GeofencingOptions(this.maximumMonitoredFeatures, null);
        }
    }

    public final Builder toBuilder() {
        return new Builder().setMaximumMonitoredFeatures(this.maximumMonitoredFeatures);
    }

    private GeofencingOptions(int i) {
        this.maximumMonitoredFeatures = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GeofencingOptions) && this.maximumMonitoredFeatures == ((GeofencingOptions) obj).maximumMonitoredFeatures;
    }

    public String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("GeofencingOptions(maximumMonitoredFeatures="), this.maximumMonitoredFeatures, ')');
    }

    public /* synthetic */ GeofencingOptions(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.maximumMonitoredFeatures));
    }
}
