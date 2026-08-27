package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StylePackCallbackNative implements StylePackCallback {
    private long peer;

    public static class StylePackCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StylePackCallbackNative.cleanNativePeer(this.peer);
        }

        public StylePackCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StylePackCallback
    public native void run(Expected<StylePackError, StylePack> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StylePackCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePackCallbackPeerCleaner(j));
    }
}
