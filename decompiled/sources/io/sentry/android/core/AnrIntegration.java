package io.sentry.android.core;

import android.content.Context;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.io.Closeable;
import kotlinx.coroutines.DelayKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class AnrIntegration implements LogCustomEventStep, Closeable {
    public static ANRWatchDog serializer;
    public static final io.sentry.util.RemoteActionCompatParcelizer write = new io.sentry.util.RemoteActionCompatParcelizer();
    public SentryOptions IconCompatParcelizer;
    public final Context read;
    public boolean RemoteActionCompatParcelizer = false;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatQueueItem = new io.sentry.util.RemoteActionCompatParcelizer();

    public final void IconCompatParcelizer(SentryAndroidOptions sentryAndroidOptions) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = write.serializer();
        try {
            if (serializer == null) {
                BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                ANRWatchDog aNRWatchDog = new ANRWatchDog(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 25, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.read);
                serializer = aNRWatchDog;
                aNRWatchDog.start();
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "AnrIntegration installed.", new Object[0]);
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

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        this.IconCompatParcelizer = sentryOptions;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            DelayKt.MediaSessionCompatToken("Anr");
            try {
                sentryAndroidOptions.getExecutorService().RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 19, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            this.RemoteActionCompatParcelizer = true;
            uriActionExternalSyntheticLambda4Serializer.close();
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = write.serializer();
            try {
                ANRWatchDog aNRWatchDog = serializer;
                if (aNRWatchDog != null) {
                    aNRWatchDog.interrupt();
                    serializer = null;
                    SentryOptions sentryOptions = this.IconCompatParcelizer;
                    if (sentryOptions != null) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                uriActionExternalSyntheticLambda4Serializer2.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
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

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.read = applicationContext != null ? applicationContext : context;
    }
}
