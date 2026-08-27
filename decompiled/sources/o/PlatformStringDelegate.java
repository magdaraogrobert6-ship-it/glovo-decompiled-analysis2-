package o;

import android.net.Uri;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformStringDelegate {
    private static int read = 1;
    private static int write;
    public final SharedFlowImpl RemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);

    public final void read(Uri uri) {
        int i = 2 % 2;
        int i2 = write + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            uri.getClass();
            this.RemoteActionCompatParcelizer.write(uri);
        } else {
            uri.getClass();
            this.RemoteActionCompatParcelizer.write(uri);
            int i3 = 57 / 0;
        }
    }
}
