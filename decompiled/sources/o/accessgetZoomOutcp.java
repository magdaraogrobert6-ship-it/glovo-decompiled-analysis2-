package o;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.Status;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetZoomOutcp extends Binder implements IInterface {
    public final /* synthetic */ ParentDataModifierDefaultImpls write;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public accessgetZoomOutcp(KeyCompanion keyCompanion, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.write = parentDataModifierDefaultImpls;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = getAltLeftEK5gGoQ.RemoteActionCompatParcelizer;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(statusCreateFromParcel, (Object) null, this.write);
            return true;
        }
        throw new BadParcelableException(d$$ExternalSyntheticOutline0.m(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
    }
}
