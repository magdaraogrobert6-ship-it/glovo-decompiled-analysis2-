package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionUtilsWhenMappings;
import o.LogCustomEventStep;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint
public class AnrV2Integration implements LogCustomEventStep, Closeable {
    public SentryAndroidOptions IconCompatParcelizer;
    public final io.sentry.transport.IconCompatParcelizer RemoteActionCompatParcelizer;
    public final Context serializer;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.serializer = applicationContext != null ? applicationContext : context;
        this.RemoteActionCompatParcelizer = io.sentry.transport.IconCompatParcelizer.write;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.IconCompatParcelizer = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.IconCompatParcelizer.isAnrEnabled()));
        String cacheDirPath = this.IconCompatParcelizer.getCacheDirPath();
        SentryAndroidOptions sentryAndroidOptions2 = this.IconCompatParcelizer;
        if (cacheDirPath == null) {
            sentryAndroidOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (sentryAndroidOptions2.isAnrEnabled()) {
            try {
                BrazeActionUtilsWhenMappings executorService = sentryOptions.getExecutorService();
                Context context = this.serializer;
                SentryAndroidOptions sentryAndroidOptions3 = this.IconCompatParcelizer;
                executorService.RemoteActionCompatParcelizer(new r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs(context, sentryAndroidOptions3, this.RemoteActionCompatParcelizer, new ComponentActivity(sentryAndroidOptions3)));
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to start ANR processor.", th);
            }
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "AnrV2Integration installed.", new Object[0]);
            DelayKt.MediaSessionCompatToken("AnrV2");
        }
    }
}
