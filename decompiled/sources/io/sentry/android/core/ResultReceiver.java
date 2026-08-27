package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import io.sentry.HostnameCache$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BannerDismissSnapshotCompanion;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeActionUtilsWhenMappings;
import o.ContainerStep;
import o.ContentCardsActivity;
import o.UriActionExternalSyntheticLambda4;
import o.formatQueryBundleForLoglambda0;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.internalHeightCallbacklambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class ResultReceiver implements ContainerStep {
    public volatile BannerDismissSnapshotCompanion IconCompatParcelizer;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final BrazeActionParserExternalSyntheticLambda0 MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public volatile AndroidProfiler MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public Date ParcelableVolumeInfo;
    public long PlaybackStateCompat;
    public long PlaybackStateCompatCustomAction;
    public final AtomicBoolean RatingCompat;
    public final Context RemoteActionCompatParcelizer;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final SentryFrameMetricsCollector read;
    public final BrazeActionUtilsWhenMappings serializer;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ write;

    @Override // o.ContainerStep
    public final void IconCompatParcelizer(getChildStepIteratorandroid_sdk_ui_release getchildstepiteratorandroid_sdk_ui_release) {
        if (this.RatingCompat.get() && this.IconCompatParcelizer == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
            try {
                if (this.RatingCompat.get() && this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = new BannerDismissSnapshotCompanion(getchildstepiteratorandroid_sdk_ui_release, Long.valueOf(this.PlaybackStateCompat), Long.valueOf(this.PlaybackStateCompatCustomAction));
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

    @Override // o.ContainerStep
    public final boolean read() {
        return this.RatingCompat.get();
    }

    @Override // o.ContainerStep
    public final void write() {
        MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapperIconCompatParcelizer;
        this.write.getClass();
        if (this.RatingCompat.getAndSet(true)) {
            return;
        }
        if (!this.MediaSessionCompatQueueItem) {
            this.MediaSessionCompatQueueItem = true;
            if (this.MediaDescriptionCompat) {
                String str = this.MediaSessionCompatToken;
                if (str == null) {
                    this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    if (i <= 0) {
                        this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                    } else {
                        this.MediaSessionCompatResultReceiverWrapper = new AndroidProfiler(str, 1000000 / i, this.read, this.serializer, this.MediaMetadataCompat);
                    }
                }
            } else {
                this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.MediaSessionCompatResultReceiverWrapper != null && (mediaSessionCompatResultReceiverWrapperIconCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer()) != null) {
            this.PlaybackStateCompat = mediaSessionCompatResultReceiverWrapperIconCompatParcelizer.read;
            this.PlaybackStateCompatCustomAction = mediaSessionCompatResultReceiverWrapperIconCompatParcelizer.write;
            this.ParcelableVolumeInfo = (Date) mediaSessionCompatResultReceiverWrapperIconCompatParcelizer.serializer;
            this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.MediaSessionCompatResultReceiverWrapper != null && this.MediaSessionCompatResultReceiverWrapper.read) {
            this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
        try {
            this.IconCompatParcelizer = null;
            uriActionExternalSyntheticLambda4Serializer.close();
            this.RatingCompat.set(false);
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public ResultReceiver(Context context, SentryAndroidOptions sentryAndroidOptions, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
        String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
        boolean zIsProfilingEnabled = sentryAndroidOptions.isProfilingEnabled();
        int profilingTracesHz = sentryAndroidOptions.getProfilingTracesHz();
        BrazeActionUtilsWhenMappings executorService = sentryAndroidOptions.getExecutorService();
        this.MediaSessionCompatQueueItem = false;
        this.RatingCompat = new AtomicBoolean(false);
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.MediaBrowserCompatMediaItem = new io.sentry.util.RemoteActionCompatParcelizer();
        Context applicationContext = context.getApplicationContext();
        this.RemoteActionCompatParcelizer = applicationContext != null ? applicationContext : context;
        setNativeShader.read(logger, "ILogger is required");
        this.MediaMetadataCompat = logger;
        this.read = sentryFrameMetricsCollector;
        this.write = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.MediaSessionCompatToken = profilingTracesDirPath;
        this.MediaDescriptionCompat = zIsProfilingEnabled;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = profilingTracesHz;
        setNativeShader.read(executorService, "The ISentryExecutorService is required.");
        this.serializer = executorService;
        this.ParcelableVolumeInfo = setNativeShader.serializer();
    }

    @Override // o.ContainerStep
    public final void IconCompatParcelizer() {
        BannerDismissSnapshotCompanion bannerDismissSnapshotCompanion = this.IconCompatParcelizer;
        if (bannerDismissSnapshotCompanion != null) {
            RemoteActionCompatParcelizer(bannerDismissSnapshotCompanion.write, bannerDismissSnapshotCompanion.serializer, bannerDismissSnapshotCompanion.MediaSessionCompatQueueItem, true, null, internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer());
        }
        this.RatingCompat.set(false);
        if (this.MediaSessionCompatResultReceiverWrapper != null) {
            AndroidProfiler androidProfiler = this.MediaSessionCompatResultReceiverWrapper;
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = androidProfiler.RatingCompat.serializer();
            try {
                Future future = androidProfiler.MediaBrowserCompatMediaItem;
                if (future != null) {
                    future.cancel(true);
                    androidProfiler.MediaBrowserCompatMediaItem = null;
                }
                if (androidProfiler.read) {
                    androidProfiler.serializer(null, true);
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

    public final ContentCardsActivity RemoteActionCompatParcelizer(String str, String str2, String str3, boolean z, List list, SentryOptions sentryOptions) {
        String string;
        String str4;
        String str5;
        this.write.getClass();
        int i = Build.VERSION.SDK_INT;
        if (this.MediaSessionCompatResultReceiverWrapper != null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
            try {
                BannerDismissSnapshotCompanion bannerDismissSnapshotCompanion = this.IconCompatParcelizer;
                if (bannerDismissSnapshotCompanion != null && bannerDismissSnapshotCompanion.serializer.equals(str2)) {
                    this.IconCompatParcelizer = null;
                    uriActionExternalSyntheticLambda4Serializer.close();
                    this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Transaction %s (%s) finished.", str, str3);
                    PlaybackStateCompatCustomAction playbackStateCompatCustomActionSerializer = this.MediaSessionCompatResultReceiverWrapper.serializer(list, false);
                    this.RatingCompat.set(false);
                    if (playbackStateCompatCustomActionSerializer != null) {
                        long j = playbackStateCompatCustomActionSerializer.serializer;
                        long j2 = this.PlaybackStateCompat;
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(bannerDismissSnapshotCompanion);
                        long j3 = playbackStateCompatCustomActionSerializer.serializer;
                        long j4 = this.PlaybackStateCompat;
                        long j5 = playbackStateCompatCustomActionSerializer.read;
                        long j6 = this.PlaybackStateCompatCustomAction;
                        if (bannerDismissSnapshotCompanion.RemoteActionCompatParcelizer == null) {
                            bannerDismissSnapshotCompanion.RemoteActionCompatParcelizer = Long.valueOf(j3 - j4);
                            bannerDismissSnapshotCompanion.RatingCompat = Long.valueOf(bannerDismissSnapshotCompanion.RatingCompat.longValue() - j4);
                            bannerDismissSnapshotCompanion.IconCompatParcelizer = Long.valueOf(j5 - j6);
                            bannerDismissSnapshotCompanion.read = Long.valueOf(bannerDismissSnapshotCompanion.read.longValue() - j6);
                        }
                        Long l = sentryOptions instanceof SentryAndroidOptions ? _init_lambda4.read(this.RemoteActionCompatParcelizer, (SentryAndroidOptions) sentryOptions).MediaBrowserCompatMediaItem : null;
                        if (l != null) {
                            string = Long.toString(l.longValue());
                        } else {
                            string = "0";
                        }
                        String str6 = string;
                        String[] strArr = Build.SUPPORTED_ABIS;
                        File file = playbackStateCompatCustomActionSerializer.IconCompatParcelizer;
                        Date date = this.ParcelableVolumeInfo;
                        String string2 = Long.toString(j - j2);
                        this.write.getClass();
                        if (strArr != null && strArr.length > 0) {
                            str4 = strArr[0];
                        } else {
                            str4 = "";
                        }
                        String str7 = str4;
                        HostnameCache$$ExternalSyntheticLambda0 hostnameCache$$ExternalSyntheticLambda0 = new HostnameCache$$ExternalSyntheticLambda0(5);
                        this.write.getClass();
                        String str8 = Build.MANUFACTURER;
                        this.write.getClass();
                        String str9 = Build.MODEL;
                        this.write.getClass();
                        String str10 = Build.VERSION.RELEASE;
                        Boolean boolWrite = this.write.write();
                        String proguardUuid = sentryOptions.getProguardUuid();
                        String release = sentryOptions.getRelease();
                        String environment = sentryOptions.getEnvironment();
                        if (!playbackStateCompatCustomActionSerializer.write && !z) {
                            str5 = Constants.NORMAL;
                        } else {
                            str5 = "timeout";
                        }
                        return new ContentCardsActivity(file, date, arrayList, str, str2, str3, string2, i, str7, hostnameCache$$ExternalSyntheticLambda0, str8, str9, str10, boolWrite, str6, proguardUuid, release, environment, str5, playbackStateCompatCustomActionSerializer.RemoteActionCompatParcelizer);
                    }
                }
                this.MediaMetadataCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                uriActionExternalSyntheticLambda4Serializer.close();
                return null;
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
        return null;
    }

    @Override // o.ContainerStep
    public final ContentCardsActivity write(formatQueryBundleForLoglambda0 formatquerybundleforloglambda0, List list, SentryOptions sentryOptions) {
        return RemoteActionCompatParcelizer(formatquerybundleforloglambda0.ParcelableVolumeInfo, formatquerybundleforloglambda0.read.toString(), formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper.read.PlaybackStateCompat.toString(), false, list, sentryOptions);
    }
}
