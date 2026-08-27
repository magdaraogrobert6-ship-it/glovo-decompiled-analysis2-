package o;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetSetTopBoxInputcp extends zzb implements accessgetSearchcp {
    public static accessgetSearchcp write(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
        if (iInterfaceQueryLocalInterface instanceof accessgetSearchcp) {
            return (accessgetSearchcp) iInterfaceQueryLocalInterface;
        }
        return new accessgetTvAntennaCablecp(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }
}
