package o;

import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: classes3.dex */
public final class runCachedlambda1 implements Runnable {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ StretchedVideoResolutionQuirk RemoteActionCompatParcelizer;
    public final /* synthetic */ SafeContinuation serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ runCachedlambda1(SafeContinuation safeContinuation, StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk, int i) {
        this.write = i;
        this.serializer = safeContinuation;
        this.RemoteActionCompatParcelizer = stretchedVideoResolutionQuirk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk = this.RemoteActionCompatParcelizer;
        SafeContinuation safeContinuation = this.serializer;
        if (i4 == 0) {
            try {
                safeContinuation.resumeWith(new onItemDismiss(stretchedVideoResolutionQuirk.get()));
                return;
            } catch (Exception e) {
                safeContinuation.resumeWith(new onItemDismiss(new isItemDismissable(e)));
                return;
            }
        }
        try {
            safeContinuation.resumeWith(new onItemDismiss(stretchedVideoResolutionQuirk.get()));
        } catch (Exception e2) {
            safeContinuation.resumeWith(new onItemDismiss(new isItemDismissable(e2)));
        }
        int i5 = read + 67;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
