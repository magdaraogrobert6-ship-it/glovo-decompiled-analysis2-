package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class OnPlacedModifierDefaultImpls implements IInterface {
    public final IBinder serializer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.serializer;
    }

    public OnPlacedModifierDefaultImpls(IBinder iBinder) {
        this.serializer = iBinder;
    }

    public final Parcel RemoteActionCompatParcelizer(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.serializer.transact(i, parcel, parcelObtain, 0);
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
