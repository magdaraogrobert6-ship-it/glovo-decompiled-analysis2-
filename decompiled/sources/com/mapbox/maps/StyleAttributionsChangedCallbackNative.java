package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StyleAttributionsChangedCallbackNative implements StyleAttributionsChangedCallback {
    private long peer;

    public static class StyleAttributionsChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StyleAttributionsChangedCallbackNative.cleanNativePeer(this.peer);
        }

        public StyleAttributionsChangedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StyleAttributionsChangedCallback
    public native void run(StyleAttributionsChanged styleAttributionsChanged);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StyleAttributionsChangedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleAttributionsChangedCallbackPeerCleaner(j));
    }
}
