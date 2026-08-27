package o;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class lerpFloatList implements BrushKt {
    public IBinder read;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.read;
    }

    @Override // o.BrushKt
    public final void IconCompatParcelizer(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(BrushKt.IconCompatParcelizer);
            parcelObtain.writeStringArray(strArr);
            this.read.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
