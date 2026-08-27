package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class SourceDataLoadedCallbackNative implements SourceDataLoadedCallback {
    private long peer;

    public static class SourceDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SourceDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }

        public SourceDataLoadedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public native void run(SourceDataLoaded sourceDataLoaded);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SourceDataLoadedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SourceDataLoadedCallbackPeerCleaner(j));
    }
}
