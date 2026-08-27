package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.android.core.AppState$$ExternalSyntheticLambda0;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeFilterQuality50PEsBU;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryFrameMetricsCollector implements Application.ActivityLifecycleCallbacks {
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final ConcurrentHashMap MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public final Handler MediaSessionCompatQueueItem;
    public final serializer MediaSessionCompatToken;
    public final CopyOnWriteArraySet ParcelableVolumeInfo;
    public final io.sentry.android.core.MediaBrowserCompatMediaItem PlaybackStateCompatCustomAction;
    public long RatingCompat;
    public final Field RemoteActionCompatParcelizer;
    public final setNativeFilterQuality50PEsBU read;
    public Choreographer serializer;
    public WeakReference write;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public SentryFrameMetricsCollector(Context context, final io.sentry.android.core.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        serializer serializerVar = new serializer();
        this.ParcelableVolumeInfo = new CopyOnWriteArraySet();
        this.MediaDescriptionCompat = new ConcurrentHashMap();
        this.MediaBrowserCompatMediaItem = false;
        this.RatingCompat = 0L;
        this.MediaMetadataCompat = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.PlaybackStateCompatCustomAction = mediaBrowserCompatMediaItem;
        this.IconCompatParcelizer = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.MediaSessionCompatToken = serializerVar;
        if (context instanceof Application) {
            int i = 1;
            this.MediaBrowserCompatMediaItem = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector$$ExternalSyntheticLambda2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    mediaBrowserCompatMediaItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.MediaSessionCompatQueueItem = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new AppState$$ExternalSyntheticLambda0(this, i, mediaBrowserCompatMediaItem));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.RemoteActionCompatParcelizer = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                mediaBrowserCompatMediaItem.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.read = new setNativeFilterQuality50PEsBU(this, i, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
        }
    }

    public static void IconCompatParcelizer(SentryFrameMetricsCollector sentryFrameMetricsCollector, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, Window window, FrameMetrics frameMetrics) {
        float refreshRate;
        long jNanoTime = System.nanoTime();
        if (Build.VERSION.SDK_INT >= 30) {
            refreshRate = window.getContext().getDisplay().getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        long metric = frameMetrics.getMetric(0);
        long metric2 = frameMetrics.getMetric(1);
        long metric3 = frameMetrics.getMetric(2);
        long metric4 = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + metric3 + metric2 + metric;
        long jMax = Math.max(0L, metric4 - ((long) (1.0E9f / refreshRate)));
        sentryFrameMetricsCollector.IconCompatParcelizer.getClass();
        long metric5 = frameMetrics.getMetric(10);
        if (metric5 < 0) {
            metric5 = jNanoTime - metric4;
        }
        long jMax2 = Math.max(metric5, sentryFrameMetricsCollector.MediaMetadataCompat);
        if (jMax2 == sentryFrameMetricsCollector.RatingCompat) {
            return;
        }
        sentryFrameMetricsCollector.RatingCompat = jMax2;
        sentryFrameMetricsCollector.MediaMetadataCompat = jMax2 + metric4;
        boolean z = metric4 > ((long) (1.0E9f / (refreshRate - 1.0f)));
        boolean z2 = z && metric4 > 700000000;
        Iterator it = sentryFrameMetricsCollector.MediaDescriptionCompat.values().iterator();
        while (it.hasNext()) {
            ((PlaybackStateCompat) it.next()).read(jMax2, sentryFrameMetricsCollector.MediaMetadataCompat, metric4, jMax, z, z2, refreshRate);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.write;
        if (weakReference == null || weakReference.get() != window) {
            this.write = new WeakReference(window);
            write();
        }
    }

    public final void write() {
        WeakReference weakReference = this.write;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.MediaBrowserCompatMediaItem || this.MediaDescriptionCompat.isEmpty() || this.MediaSessionCompatQueueItem == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new SentryFrameMetricsCollector$$ExternalSyntheticLambda0(this, window, 0));
    }

    public final void read(String str) {
        if (this.MediaBrowserCompatMediaItem) {
            ConcurrentHashMap concurrentHashMap = this.MediaDescriptionCompat;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.write;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new SentryFrameMetricsCollector$$ExternalSyntheticLambda0(this, window, 1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new SentryFrameMetricsCollector$$ExternalSyntheticLambda0(this, activity.getWindow(), 1));
        WeakReference weakReference = this.write;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.write = null;
    }
}
