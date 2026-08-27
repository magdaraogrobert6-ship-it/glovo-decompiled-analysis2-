package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.accessgetNumPadCommacp;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements accessgetNumPadCommacp {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzai();
    private final Status zza;
    private final LocationSettingsStates zzb;

    public LocationSettingsStates getLocationSettingsStates() {
        return this.zzb;
    }

    @Override // o.accessgetNumPadCommacp
    public Status getStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, getStatus(), i);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, getLocationSettingsStates(), i);
        SQLite.serializer(i2, parcel);
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.zza = status;
        this.zzb = locationSettingsStates;
    }
}
