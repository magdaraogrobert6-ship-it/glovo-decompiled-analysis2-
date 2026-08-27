package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StylePackMetadataCallbackNative implements StylePackMetadataCallback {
    private long peer;

    public static class StylePackMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StylePackMetadataCallbackNative.cleanNativePeer(this.peer);
        }

        public StylePackMetadataCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StylePackMetadataCallback
    public native void run(Expected<StylePackError, Value> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StylePackMetadataCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StylePackMetadataCallbackPeerCleaner(j));
    }
}
