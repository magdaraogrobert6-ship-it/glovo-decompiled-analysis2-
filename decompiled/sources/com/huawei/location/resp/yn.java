package com.huawei.location.resp;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class yn implements Parcelable {
    public static final Parcelable.Creator<yn> CREATOR = new Vw.yn(1);
    public Location IconCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Location location = this.IconCompatParcelizer;
        if (location != null) {
            String provider = location.getProvider();
            if (provider == null) {
                provider = "";
            }
            parcel.writeString(provider);
            parcel.writeLong(location.getTime());
            parcel.writeLong(location.getElapsedRealtimeNanos());
            parcel.writeByte((byte) 0);
            parcel.writeDouble(location.getLatitude());
            parcel.writeDouble(location.getLongitude());
            parcel.writeDouble(location.getAltitude());
            parcel.writeFloat(location.getSpeed());
            parcel.writeFloat(location.getBearing());
            parcel.writeFloat(location.getAccuracy());
            parcel.writeFloat(location.getVerticalAccuracyMeters());
            parcel.writeFloat(location.getSpeedAccuracyMetersPerSecond());
            parcel.writeFloat(location.getBearingAccuracyDegrees());
            parcel.writeBundle(location.getExtras());
        }
    }
}
