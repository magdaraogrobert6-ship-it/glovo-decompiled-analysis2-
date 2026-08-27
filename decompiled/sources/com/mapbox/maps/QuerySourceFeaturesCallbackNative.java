package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class QuerySourceFeaturesCallbackNative implements QuerySourceFeaturesCallback {
    private long peer;

    public static class QuerySourceFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            QuerySourceFeaturesCallbackNative.cleanNativePeer(this.peer);
        }

        public QuerySourceFeaturesCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.QuerySourceFeaturesCallback
    public native void run(Expected<String, List<QueriedSourceFeature>> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private QuerySourceFeaturesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QuerySourceFeaturesCallbackPeerCleaner(j));
    }
}
