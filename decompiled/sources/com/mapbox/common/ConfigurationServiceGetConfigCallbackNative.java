package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class ConfigurationServiceGetConfigCallbackNative implements ConfigurationServiceGetConfigCallback {
    private long peer;

    public static class ConfigurationServiceGetConfigCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceGetConfigCallbackNative.cleanNativePeer(this.peer);
        }

        public ConfigurationServiceGetConfigCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ConfigurationServiceGetConfigCallback
    public native void run(Expected<ConfigurationServiceError, ConfigurationOptions> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ConfigurationServiceGetConfigCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ConfigurationServiceGetConfigCallbackPeerCleaner(j));
    }
}
