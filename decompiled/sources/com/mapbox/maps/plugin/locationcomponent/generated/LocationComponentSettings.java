package com.mapbox.maps.plugin.locationcomponent.generated;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.PuckBearing;
import java.util.Objects;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationComponentSettings implements Parcelable {
    public static final Parcelable.Creator<LocationComponentSettings> CREATOR = new zza(21);
    public final int accuracyRingBorderColor;
    public final int accuracyRingColor;
    public final boolean enabled;
    public final String layerAbove;
    public final String layerBelow;
    public final LocationPuck locationPuck;
    public final PuckBearing puckBearing;
    public final boolean puckBearingEnabled;
    public final int pulsingColor;
    public final boolean pulsingEnabled;
    public final float pulsingMaxRadius;
    public final boolean showAccuracyRing;
    public final String slot;

    public final class Builder {
        public int accuracyRingBorderColor;
        public int accuracyRingColor;
        public boolean enabled;
        public String layerAbove;
        public String layerBelow;
        public LocationPuck locationPuck;
        public PuckBearing puckBearing;
        public boolean puckBearingEnabled;
        public int pulsingColor;
        public boolean pulsingEnabled;
        public float pulsingMaxRadius;
        public boolean showAccuracyRing;
        public String slot;

        public final LocationComponentSettings build() {
            return new LocationComponentSettings(this.enabled, this.pulsingEnabled, this.pulsingColor, this.pulsingMaxRadius, this.showAccuracyRing, this.accuracyRingColor, this.accuracyRingBorderColor, this.layerAbove, this.layerBelow, this.puckBearingEnabled, this.puckBearing, this.slot, this.locationPuck);
        }

        public Builder(LocationPuck locationPuck) {
            locationPuck.getClass();
            this.locationPuck = locationPuck;
            this.pulsingColor = Color.parseColor("#4A90E2");
            this.pulsingMaxRadius = 10.0f;
            this.accuracyRingColor = Color.parseColor("#4d89cff0");
            this.accuracyRingBorderColor = Color.parseColor("#4d89cff0");
            this.puckBearing = PuckBearing.HEADING;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Builder toBuilder() {
        LocationPuck locationPuck = this.locationPuck;
        Builder builder = new Builder(locationPuck);
        builder.enabled = this.enabled;
        builder.pulsingEnabled = this.pulsingEnabled;
        builder.pulsingColor = this.pulsingColor;
        builder.pulsingMaxRadius = this.pulsingMaxRadius;
        builder.showAccuracyRing = this.showAccuracyRing;
        builder.accuracyRingColor = this.accuracyRingColor;
        builder.accuracyRingBorderColor = this.accuracyRingBorderColor;
        builder.layerAbove = this.layerAbove;
        builder.layerBelow = this.layerBelow;
        builder.puckBearingEnabled = this.puckBearingEnabled;
        PuckBearing puckBearing = this.puckBearing;
        puckBearing.getClass();
        builder.puckBearing = puckBearing;
        builder.slot = this.slot;
        locationPuck.getClass();
        builder.locationPuck = locationPuck;
        return builder;
    }

    public LocationComponentSettings(boolean z, boolean z2, int i, float f, boolean z3, int i2, int i3, String str, String str2, boolean z4, PuckBearing puckBearing, String str3, LocationPuck locationPuck) {
        this.enabled = z;
        this.pulsingEnabled = z2;
        this.pulsingColor = i;
        this.pulsingMaxRadius = f;
        this.showAccuracyRing = z3;
        this.accuracyRingColor = i2;
        this.accuracyRingBorderColor = i3;
        this.layerAbove = str;
        this.layerBelow = str2;
        this.puckBearingEnabled = z4;
        this.puckBearing = puckBearing;
        this.slot = str3;
        this.locationPuck = locationPuck;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.pulsingEnabled ? 1 : 0);
        parcel.writeInt(this.pulsingColor);
        parcel.writeFloat(this.pulsingMaxRadius);
        parcel.writeInt(this.showAccuracyRing ? 1 : 0);
        parcel.writeInt(this.accuracyRingColor);
        parcel.writeInt(this.accuracyRingBorderColor);
        parcel.writeString(this.layerAbove);
        parcel.writeString(this.layerBelow);
        parcel.writeInt(this.puckBearingEnabled ? 1 : 0);
        parcel.writeString(this.puckBearing.name());
        parcel.writeString(this.slot);
        parcel.writeParcelable(this.locationPuck, i);
    }

    public final String toString() {
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("LocationComponentSettings(enabled=" + this.enabled + ",\n      pulsingEnabled=" + this.pulsingEnabled + ", pulsingColor=" + this.pulsingColor + ",\n      pulsingMaxRadius=" + this.pulsingMaxRadius + ", showAccuracyRing=" + this.showAccuracyRing + ",\n      accuracyRingColor=" + this.accuracyRingColor + ", accuracyRingBorderColor=" + this.accuracyRingBorderColor + ",\n      layerAbove=" + this.layerAbove + ", layerBelow=" + this.layerBelow + ", puckBearingEnabled=" + this.puckBearingEnabled + ",\n      puckBearing=" + this.puckBearing + ", slot=" + this.slot + ", locationPuck=" + this.locationPuck + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationComponentSettings.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LocationComponentSettings locationComponentSettings = (LocationComponentSettings) obj;
        if (this.enabled == locationComponentSettings.enabled && this.pulsingEnabled == locationComponentSettings.pulsingEnabled && this.pulsingColor == locationComponentSettings.pulsingColor && Float.compare(this.pulsingMaxRadius, locationComponentSettings.pulsingMaxRadius) == 0 && this.showAccuracyRing == locationComponentSettings.showAccuracyRing && this.accuracyRingColor == locationComponentSettings.accuracyRingColor && this.accuracyRingBorderColor == locationComponentSettings.accuracyRingBorderColor) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.layerAbove, locationComponentSettings.layerAbove}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.layerBelow, locationComponentSettings.layerBelow}, getCieXyz.write())).booleanValue() && this.puckBearingEnabled == locationComponentSettings.puckBearingEnabled && this.puckBearing == locationComponentSettings.puckBearing) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.slot, locationComponentSettings.slot}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locationPuck, locationComponentSettings.locationPuck}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.enabled;
        boolean z2 = this.pulsingEnabled;
        int i = this.pulsingColor;
        float f = this.pulsingMaxRadius;
        boolean z3 = this.showAccuracyRing;
        int i2 = this.accuracyRingColor;
        int i3 = this.accuracyRingBorderColor;
        boolean z4 = this.puckBearingEnabled;
        String str = this.slot;
        LocationPuck locationPuck = this.locationPuck;
        return Objects.hash(Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Float.valueOf(f), Boolean.valueOf(z3), Integer.valueOf(i2), Integer.valueOf(i3), this.layerAbove, this.layerBelow, Boolean.valueOf(z4), this.puckBearing, str, locationPuck);
    }
}
