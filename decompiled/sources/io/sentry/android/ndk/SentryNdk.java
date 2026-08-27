package io.sentry.android.ndk;

import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.getSavedStateRegistryControllerannotations;
import io.sentry.ndk.NdkOptions;
import io.sentry.ndk.RemoteActionCompatParcelizer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryNdk {
    private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

    private SentryNdk() {
    }

    public static void close() {
        try {
            if (!loadLibraryLatch.await(ConstantKt.DEFAULT_REQUEST_TIMEOUT, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            io.sentry.ndk.SentryNdk.close();
        } catch (InterruptedException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }

    static {
        new Thread(new xr$$ExternalSyntheticLambda1(5), "SentryNdkLoadLibs").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0() {
        try {
            io.sentry.ndk.SentryNdk.loadNativeLibraries();
        } catch (Throwable unused) {
        }
        loadLibraryLatch.countDown();
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        serializer.write(sentryAndroidOptions.getSdkVersion());
        try {
            if (!loadLibraryLatch.await(ConstantKt.DEFAULT_REQUEST_TIMEOUT, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            String dsn = sentryAndroidOptions.getDsn();
            setNativeShader.read(dsn, "DSN is required for sentry-ndk");
            boolean zIsDebug = sentryAndroidOptions.isDebug();
            String outboxPath = sentryAndroidOptions.getOutboxPath();
            setNativeShader.read(outboxPath, "outbox path is required for sentry-ndk");
            NdkOptions ndkOptions = new NdkOptions(dsn, zIsDebug, outboxPath, sentryAndroidOptions.getRelease(), sentryAndroidOptions.getEnvironment(), sentryAndroidOptions.getDist(), sentryAndroidOptions.getMaxBreadcrumbs(), sentryAndroidOptions.getNativeSdkName());
            int ndkHandlerStrategy = sentryAndroidOptions.getNdkHandlerStrategy();
            if (ndkHandlerStrategy == getSavedStateRegistryControllerannotations.SENTRY_HANDLER_STRATEGY_DEFAULT.getValue()) {
                ndkOptions.setNdkHandlerStrategy(RemoteActionCompatParcelizer.SENTRY_HANDLER_STRATEGY_DEFAULT);
            } else if (ndkHandlerStrategy == getSavedStateRegistryControllerannotations.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START.getValue()) {
                ndkOptions.setNdkHandlerStrategy(RemoteActionCompatParcelizer.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START);
            }
            Double tracesSampleRate = sentryAndroidOptions.getTracesSampleRate();
            if (tracesSampleRate == null) {
                ndkOptions.setTracesSampleRate(0.0f);
            } else {
                ndkOptions.setTracesSampleRate(tracesSampleRate.floatValue());
            }
            io.sentry.ndk.SentryNdk.init(ndkOptions);
            if (sentryAndroidOptions.isEnableScopeSync()) {
                sentryAndroidOptions.addScopeObserver(new read(sentryAndroidOptions));
            }
            sentryAndroidOptions.setDebugImagesLoader(new write(sentryAndroidOptions, new io.sentry.ndk.read()));
        } catch (InterruptedException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Thread interrupted while waiting for NDK libs to be loaded", e);
        }
    }
}
