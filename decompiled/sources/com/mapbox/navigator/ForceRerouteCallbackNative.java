package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class ForceRerouteCallbackNative implements ForceRerouteCallback {
    private long peer;

    public static class ForceRerouteCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ForceRerouteCallbackNative.cleanNativePeer(this.peer);
        }

        public ForceRerouteCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.ForceRerouteCallback
    public native void run(Expected<RerouteError, RerouteInfo> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ForceRerouteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ForceRerouteCallbackPeerCleaner(j));
    }
}
