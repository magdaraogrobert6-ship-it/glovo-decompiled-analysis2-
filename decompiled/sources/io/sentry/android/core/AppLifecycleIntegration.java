package io.sentry.android.core;

import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class AppLifecycleIntegration implements LogCustomEventStep, Closeable {
    public volatile addObserverForBackInvokerlambda0 read;
    public SentryAndroidOptions serializer;
    public final io.sentry.util.RemoteActionCompatParcelizer write = new io.sentry.util.RemoteActionCompatParcelizer();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            addObserverForBackInvokerlambda0 addobserverforbackinvokerlambda0 = this.read;
            this.read = null;
            uriActionExternalSyntheticLambda4Serializer.close();
            if (addobserverforbackinvokerlambda0 != null) {
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.RemoteActionCompatParcelizer(addobserverforbackinvokerlambda0);
                SentryAndroidOptions sentryAndroidOptions = this.serializer;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.serializer();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.serializer = sentryAndroidOptions;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "enableSessionTracking enabled: %s", Boolean.valueOf(this.serializer.isEnableAutoSessionTracking()));
        this.serializer.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.serializer.isEnableAppLifecycleBreadcrumbs()));
        if (this.serializer.isEnableAutoSessionTracking() || this.serializer.isEnableAppLifecycleBreadcrumbs()) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
            try {
                if (this.read != null) {
                    uriActionExternalSyntheticLambda4Serializer.close();
                    return;
                }
                this.read = new addObserverForBackInvokerlambda0(this.serializer.getSessionTrackingIntervalMillis(), this.serializer.isEnableAutoSessionTracking(), this.serializer.isEnableAppLifecycleBreadcrumbs());
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.serializer(this.read);
                uriActionExternalSyntheticLambda4Serializer.close();
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "AppLifecycleIntegration installed.", new Object[0]);
                DelayKt.MediaSessionCompatToken("AppLifecycle");
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
