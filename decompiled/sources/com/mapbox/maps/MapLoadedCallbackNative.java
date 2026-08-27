package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class MapLoadedCallbackNative implements MapLoadedCallback {
    private long peer;

    public static class MapLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapLoadedCallbackNative.cleanNativePeer(this.peer);
        }

        public MapLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.MapLoadedCallback
    public native void run(MapLoaded mapLoaded);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private MapLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MapLoadedCallbackPeerCleaner(j));
    }
}
