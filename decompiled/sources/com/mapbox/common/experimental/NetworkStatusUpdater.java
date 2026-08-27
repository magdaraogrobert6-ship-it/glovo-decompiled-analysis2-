package com.mapbox.common.experimental;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class NetworkStatusUpdater {
    protected long peer;

    public static class NetworkStatusUpdaterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            NetworkStatusUpdater.cleanNativePeer(this.peer);
        }

        public NetworkStatusUpdaterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @MapboxExperimental
    public native void updateNetworkStatus(NetworkStatusUpdate networkStatusUpdate);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public NetworkStatusUpdater(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new NetworkStatusUpdaterPeerCleaner(j));
    }
}
