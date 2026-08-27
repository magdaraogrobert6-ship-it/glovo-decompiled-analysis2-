package io.sentry.android.core;

import android.content.Context;
import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkBreadcrumbsIntegration implements LogCustomEventStep, Closeable {
    public final Context IconCompatParcelizer;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ RemoteActionCompatParcelizer;
    public volatile fullyDrawnReporter_delegatelambda00 read;
    public final io.sentry.util.RemoteActionCompatParcelizer serializer = new io.sentry.util.RemoteActionCompatParcelizer();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.serializer.serializer();
        try {
            fullyDrawnReporter_delegatelambda00 fullydrawnreporter_delegatelambda00 = this.read;
            this.read = null;
            uriActionExternalSyntheticLambda4Serializer.close();
            if (fullydrawnreporter_delegatelambda00 != null) {
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = io.sentry.android.core.internal.util.read.IconCompatParcelizer.serializer();
                try {
                    io.sentry.android.core.internal.util.read.RemoteActionCompatParcelizer.remove(fullydrawnreporter_delegatelambda00);
                    uriActionExternalSyntheticLambda4Serializer2.close();
                } catch (Throwable th) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        Context applicationContext = context.getApplicationContext();
        this.IconCompatParcelizer = applicationContext != null ? applicationContext : context;
        this.RemoteActionCompatParcelizer = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.RemoteActionCompatParcelizer.getClass();
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.serializer.serializer();
            try {
                this.read = new fullyDrawnReporter_delegatelambda00(this.RemoteActionCompatParcelizer, sentryOptions.getDateProvider());
                if (io.sentry.android.core.internal.util.read.write(this.IconCompatParcelizer, sentryOptions.getLogger(), this.RemoteActionCompatParcelizer, this.read)) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    DelayKt.MediaSessionCompatToken("NetworkBreadcrumbs");
                } else {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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
}
