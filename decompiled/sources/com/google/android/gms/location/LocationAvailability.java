package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    final int zzc;
    private final int zzd;
    private final int zze;
    private final long zzf;
    private final zzal[] zzg;
    public static final LocationAvailability zza = new LocationAvailability(0, 1, 1, 0, null, true);
    public static final LocationAvailability zzb = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzab();

    public boolean isLocationAvailable() {
        return this.zzc < 1000;
    }

    public static boolean hasLocationAvailability(Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzd;
        int i3 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(i2);
        int i4 = this.zze;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i4);
        long j = this.zzf;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(j);
        int i5 = this.zzc;
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(i5);
        SQLite.serializer(parcel, 5, this.zzg, i);
        boolean zIsLocationAvailable = isLocationAvailable();
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(zIsLocationAvailable ? 1 : 0);
        SQLite.serializer(i3, parcel);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.zzd == locationAvailability.zzd && this.zze == locationAvailability.zze && this.zzf == locationAvailability.zzf && this.zzc == locationAvailability.zzc && Arrays.equals(this.zzg, locationAvailability.zzg);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzc)});
    }

    public LocationAvailability(int i, int i2, int i3, long j, zzal[] zzalVarArr, boolean z) {
        this.zzc = i < 1000 ? 0 : 1000;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = j;
        this.zzg = zzalVarArr;
    }

    public String toString() {
        boolean zIsLocationAvailable = isLocationAvailable();
        StringBuilder sb = new StringBuilder(String.valueOf(zIsLocationAvailable).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(zIsLocationAvailable);
        sb.append("]");
        return sb.toString();
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
