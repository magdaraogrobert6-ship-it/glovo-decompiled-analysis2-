package com.sentiance.sdk.ondevice.api;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import com.sentiance.sdk.DontObfuscate;
import o.r8lambdasltIPiGJVVPhbuJO9BTkcUoy0rM;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class GeoLocation implements Parcelable {
    public static final Parcelable.Creator<GeoLocation> CREATOR = new r8lambdasltIPiGJVVPhbuJO9BTkcUoy0rM();
    private final int mAccuracyInMeters;
    private final double mLatitude;
    private final double mLongitude;

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

    public boolean hasAccuracy() {
        return this.mAccuracyInMeters != -1;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.mLatitude);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.mLongitude);
        return (((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2))) * 31) + this.mAccuracyInMeters;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeInt(this.mAccuracyInMeters);
    }

    public GeoLocation(Parcel parcel) {
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mAccuracyInMeters = parcel.readInt();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeoLocation{latitude=");
        sb.append(this.mLatitude);
        sb.append(", longitude=");
        sb.append(this.mLongitude);
        sb.append(", accuracyInMeters=");
        return af$$ExternalSyntheticOutline0.m(sb, this.mAccuracyInMeters, '}');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GeoLocation geoLocation = (GeoLocation) obj;
            if (Double.compare(geoLocation.mLatitude, this.mLatitude) == 0 && Double.compare(geoLocation.mLongitude, this.mLongitude) == 0 && this.mAccuracyInMeters == geoLocation.mAccuracyInMeters) {
                return true;
            }
        }
        return false;
    }

    public GeoLocation(double d, double d2, int i) {
        this.mLatitude = d;
        this.mLongitude = d2;
        this.mAccuracyInMeters = i;
    }
}
