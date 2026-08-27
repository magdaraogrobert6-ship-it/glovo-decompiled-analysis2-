package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.mapbox.common.module.MapboxHttpClient$$ExternalSyntheticLambda2;
import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.accessgetDismissSubscriberp;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class AppComponentsBreadcrumbsIntegration implements LogCustomEventStep, Closeable, ComponentCallbacks2 {
    public static final executelambda4 IconCompatParcelizer = new executelambda4();
    public accessgetDismissSubscriberp RemoteActionCompatParcelizer;
    public final io.sentry.android.core.internal.util.MediaDescriptionCompat read = new io.sentry.android.core.internal.util.MediaDescriptionCompat(60000, 0);
    public final Context serializer;
    public SentryAndroidOptions write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.serializer.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.write;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.write;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        this.RemoteActionCompatParcelizer = accessgetDismissSubscriberp.IconCompatParcelizer;
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.write = sentryAndroidOptions;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.write.isEnableAppComponentBreadcrumbs()));
        if (this.write.isEnableAppComponentBreadcrumbs()) {
            try {
                this.serializer.registerComponentCallbacks(this);
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                DelayKt.MediaSessionCompatToken("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.write.setEnableAppComponentBreadcrumbs(false);
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.write;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().RemoteActionCompatParcelizer(runnable);
            } catch (Throwable th) {
                this.write.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        if (i >= 40 && !this.read.IconCompatParcelizer()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            RemoteActionCompatParcelizer(new Runnable() { // from class: io.sentry.android.core.AppComponentsBreadcrumbsIntegration$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.serializer;
                    if (appComponentsBreadcrumbsIntegration.RemoteActionCompatParcelizer != null) {
                        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1(jCurrentTimeMillis);
                        getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "system";
                        getintentarraywithconfiguredbackstacklambda1.write = "device.event";
                        getintentarraywithconfiguredbackstacklambda1.serializer = "Low memory";
                        getintentarraywithconfiguredbackstacklambda1.read("LOW_MEMORY", "action");
                        getintentarraywithconfiguredbackstacklambda1.read(Integer.valueOf(i), "level");
                        getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING;
                        appComponentsBreadcrumbsIntegration.RemoteActionCompatParcelizer.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, AppComponentsBreadcrumbsIntegration.IconCompatParcelizer);
                    }
                }
            });
        }
    }

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.serializer = applicationContext != null ? applicationContext : context;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        RemoteActionCompatParcelizer(new MapboxHttpClient$$ExternalSyntheticLambda2(this, System.currentTimeMillis(), configuration, 3));
    }
}
