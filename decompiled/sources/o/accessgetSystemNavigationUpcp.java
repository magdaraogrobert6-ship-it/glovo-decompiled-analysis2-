package o;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSystemNavigationUpcp extends accessgetStem1cp {
    public final /* synthetic */ BaseGmsClient MediaBrowserCompatMediaItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetSystemNavigationUpcp(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.MediaBrowserCompatMediaItem = baseGmsClient;
    }

    @Override // o.accessgetStem1cp
    public final boolean read() {
        this.MediaBrowserCompatMediaItem.MediaMetadataCompat.IconCompatParcelizer(ConnectionResult.write);
        return true;
    }

    @Override // o.accessgetStem1cp
    public final void serializer(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.MediaBrowserCompatMediaItem;
        baseGmsClient.getClass();
        if ((baseGmsClient instanceof OnPlacedNode) && baseGmsClient.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
            baseGmsClient.ComponentActivity();
        } else {
            baseGmsClient.MediaMetadataCompat.IconCompatParcelizer(connectionResult);
            System.currentTimeMillis();
        }
    }
}
