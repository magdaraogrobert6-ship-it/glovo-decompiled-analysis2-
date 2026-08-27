package o;

import io.sentry.SentryOptions;
import io.sentry.android.core.SpanFrameMetricsCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class getWebViewActivityIntent implements openUriWithActionView {
    public final SentryOptions MediaMetadataCompat;
    public final ArrayList MediaSessionCompatQueueItem;
    public final boolean read;
    public final ArrayList serializer;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaBrowserCompatMediaItem = new io.sentry.util.RemoteActionCompatParcelizer();
    public volatile java.util.Timer RatingCompat = null;
    public final ConcurrentHashMap IconCompatParcelizer = new ConcurrentHashMap();
    public final AtomicBoolean write = new AtomicBoolean(false);
    public long RemoteActionCompatParcelizer = 0;

    @Override // o.openUriWithActionView
    public final void IconCompatParcelizer() {
        this.MediaMetadataCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.IconCompatParcelizer.clear();
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((SpanFrameMetricsCollector) it.next()).write();
        }
        if (this.write.getAndSet(false)) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
            try {
                if (this.RatingCompat != null) {
                    this.RatingCompat.cancel();
                    this.RatingCompat = null;
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // o.openUriWithActionView
    public final List RemoteActionCompatParcelizer(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) throws Throwable {
        this.MediaMetadataCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "stop collecting performance info for transactions %s (%s)", getchildstepiteratorandroid_sdk_ui_release.PlaybackStateCompat(), getchildstepiteratorandroid_sdk_ui_release.RemoteActionCompatParcelizer().PlaybackStateCompat.toString());
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((SpanFrameMetricsCollector) it.next()).RemoteActionCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release);
        }
        return read(getchildstepiteratorandroid_sdk_ui_release.MediaSessionCompatToken().toString());
    }

    @Override // o.openUriWithActionView
    public final void serializer(IBannerWebViewClientListener iBannerWebViewClientListener) {
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((SpanFrameMetricsCollector) it.next()).write(iBannerWebViewClientListener);
        }
    }

    @Override // o.openUriWithActionView
    public final void write(IBannerWebViewClientListener iBannerWebViewClientListener) throws Throwable {
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((SpanFrameMetricsCollector) it.next()).RemoteActionCompatParcelizer(iBannerWebViewClientListener);
        }
    }

    @Override // o.openUriWithActionView
    public final void RemoteActionCompatParcelizer(String str) {
        if (this.read) {
            this.MediaMetadataCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.IconCompatParcelizer.containsKey(str)) {
            this.IconCompatParcelizer.put(str, new openUriWithWebViewActivity(this, null));
        }
        if (this.write.getAndSet(true)) {
            return;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
        try {
            if (this.RatingCompat == null) {
                this.RatingCompat = new java.util.Timer(true);
            }
            this.RatingCompat.schedule(new r8lambdalCqhmIfjhi5JQMGoF5TqaZHyfo(2, this), 0L);
            this.RatingCompat.scheduleAtFixedRate(new getIntentArrayWithConfiguredBackStack(this, new ArrayList()), 100L, 100L);
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public getWebViewActivityIntent(SentryOptions sentryOptions) {
        boolean z = false;
        setNativeShader.read(sentryOptions, "The options object is required.");
        this.MediaMetadataCompat = sentryOptions;
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.serializer = new ArrayList();
        for (getAllBrazeActionStepTypes getallbrazeactionsteptypes : sentryOptions.getPerformanceCollectors()) {
            if (getallbrazeactionsteptypes instanceof containsAnyPushPermissionBrazeActions) {
                this.MediaSessionCompatQueueItem.add((containsAnyPushPermissionBrazeActions) getallbrazeactionsteptypes);
            }
            if (getallbrazeactionsteptypes instanceof SpanFrameMetricsCollector) {
                this.serializer.add((SpanFrameMetricsCollector) getallbrazeactionsteptypes);
            }
        }
        if (this.MediaSessionCompatQueueItem.isEmpty() && this.serializer.isEmpty()) {
            z = true;
        }
        this.read = z;
    }

    @Override // o.openUriWithActionView
    public final List read(String str) {
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        openUriWithWebViewActivity openuriwithwebviewactivity = (openUriWithWebViewActivity) concurrentHashMap.remove(str);
        this.MediaMetadataCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            IconCompatParcelizer();
        }
        if (openuriwithwebviewactivity != null) {
            return openuriwithwebviewactivity.write;
        }
        return null;
    }

    @Override // o.openUriWithActionView
    public final void serializer(formatQueryBundleForLoglambda0 formatquerybundleforloglambda0) {
        if (this.read) {
            this.MediaMetadataCompat.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            ((SpanFrameMetricsCollector) it.next()).write(formatquerybundleforloglambda0);
        }
        String string = formatquerybundleforloglambda0.read.toString();
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(string, new openUriWithWebViewActivity(this, formatquerybundleforloglambda0));
        }
        RemoteActionCompatParcelizer(string);
    }
}
