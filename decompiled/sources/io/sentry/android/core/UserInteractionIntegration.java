package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.accessgetDismissSubscriberp;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInteractionIntegration implements LogCustomEventStep, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application RemoteActionCompatParcelizer;
    public accessgetDismissSubscriberp serializer;
    public SentryAndroidOptions write;
    public final boolean IconCompatParcelizer = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.write, "androidx.core.view.GestureDetectorCompat");
    public final boolean read = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.write, "androidx.lifecycle.Lifecycle");

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        serializer(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.write;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    public UserInteractionIntegration(Application application, io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        this.RemoteActionCompatParcelizer = application;
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.write = sentryAndroidOptions;
        this.serializer = accessgetDismissSubscriberp.IconCompatParcelizer;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.write.isEnableUserInteractionTracing();
        BrazeActionParserExternalSyntheticLambda0 logger = this.write.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (!this.IconCompatParcelizer) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.RemoteActionCompatParcelizer.registerActivityLifecycleCallbacks(this);
            this.write.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "UserInteractionIntegration installed.", new Object[0]);
            DelayKt.MediaSessionCompatToken("UserInteraction");
            if (this.read) {
                WeakReference weakReference = (WeakReference) r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer.write;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof accessisRenderNodeCompatiblecp) && ((accessregisterComponentCallback) ((accessisRenderNodeCompatiblecp) activity).getLifecycle()).RatingCompat == toColorLong8_81llA.RESUMED) {
                    serializer(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.write;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.MediaDescriptionCompat) {
            io.sentry.android.core.internal.gestures.MediaDescriptionCompat mediaDescriptionCompat = (io.sentry.android.core.internal.gestures.MediaDescriptionCompat) callback;
            mediaDescriptionCompat.serializer();
            if (mediaDescriptionCompat.RemoteActionCompatParcelizer() instanceof io.sentry.android.core.internal.gestures.write) {
                window.setCallback(null);
            } else {
                window.setCallback(mediaDescriptionCompat.RemoteActionCompatParcelizer());
            }
        }
    }

    public final void serializer(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.write;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.serializer == null || this.write == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.write();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.MediaDescriptionCompat) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.MediaDescriptionCompat(callback, activity, new io.sentry.android.core.internal.gestures.serializer(activity, this.serializer, this.write), this.write));
    }
}
