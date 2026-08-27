package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.getMinusEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzv extends com.google.android.gms.internal.location.zzb implements zzw {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzw zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzw ? (zzw) iInterfaceQueryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) getMinusEK5gGoQ.read(parcel, LocationResult.CREATOR);
            getMinusEK5gGoQ.serializer(parcel);
            zzd(locationResult);
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) getMinusEK5gGoQ.read(parcel, LocationAvailability.CREATOR);
            getMinusEK5gGoQ.serializer(parcel);
            zze(locationAvailability);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
