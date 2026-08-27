package io.sentry.android.core;

import android.view.Choreographer;
import com.deliveryhero.perseus.common.Coroutines$Companion$enqueue$1;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import java.io.IOException;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.rx2.DispatcherScheduler;
import kotlinx.coroutines.selects.SelectImplementation;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.createFromParcel;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setBackButtonDismissesInAppMessageViewlambda0;
import o.setCustomControlInAppMessageManagerListenerlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AppState$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ AppState$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        switch (i) {
            case 0:
                ((r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) obj2).RemoteActionCompatParcelizer((BrazeActionParserExternalSyntheticLambda0) obj);
                break;
            case 1:
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = (MediaBrowserCompatMediaItem) obj;
                try {
                    ((SentryFrameMetricsCollector) obj2).serializer = Choreographer.getInstance();
                } catch (Throwable th) {
                    mediaBrowserCompatMediaItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
                    return;
                }
                break;
            case 2:
                ((io.sentry.cache.MediaMetadataCompat) obj2).write((io.sentry.protocol.addObserverForBackInvoker) obj, "user.json");
                break;
            case 3:
                ((io.sentry.cache.MediaMetadataCompat) obj2).write((Map) obj, "tags.json");
                break;
            case 4:
                io.sentry.cache.MediaMetadataCompat mediaMetadataCompat = (io.sentry.cache.MediaMetadataCompat) obj2;
                try {
                    ((io.sentry.cache.tape.read) mediaMetadataCompat.serializer.IconCompatParcelizer()).IconCompatParcelizer((getIntentArrayWithConfiguredBackStacklambda1) obj);
                } catch (IOException e) {
                    mediaMetadataCompat.IconCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to add breadcrumb to file queue", e);
                    return;
                }
                break;
            case 5:
                ((io.sentry.cache.MediaMetadataCompat) obj2).write((io.sentry.protocol.IconCompatParcelizer) obj, "contexts.json");
                break;
            case 6:
                io.sentry.cache.MediaMetadataCompat mediaMetadataCompat2 = (io.sentry.cache.MediaMetadataCompat) obj2;
                String str = (String) obj;
                if (str != null) {
                    mediaMetadataCompat2.write((Object) str, "transaction.json");
                } else {
                    mediaMetadataCompat2.IconCompatParcelizer("transaction.json");
                }
                break;
            case 7:
                io.sentry.cache.MediaMetadataCompat mediaMetadataCompat3 = (io.sentry.cache.MediaMetadataCompat) obj2;
                try {
                    ((Runnable) obj).run();
                } catch (Throwable th2) {
                    mediaMetadataCompat3.IconCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Serialization task failed", th2);
                    return;
                }
                break;
            case 8:
                ((CancellableContinuationImpl) obj2).read((CoroutineDispatcher) obj);
                break;
            case 9:
                BuildersKt.RemoteActionCompatParcelizer(((DispatcherScheduler) obj2).MediaSessionCompatQueueItem, null, null, new Coroutines$Companion$enqueue$1(2, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj), 3);
                break;
            case 10:
                ((DispatcherScheduler.DispatcherWorker) obj2).write.b_((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
                break;
            default:
                ((SelectImplementation) ((setBackButtonDismissesInAppMessageViewlambda0) obj2)).IconCompatParcelizer((setCustomControlInAppMessageManagerListenerlambda0) obj, createFromParcel.INSTANCE);
                break;
        }
    }
}
