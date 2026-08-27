package o;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetMoveEndcp extends accessgetNumPad7cp {
    public static int RemoteActionCompatParcelizer = 1;

    public final int read() {
        int i;
        synchronized (this) {
            i = RemoteActionCompatParcelizer;
            if (i == 1) {
                Context context = this.write;
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    i = 4;
                    RemoteActionCompatParcelizer = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.write(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    RemoteActionCompatParcelizer = 2;
                } else {
                    i = 3;
                    RemoteActionCompatParcelizer = 3;
                }
            }
        }
        return i;
    }

    public accessgetMoveEndcp(Context context, Activity activity, accessgetNumLockcp accessgetnumlockcp, accessgetNumPad2cp accessgetnumpad2cp, accessgetNumPad8cp accessgetnumpad8cp) {
        super(context, activity, accessgetnumlockcp, accessgetnumpad2cp, accessgetnumpad8cp);
    }
}
