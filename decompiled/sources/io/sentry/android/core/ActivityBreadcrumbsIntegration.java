package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityBreadcrumbsIntegration implements LogCustomEventStep, Closeable, Application.ActivityLifecycleCallbacks {
    public accessgetDismissSubscriberp IconCompatParcelizer;
    public final Application RemoteActionCompatParcelizer;
    public final io.sentry.util.RemoteActionCompatParcelizer read = new io.sentry.util.RemoteActionCompatParcelizer();
    public boolean write;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            serializer(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            serializer(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            serializer(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            serializer(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            serializer(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            serializer(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            serializer(activity, "stopped");
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            this.RemoteActionCompatParcelizer.unregisterActivityLifecycleCallbacks(this);
            accessgetDismissSubscriberp accessgetdismisssubscriberp = this.IconCompatParcelizer;
            if (accessgetdismisssubscriberp != null) {
                accessgetdismisssubscriberp.RemoteActionCompatParcelizer().getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    public ActivityBreadcrumbsIntegration(Application application) {
        this.RemoteActionCompatParcelizer = application;
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.IconCompatParcelizer = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.write = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.write));
        if (this.write) {
            this.RemoteActionCompatParcelizer.registerActivityLifecycleCallbacks(this);
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            DelayKt.MediaSessionCompatToken("ActivityBreadcrumbs");
        }
    }

    public final void serializer(Activity activity, String str) {
        if (this.IconCompatParcelizer == null) {
            return;
        }
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
        getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "navigation";
        getintentarraywithconfiguredbackstacklambda1.read(str, "state");
        getintentarraywithconfiguredbackstacklambda1.read(activity.getClass().getSimpleName(), "screen");
        getintentarraywithconfiguredbackstacklambda1.write = "ui.lifecycle";
        getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
        executelambda4 executelambda4Var = new executelambda4();
        executelambda4Var.RemoteActionCompatParcelizer("android:activity", activity);
        this.IconCompatParcelizer.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
    }
}
