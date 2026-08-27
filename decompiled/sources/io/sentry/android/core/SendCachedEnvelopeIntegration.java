package io.sentry.android.core;

import io.sentry.SentryOptions;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.configureWebView;
import o.getActionTypeandroid_sdk_ui_release;
import o.loadHtmlData;
import o.parseandroid_sdk_ui_release;
import o.parselambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
final class SendCachedEnvelopeIntegration implements LogCustomEventStep, parselambda1, Closeable {
    public parseandroid_sdk_ui_release IconCompatParcelizer;
    public loadHtmlData MediaDescriptionCompat;
    public final io.sentry.util.MediaMetadataCompat MediaMetadataCompat;
    public accessgetDismissSubscriberp MediaSessionCompatQueueItem;
    public SentryAndroidOptions RatingCompat;
    public final configureWebView RemoteActionCompatParcelizer;
    public final AtomicBoolean MediaBrowserCompatMediaItem = new AtomicBoolean(false);
    public final AtomicBoolean read = new AtomicBoolean(false);
    public final AtomicBoolean write = new AtomicBoolean(false);
    public final io.sentry.util.RemoteActionCompatParcelizer serializer = new io.sentry.util.RemoteActionCompatParcelizer();

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        accessgetDismissSubscriberp accessgetdismisssubscriberp = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = accessgetdismisssubscriberp;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.RatingCompat = sentryAndroidOptions;
        String cacheDirPath = sentryOptions.getCacheDirPath();
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        this.RemoteActionCompatParcelizer.getClass();
        if (!configureWebView.IconCompatParcelizer(logger, cacheDirPath)) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            DelayKt.MediaSessionCompatToken("SendCachedEnvelope");
            read(accessgetdismisssubscriberp, this.RatingCompat);
        }
    }

    public final void read(accessgetDismissSubscriberp accessgetdismisssubscriberp, SentryAndroidOptions sentryAndroidOptions) {
        try {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.serializer.serializer();
            try {
                Future futureRemoteActionCompatParcelizer = sentryAndroidOptions.getExecutorService().RemoteActionCompatParcelizer(new SendCachedEnvelopeIntegration$$ExternalSyntheticLambda0(this, sentryAndroidOptions, accessgetdismisssubscriberp, 0));
                if (((Boolean) this.MediaMetadataCompat.IconCompatParcelizer()).booleanValue() && this.MediaBrowserCompatMediaItem.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureRemoteActionCompatParcelizer.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.set(true);
        parseandroid_sdk_ui_release parseandroid_sdk_ui_releaseVar = this.IconCompatParcelizer;
        if (parseandroid_sdk_ui_releaseVar != null) {
            parseandroid_sdk_ui_releaseVar.write(this);
        }
    }

    @Override // o.parselambda1
    public final void serializer(getActionTypeandroid_sdk_ui_release getactiontypeandroid_sdk_ui_release) {
        SentryAndroidOptions sentryAndroidOptions;
        accessgetDismissSubscriberp accessgetdismisssubscriberp = this.MediaSessionCompatQueueItem;
        if (accessgetdismisssubscriberp == null || (sentryAndroidOptions = this.RatingCompat) == null || getactiontypeandroid_sdk_ui_release == getActionTypeandroid_sdk_ui_release.DISCONNECTED) {
            return;
        }
        read(accessgetdismisssubscriberp, sentryAndroidOptions);
    }

    public SendCachedEnvelopeIntegration(configureWebView configurewebview, io.sentry.util.MediaMetadataCompat mediaMetadataCompat) {
        this.RemoteActionCompatParcelizer = configurewebview;
        this.MediaMetadataCompat = mediaMetadataCompat;
    }
}
