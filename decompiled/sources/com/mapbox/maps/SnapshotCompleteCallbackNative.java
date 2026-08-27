package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class SnapshotCompleteCallbackNative implements SnapshotCompleteCallback {
    private long peer;

    public static class SnapshotCompleteCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SnapshotCompleteCallbackNative.cleanNativePeer(this.peer);
        }

        public SnapshotCompleteCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.SnapshotCompleteCallback, com.mapbox.maps.QueryRenderedFeaturesCallback
    public native void run(Expected<String, MapSnapshot> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SnapshotCompleteCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SnapshotCompleteCallbackPeerCleaner(j));
    }
}
