package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StyleImageRemoveUnusedCallbackNative implements StyleImageRemoveUnusedCallback {
    private long peer;

    public static class StyleImageRemoveUnusedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StyleImageRemoveUnusedCallbackNative.cleanNativePeer(this.peer);
        }

        public StyleImageRemoveUnusedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public native void run(StyleImageRemoveUnused styleImageRemoveUnused);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StyleImageRemoveUnusedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleImageRemoveUnusedCallbackPeerCleaner(j));
    }
}
