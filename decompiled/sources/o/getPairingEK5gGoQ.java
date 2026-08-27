package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getPairingEK5gGoQ implements IInterface {
    public final String IconCompatParcelizer;
    public final IBinder read;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.read;
    }

    public getPairingEK5gGoQ(IBinder iBinder, String str) {
        this.read = iBinder;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.read.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel serializer() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.IconCompatParcelizer);
        return parcelObtain;
    }

    public final Parcel serializer(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.read.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public final void read(Parcel parcel) {
        try {
            this.read.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
