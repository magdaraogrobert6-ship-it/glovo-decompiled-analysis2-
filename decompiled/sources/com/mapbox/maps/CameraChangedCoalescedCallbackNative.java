package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@com.mapbox.annotation.MapboxExperimental
final class CameraChangedCoalescedCallbackNative implements CameraChangedCoalescedCallback {
    private long peer;

    public static class CameraChangedCoalescedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCoalescedCallbackNative.cleanNativePeer(this.peer);
        }

        public CameraChangedCoalescedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public native void run(CameraChangedCoalesced cameraChangedCoalesced);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private CameraChangedCoalescedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CameraChangedCoalescedCallbackPeerCleaner(j));
    }
}
