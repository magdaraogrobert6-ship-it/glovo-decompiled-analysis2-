package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSystemHomecp extends zza implements accessgetSymbolcp {
    public static int IconCompatParcelizer;
    public static int RemoteActionCompatParcelizer;

    public final boolean write() {
        Parcel parcelZzB = zzB(7, zza());
        int i = getButton11EK5gGoQ.RemoteActionCompatParcelizer;
        boolean z = parcelZzB.readInt() != 0;
        parcelZzB.recycle();
        return z;
    }

    public final zzr IconCompatParcelizer(zzp zzpVar) {
        Parcel parcelZza = zza();
        int i = getButton11EK5gGoQ.RemoteActionCompatParcelizer;
        parcelZza.writeInt(1);
        zzpVar.writeToParcel(parcelZza, 0);
        Parcel parcelZzB = zzB(8, parcelZza);
        zzr zzrVar = (zzr) getButton11EK5gGoQ.read(parcelZzB, zzr.CREATOR);
        parcelZzB.recycle();
        return zzrVar;
    }

    public final zzr serializer(zzp zzpVar) {
        Parcel parcelZza = zza();
        int i = getButton11EK5gGoQ.RemoteActionCompatParcelizer;
        parcelZza.writeInt(1);
        zzpVar.writeToParcel(parcelZza, 0);
        Parcel parcelZzB = zzB(6, parcelZza);
        zzr zzrVar = (zzr) getButton11EK5gGoQ.read(parcelZzB, zzr.CREATOR);
        parcelZzB.recycle();
        return zzrVar;
    }

    public final boolean serializer(zzt zztVar, ObjectWrapper objectWrapper) {
        Parcel parcelZza = zza();
        int i = getButton11EK5gGoQ.RemoteActionCompatParcelizer;
        parcelZza.writeInt(1);
        zztVar.writeToParcel(parcelZza, 0);
        getButton11EK5gGoQ.IconCompatParcelizer(parcelZza, objectWrapper);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean z = parcelZzB.readInt() != 0;
        parcelZzB.recycle();
        return z;
    }

    public static int read() {
        int i = IconCompatParcelizer;
        int i2 = i % 8475024;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        RemoteActionCompatParcelizer = startElapsedRealtime;
        return startElapsedRealtime;
    }

    public accessgetSystemHomecp(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
