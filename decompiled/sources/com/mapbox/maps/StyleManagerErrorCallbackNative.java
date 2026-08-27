package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StyleManagerErrorCallbackNative implements StyleManagerErrorCallback {
    private long peer;

    public static class StyleManagerErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerErrorCallbackNative.cleanNativePeer(this.peer);
        }

        public StyleManagerErrorCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StyleManagerErrorCallback
    public native void run(StyleManager styleManager, MapLoadingError mapLoadingError);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StyleManagerErrorCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleManagerErrorCallbackPeerCleaner(j));
    }
}
