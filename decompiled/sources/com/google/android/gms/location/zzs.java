package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import o.getMinusEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzs extends com.google.android.gms.internal.location.zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static zzt zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof zzt ? (zzt) iInterfaceQueryLocalInterface : new zzr(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) getMinusEK5gGoQ.read(parcel, DeviceOrientation.CREATOR);
        getMinusEK5gGoQ.serializer(parcel);
        zzd(deviceOrientation);
        return true;
    }
}
