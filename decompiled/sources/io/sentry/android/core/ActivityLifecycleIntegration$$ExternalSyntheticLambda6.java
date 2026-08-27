package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import androidx.work.impl.WorkerWrapper;
import io.sentry.SentryOptions;
import io.sentry.SentryOptions$$ExternalSyntheticLambda0;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.util.ArrayList;
import kotlin.LazyKt__LazyJVMKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeActionUtils;
import o.LogCustomEventStep;
import o.StepData;
import o.UriActionExternalSyntheticLambda1;
import o.UriActionExternalSyntheticLambda4;
import o.beforeMessageClosed;
import o.getAlpha8_sVssgQ;
import o.getArgandroid_sdk_ui_release;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getWebViewActivityIntent;
import o.isArgCountInBounds;
import o.isArgCountInBoundslambda0;
import o.queryResultsChanged;
import o.r8lambdaC65AgNYjlXsuFXOhYux3_Qwhdc4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaOvKN5euqH6Ij7OM19FiXA03UYH4;
import o.r8lambdaTNtTDMxkDDgiI2m22ZXaLqsE;
import o.r8lambdaYUcla_T2qX_wkQ_VCWtu0Z3x1UI;
import o.r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik;
import o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityLifecycleIntegration$$ExternalSyntheticLambda6 implements r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4 {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ ActivityLifecycleIntegration$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.IconCompatParcelizer = obj3;
    }

    @Override // o.r8lambdan7tsCDbGkNcn7OAdLCxuK9AaF4
    public void accept(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.RemoteActionCompatParcelizer;
        BrazeActionUtils brazeActionUtils = (BrazeActionUtils) this.serializer;
        getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release2 = (getChildStepIteratorandroid_sdk_ui_release) this.IconCompatParcelizer;
        if (getchildstepiteratorandroid_sdk_ui_release == null) {
            brazeActionUtils.IconCompatParcelizer(getchildstepiteratorandroid_sdk_ui_release2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.MediaSessionCompatResultReceiverWrapper;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", getchildstepiteratorandroid_sdk_ui_release2.PlaybackStateCompat());
        }
    }

    public void read(SentryOptions sentryOptions) {
        int i;
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = (MediaBrowserCompatMediaItem) this.RemoteActionCompatParcelizer;
        Context context = (Context) this.serializer;
        queryResultsChanged queryresultschanged = (queryResultsChanged) this.IconCompatParcelizer;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        boolean zIconCompatParcelizer = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "timber.log.Timber");
        int i2 = 0;
        int i3 = 1;
        boolean z = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z2 = zIconCompatParcelizer && io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zIconCompatParcelizer2 = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zIconCompatParcelizer3 = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(mediaBrowserCompatMediaItem);
        io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = new io.sentry.util.MediaBrowserCompatMediaItem(i2);
        WorkerWrapper.Builder builder = new WorkerWrapper.Builder(mediaBrowserCompatMediaItem2, sentryAndroidOptions);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(mediaBrowserCompatMediaItem);
        sentryAndroidOptions.setFatalLogger(new MediaBrowserCompatMediaItem(3));
        sentryAndroidOptions.setDefaultScopeType(r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(beforeMessageClosed.OFF);
        sentryAndroidOptions.setDateProvider(new onBackPressedDispatcher_delegatelambda010());
        sentryAndroidOptions.setRuntimeManager(new io.sentry.android.core.internal.util.serializer());
        sentryAndroidOptions.getLogs().read = new MediaBrowserCompatMediaItem(4);
        sentryAndroidOptions.getMetrics().IconCompatParcelizer = new MediaBrowserCompatMediaItem(5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new SentryFrameMetricsCollector(applicationContext, mediaBrowserCompatMediaItem, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq));
        LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(applicationContext, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath((String) sentryAndroidOptions.getRuntimeManager().RemoteActionCompatParcelizer(new getAlpha8_sVssgQ(applicationContext, i3)));
        PackageInfo packageInfoRemoteActionCompatParcelizer = _init_lambda3.RemoteActionCompatParcelizer(applicationContext, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
        if (packageInfoRemoteActionCompatParcelizer != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoRemoteActionCompatParcelizer.packageName + "@" + packageInfoRemoteActionCompatParcelizer.versionName + "+" + Long.toString(packageInfoRemoteActionCompatParcelizer.getLongVersionCode()));
            }
            String str = packageInfoRemoteActionCompatParcelizer.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        int i4 = 2;
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId((String) sentryAndroidOptions.getRuntimeManager().RemoteActionCompatParcelizer(new getAlpha8_sVssgQ(applicationContext, i4)));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Could not generate distinct Id.", e);
            }
        }
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer;
        if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.write.serializer();
            try {
                r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer(sentryAndroidOptions.getLogger());
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        AndroidOptionsInitializer.RemoteActionCompatParcelizer(context, sentryAndroidOptions, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, mediaBrowserCompatMediaItem2, builder, z, z2, zIconCompatParcelizer2, zIconCompatParcelizer3);
        try {
            queryresultschanged.IconCompatParcelizer(sentryAndroidOptions);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th3);
        }
        AppStartMetrics appStartMetrics = AppStartMetrics.read();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer = appStartMetrics.MediaSessionCompatQueueItem;
            if (remoteActionCompatParcelizer.read == 0) {
                remoteActionCompatParcelizer.read(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            appStartMetrics.serializer((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = appStartMetrics.PlaybackStateCompatCustomAction;
        if (remoteActionCompatParcelizer2.read == 0) {
            remoteActionCompatParcelizer2.read(getOnBackPressedInput.serializer);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.RatingCompat)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new AndroidEnvelopeCache(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof r8lambdaC65AgNYjlXsuFXOhYux3_Qwhdc4) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.read(context, sentryAndroidOptions, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.MediaMetadataCompat(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.RatingCompat(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new r8lambdaYUcla_T2qX_wkQ_VCWtu0Z3x1UI(sentryAndroidOptions, 1));
        sentryAndroidOptions.addEventProcessor(new _init_lambda1(context, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new PerformanceAndroidEventProcessor(sentryAndroidOptions, builder));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(context, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.ParcelableVolumeInfo) {
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(0);
            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2.write = sentryAndroidOptions;
            sentryAndroidOptions.setTransportGate(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2);
        }
        AppStartMetrics appStartMetrics2 = AppStartMetrics.read();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.read) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.serializer(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.serializer) {
            BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
            i = 0;
            OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(0);
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                applicationContext2 = context;
            }
            okHttpCall$1.write = applicationContext2;
            okHttpCall$1.serializer = logger;
            sentryAndroidOptions.setDebugMetaLoader(okHttpCall$1);
        } else {
            i = 0;
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof getArgandroid_sdk_ui_release) {
            sentryAndroidOptions.setVersionDetector(new UriActionExternalSyntheticLambda1(sentryAndroidOptions));
        }
        io.sentry.util.MediaMetadataCompat mediaMetadataCompat = new io.sentry.util.MediaMetadataCompat(new SentryOptions$$ExternalSyntheticLambda0(mediaBrowserCompatMediaItem2, sentryAndroidOptions));
        boolean zIconCompatParcelizer4 = io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.read(mediaMetadataCompat));
            if (zIconCompatParcelizer4 && io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zIconCompatParcelizer4 && io.sentry.util.MediaBrowserCompatMediaItem.IconCompatParcelizer(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.read) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.MediaMetadataCompat.read);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof isArgCountInBoundslambda0) {
            sentryAndroidOptions.setSocketTagger(MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new MediaDescriptionCompat());
            sentryAndroidOptions.addPerformanceCollector(new IconCompatParcelizer(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                SentryFrameMetricsCollector frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                setNativeShader.read(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new SpanFrameMetricsCollector(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof StepData) {
            sentryAndroidOptions.setCompositePerformanceCollector(new getWebViewActivityIntent(sentryAndroidOptions));
        }
        if (zIconCompatParcelizer2 && (sentryAndroidOptions.getReplayController().MediaSessionCompatQueueItem() instanceof r8lambdaTNtTDMxkDDgiI2m22ZXaLqsE)) {
            sentryAndroidOptions.getReplayController().IconCompatParcelizer(new io.sentry.android.replay.serializer(sentryAndroidOptions));
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = AppStartMetrics.serializer.serializer();
        try {
            appStartMetrics2.getClass();
            uriActionExternalSyntheticLambda4Serializer2.close();
            sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(r8lambdaOvKN5euqH6Ij7OM19FiXA03UYH4.RemoteActionCompatParcelizer);
                SentryFrameMetricsCollector frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                setNativeShader.read(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setTransactionProfiler(new ResultReceiver(context, sentryAndroidOptions, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, frameMetricsCollector2));
            } else {
                sentryAndroidOptions.setTransactionProfiler(isArgCountInBounds.IconCompatParcelizer);
                SentryFrameMetricsCollector frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                setNativeShader.read(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setContinuousProfiler(new serializer(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (LogCustomEventStep logCustomEventStep : sentryAndroidOptions.getIntegrations()) {
                if (z && (logCustomEventStep instanceof FragmentLifecycleIntegration)) {
                    arrayList4.add(logCustomEventStep);
                }
                if (z2 && (logCustomEventStep instanceof SentryTimberIntegration)) {
                    arrayList3.add(logCustomEventStep);
                }
                if (logCustomEventStep instanceof SystemEventsBreadcrumbsIntegration) {
                    arrayList5.add(logCustomEventStep);
                }
            }
            if (arrayList4.size() > 1) {
                int i5 = i;
                for (int i6 = 1; i5 < arrayList4.size() - i6; i6 = 1) {
                    sentryAndroidOptions.getIntegrations().remove((LogCustomEventStep) arrayList4.get(i5));
                    i5++;
                }
            }
            if (arrayList3.size() > 1) {
                int i7 = i;
                for (int i8 = 1; i7 < arrayList3.size() - i8; i8 = 1) {
                    sentryAndroidOptions.getIntegrations().remove((LogCustomEventStep) arrayList3.get(i7));
                    i7++;
                }
            }
            if (arrayList5.size() > 1) {
                for (int i9 = i; i9 < arrayList5.size() - 1; i9++) {
                    sentryAndroidOptions.getIntegrations().remove((LogCustomEventStep) arrayList5.get(i9));
                }
            }
        } catch (Throwable th4) {
            try {
                uriActionExternalSyntheticLambda4Serializer2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
