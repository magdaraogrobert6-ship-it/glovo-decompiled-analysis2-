package io.sentry.android.core;

import android.content.Context;
import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionUtilsWhenMappings;
import o.LogCustomEventStep;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public class TombstoneIntegration implements LogCustomEventStep, Closeable {
    public final io.sentry.transport.IconCompatParcelizer IconCompatParcelizer;
    public SentryAndroidOptions RemoteActionCompatParcelizer;
    public final Context serializer;

    public TombstoneIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.serializer = applicationContext != null ? applicationContext : context;
        this.IconCompatParcelizer = io.sentry.transport.IconCompatParcelizer.write;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.RemoteActionCompatParcelizer;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.RemoteActionCompatParcelizer = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.RemoteActionCompatParcelizer.isTombstoneEnabled()));
        if (this.RemoteActionCompatParcelizer.isTombstoneEnabled()) {
            if (this.RemoteActionCompatParcelizer.getCacheDirPath() == null) {
                this.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                BrazeActionUtilsWhenMappings executorService = sentryOptions.getExecutorService();
                Context context = this.serializer;
                SentryAndroidOptions sentryAndroidOptions2 = this.RemoteActionCompatParcelizer;
                executorService.RemoteActionCompatParcelizer(new r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs(context, sentryAndroidOptions2, this.IconCompatParcelizer, new addOnMultiWindowModeChangedListener(context, sentryAndroidOptions2)));
            } catch (Throwable th) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to start tombstone processor.", th);
            }
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            DelayKt.MediaSessionCompatToken("Tombstone");
        }
    }
}
