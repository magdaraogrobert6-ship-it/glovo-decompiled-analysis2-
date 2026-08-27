package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class getSystemBars implements getStatusBars, IInterface {
    public final IBinder RemoteActionCompatParcelizer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.RemoteActionCompatParcelizer;
    }

    public getSystemBars(IBinder iBinder) {
        this.RemoteActionCompatParcelizer = iBinder;
    }

    @Override // o.getStatusBars
    public final void IconCompatParcelizer(String str, Bundle bundle, getTargetValueInsetshdzbrEE gettargetvalueinsetshdzbree) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i = getSystemGestures.serializer;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(gettargetvalueinsetshdzbree);
        try {
            this.RemoteActionCompatParcelizer.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
