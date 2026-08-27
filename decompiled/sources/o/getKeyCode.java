package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class getKeyCode implements accessgetZcp, IInterface {
    public final IBinder RemoteActionCompatParcelizer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.RemoteActionCompatParcelizer;
    }

    public getKeyCode(IBinder iBinder) {
        this.RemoteActionCompatParcelizer = iBinder;
    }

    public final Parcel IconCompatParcelizer(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.RemoteActionCompatParcelizer.transact(i, parcel, parcelObtain, 0);
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
}
