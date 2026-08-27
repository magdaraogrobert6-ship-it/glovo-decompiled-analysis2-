package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class QueryRenderedRasterValuesCallbackNative implements QueryRenderedRasterValuesCallback {
    private long peer;

    public static class QueryRenderedRasterValuesCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            QueryRenderedRasterValuesCallbackNative.cleanNativePeer(this.peer);
        }

        public QueryRenderedRasterValuesCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.QueryRenderedRasterValuesCallback
    public native void run(Expected<String, QueriedRasterValues> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private QueryRenderedRasterValuesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QueryRenderedRasterValuesCallbackPeerCleaner(j));
    }
}
