package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class setLargerCloseButtonClickArealambda0 {
    public final onCreateWindowlambda3 cleanupQueue;
    public final InAppMessageImageView connectionListener;
    public final long keepAliveDurationNs;
    public final int maxIdleConnections;
    public volatile Map addressStates = SimpleItemTouchHelperCallback.serializer;
    public final onCreateWindow cleanupTask = new onCreateWindow(2, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), setWebViewContent.read, " ConnectionPool connection closer"), this);
    public final ConcurrentLinkedQueue connections = new ConcurrentLinkedQueue();

    public final int read(InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, long j) {
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        ArrayList arrayList = inAppMessageImmersiveBaseView.calls;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + inAppMessageImmersiveBaseView.route.address.url + " was leaked. Did you forget to close a response body?";
                getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                getMaxSafeTopInset.MediaDescriptionCompat.RemoteActionCompatParcelizer(((r8lambda95pWSri5vrWW7AWxwibPFKul6nM) reference).serializer, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    inAppMessageImmersiveBaseView.idleAtNs = j - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public setLargerCloseButtonClickArealambda0(InAppMessageHtmlFullView inAppMessageHtmlFullView, int i, long j, TimeUnit timeUnit, InAppMessageImageView inAppMessageImageView, InAppMessageButton inAppMessageButton) {
        this.maxIdleConnections = i;
        this.connectionListener = inAppMessageImageView;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = inAppMessageHtmlFullView.read();
        if (j > 0) {
            return;
        }
        DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "keepAliveDuration <= 0: "));
        throw null;
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(setLargerCloseButtonClickArealambda0.class, Map.class, "addressStates");
    }
}
