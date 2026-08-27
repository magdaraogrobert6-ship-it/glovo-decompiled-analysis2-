package io.sentry.android.core;

import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class NdkIntegration implements LogCustomEventStep, Closeable {
    public final Class IconCompatParcelizer;
    public SentryAndroidOptions RemoteActionCompatParcelizer;

    public static void write(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    public NdkIntegration(Class cls) {
        this.IconCompatParcelizer = cls;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.RemoteActionCompatParcelizer;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.IconCompatParcelizer;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e) {
            this.RemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to invoke the SentryNdk.close method.", e);
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to close SentryNdk.", th);
        } finally {
            write(this.RemoteActionCompatParcelizer);
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.RemoteActionCompatParcelizer = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        BrazeActionParserExternalSyntheticLambda0 logger = this.RemoteActionCompatParcelizer.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.IconCompatParcelizer) == null) {
            write(this.RemoteActionCompatParcelizer);
            return;
        }
        if (this.RemoteActionCompatParcelizer.getCacheDirPath() == null) {
            this.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "No cache dir path is defined in options.", new Object[0]);
            write(this.RemoteActionCompatParcelizer);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "NdkIntegration installed.", new Object[0]);
            DelayKt.MediaSessionCompatToken("Ndk");
        } catch (NoSuchMethodException e) {
            write(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            write(this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
