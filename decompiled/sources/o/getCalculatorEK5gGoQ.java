package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getCalculatorEK5gGoQ implements IInterface {
    public final IBinder serializer;
    public final String write;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.serializer;
    }

    public getCalculatorEK5gGoQ(IBinder iBinder, String str) {
        this.serializer = iBinder;
        this.write = str;
    }

    public final void IconCompatParcelizer(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.serializer.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
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

    public final Parcel serializer() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.write);
        return parcelObtain;
    }
}
