package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class StylePacksCallbackNative implements StylePacksCallback {
    private long peer;

    public static class StylePacksCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StylePacksCallbackNative.cleanNativePeer(this.peer);
        }

        public StylePacksCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StylePacksCallback
    public native void run(Expected<StylePackError, List<StylePack>> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StylePacksCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePacksCallbackPeerCleaner(j));
    }
}
