package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class OfflineIndexObserverNative implements OfflineIndexObserver {
    protected long peer;

    public static class OfflineIndexObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineIndexObserverNative.cleanNativePeer(this.peer);
        }

        public OfflineIndexObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.OfflineIndexObserver
    public native void onError(OfflineIndexError offlineIndexError);

    @Override // com.mapbox.search.internal.bindgen.OfflineIndexObserver
    public native void onIndexChanged(OfflineIndexChangeEvent offlineIndexChangeEvent);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineIndexObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineIndexObserverPeerCleaner(j));
    }
}
