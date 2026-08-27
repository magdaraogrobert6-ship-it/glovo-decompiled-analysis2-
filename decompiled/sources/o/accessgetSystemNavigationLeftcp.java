package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSystemNavigationLeftcp implements IInterface {
    public final IBinder read;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.read;
    }

    public accessgetSystemNavigationLeftcp(IBinder iBinder) {
        this.read = iBinder;
    }

    public final void write(zzd zzdVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(zzdVar);
            parcelObtain.writeInt(1);
            zza.write(getServiceRequest, parcelObtain, 0);
            this.read.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
