package o;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetRcp extends zzb implements accessgetScrollLockcp {
    public static Account serializer(accessgetScrollLockcp accessgetscrolllockcp) {
        if (accessgetscrolllockcp == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            accessgetTvcp accessgettvcp = (accessgetTvcp) accessgetscrolllockcp;
            Parcel parcelZzB = accessgettvcp.zzB(2, accessgettvcp.zza());
            Account account = (Account) getButton11EK5gGoQ.read(parcelZzB, Account.CREATOR);
            parcelZzB.recycle();
            return account;
        } catch (RemoteException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public static accessgetScrollLockcp write(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (iInterfaceQueryLocalInterface instanceof accessgetScrollLockcp) {
            return (accessgetScrollLockcp) iInterfaceQueryLocalInterface;
        }
        return new accessgetTvcp(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
}
