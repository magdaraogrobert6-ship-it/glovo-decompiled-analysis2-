package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StylePackLoadProgressCallbackNative implements StylePackLoadProgressCallback {
    private long peer;

    public static class StylePackLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StylePackLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }

        public StylePackLoadProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StylePackLoadProgressCallback
    public native void run(StylePackLoadProgress stylePackLoadProgress);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StylePackLoadProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePackLoadProgressCallbackPeerCleaner(j));
    }
}
