package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StyleManagerCallbackNative implements StyleManagerCallback {
    private long peer;

    public static class StyleManagerCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerCallbackNative.cleanNativePeer(this.peer);
        }

        public StyleManagerCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StyleManagerCallback
    public native void run(StyleManager styleManager);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StyleManagerCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleManagerCallbackPeerCleaner(j));
    }
}
