package com.sentiance.sdk.ondevice.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getStoryStylelambda1;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class Waypoint implements Parcelable {
    public static final Parcelable.Creator<Waypoint> CREATOR = new getStoryStylelambda1();
    private final int mAccuracyInMeters;
    private final boolean mIsSynthetic;
    private final double mLatitude;
    private final double mLongitude;
    private final float mSpeedInMps;
    private final float mSpeedLimitInMps;
    private final long mTimestamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAccuracyInMeters() {
        return this.mAccuracyInMeters;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public float getSpeedInMps() {
        return this.mSpeedInMps;
    }

    public float getSpeedLimitInMps() {
        return this.mSpeedLimitInMps;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public boolean hasAccuracy() {
        return this.mAccuracyInMeters != -1;
    }

    public boolean hasSpeed() {
        return this.mSpeedInMps != -1.0f;
    }

    public boolean hasUnlimitedSpeedLimit() {
        return this.mSpeedLimitInMps == Float.MAX_VALUE;
    }

    public boolean isSpeedLimitInfoSet() {
        return this.mSpeedLimitInMps != -1.0f;
    }

    public boolean isSynthetic() {
        return this.mIsSynthetic;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeLong(this.mTimestamp);
        parcel.writeInt(this.mAccuracyInMeters);
        parcel.writeFloat(this.mSpeedInMps);
        parcel.writeFloat(this.mSpeedLimitInMps);
        parcel.writeInt(this.mIsSynthetic ? 1 : 0);
    }

    public Waypoint(Parcel parcel) {
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mTimestamp = parcel.readLong();
        this.mAccuracyInMeters = parcel.readInt();
        this.mSpeedInMps = parcel.readFloat();
        this.mSpeedLimitInMps = parcel.readFloat();
        this.mIsSynthetic = parcel.readInt() == 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Waypoint{mLatitude=");
        sb.append(this.mLatitude);
        sb.append(", mLongitude=");
        sb.append(this.mLongitude);
        sb.append(", mTimestamp=");
        sb.append(this.mTimestamp);
        sb.append(", mAccuracyInMeters=");
        sb.append(this.mAccuracyInMeters);
        sb.append(", mSpeedInMps=");
        sb.append(this.mSpeedInMps);
        sb.append(", mSpeedLimitInMps=");
        sb.append(this.mSpeedLimitInMps);
        sb.append(", mIsSynthetic=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.mIsSynthetic, '}');
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.mLatitude), Double.valueOf(this.mLongitude), Long.valueOf(this.mTimestamp), Integer.valueOf(this.mAccuracyInMeters), Float.valueOf(this.mSpeedInMps), Float.valueOf(this.mSpeedLimitInMps), Boolean.valueOf(this.mIsSynthetic));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Waypoint waypoint = (Waypoint) obj;
        return Double.compare(this.mLatitude, waypoint.mLatitude) == 0 && Double.compare(this.mLongitude, waypoint.mLongitude) == 0 && this.mTimestamp == waypoint.mTimestamp && this.mAccuracyInMeters == waypoint.mAccuracyInMeters && Float.compare(this.mSpeedInMps, waypoint.mSpeedInMps) == 0 && Float.compare(this.mSpeedLimitInMps, waypoint.mSpeedLimitInMps) == 0 && this.mIsSynthetic == waypoint.mIsSynthetic;
    }

    public Waypoint(double d, double d2, long j, int i, float f, float f2) {
        this(d, d2, j, i, f, f2, false);
    }

    public Waypoint(double d, double d2, long j, int i, float f, float f2, boolean z) {
        this.mLatitude = d;
        this.mLongitude = d2;
        this.mAccuracyInMeters = i;
        this.mTimestamp = j;
        this.mSpeedInMps = f;
        this.mSpeedLimitInMps = f2;
        this.mIsSynthetic = z;
    }
}
