package o;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class createNotificationChannels extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;

    /* JADX WARN: Illegal instructions before constructor call */
    public createNotificationChannels(int i) {
        this.read = i;
        getOnBackInvokedCallback getonbackinvokedcallback = getOnBackInvokedCallback.RemoteActionCompatParcelizer;
        if (i != 1) {
            super(getonbackinvokedcallback);
        } else {
            super(getonbackinvokedcallback);
        }
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read != 0) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "One click data store failed", new Object[0]);
            int i4 = serializer + 73;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Go and start data store failed", new Object[0]);
        int i6 = IconCompatParcelizer + 101;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}
