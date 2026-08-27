package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RenderFrameStartedCallbackNative implements RenderFrameStartedCallback {
    private long peer;

    public static class RenderFrameStartedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameStartedCallbackNative.cleanNativePeer(this.peer);
        }

        public RenderFrameStartedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public native void run(RenderFrameStarted renderFrameStarted);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RenderFrameStartedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RenderFrameStartedCallbackPeerCleaner(j));
    }
}
