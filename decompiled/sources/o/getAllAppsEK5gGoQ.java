package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getAllAppsEK5gGoQ implements IInterface {
    public final IBinder IconCompatParcelizer;
    public final String serializer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.IconCompatParcelizer;
    }

    public getAllAppsEK5gGoQ(IBinder iBinder, String str) {
        this.IconCompatParcelizer = iBinder;
        this.serializer = str;
    }

    public final void read(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.IconCompatParcelizer.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
