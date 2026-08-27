package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class OfflineDatabaseMergeCallbackNative implements OfflineDatabaseMergeCallback {
    private long peer;

    public static class OfflineDatabaseMergeCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineDatabaseMergeCallbackNative.cleanNativePeer(this.peer);
        }

        public OfflineDatabaseMergeCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.OfflineDatabaseMergeCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private OfflineDatabaseMergeCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OfflineDatabaseMergeCallbackPeerCleaner(j));
    }
}
