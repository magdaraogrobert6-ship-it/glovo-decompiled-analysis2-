package o;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class and extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ and(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder, int i) {
        super(imageOnlyContentCardViewViewHolder);
        this.read = i;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        int i = 2 % 2;
        switch (this.read) {
            case 0:
                return;
            case 1:
                Timber.RemoteActionCompatParcelizer.serializer(th, "AQS: failed to proceed app quality score events", new Object[0]);
                return;
            case 2:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Auto accept data store failed", new Object[0]);
                return;
            case 3:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Delivery State data store failed", new Object[0]);
                int i2 = write + 93;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 4:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Rider home state data store failed", new Object[0]);
                return;
            case 5:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "CoroutineExceptionHandler got " + th + " in " + textAnnouncementContentCardView, new Object[0]);
                return;
            case 6:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Exception in events buffer", new Object[0]);
                int i3 = write + 107;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            default:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "FwF Gen II eval cache data store failed", new Object[0]);
                return;
        }
    }
}
