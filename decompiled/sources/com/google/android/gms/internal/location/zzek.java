package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import com.google.android.gms.location.Geofence;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzek extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzek> CREATOR = new zzq(6);
    public final double IconCompatParcelizer;
    public final int MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final short RemoteActionCompatParcelizer;
    public final long read;
    public final double serializer;
    public final String write;

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.read;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.IconCompatParcelizer;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.RatingCompat;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.serializer;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.MediaMetadataCompat;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.write;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.MediaDescriptionCompat;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.serializer);
        int i = (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        int iFloatToIntBits = Float.floatToIntBits(this.MediaMetadataCompat);
        return ((((iFloatToIntBits + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + i) * 31)) * 31) + this.RemoteActionCompatParcelizer) * 31) + this.MediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeLong(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 8);
        parcel.writeDouble(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 8);
        parcel.writeDouble(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeFloat(this.MediaMetadataCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeInt(this.MediaDescriptionCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeInt(this.MediaSessionCompatQueueItem);
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 4);
        parcel.writeInt(this.RatingCompat);
        SQLite.serializer(i2, parcel);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s = this.RemoteActionCompatParcelizer;
        if (s != -1) {
            str = s != 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.write.replaceAll("\\p{C}", "?"), Integer.valueOf(this.MediaDescriptionCompat), Double.valueOf(this.IconCompatParcelizer), Double.valueOf(this.serializer), Float.valueOf(this.MediaMetadataCompat), Integer.valueOf(this.MediaSessionCompatQueueItem / 1000), Integer.valueOf(this.RatingCompat), Long.valueOf(this.read));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzek)) {
            return false;
        }
        zzek zzekVar = (zzek) obj;
        return this.MediaMetadataCompat == zzekVar.MediaMetadataCompat && this.IconCompatParcelizer == zzekVar.IconCompatParcelizer && this.serializer == zzekVar.serializer && this.RemoteActionCompatParcelizer == zzekVar.RemoteActionCompatParcelizer && this.MediaDescriptionCompat == zzekVar.MediaDescriptionCompat;
    }

    public zzek(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("requestId is null or too long: ".concat(String.valueOf(str)));
            throw null;
        }
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 16);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 18);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(d2).length() + 19);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "No supported transition specified: ", new StringBuilder(String.valueOf(i).length() + 35)));
            throw null;
        }
        this.RemoteActionCompatParcelizer = s;
        this.write = str;
        this.IconCompatParcelizer = d;
        this.serializer = d2;
        this.MediaMetadataCompat = f;
        this.read = j;
        this.MediaDescriptionCompat = i4;
        this.MediaSessionCompatQueueItem = i2;
        this.RatingCompat = i3;
    }
}
