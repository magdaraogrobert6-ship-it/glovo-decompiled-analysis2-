package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetDrawStyle {
    private static int IconCompatParcelizer = 1;
    private static int write;

    @SerializedName("screen_on")
    private final Boolean screenOn = null;

    @SerializedName("proximity_near")
    private final Boolean isProximityNear = null;

    @SerializedName("barometer")
    private final Float barometerHpa = null;

    @SerializedName("absolute_altitude")
    private final Float absoluteAltitudeMeters = null;

    @SerializedName("thermal_state")
    private final Integer thermalStatus = null;

    @SerializedName("accel_mean")
    private final Float accelMean = null;

    @SerializedName("accel_max")
    private final Float accelMax = null;

    @SerializedName("accel_min")
    private final Float accelMin = null;

    @SerializedName("accel_variance")
    private final Float accelVariance = null;

    @SerializedName("accel_max_jerk")
    private final Float accelMaxJerk = null;

    @SerializedName("gyro_variance")
    private final Float gyroVariance = null;

    @SerializedName("mag_variance")
    private final Float magVariance = null;

    @SerializedName("mag_delta_mean")
    private final Float magDeltaMean = null;

    public final String toString() {
        int i = 2 % 2;
        String str = "SensorData(screenOn=" + this.screenOn + ", isProximityNear=" + this.isProximityNear + ", barometerHpa=" + this.barometerHpa + ", absoluteAltitudeMeters=" + this.absoluteAltitudeMeters + ", thermalStatus=" + this.thermalStatus + ", accelMean=" + this.accelMean + ", accelMax=" + this.accelMax + ", accelMin=" + this.accelMin + ", accelVariance=" + this.accelVariance + ", accelMaxJerk=" + this.accelMaxJerk + ", gyroVariance=" + this.gyroVariance + ", magVariance=" + this.magVariance + ", magDeltaMean=" + this.magDeltaMean + ")";
        int i2 = write + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof accesssetDrawStyle) {
            accesssetDrawStyle accesssetdrawstyle = (accesssetDrawStyle) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.screenOn, accesssetdrawstyle.screenOn}, getCieXyz.write())).booleanValue())) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isProximityNear, accesssetdrawstyle.isProximityNear}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 125;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.barometerHpa, accesssetdrawstyle.barometerHpa}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.absoluteAltitudeMeters, accesssetdrawstyle.absoluteAltitudeMeters}, getCieXyz.write())).booleanValue()) {
                    int i4 = IconCompatParcelizer + 31;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.thermalStatus, accesssetdrawstyle.thermalStatus}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accelMean, accesssetdrawstyle.accelMean}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accelMax, accesssetdrawstyle.accelMax}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accelMin, accesssetdrawstyle.accelMin}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accelVariance, accesssetdrawstyle.accelVariance}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accelMaxJerk, accesssetdrawstyle.accelMaxJerk}, getCieXyz.write())).booleanValue()) {
                    int i6 = write + 79;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.gyroVariance, accesssetdrawstyle.gyroVariance}, getCieXyz.write())).booleanValue()) {
                    int i8 = IconCompatParcelizer + 67;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.magVariance, accesssetdrawstyle.magVariance}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.magDeltaMean, accesssetdrawstyle.magDeltaMean}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i10 = IconCompatParcelizer + 79;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        Boolean bool = this.screenOn;
        if (bool == null) {
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
            int i2 = IconCompatParcelizer + 19;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        Boolean bool2 = this.isProximityNear;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Float f = this.barometerHpa;
        if (f == null) {
            int i4 = IconCompatParcelizer + 97;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = f.hashCode();
        }
        Float f2 = this.absoluteAltitudeMeters;
        int iHashCode7 = f2 == null ? 0 : f2.hashCode();
        Integer num = this.thermalStatus;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Float f3 = this.accelMean;
        if (f3 == null) {
            int i6 = write + 91;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = f3.hashCode();
        }
        Float f4 = this.accelMax;
        if (f4 == null) {
            int i8 = IconCompatParcelizer + 7;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = f4.hashCode();
        }
        Float f5 = this.accelMin;
        int iHashCode9 = 1;
        if (f5 == null) {
            int i10 = write + 83;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode5 = i10 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode5 = f5.hashCode();
        }
        Float f6 = this.accelVariance;
        int iHashCode10 = f6 == null ? 0 : f6.hashCode();
        Float f7 = this.accelMaxJerk;
        if (f7 == null) {
            int i11 = IconCompatParcelizer + 117;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                iHashCode9 = 0;
            }
        } else {
            iHashCode9 = f7.hashCode();
        }
        Float f8 = this.gyroVariance;
        int iHashCode11 = f8 == null ? 0 : f8.hashCode();
        Float f9 = this.magVariance;
        int iHashCode12 = f9 == null ? 0 : f9.hashCode();
        Float f10 = this.magDeltaMean;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode10) * 31) + iHashCode9) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (f10 != null ? f10.hashCode() : 0);
    }
}
