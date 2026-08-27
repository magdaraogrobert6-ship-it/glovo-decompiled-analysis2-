package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class QueryFeatureStateCallbackNative implements QueryFeatureStateCallback {
    private long peer;

    public static class QueryFeatureStateCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureStateCallbackNative.cleanNativePeer(this.peer);
        }

        public QueryFeatureStateCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public native void run(Expected<String, Value> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private QueryFeatureStateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QueryFeatureStateCallbackPeerCleaner(j));
    }
}
