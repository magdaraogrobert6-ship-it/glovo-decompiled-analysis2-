package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class VoidCallbackNative implements VoidCallback {
    private long peer;

    public static class VoidCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            VoidCallbackNative.cleanNativePeer(this.peer);
        }

        public VoidCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.VoidCallback
    public native void run();

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private VoidCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new VoidCallbackPeerCleaner(j));
    }
}
