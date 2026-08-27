package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkerWrapper;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import o.LogCustomEventStep;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidOptionsInitializer {
    public static void RemoteActionCompatParcelizer(Context context, SentryAndroidOptions sentryAndroidOptions, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, WorkerWrapper.Builder builder, boolean z, boolean z2, boolean z3, boolean z4) {
        LogCustomEventStep anrIntegration;
        io.sentry.util.MediaMetadataCompat mediaMetadataCompat = new io.sentry.util.MediaMetadataCompat(new ParcelableVolumeInfo(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new SharedResourcePool(new ParcelableVolumeInfo(sentryAndroidOptions)), mediaMetadataCompat));
        sentryAndroidOptions.addIntegration(new NdkIntegration(io.sentry.util.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(sentryAndroidOptions.getLogger(), "io.sentry.android.ndk.SentryNdk")));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new JsonObjectSerializer(10, new ParcelableVolumeInfo(sentryAndroidOptions)), mediaMetadataCompat));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        if (i >= 30) {
            anrIntegration = new AnrV2Integration(context);
        } else {
            anrIntegration = new AnrIntegration(context);
        }
        sentryAndroidOptions.addIntegration(anrIntegration);
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, builder));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, mediaBrowserCompatMediaItem));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z4) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
