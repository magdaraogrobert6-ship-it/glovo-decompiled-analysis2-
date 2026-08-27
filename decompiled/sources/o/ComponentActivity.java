package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentActivity extends Binder implements MediaSessionCompatToken {
    public static final /* synthetic */ int serializer = 0;
    public final /* synthetic */ android.support.v4.os.ResultReceiver read;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public ComponentActivity(android.support.v4.os.ResultReceiver resultReceiver) {
        this.read = resultReceiver;
        attachInterface(this, MediaSessionCompatToken.IconCompatParcelizer);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = MediaSessionCompatToken.IconCompatParcelizer;
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
        this.read.serializer(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }
}
