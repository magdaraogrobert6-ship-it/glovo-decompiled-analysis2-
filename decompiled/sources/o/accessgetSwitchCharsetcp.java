package o;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetSwitchCharsetcp extends zzb implements accessgetSymbolcp {
    public static accessgetSymbolcp IconCompatParcelizer(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (iInterfaceQueryLocalInterface instanceof accessgetSymbolcp) {
            return (accessgetSymbolcp) iInterfaceQueryLocalInterface;
        }
        return new accessgetSystemHomecp(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }
}
