package o;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetThumbsUpcp extends zza implements accessgetToggle2D3Dcp {
    @Override // o.accessgetToggle2D3Dcp
    public final int read() {
        Parcel parcelZzB = zzB(2, zza());
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    @Override // o.accessgetToggle2D3Dcp
    public final accessgetTwocp zzd() {
        Parcel parcelZzB = zzB(1, zza());
        accessgetTwocp accessgettwocpAsInterface = ObjectWrapper.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return accessgettwocpAsInterface;
    }

    public accessgetThumbsUpcp(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
