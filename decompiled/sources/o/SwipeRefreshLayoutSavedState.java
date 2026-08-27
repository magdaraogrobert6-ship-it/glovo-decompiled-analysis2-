package o;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SwipeRefreshLayoutSavedState implements Runnable {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ CancellableContinuationImpl serializer;
    public final /* synthetic */ StretchedVideoResolutionQuirk write;

    public /* synthetic */ SwipeRefreshLayoutSavedState(CancellableContinuationImpl cancellableContinuationImpl, StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = cancellableContinuationImpl;
        this.write = stretchedVideoResolutionQuirk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk = this.write;
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        if (i2 == 0) {
            try {
                cancellableContinuationImpl.resumeWith(new onItemDismiss(stretchedVideoResolutionQuirk.get()));
            } catch (Exception e) {
                cancellableContinuationImpl.resumeWith(new onItemDismiss(new isItemDismissable(e)));
            }
            int i3 = RemoteActionCompatParcelizer + 85;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        try {
            cancellableContinuationImpl.resumeWith(new onItemDismiss(stretchedVideoResolutionQuirk.get()));
            int i5 = RemoteActionCompatParcelizer + 55;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } catch (Exception e2) {
            cancellableContinuationImpl.resumeWith(new onItemDismiss(new isItemDismissable(e2)));
        }
        int i7 = RemoteActionCompatParcelizer + 75;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
