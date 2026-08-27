package o;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetNumPadDotcp extends BasePendingResult {
    public abstract void RemoteActionCompatParcelizer(accessgetScp accessgetscp);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetNumPadDotcp(accessgetNumLockcp accessgetnumlockcp, accessgetNumPad6cp accessgetnumpad6cp) {
        super(accessgetnumpad6cp);
        accessgetSystemNavigationDowncp.serializer(accessgetnumpad6cp, "GoogleApiClient must not be null");
        accessgetSystemNavigationDowncp.serializer(accessgetnumlockcp, "Api must not be null");
    }

    public final void RemoteActionCompatParcelizer(Status status) {
        accessgetSystemNavigationDowncp.write("Failed result must not be success", !status.write());
        write(serializer(status));
    }
}
