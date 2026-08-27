package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final class BrushKtShaderBrush1 extends Binder implements BrushKt {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationClient read;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public BrushKtShaderBrush1(androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.read = multiInstanceInvalidationClient;
        attachInterface(this, BrushKt.IconCompatParcelizer);
    }

    @Override // o.BrushKt
    public final void IconCompatParcelizer(String[] strArr) {
        strArr.getClass();
        androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.read;
        BuildersKt.RemoteActionCompatParcelizer(multiInstanceInvalidationClient.RemoteActionCompatParcelizer, null, null, new coil3.RealImageLoader.AnonymousClass2(strArr, multiInstanceInvalidationClient, (ShortNewsContentCardView) null, 23), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = BrushKt.IconCompatParcelizer;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        IconCompatParcelizer(parcel.createStringArray());
        return true;
    }
}
