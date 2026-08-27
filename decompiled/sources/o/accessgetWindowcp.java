package o;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetWindowcp extends zza {
    public final accessgetTwocp IconCompatParcelizer(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel parcelZza = zza();
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper2);
        Parcel parcelZzB = zzB(3, parcelZza);
        accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return accessgettwocpAsInterface;
    }

    public final accessgetTwocp write(ObjectWrapper objectWrapper, String str, int i, ObjectWrapper objectWrapper2) {
        Parcel parcelZza = zza();
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper2);
        Parcel parcelZzB = zzB(2, parcelZza);
        accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return accessgettwocpAsInterface;
    }

    public accessgetWindowcp(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
