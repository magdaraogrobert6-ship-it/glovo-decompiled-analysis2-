package o;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class accessclipRectmtrdDEjd implements toShaderBrush {
    public IBinder RemoteActionCompatParcelizer;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.toShaderBrush
    public final void read(String[] strArr, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(toShaderBrush.write);
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            this.RemoteActionCompatParcelizer.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // o.toShaderBrush
    public final int serializer(BrushKt brushKt, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(toShaderBrush.write);
            parcelObtain.writeStrongInterface(brushKt);
            parcelObtain.writeString(str);
            this.RemoteActionCompatParcelizer.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // o.toShaderBrush
    public final void write(BrushKt brushKt, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(toShaderBrush.write);
            parcelObtain.writeStrongInterface(brushKt);
            parcelObtain.writeInt(i);
            this.RemoteActionCompatParcelizer.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
