package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
public final class ConfigurationService {
    protected long peer;

    public static class ConfigurationServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationService.cleanNativePeer(this.peer);
        }

        public ConfigurationServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native ConfigurationService getOrCreate(EventsServerOptions eventsServerOptions);

    private static native void nativeSelfRegister();

    public native void getConfig(ConfigurationServiceGetConfigCallback configurationServiceGetConfigCallback);

    public native void registerObserver(ConfigurationServiceObserver configurationServiceObserver);

    public native void unregisterObserver(ConfigurationServiceObserver configurationServiceObserver);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ConfigurationService(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ConfigurationServicePeerCleaner(j));
    }
}
