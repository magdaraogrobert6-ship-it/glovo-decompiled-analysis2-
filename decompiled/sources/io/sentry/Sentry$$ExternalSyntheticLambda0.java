package io.sentry;

import io.sentry.cache.MediaMetadataCompat;
import io.sentry.cache.RatingCompat;
import io.sentry.cache.tape.read;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.util.MediaSessionCompatToken;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import kotlin.TuplesKt;
import o._get_messageWebView_lambda0;
import o.containsInvalidBrazeAction;
import o.defaultCardHandling;
import o.initBannerlambda1;
import o.internalHeightCallbacklambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Sentry$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ SentryOptions RemoteActionCompatParcelizer;

    public /* synthetic */ Sentry$$ExternalSyntheticLambda0(SentryOptions sentryOptions, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = sentryOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        SentryOptions sentryOptions = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            sentryOptions.loadLazyFields();
            return;
        }
        if (i == 1) {
            String cacheDirPathWithoutDsn = sentryOptions.getCacheDirPathWithoutDsn();
            if (cacheDirPathWithoutDsn != null) {
                File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                try {
                    TuplesKt.serializer(file);
                    if (sentryOptions.isEnableAppStartProfiling() || sentryOptions.isStartProfilerOnAppStart()) {
                        if (!sentryOptions.isStartProfilerOnAppStart() && !sentryOptions.isTracingEnabled()) {
                            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                            return;
                        }
                        if (file.createNewFile()) {
                            initBannerlambda1 initbannerlambda1 = new initBannerlambda1(sentryOptions, sentryOptions.isEnableAppStartProfiling() ? sentryOptions.getInternalTracesSampler().serializer(new OkHttpCall$1(new defaultCardHandling("app.launch", "profile"), Double.valueOf(MediaSessionCompatToken.read().IconCompatParcelizer()))) : new _get_messageWebView_lambda0(Boolean.FALSE, null));
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, internalHeightCallbacklambda0.write));
                                try {
                                    sentryOptions.getSerializer().serializer(bufferedWriter, initbannerlambda1);
                                    bufferedWriter.close();
                                    fileOutputStream.close();
                                    return;
                                } catch (Throwable th) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to create app start profiling config file. ", th5);
                    return;
                }
            }
            return;
        }
        if (i != 2) {
            internalHeightCallbacklambda0.IconCompatParcelizer().read(sentryOptions.getFlushTimeoutMillis());
            return;
        }
        for (containsInvalidBrazeAction containsinvalidbrazeaction : sentryOptions.getOptionsObservers()) {
            String release = sentryOptions.getRelease();
            RatingCompat ratingCompat = (RatingCompat) containsinvalidbrazeaction;
            if (release == null) {
                ratingCompat.IconCompatParcelizer("release.json");
            } else {
                ratingCompat.read(release, "release.json");
            }
            String proguardUuid = sentryOptions.getProguardUuid();
            if (proguardUuid == null) {
                ratingCompat.IconCompatParcelizer("proguard-uuid.json");
            } else {
                ratingCompat.read(proguardUuid, "proguard-uuid.json");
            }
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 sdkVersion = sentryOptions.getSdkVersion();
            if (sdkVersion == null) {
                ratingCompat.IconCompatParcelizer("sdk-version.json");
            } else {
                ratingCompat.read(sdkVersion, "sdk-version.json");
            }
            String dist = sentryOptions.getDist();
            if (dist == null) {
                ratingCompat.IconCompatParcelizer("dist.json");
            } else {
                ratingCompat.read(dist, "dist.json");
            }
            String environment = sentryOptions.getEnvironment();
            if (environment == null) {
                ratingCompat.IconCompatParcelizer("environment.json");
            } else {
                ratingCompat.read(environment, "environment.json");
            }
            ratingCompat.read(sentryOptions.getTags(), "tags.json");
            Double d = sentryOptions.getSessionReplay().PlaybackStateCompat;
            if (d == null) {
                ratingCompat.IconCompatParcelizer("replay-error-sample-rate.json");
            } else {
                ratingCompat.read(d.toString(), "replay-error-sample-rate.json");
            }
        }
        MediaMetadataCompat mediaMetadataCompatFindPersistingScopeObserver = sentryOptions.findPersistingScopeObserver();
        if (mediaMetadataCompatFindPersistingScopeObserver != null) {
            try {
                ((read) mediaMetadataCompatFindPersistingScopeObserver.serializer.IconCompatParcelizer()).write();
            } catch (IOException e) {
                mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to clear breadcrumbs from file queue", e);
            }
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("user.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("level.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("request.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("fingerprint.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("contexts.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("extras.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("tags.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("trace.json");
            mediaMetadataCompatFindPersistingScopeObserver.IconCompatParcelizer("transaction.json");
        }
    }
}
