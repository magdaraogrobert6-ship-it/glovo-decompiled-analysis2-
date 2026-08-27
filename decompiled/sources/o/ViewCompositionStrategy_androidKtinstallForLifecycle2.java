package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewCompositionStrategy_androidKtinstallForLifecycle2 {
    public final int MediaBrowserCompatMediaItem;
    public static final ViewCompositionStrategy_androidKtinstallForLifecycle2 RemoteActionCompatParcelizer = new ViewCompositionStrategy_androidKtinstallForLifecycle2(0);
    public static final ViewCompositionStrategy_androidKtinstallForLifecycle2 write = new ViewCompositionStrategy_androidKtinstallForLifecycle2(1);
    public static final ViewCompositionStrategy_androidKtinstallForLifecycle2 serializer = new ViewCompositionStrategy_androidKtinstallForLifecycle2(2);
    public static final ViewCompositionStrategy_androidKtinstallForLifecycle2 IconCompatParcelizer = new ViewCompositionStrategy_androidKtinstallForLifecycle2(3);
    public static final ViewCompositionStrategy_androidKtinstallForLifecycle2 read = new ViewCompositionStrategy_androidKtinstallForLifecycle2(4);

    public ViewCompositionStrategy_androidKtinstallForLifecycle2(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.MediaBrowserCompatMediaItem)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ViewCompositionStrategy_androidKtinstallForLifecycle2.class == obj.getClass() && this.MediaBrowserCompatMediaItem == ((ViewCompositionStrategy_androidKtinstallForLifecycle2) obj).MediaBrowserCompatMediaItem;
    }
}
