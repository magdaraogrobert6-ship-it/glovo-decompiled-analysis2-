package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class ConfigurationServiceObserverNative implements ConfigurationServiceObserver {
    protected long peer;

    public static class ConfigurationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceObserverNative.cleanNativePeer(this.peer);
        }

        public ConfigurationServiceObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didEncounterError(ConfigurationServiceError configurationServiceError);

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didStartUpdate();

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didUpdate(ConfigurationOptions configurationOptions);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ConfigurationServiceObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ConfigurationServiceObserverPeerCleaner(j));
    }
}
