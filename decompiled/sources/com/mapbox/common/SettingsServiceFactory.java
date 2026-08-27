package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class SettingsServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SettingsServiceFactory.cleanNativePeer(this.peer);
        }

        public SettingsServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native SettingsService getInstance(SettingsServiceStorageType settingsServiceStorageType);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SettingsServiceFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SettingsServiceFactoryPeerCleaner(j));
    }
}
