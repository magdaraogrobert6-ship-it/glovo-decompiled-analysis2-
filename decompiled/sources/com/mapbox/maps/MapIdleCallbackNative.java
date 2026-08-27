package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class MapIdleCallbackNative implements MapIdleCallback {
    private long peer;

    public static class MapIdleCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapIdleCallbackNative.cleanNativePeer(this.peer);
        }

        public MapIdleCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.MapIdleCallback
    public native void run(MapIdle mapIdle);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private MapIdleCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new MapIdleCallbackPeerCleaner(j));
    }
}
