package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class CacheFactory implements CacheFactoryInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class CacheFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CacheFactory.cleanNativePeer(this.peer);
        }

        public CacheFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native CacheHandle build(TilesConfig tilesConfig, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle, BillingProductType billingProductType);

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CacheFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new CacheFactoryPeerCleaner(j));
    }
}
