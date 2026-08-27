package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RefreshRouteCallbackNative implements RefreshRouteCallback {
    private long peer;

    public static class RefreshRouteCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RefreshRouteCallbackNative.cleanNativePeer(this.peer);
        }

        public RefreshRouteCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RefreshRouteCallback, com.mapbox.maps.QueryRenderedFeaturesCallback
    public native void run(Expected<String, RefreshRouteResult> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RefreshRouteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RefreshRouteCallbackPeerCleaner(j));
    }
}
