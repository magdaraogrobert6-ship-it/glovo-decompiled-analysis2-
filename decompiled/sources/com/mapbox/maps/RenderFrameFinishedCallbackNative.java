package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RenderFrameFinishedCallbackNative implements RenderFrameFinishedCallback {
    private long peer;

    public static class RenderFrameFinishedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameFinishedCallbackNative.cleanNativePeer(this.peer);
        }

        public RenderFrameFinishedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public native void run(RenderFrameFinished renderFrameFinished);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RenderFrameFinishedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RenderFrameFinishedCallbackPeerCleaner(j));
    }
}
