package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.huawei.hmf.tasks.a.d$a;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.MediaSessionCompatQueueItem;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import io.sentry.util.MediaMetadataCompat;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.UriActionExternalSyntheticLambda4;
import o.createFromParcel;
import o.onTouchEnded;
import o.r8lambdaea88sc6bNzdkREmuTaOF4vcCHI;
import o.setViewBackgroundColorFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class AppStartMetrics extends ActivityLifecycleCallbacksAdapter {
    public static volatile AppStartMetrics IconCompatParcelizer;
    public static long read = SystemClock.uptimeMillis();
    public static final io.sentry.util.RemoteActionCompatParcelizer serializer = new io.sentry.util.RemoteActionCompatParcelizer();
    public read MediaDescriptionCompat = read.UNKNOWN;
    public final MediaMetadataCompat MediaBrowserCompatMediaItem = new MediaMetadataCompat(new AndroidUiDispatcherCompanioncurrentThread1(26));
    public volatile long MediaSessionCompatToken = -1;
    public boolean PlaybackStateCompat = false;
    public boolean MediaSessionCompatResultReceiverWrapper = true;
    public final AtomicInteger RemoteActionCompatParcelizer = new AtomicInteger();
    public final AtomicBoolean ParcelableVolumeInfo = new AtomicBoolean(false);
    public final RemoteActionCompatParcelizer MediaSessionCompatQueueItem = new RemoteActionCompatParcelizer();
    public final RemoteActionCompatParcelizer PlaybackStateCompatCustomAction = new RemoteActionCompatParcelizer();
    public final RemoteActionCompatParcelizer RatingCompat = new RemoteActionCompatParcelizer();
    public final HashMap MediaMetadataCompat = new HashMap();
    public final ArrayList write = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.android.core.performance.AppStartMetrics$2, reason: invalid class name */
    public final class AnonymousClass2 implements MessageQueue.IdleHandler {
        private static int IconCompatParcelizer = 1;
        private static int serializer;
        public final /* synthetic */ Object read;
        public final /* synthetic */ int write;

        public /* synthetic */ AnonymousClass2(int i, Object obj) {
            this.write = i;
            this.read = obj;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() throws CLParsingException, InterruptedException, IOException {
            int i = 2 % 2;
            int i2 = serializer + 41;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = this.write;
            if (i3 == 0) {
                ((AppStartMetrics) this.read).MediaSessionCompatToken = SystemClock.uptimeMillis();
                AppStartMetrics.RemoteActionCompatParcelizer((AppStartMetrics) this.read);
                return false;
            }
            if (i3 == 1) {
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.read;
                if (!(!(cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded))) {
                    cancellableContinuationImpl.resumeWith(createFromParcel.INSTANCE);
                }
                return false;
            }
            ((setViewBackgroundColorFilter) this.read).read.invoke();
            int i4 = serializer + 47;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this) {
            if (!this.ParcelableVolumeInfo.getAndSet(true)) {
                AppStartMetrics appStartMetrics = read();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = appStartMetrics.PlaybackStateCompatCustomAction;
                remoteActionCompatParcelizer.getClass();
                remoteActionCompatParcelizer.write = SystemClock.uptimeMillis();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = appStartMetrics.MediaSessionCompatQueueItem;
                remoteActionCompatParcelizer2.getClass();
                remoteActionCompatParcelizer2.write = SystemClock.uptimeMillis();
            }
        }
    }

    public static void RemoteActionCompatParcelizer(AppStartMetrics appStartMetrics) {
        if (appStartMetrics.RemoteActionCompatParcelizer.get() == 0) {
            appStartMetrics.MediaBrowserCompatMediaItem.IconCompatParcelizer(Boolean.FALSE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer;
        WeakReference weakReference = (WeakReference) r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write;
        if (weakReference == null || weakReference.get() == activity) {
            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write = null;
        }
        if (this.RemoteActionCompatParcelizer.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.MediaDescriptionCompat = read.WARM;
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(Boolean.TRUE);
        this.MediaSessionCompatResultReceiverWrapper = true;
        this.ParcelableVolumeInfo.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer;
        WeakReference weakReference = (WeakReference) r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write;
        if (weakReference == null || weakReference.get() == activity) {
            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer.read(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer.read(activity);
        if (this.ParcelableVolumeInfo.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final int i = 0;
            MediaSessionCompatQueueItem.read(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda0
                public final /* synthetic */ AppStartMetrics write;

                {
                    this.write = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    AppStartMetrics appStartMetrics = this.write;
                    if (i2 != 0) {
                        appStartMetrics.IconCompatParcelizer();
                    } else {
                        appStartMetrics.IconCompatParcelizer();
                    }
                }
            }, new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer));
        } else {
            final int i2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.AppStartMetrics$$ExternalSyntheticLambda0
                public final /* synthetic */ AppStartMetrics write;

                {
                    this.write = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    AppStartMetrics appStartMetrics = this.write;
                    if (i3 != 0) {
                        appStartMetrics.IconCompatParcelizer();
                    } else {
                        appStartMetrics.IconCompatParcelizer();
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer;
        WeakReference weakReference = (WeakReference) r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write;
        if (weakReference == null || weakReference.get() == activity) {
            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.write = null;
        }
    }

    public final RemoteActionCompatParcelizer serializer(SentryAndroidOptions sentryAndroidOptions) {
        if (this.MediaDescriptionCompat != read.UNKNOWN && ((Boolean) this.MediaBrowserCompatMediaItem.IconCompatParcelizer()).booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaSessionCompatQueueItem;
                if (remoteActionCompatParcelizer.serializer() && remoteActionCompatParcelizer.RemoteActionCompatParcelizer() <= 60000) {
                    return remoteActionCompatParcelizer;
                }
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.PlaybackStateCompatCustomAction;
            if (remoteActionCompatParcelizer2.serializer() && remoteActionCompatParcelizer2.RemoteActionCompatParcelizer() <= 60000) {
                return remoteActionCompatParcelizer2;
            }
        }
        return new RemoteActionCompatParcelizer();
    }

    public static AppStartMetrics read() {
        if (IconCompatParcelizer == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = serializer.serializer();
            try {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new AppStartMetrics();
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
        return IconCompatParcelizer;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer.read(activity);
        if (this.RemoteActionCompatParcelizer.incrementAndGet() == 1 && !this.ParcelableVolumeInfo.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            long j = this.MediaSessionCompatQueueItem.read;
            if (!((Boolean) this.MediaBrowserCompatMediaItem.IconCompatParcelizer()).booleanValue() || jUptimeMillis2 - j > 60000) {
                this.MediaDescriptionCompat = read.WARM;
                this.MediaSessionCompatResultReceiverWrapper = true;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaSessionCompatQueueItem;
                remoteActionCompatParcelizer.serializer = null;
                remoteActionCompatParcelizer.read = 0L;
                remoteActionCompatParcelizer.write = 0L;
                remoteActionCompatParcelizer.IconCompatParcelizer = 0L;
                remoteActionCompatParcelizer.read(jUptimeMillis);
                read = jUptimeMillis;
                this.MediaMetadataCompat.clear();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.RatingCompat;
                remoteActionCompatParcelizer2.serializer = null;
                remoteActionCompatParcelizer2.read = 0L;
                remoteActionCompatParcelizer2.write = 0L;
                remoteActionCompatParcelizer2.IconCompatParcelizer = 0L;
            } else if (this.MediaDescriptionCompat == read.UNKNOWN) {
                if (bundle != null) {
                    this.MediaDescriptionCompat = read.WARM;
                } else if (this.MediaSessionCompatToken == -1 || jUptimeMillis <= this.MediaSessionCompatToken) {
                    this.MediaDescriptionCompat = read.COLD;
                } else {
                    this.MediaDescriptionCompat = read.WARM;
                }
            }
        }
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(Boolean.TRUE);
    }

    public final void serializer(Application application) {
        if (this.PlaybackStateCompat) {
            return;
        }
        this.PlaybackStateCompat = true;
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        application.registerActivityLifecycleCallbacks(IconCompatParcelizer);
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        int i = 0;
        if (activityManager != null && Build.VERSION.SDK_INT >= 35) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo applicationStartInfoCk_ = ActivityLifecycleIntegration$$ExternalSyntheticLambda1.ck_(historicalProcessStartReasons.get(0));
                if (applicationStartInfoCk_.getStartupState() == 0) {
                    if (applicationStartInfoCk_.getStartType() == 1) {
                        this.MediaDescriptionCompat = read.COLD;
                    } else {
                        this.MediaDescriptionCompat = read.WARM;
                    }
                }
            }
        }
        read readVar = this.MediaDescriptionCompat;
        read readVar2 = read.UNKNOWN;
        if (readVar == readVar2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new AnonymousClass2(i, this));
        } else if (readVar == readVar2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new d$a(this, 17, handler));
        }
    }
}
