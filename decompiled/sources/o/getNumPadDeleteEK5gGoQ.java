package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadDeleteEK5gGoQ extends zza {
    public getNumPadDeleteEK5gGoQ(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void serializer(zzei zzeiVar) {
        Parcel parcelZza = zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzeiVar);
        zzc(59, parcelZza);
    }

    public final void write(zzee zzeeVar, LocationRequest locationRequest, getNavigatePreviousEK5gGoQ getnavigatepreviousek5ggoq) throws RemoteException {
        Parcel parcelZza = zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, zzeeVar);
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, locationRequest);
        parcelZza.writeStrongBinder(getnavigatepreviousek5ggoq);
        zzc(88, parcelZza);
    }
}
