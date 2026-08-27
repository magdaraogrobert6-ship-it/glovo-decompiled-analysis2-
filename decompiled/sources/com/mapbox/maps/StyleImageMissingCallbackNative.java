package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StyleImageMissingCallbackNative implements StyleImageMissingCallback {
    private long peer;

    public static class StyleImageMissingCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StyleImageMissingCallbackNative.cleanNativePeer(this.peer);
        }

        public StyleImageMissingCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public native void run(StyleImageMissing styleImageMissing);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StyleImageMissingCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleImageMissingCallbackPeerCleaner(j));
    }
}
