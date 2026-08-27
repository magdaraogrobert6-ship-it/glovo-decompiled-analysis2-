package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StyleLoadedCallbackNative implements StyleLoadedCallback {
    private long peer;

    public static class StyleLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StyleLoadedCallbackNative.cleanNativePeer(this.peer);
        }

        public StyleLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StyleLoadedCallback
    public native void run(StyleLoaded styleLoaded);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StyleLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleLoadedCallbackPeerCleaner(j));
    }
}
