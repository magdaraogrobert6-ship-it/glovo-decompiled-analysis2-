package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getBackslashEK5gGoQ implements IInterface {
    public final IBinder IconCompatParcelizer;
    public final String serializer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.IconCompatParcelizer;
    }

    public getBackslashEK5gGoQ(IBinder iBinder, String str) {
        this.IconCompatParcelizer = iBinder;
        this.serializer = str;
    }

    public final void RemoteActionCompatParcelizer(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.IconCompatParcelizer.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel write() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.serializer);
        return parcelObtain;
    }
}
