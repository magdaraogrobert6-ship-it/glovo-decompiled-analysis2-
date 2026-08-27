package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
public class RouterFactory implements RouterFactoryInterface {
    protected long peer;

    public static class RouterFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouterFactory.cleanNativePeer(this.peer);
        }

        public RouterFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    @Deprecated
    public static native RouterInterface build(RouterType routerType, CacheHandle cacheHandle, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle);

    public static native RouterInterface build(RouterType routerType, TilesManagerHandle tilesManagerHandle, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle);

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouterFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RouterFactoryPeerCleaner(j));
    }
}
