package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryNdk {
    private static volatile boolean nativeLibrariesLoaded;

    private SentryNdk() {
    }

    private static native void initSentryNative(NdkOptions ndkOptions);

    private static native void shutdown();

    public static void loadNativeLibraries() {
        synchronized (SentryNdk.class) {
            if (!nativeLibrariesLoaded) {
                System.loadLibrary("log");
                System.loadLibrary("sentry");
                System.loadLibrary("sentry-android");
                nativeLibrariesLoaded = true;
            }
        }
    }

    public static void close() {
        loadNativeLibraries();
        shutdown();
    }

    public static void init(NdkOptions ndkOptions) {
        loadNativeLibraries();
        initSentryNative(ndkOptions);
    }
}
