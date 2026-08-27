package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class QueryFeatureExtensionCallbackNative implements QueryFeatureExtensionCallback {
    private long peer;

    public static class QueryFeatureExtensionCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureExtensionCallbackNative.cleanNativePeer(this.peer);
        }

        public QueryFeatureExtensionCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.QueryFeatureExtensionCallback
    public native void run(Expected<String, FeatureExtensionValue> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private QueryFeatureExtensionCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QueryFeatureExtensionCallbackPeerCleaner(j));
    }
}
