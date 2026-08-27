package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigFactory implements ConfigFactoryInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class ConfigFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ConfigFactory.cleanNativePeer(this.peer);
        }

        public ConfigFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native ConfigHandle build(SettingsProfile settingsProfile, NavigatorConfig navigatorConfig, String str);

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ConfigFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ConfigFactoryPeerCleaner(j));
    }
}
