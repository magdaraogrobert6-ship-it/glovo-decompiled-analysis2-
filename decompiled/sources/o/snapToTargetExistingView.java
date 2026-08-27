package o;

import dagger.Lazy;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class snapToTargetExistingView implements androidx.lifecycle.DefaultLifecycleObserver {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final Lazy RemoteActionCompatParcelizer;
    public final Lazy serializer;

    public snapToTargetExistingView(Lazy lazy, Lazy lazy2) {
        this.RemoteActionCompatParcelizer = lazy;
        this.serializer = lazy2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        accessisrendernodecompatiblecp.getClass();
        super.onPause(accessisrendernodecompatiblecp);
        ((getUnmergedRootSemanticsNode) ((SemanticsOwnerKt) this.RemoteActionCompatParcelizer.write())).RemoteActionCompatParcelizer();
        consumeFlingInStretch consumeflinginstretch = (consumeFlingInStretch) this.serializer.write();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = consumeflinginstretch.MediaBrowserCompatMediaItem;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i2 = IconCompatParcelizer + 31;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i4 = read + 59;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        consumeflinginstretch.MediaBrowserCompatMediaItem = null;
    }
}
