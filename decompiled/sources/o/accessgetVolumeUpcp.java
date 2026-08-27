package o;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetVolumeUpcp extends zza {
    public final int serializer() {
        Parcel parcelZzB = zzB(6, zza());
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    public accessgetVolumeUpcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int read(ObjectWrapper objectWrapper, String str, boolean z) {
        Parcel parcelZza = zza();
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    public final accessgetTwocp read(ObjectWrapper objectWrapper, String str, int i) {
        Parcel parcelZza = zza();
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(4, parcelZza);
        accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return accessgettwocpAsInterface;
    }

    public final int serializer(ObjectWrapper objectWrapper, String str, boolean z) {
        Parcel parcelZza = zza();
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    public final accessgetTwocp serializer(ObjectWrapper objectWrapper, String str, int i) {
        Parcel parcelZza = zza();
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        Parcel parcelZzB = zzB(2, parcelZza);
        accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return accessgettwocpAsInterface;
    }

    public final accessgetTwocp serializer(ObjectWrapper objectWrapper, String str, boolean z, long j) {
        Parcel parcelZza = zza();
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        Parcel parcelZzB = zzB(7, parcelZza);
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
        Parcel parcelZzB = zzB(8, parcelZza);
        accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return accessgettwocpAsInterface;
    }
}
