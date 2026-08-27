package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class CameraChangedCallbackNative implements CameraChangedCallback {
    private long peer;

    public static class CameraChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCallbackNative.cleanNativePeer(this.peer);
        }

        public CameraChangedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.CameraChangedCallback
    public native void run(CameraChanged cameraChanged);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private CameraChangedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CameraChangedCallbackPeerCleaner(j));
    }
}
