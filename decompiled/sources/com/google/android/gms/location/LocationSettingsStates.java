package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.config.RemoteActionCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzaj();
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        return (LocationSettingsStates) RemoteActionCompatParcelizer.serializer(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        boolean zIsGpsUsable = isGpsUsable();
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(zIsGpsUsable ? 1 : 0);
        boolean zIsNetworkLocationUsable = isNetworkLocationUsable();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(zIsNetworkLocationUsable ? 1 : 0);
        boolean zIsBleUsable = isBleUsable();
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(zIsBleUsable ? 1 : 0);
        boolean zIsGpsPresent = isGpsPresent();
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(zIsGpsPresent ? 1 : 0);
        boolean zIsNetworkLocationPresent = isNetworkLocationPresent();
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(zIsNetworkLocationPresent ? 1 : 0);
        boolean zIsBlePresent = isBlePresent();
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(zIsBlePresent ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
    }

    public boolean isLocationPresent() {
        return this.zzd || this.zze;
    }

    public boolean isLocationUsable() {
        return this.zza || this.zzb;
    }
}
