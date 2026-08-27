package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class GenericEventCallbackNative implements GenericEventCallback {
    private long peer;

    public static class GenericEventCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            GenericEventCallbackNative.cleanNativePeer(this.peer);
        }

        public GenericEventCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.GenericEventCallback
    public native void run(GenericEvent genericEvent);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private GenericEventCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GenericEventCallbackPeerCleaner(j));
    }
}
