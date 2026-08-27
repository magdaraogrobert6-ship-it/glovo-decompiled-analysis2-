package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import androidx.core.app.FrameMetricsAggregator;
import androidx.work.impl.WorkerWrapper;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.SpanId$$ExternalSyntheticLambda1;
import io.sentry.android.core.performance.AppStartMetrics;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.DelayKt;
import o.ContainerStepgetChildStepIteratorinlinediterator2;
import o.LogCustomEventStep;
import o.SetPushNotificationSubscriptionStep;
import o.UriActionExternalSyntheticLambda4;
import o._get_messageWebView_lambda0;
import o.accessgetDismissSubscriberp;
import o.beforeMessageClosedlambda0;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.defaultCardHandling;
import o.defaultCardHandlinglambda0;
import o.getActionTypelambda0;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.handleCardClicklambda4;
import o.internalHeightCallbacklambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;
import o.requestPushPermissionlambda0;
import o.secondArg_delegatelambda0;
import o.setNativeShader;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityLifecycleIntegration implements LogCustomEventStep, Closeable, Application.ActivityLifecycleCallbacks {
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public SentryAndroidOptions MediaSessionCompatResultReceiverWrapper;
    public accessgetDismissSubscriberp PlaybackStateCompat;
    public final WorkerWrapper.Builder RemoteActionCompatParcelizer;
    public r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 read;
    public final Application write;
    public boolean ParcelableVolumeInfo = false;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
    public boolean MediaSessionCompatQueueItem = false;
    public getActionTypelambda0 MediaBrowserCompatMediaItem = null;
    public final WeakHashMap ResultReceiver = new WeakHashMap();
    public final WeakHashMap r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new WeakHashMap();
    public final WeakHashMap IconCompatParcelizer = new WeakHashMap();
    public createBannerWebViewClientListenerandroid_sdk_ui_release PlaybackStateCompatCustomAction = new requestPushPermissionlambda0(new Date(0), 0);
    public Future r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
    public final WeakHashMap serializer = new WeakHashMap();
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatToken = new io.sentry.util.RemoteActionCompatParcelizer();
    public final io.sentry.util.RemoteActionCompatParcelizer RatingCompat = new io.sentry.util.RemoteActionCompatParcelizer();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        createBannerWebViewClientListenerandroid_sdk_ui_release requestpushpermissionlambda0;
        this.MediaSessionCompatQueueItem = true;
        accessgetDismissSubscriberp accessgetdismisssubscriberp = this.PlaybackStateCompat;
        if (accessgetdismisssubscriberp != null) {
            requestpushpermissionlambda0 = accessgetdismisssubscriberp.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        } else {
            MediaSessionCompatQueueItem.serializer.getClass();
            requestpushpermissionlambda0 = new requestPushPermissionlambda0();
        }
        this.PlaybackStateCompatCustomAction = requestpushpermissionlambda0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static void IconCompatParcelizer(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0, r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1) {
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 == null || r8lambdareqvhj3p9oule_afn8an0r0tlg0.MediaDescriptionCompat()) {
            return;
        }
        String strIconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0.IconCompatParcelizer();
        if (strIconCompatParcelizer == null || !strIconCompatParcelizer.endsWith(" - Deadline Exceeded")) {
            strIconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0.IconCompatParcelizer() + " - Deadline Exceeded";
        }
        r8lambdareqvhj3p9oule_afn8an0r0tlg0.write(strIconCompatParcelizer);
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer = r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg1.serializer() : null;
        if (createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer == null) {
            createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer = r8lambdareqvhj3p9oule_afn8an0r0tlg0.write();
        }
        write(r8lambdareqvhj3p9oule_afn8an0r0tlg0, createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer, defaultCardHandlinglambda0.DEADLINE_EXCEEDED);
    }

    public static void write(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0, createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release, defaultCardHandlinglambda0 defaultcardhandlinglambda0) {
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 == null || r8lambdareqvhj3p9oule_afn8an0r0tlg0.MediaDescriptionCompat()) {
            return;
        }
        if (defaultcardhandlinglambda0 == null) {
            defaultcardhandlinglambda0 = r8lambdareqvhj3p9oule_afn8an0r0tlg0.MediaSessionCompatQueueItem() != null ? r8lambdareqvhj3p9oule_afn8an0r0tlg0.MediaSessionCompatQueueItem() : defaultCardHandlinglambda0.OK;
        }
        r8lambdareqvhj3p9oule_afn8an0r0tlg0.write(defaultcardhandlinglambda0, createbannerwebviewclientlistenerandroid_sdk_ui_release);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.MediaSessionCompatResultReceiverWrapper;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        WorkerWrapper.Builder builder = this.RemoteActionCompatParcelizer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = ((io.sentry.util.RemoteActionCompatParcelizer) builder.IconCompatParcelizer).serializer();
        try {
            if (builder.read()) {
                builder.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(16, builder), "FrameMetricsAggregator.stop");
                r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = ((FrameMetricsAggregator) ((io.sentry.util.MediaMetadataCompat) builder.write).IconCompatParcelizer()).serializer;
                Object obj = r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat;
                r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat = new SparseIntArray[9];
            }
            ((ConcurrentHashMap) builder.read).clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        WeakHashMap weakHashMap2 = this.ResultReceiver;
        WeakHashMap weakHashMap3 = this.IconCompatParcelizer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatToken.serializer();
        try {
            io.sentry.android.core.performance.IconCompatParcelizer iconCompatParcelizer = (io.sentry.android.core.performance.IconCompatParcelizer) weakHashMap3.remove(activity);
            if (iconCompatParcelizer != null) {
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = iconCompatParcelizer.serializer;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null && !r8lambdareqvhj3p9oule_afn8an0r0tlg0.MediaDescriptionCompat()) {
                    iconCompatParcelizer.serializer.write(defaultCardHandlinglambda0.CANCELLED);
                }
                iconCompatParcelizer.serializer = null;
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = iconCompatParcelizer.IconCompatParcelizer;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null && !r8lambdareqvhj3p9oule_afn8an0r0tlg1.MediaDescriptionCompat()) {
                    iconCompatParcelizer.IconCompatParcelizer.write(defaultCardHandlinglambda0.CANCELLED);
                }
                iconCompatParcelizer.IconCompatParcelizer = null;
            }
            boolean z = this.ParcelableVolumeInfo;
            WeakHashMap weakHashMap4 = this.serializer;
            if (z) {
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg2 = this.read;
                defaultCardHandlinglambda0 defaultcardhandlinglambda0 = defaultCardHandlinglambda0.CANCELLED;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg2 != null && !r8lambdareqvhj3p9oule_afn8an0r0tlg2.MediaDescriptionCompat()) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg2.write(defaultcardhandlinglambda0);
                }
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg3 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) weakHashMap2.get(activity);
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg4 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) weakHashMap.get(activity);
                defaultCardHandlinglambda0 defaultcardhandlinglambda1 = defaultCardHandlinglambda0.DEADLINE_EXCEEDED;
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg3 != null && !r8lambdareqvhj3p9oule_afn8an0r0tlg3.MediaDescriptionCompat()) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg3.write(defaultcardhandlinglambda1);
                }
                IconCompatParcelizer(r8lambdareqvhj3p9oule_afn8an0r0tlg4, r8lambdareqvhj3p9oule_afn8an0r0tlg3);
                Future future = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (future != null) {
                    future.cancel(false);
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
                }
                if (this.ParcelableVolumeInfo) {
                    serializer((getChildStepIteratorandroid_sdk_ui_release) weakHashMap4.get(activity), null, null);
                }
                this.read = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.MediaSessionCompatQueueItem = false;
                this.PlaybackStateCompatCustomAction = new requestPushPermissionlambda0(new Date(0L), 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatToken.serializer();
        try {
            if (!this.MediaMetadataCompat) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.IconCompatParcelizer iconCompatParcelizer = (io.sentry.android.core.performance.IconCompatParcelizer) this.IconCompatParcelizer.get(activity);
        if (iconCompatParcelizer != null) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = this.read;
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 == null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.serializer.get(activity);
            }
            if (iconCompatParcelizer.read == null || r8lambdareqvhj3p9oule_afn8an0r0tlg0 == null) {
                return;
            }
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0Write = io.sentry.android.core.performance.IconCompatParcelizer.write(r8lambdareqvhj3p9oule_afn8an0r0tlg0, iconCompatParcelizer.RemoteActionCompatParcelizer.concat(".onCreate"), iconCompatParcelizer.read);
            iconCompatParcelizer.serializer = r8lambdareqvhj3p9oule_afn8an0r0tlg0Write;
            r8lambdareqvhj3p9oule_afn8an0r0tlg0Write.read();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        createBannerWebViewClientListenerandroid_sdk_ui_release requestpushpermissionlambda0;
        io.sentry.android.core.performance.IconCompatParcelizer iconCompatParcelizer = new io.sentry.android.core.performance.IconCompatParcelizer(activity.getClass().getName());
        this.IconCompatParcelizer.put(activity, iconCompatParcelizer);
        if (this.MediaSessionCompatQueueItem) {
            return;
        }
        accessgetDismissSubscriberp accessgetdismisssubscriberp = this.PlaybackStateCompat;
        if (accessgetdismisssubscriberp != null) {
            requestpushpermissionlambda0 = accessgetdismisssubscriberp.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
        } else {
            MediaSessionCompatQueueItem.serializer.getClass();
            requestpushpermissionlambda0 = new requestPushPermissionlambda0();
        }
        this.PlaybackStateCompatCustomAction = requestpushpermissionlambda0;
        iconCompatParcelizer.read = requestpushpermissionlambda0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        createBannerWebViewClientListenerandroid_sdk_ui_release requestpushpermissionlambda0;
        io.sentry.android.core.performance.IconCompatParcelizer iconCompatParcelizer = (io.sentry.android.core.performance.IconCompatParcelizer) this.IconCompatParcelizer.get(activity);
        if (iconCompatParcelizer != null) {
            SentryAndroidOptions sentryAndroidOptions = this.MediaSessionCompatResultReceiverWrapper;
            if (sentryAndroidOptions != null) {
                requestpushpermissionlambda0 = sentryAndroidOptions.getDateProvider().RemoteActionCompatParcelizer();
            } else {
                MediaSessionCompatQueueItem.serializer.getClass();
                requestpushpermissionlambda0 = new requestPushPermissionlambda0();
            }
            iconCompatParcelizer.write = requestpushpermissionlambda0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatToken.serializer();
        try {
            if (!this.MediaMetadataCompat) {
                onActivityPostStarted(activity);
            }
            if (this.ParcelableVolumeInfo) {
                final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.ResultReceiver.get(activity);
                final r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.get(activity);
                if (activity.getWindow() != null) {
                    final int i = 0;
                    io.sentry.android.core.internal.util.MediaSessionCompatQueueItem.read(activity, new Runnable(this) { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda2
                        public final /* synthetic */ ActivityLifecycleIntegration RemoteActionCompatParcelizer;

                        {
                            this.RemoteActionCompatParcelizer = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg2 = r8lambdareqvhj3p9oule_afn8an0r0tlg0;
                            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg3 = r8lambdareqvhj3p9oule_afn8an0r0tlg1;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.RemoteActionCompatParcelizer;
                            if (i2 != 0) {
                                activityLifecycleIntegration.write(r8lambdareqvhj3p9oule_afn8an0r0tlg3, r8lambdareqvhj3p9oule_afn8an0r0tlg2);
                            } else {
                                activityLifecycleIntegration.write(r8lambdareqvhj3p9oule_afn8an0r0tlg3, r8lambdareqvhj3p9oule_afn8an0r0tlg2);
                            }
                        }
                    }, this.MediaDescriptionCompat);
                } else {
                    final int i2 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda2
                        public final /* synthetic */ ActivityLifecycleIntegration RemoteActionCompatParcelizer;

                        {
                            this.RemoteActionCompatParcelizer = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg2 = r8lambdareqvhj3p9oule_afn8an0r0tlg0;
                            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg3 = r8lambdareqvhj3p9oule_afn8an0r0tlg1;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.RemoteActionCompatParcelizer;
                            if (i3 != 0) {
                                activityLifecycleIntegration.write(r8lambdareqvhj3p9oule_afn8an0r0tlg3, r8lambdareqvhj3p9oule_afn8an0r0tlg2);
                            } else {
                                activityLifecycleIntegration.write(r8lambdareqvhj3p9oule_afn8an0r0tlg3, r8lambdareqvhj3p9oule_afn8an0r0tlg2);
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatToken.serializer();
        try {
            if (!this.MediaMetadataCompat) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.ParcelableVolumeInfo) {
                this.RemoteActionCompatParcelizer.read(activity);
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

    public final void serializer(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release, r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0, r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1) {
        if (getchildstepiteratorandroid_sdk_ui_release == null || getchildstepiteratorandroid_sdk_ui_release.MediaDescriptionCompat()) {
            return;
        }
        defaultCardHandlinglambda0 defaultcardhandlinglambda0 = defaultCardHandlinglambda0.DEADLINE_EXCEEDED;
        if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null && !r8lambdareqvhj3p9oule_afn8an0r0tlg0.MediaDescriptionCompat()) {
            r8lambdareqvhj3p9oule_afn8an0r0tlg0.write(defaultcardhandlinglambda0);
        }
        IconCompatParcelizer(r8lambdareqvhj3p9oule_afn8an0r0tlg1, r8lambdareqvhj3p9oule_afn8an0r0tlg0);
        Future future = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (future != null) {
            future.cancel(false);
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        }
        defaultCardHandlinglambda0 defaultcardhandlinglambda0MediaSessionCompatQueueItem = getchildstepiteratorandroid_sdk_ui_release.MediaSessionCompatQueueItem();
        if (defaultcardhandlinglambda0MediaSessionCompatQueueItem == null) {
            defaultcardhandlinglambda0MediaSessionCompatQueueItem = defaultCardHandlinglambda0.OK;
        }
        getchildstepiteratorandroid_sdk_ui_release.write(defaultcardhandlinglambda0MediaSessionCompatQueueItem);
        if (this.PlaybackStateCompat != null) {
            internalHeightCallbacklambda0.read(new SentryTracer$$ExternalSyntheticLambda1(this, 6, getchildstepiteratorandroid_sdk_ui_release));
        }
    }

    public ActivityLifecycleIntegration(Application application, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, WorkerWrapper.Builder builder) {
        this.write = application;
        this.MediaDescriptionCompat = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.RemoteActionCompatParcelizer = builder;
        if (Build.VERSION.SDK_INT >= 29) {
            this.MediaMetadataCompat = true;
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.MediaSessionCompatResultReceiverWrapper = sentryAndroidOptions;
        this.PlaybackStateCompat = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.ParcelableVolumeInfo = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.MediaBrowserCompatMediaItem = this.MediaSessionCompatResultReceiverWrapper.getFullyDisplayedReporter();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.MediaSessionCompatResultReceiverWrapper.isEnableTimeToFullDisplayTracing();
        this.write.registerActivityLifecycleCallbacks(this);
        this.MediaSessionCompatResultReceiverWrapper.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        DelayKt.MediaSessionCompatToken("ActivityLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        getActionTypelambda0 getactiontypelambda0;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.MediaMetadataCompat) {
            onActivityPreCreated(activity, bundle);
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatToken.serializer();
        try {
            if (this.PlaybackStateCompat != null && (sentryAndroidOptions = this.MediaSessionCompatResultReceiverWrapper) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                String strSerializer = Okio.serializer((KeyEvent.Callback) activity);
                accessgetDismissSubscriberp accessgetdismisssubscriberp = this.PlaybackStateCompat;
                SpanId$$ExternalSyntheticLambda1 spanId$$ExternalSyntheticLambda1 = new SpanId$$ExternalSyntheticLambda1(strSerializer, 8);
                accessgetdismisssubscriberp.getClass();
                internalHeightCallbacklambda0.read(spanId$$ExternalSyntheticLambda1);
            }
            RemoteActionCompatParcelizer(activity);
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.ResultReceiver.get(activity);
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.get(activity);
            this.MediaSessionCompatQueueItem = true;
            if (this.ParcelableVolumeInfo && r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null && r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null && (getactiontypelambda0 = this.MediaBrowserCompatMediaItem) != null) {
                getactiontypelambda0.serializer.add(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(0));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.IconCompatParcelizer iconCompatParcelizer = (io.sentry.android.core.performance.IconCompatParcelizer) this.IconCompatParcelizer.get(activity);
        if (iconCompatParcelizer != null) {
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = this.read;
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg0 == null) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) this.serializer.get(activity);
            }
            if (iconCompatParcelizer.write != null && r8lambdareqvhj3p9oule_afn8an0r0tlg0 != null) {
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0Write = io.sentry.android.core.performance.IconCompatParcelizer.write(r8lambdareqvhj3p9oule_afn8an0r0tlg0, iconCompatParcelizer.RemoteActionCompatParcelizer.concat(".onStart"), iconCompatParcelizer.write);
                iconCompatParcelizer.IconCompatParcelizer = r8lambdareqvhj3p9oule_afn8an0r0tlg0Write;
                r8lambdareqvhj3p9oule_afn8an0r0tlg0Write.read();
            }
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = iconCompatParcelizer.serializer;
            if (r8lambdareqvhj3p9oule_afn8an0r0tlg1 == null || iconCompatParcelizer.IconCompatParcelizer == null) {
                return;
            }
            createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer = r8lambdareqvhj3p9oule_afn8an0r0tlg1.serializer();
            createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer2 = iconCompatParcelizer.IconCompatParcelizer.serializer();
            if (createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer == null || createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MediaSessionCompatQueueItem.serializer.getClass();
            requestPushPermissionlambda0 requestpushpermissionlambda0 = new requestPushPermissionlambda0();
            long j = requestpushpermissionlambda0.read(iconCompatParcelizer.serializer.write()) / 1000000;
            long j2 = requestpushpermissionlambda0.read(createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer) / 1000000;
            long j3 = requestpushpermissionlambda0.read(iconCompatParcelizer.IconCompatParcelizer.write()) / 1000000;
            long j4 = requestpushpermissionlambda0.read(createbannerwebviewclientlistenerandroid_sdk_ui_releaseSerializer2) / 1000000;
            io.sentry.android.core.performance.serializer serializerVar = new io.sentry.android.core.performance.serializer();
            String strIconCompatParcelizer = iconCompatParcelizer.serializer.IconCompatParcelizer();
            long j5 = iconCompatParcelizer.serializer.write().read() / 1000000;
            io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer = serializerVar.read;
            remoteActionCompatParcelizer.serializer = strIconCompatParcelizer;
            remoteActionCompatParcelizer.IconCompatParcelizer = j5;
            remoteActionCompatParcelizer.read = jUptimeMillis - j;
            remoteActionCompatParcelizer.write = jUptimeMillis - j2;
            String strIconCompatParcelizer2 = iconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer();
            long j6 = iconCompatParcelizer.IconCompatParcelizer.write().read() / 1000000;
            io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = serializerVar.RemoteActionCompatParcelizer;
            remoteActionCompatParcelizer2.serializer = strIconCompatParcelizer2;
            remoteActionCompatParcelizer2.IconCompatParcelizer = j6;
            remoteActionCompatParcelizer2.read = jUptimeMillis - j3;
            remoteActionCompatParcelizer2.write = jUptimeMillis - j4;
            AppStartMetrics.read().write.add(serializerVar);
        }
    }

    public final void serializer() {
        beforeMessageClosedlambda0 beforemessageclosedlambda0;
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizerSerializer = AppStartMetrics.read().serializer(this.MediaSessionCompatResultReceiverWrapper);
        if (remoteActionCompatParcelizerSerializer.write != 0) {
            beforemessageclosedlambda0 = new beforeMessageClosedlambda0((remoteActionCompatParcelizerSerializer.serializer() ? remoteActionCompatParcelizerSerializer.IconCompatParcelizer + remoteActionCompatParcelizerSerializer.RemoteActionCompatParcelizer() : 0L) * 1000000);
        } else {
            beforemessageclosedlambda0 = null;
        }
        if (!this.ParcelableVolumeInfo || beforemessageclosedlambda0 == null) {
            return;
        }
        write(this.read, beforemessageclosedlambda0, null);
    }

    public final void write(r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0, r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1) {
        AppStartMetrics appStartMetrics = AppStartMetrics.read();
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer = appStartMetrics.MediaSessionCompatQueueItem;
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = appStartMetrics.PlaybackStateCompatCustomAction;
        if (remoteActionCompatParcelizer.serializer() && remoteActionCompatParcelizer.write == 0) {
            remoteActionCompatParcelizer.write = SystemClock.uptimeMillis();
        }
        if (remoteActionCompatParcelizer2.serializer() && remoteActionCompatParcelizer2.write == 0) {
            remoteActionCompatParcelizer2.write = SystemClock.uptimeMillis();
        }
        serializer();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RatingCompat.serializer();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.MediaSessionCompatResultReceiverWrapper;
            if (sentryAndroidOptions != null && r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null) {
                createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer = sentryAndroidOptions.getDateProvider().RemoteActionCompatParcelizer();
                long j = createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer.read(r8lambdareqvhj3p9oule_afn8an0r0tlg1.write()) / 1000000;
                r8lambdareqvhj3p9oule_afn8an0r0tlg1.write("time_to_initial_display", Long.valueOf(j), SetPushNotificationSubscriptionStep.MILLISECOND);
                write(r8lambdareqvhj3p9oule_afn8an0r0tlg1, createbannerwebviewclientlistenerandroid_sdk_ui_releaseRemoteActionCompatParcelizer, null);
            } else if (r8lambdareqvhj3p9oule_afn8an0r0tlg1 != null && !r8lambdareqvhj3p9oule_afn8an0r0tlg1.MediaDescriptionCompat()) {
                r8lambdareqvhj3p9oule_afn8an0r0tlg1.read();
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

    public final void RemoteActionCompatParcelizer(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        beforeMessageClosedlambda0 beforemessageclosedlambda0;
        createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release;
        String str;
        String str2;
        WeakReference weakReference = new WeakReference(activity);
        if (this.PlaybackStateCompat != null) {
            WeakHashMap weakHashMap3 = this.serializer;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.ParcelableVolumeInfo) {
                weakHashMap3.put(activity, secondArg_delegatelambda0.IconCompatParcelizer);
                if (this.MediaSessionCompatResultReceiverWrapper.isEnableAutoTraceIdGeneration()) {
                    this.PlaybackStateCompat.RemoteActionCompatParcelizer(new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(24));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                weakHashMap2 = this.ResultReceiver;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                serializer((getChildStepIteratorandroid_sdk_ui_release) entry.getValue(), (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) weakHashMap2.get(entry.getKey()), (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizerSerializer = AppStartMetrics.read().serializer(this.MediaSessionCompatResultReceiverWrapper);
            if (_init_lambda3.IconCompatParcelizer() && remoteActionCompatParcelizerSerializer.serializer()) {
                beforeMessageClosedlambda0 beforemessageclosedlambda1 = remoteActionCompatParcelizerSerializer.serializer() ? new beforeMessageClosedlambda0(remoteActionCompatParcelizerSerializer.IconCompatParcelizer * 1000000) : null;
                boolValueOf = Boolean.valueOf(AppStartMetrics.read().MediaDescriptionCompat == io.sentry.android.core.performance.read.COLD);
                beforemessageclosedlambda0 = beforemessageclosedlambda1;
            } else {
                boolValueOf = null;
                beforemessageclosedlambda0 = null;
            }
            handleCardClicklambda4 handlecardclicklambda4 = new handleCardClicklambda4();
            long deadlineTimeout = this.MediaSessionCompatResultReceiverWrapper.getDeadlineTimeout();
            handlecardclicklambda4.RatingCompat = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.MediaSessionCompatResultReceiverWrapper.isEnableActivityLifecycleTracingAutoFinish()) {
                handlecardclicklambda4.MediaDescriptionCompat = this.MediaSessionCompatResultReceiverWrapper.getIdleTimeout();
                handlecardclicklambda4.RemoteActionCompatParcelizer = true;
            }
            handlecardclicklambda4.MediaSessionCompatQueueItem = true;
            handlecardclicklambda4.MediaBrowserCompatMediaItem = new ActivityLifecycleIntegration$$ExternalSyntheticLambda6(this, weakReference, simpleName);
            if (!this.MediaSessionCompatQueueItem && beforemessageclosedlambda0 != null && boolValueOf != null) {
                AppStartMetrics.read().getClass();
                AppStartMetrics.read().getClass();
                createbannerwebviewclientlistenerandroid_sdk_ui_release = beforemessageclosedlambda0;
            } else {
                createbannerwebviewclientlistenerandroid_sdk_ui_release = this.PlaybackStateCompatCustomAction;
            }
            handlecardclicklambda4.write = createbannerwebviewclientlistenerandroid_sdk_ui_release;
            handlecardclicklambda4.MediaMetadataCompat = false;
            handlecardclicklambda4.read = "auto.ui.activity";
            getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_releaseSerializer = this.PlaybackStateCompat.serializer(new defaultCardHandling(simpleName, io.sentry.protocol.ensureViewModelStore.COMPONENT, "ui.load", (_get_messageWebView_lambda0) null), handlecardclicklambda4);
            r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(0);
            r8lambdalmkbrrgswwtv97obrsj7trj7ai.read = "auto.ui.activity";
            if (!this.MediaSessionCompatQueueItem && beforemessageclosedlambda0 != null && boolValueOf != null) {
                if (boolValueOf.booleanValue()) {
                    str = "app.start.cold";
                } else {
                    str = "app.start.warm";
                }
                String str3 = str;
                if (boolValueOf.booleanValue()) {
                    str2 = "Cold Start";
                } else {
                    str2 = "Warm Start";
                }
                this.read = getchildstepiteratorandroid_sdk_ui_releaseSerializer.read(str3, str2, beforemessageclosedlambda0, ContainerStepgetChildStepIteratorinlinediterator2.SENTRY, r8lambdalmkbrrgswwtv97obrsj7trj7ai);
                serializer();
            }
            String strConcat = simpleName.concat(" initial display");
            ContainerStepgetChildStepIteratorinlinediterator2 containerStepgetChildStepIteratorinlinediterator2 = ContainerStepgetChildStepIteratorinlinediterator2.SENTRY;
            r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = getchildstepiteratorandroid_sdk_ui_releaseSerializer.read("ui.load.initial_display", strConcat, createbannerwebviewclientlistenerandroid_sdk_ui_release, containerStepgetChildStepIteratorinlinediterator2, r8lambdalmkbrrgswwtv97obrsj7trj7ai);
            weakHashMap2.put(activity, r8lambdareqvhj3p9oule_afn8an0r0tlg0);
            if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && this.MediaBrowserCompatMediaItem != null && this.MediaSessionCompatResultReceiverWrapper != null) {
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = getchildstepiteratorandroid_sdk_ui_releaseSerializer.read("ui.load.full_display", simpleName.concat(" full display"), createbannerwebviewclientlistenerandroid_sdk_ui_release, containerStepgetChildStepIteratorinlinediterator2, r8lambdalmkbrrgswwtv97obrsj7trj7ai);
                try {
                    weakHashMap.put(activity, r8lambdareqvhj3p9oule_afn8an0r0tlg1);
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = this.MediaSessionCompatResultReceiverWrapper.getExecutorService().IconCompatParcelizer(new ND$$ExternalSyntheticLambda0(this, r8lambdareqvhj3p9oule_afn8an0r0tlg1, r8lambdareqvhj3p9oule_afn8an0r0tlg0), 25000L);
                } catch (RejectedExecutionException e) {
                    this.MediaSessionCompatResultReceiverWrapper.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                }
            }
            accessgetDismissSubscriberp accessgetdismisssubscriberp = this.PlaybackStateCompat;
            JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3 = new JankStatsFrameTracker$$ExternalSyntheticLambda3(this, 21, getchildstepiteratorandroid_sdk_ui_releaseSerializer);
            accessgetdismisssubscriberp.getClass();
            internalHeightCallbacklambda0.read(jankStatsFrameTracker$$ExternalSyntheticLambda3);
            weakHashMap3.put(activity, getchildstepiteratorandroid_sdk_ui_releaseSerializer);
        }
    }
}
