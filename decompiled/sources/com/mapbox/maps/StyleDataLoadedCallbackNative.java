package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class StyleDataLoadedCallbackNative implements StyleDataLoadedCallback {
    private long peer;

    public static class StyleDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            StyleDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }

        public StyleDataLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public native void run(StyleDataLoaded styleDataLoaded);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private StyleDataLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new StyleDataLoadedCallbackPeerCleaner(j));
    }
}
