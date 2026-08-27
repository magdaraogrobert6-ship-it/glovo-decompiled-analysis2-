package com.mapbox.common.experimental;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class NetworkStatusUpdaterFactory {
    protected long peer;

    public static class NetworkStatusUpdaterFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            NetworkStatusUpdaterFactory.cleanNativePeer(this.peer);
        }

        public NetworkStatusUpdaterFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native NetworkStatusUpdater getInstance();

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public NetworkStatusUpdaterFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new NetworkStatusUpdaterFactoryPeerCleaner(j));
    }
}
