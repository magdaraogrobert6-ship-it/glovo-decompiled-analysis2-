package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class FallbackVersionsObserverNative implements FallbackVersionsObserver {
    protected long peer;

    public static class FallbackVersionsObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            FallbackVersionsObserverNative.cleanNativePeer(this.peer);
        }

        public FallbackVersionsObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public native void onCanReturnToLatest(String str);

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public native void onFallbackVersionsFound(List<String> list);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public FallbackVersionsObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new FallbackVersionsObserverPeerCleaner(j));
    }
}
