package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HoverIconModifierNode implements IInterface {
    public final IBinder RemoteActionCompatParcelizer;
    public final String serializer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.RemoteActionCompatParcelizer;
    }

    public HoverIconModifierNode(IBinder iBinder, String str) {
        this.RemoteActionCompatParcelizer = iBinder;
        this.serializer = str;
    }

    public final void IconCompatParcelizer(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.RemoteActionCompatParcelizer.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel read() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.serializer);
        return parcelObtain;
    }

    public final Parcel serializer(int i, Parcel parcel) {
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
