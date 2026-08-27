package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class SetRouteCallbackNative implements SetRouteCallback {
    private long peer;

    public static class SetRouteCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SetRouteCallbackNative.cleanNativePeer(this.peer);
        }

        public SetRouteCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.SetRouteCallback
    public native void run(Expected<String, SetRoutesResult> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SetRouteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SetRouteCallbackPeerCleaner(j));
    }
}
