package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSystemNavigationRightcp extends accessgetStem1cp {
    public final /* synthetic */ BaseGmsClient MediaSessionCompatQueueItem;
    public final IBinder RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetSystemNavigationRightcp(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.MediaSessionCompatQueueItem = baseGmsClient;
        this.RatingCompat = iBinder;
    }

    @Override // o.accessgetStem1cp
    public final boolean read() {
        IBinder iBinder = this.RatingCompat;
        try {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.MediaSessionCompatQueueItem;
            if (!baseGmsClient.write().equals(interfaceDescriptor)) {
                String strWrite = baseGmsClient.write();
                SentryLogcatAdapter.IconCompatParcelizer("GmsClient", ff$$ExternalSyntheticOutline0.m(new StringBuilder(strWrite.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strWrite, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterface = baseGmsClient.read(iBinder);
            if (iInterface == null || !(baseGmsClient.IconCompatParcelizer(2, 4, iInterface) || baseGmsClient.IconCompatParcelizer(3, 4, iInterface))) {
                return false;
            }
            baseGmsClient.read = null;
            accessgetRocp accessgetrocp = baseGmsClient.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (accessgetrocp == null) {
                return true;
            }
            accessgetrocp.RemoteActionCompatParcelizer();
            return true;
        } catch (RemoteException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // o.accessgetStem1cp
    public final void serializer(ConnectionResult connectionResult) {
        accessgetRightBracketcp accessgetrightbracketcp = this.MediaSessionCompatQueueItem.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (accessgetrightbracketcp != null) {
            accessgetrightbracketcp.read(connectionResult);
        }
        System.currentTimeMillis();
    }
}
