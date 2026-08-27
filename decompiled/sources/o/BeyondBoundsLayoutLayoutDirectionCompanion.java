package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BeyondBoundsLayoutLayoutDirectionCompanion implements IInterface {
    public final String IconCompatParcelizer;
    public final IBinder write;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.write;
    }

    public BeyondBoundsLayoutLayoutDirectionCompanion(IBinder iBinder, String str) {
        this.write = iBinder;
        this.IconCompatParcelizer = str;
    }

    public final Parcel RemoteActionCompatParcelizer() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.IconCompatParcelizer);
        return parcelObtain;
    }

    public final Parcel read(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.write.transact(i, parcel, parcelObtain, 0);
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

    public final void write(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.write.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
