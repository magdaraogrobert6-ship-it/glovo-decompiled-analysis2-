package o;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkFetcher implements EngineInterceptorintercept2 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final Intent IconCompatParcelizer;

    public NetworkFetcher(Intent intent) {
        this.IconCompatParcelizer = intent;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = write + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToOverlayPermission(intent=" + this.IconCompatParcelizer + ")";
        int i2 = write + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof NetworkFetcher) {
                if (!this.IconCompatParcelizer.equals(((NetworkFetcher) obj).IconCompatParcelizer)) {
                    return false;
                }
            } else {
                int i5 = i2 + 103;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }
}
