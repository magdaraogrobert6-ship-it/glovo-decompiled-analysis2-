package o;

import android.app.Application;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class setUncaughtExceptionHandler implements onUncaughtException {
    public final onUncaughtException IconCompatParcelizer;
    public final getAttachHasBeenRun MediaSessionCompatQueueItem;
    public final getAttachHasBeenRun RatingCompat;
    public final onUncaughtException RemoteActionCompatParcelizer;
    public final getAttachHasBeenRun read;
    public final getAttachHasBeenRun serializer;
    public final onUncaughtException write;

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        return new FirebaseInAppMessagingDisplay((FirebaseInAppMessaging) this.IconCompatParcelizer.write(), (Map) this.RatingCompat.write(), (getUseMinimumTouchTarget) this.RemoteActionCompatParcelizer.write(), new zzz(), new zzz(), (effectiveBoundsInRoot) this.MediaSessionCompatQueueItem.write(), (Application) this.read.write(), (RulerTrackingMap) this.serializer.write(), (getShouldClearDescendantSemantics) this.write.write());
    }

    public setUncaughtExceptionHandler(onUncaughtException onuncaughtexception, getAttachHasBeenRun getattachhasbeenrun, onUncaughtException onuncaughtexception2, getAttachHasBeenRun getattachhasbeenrun2, getAttachHasBeenRun getattachhasbeenrun3, getAttachHasBeenRun getattachhasbeenrun4, onUncaughtException onuncaughtexception3) {
        this.IconCompatParcelizer = onuncaughtexception;
        this.RatingCompat = getattachhasbeenrun;
        this.RemoteActionCompatParcelizer = onuncaughtexception2;
        this.MediaSessionCompatQueueItem = getattachhasbeenrun2;
        this.read = getattachhasbeenrun3;
        this.serializer = getattachhasbeenrun4;
        this.write = onuncaughtexception3;
    }
}
