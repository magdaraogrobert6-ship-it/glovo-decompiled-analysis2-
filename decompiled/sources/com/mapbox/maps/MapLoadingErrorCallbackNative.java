package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class MapLoadingErrorCallbackNative implements MapLoadingErrorCallback {
    private long peer;

    public static class MapLoadingErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapLoadingErrorCallbackNative.cleanNativePeer(this.peer);
        }

        public MapLoadingErrorCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public native void run(MapLoadingError mapLoadingError);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private MapLoadingErrorCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MapLoadingErrorCallbackPeerCleaner(j));
    }
}
