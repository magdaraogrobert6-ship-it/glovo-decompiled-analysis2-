package o;

import android.app.Application;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getAttachHasBeenRun implements onUncaughtException {
    public final firstDescendantOrNull IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getAttachHasBeenRun(firstDescendantOrNull firstdescendantornull, int i) {
        this.write = i;
        this.IconCompatParcelizer = firstdescendantornull;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.write;
        firstDescendantOrNull firstdescendantornull = this.IconCompatParcelizer;
        if (i == 0) {
            RulerTrackingMap rulerTrackingMap = (RulerTrackingMap) ((onUncaughtException) firstdescendantornull.MediaBrowserCompatMediaItem).write();
            if (rulerTrackingMap != null) {
                return rulerTrackingMap;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable component method");
            return null;
        }
        if (i == 1) {
            effectiveBoundsInRoot effectiveboundsinroot = (effectiveBoundsInRoot) ((onUncaughtException) firstdescendantornull.MediaSessionCompatToken).write();
            if (effectiveboundsinroot != null) {
                return effectiveboundsinroot;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable component method");
            return null;
        }
        if (i != 2) {
            Application application = (Application) ((onUncaughtException) firstdescendantornull.serializer).write();
            if (application != null) {
                return application;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable component method");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(11);
        linkedHashMap.put("IMAGE_ONLY_PORTRAIT", (setAttachHasBeenRun) firstdescendantornull.read);
        linkedHashMap.put("IMAGE_ONLY_LANDSCAPE", (setAttachHasBeenRun) firstdescendantornull.write);
        linkedHashMap.put("MODAL_LANDSCAPE", (setAttachHasBeenRun) firstdescendantornull.MediaDescriptionCompat);
        linkedHashMap.put("MODAL_PORTRAIT", (setAttachHasBeenRun) firstdescendantornull.MediaSessionCompatQueueItem);
        linkedHashMap.put("CARD_LANDSCAPE", (setAttachHasBeenRun) firstdescendantornull.RatingCompat);
        linkedHashMap.put("CARD_PORTRAIT", (setAttachHasBeenRun) firstdescendantornull.MediaMetadataCompat);
        linkedHashMap.put("BANNER_PORTRAIT", (setAttachHasBeenRun) firstdescendantornull.IconCompatParcelizer);
        linkedHashMap.put("BANNER_LANDSCAPE", (setAttachHasBeenRun) firstdescendantornull.RemoteActionCompatParcelizer);
        Map mapUnmodifiableMap = linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
        if (mapUnmodifiableMap != null) {
            return mapUnmodifiableMap;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable component method");
        return null;
    }
}
