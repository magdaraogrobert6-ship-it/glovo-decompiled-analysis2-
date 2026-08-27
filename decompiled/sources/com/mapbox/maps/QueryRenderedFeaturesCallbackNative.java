package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class QueryRenderedFeaturesCallbackNative implements QueryRenderedFeaturesCallback {
    private long peer;

    public static class QueryRenderedFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            QueryRenderedFeaturesCallbackNative.cleanNativePeer(this.peer);
        }

        public QueryRenderedFeaturesCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public native void run(Expected<String, List<QueriedRenderedFeature>> expected);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private QueryRenderedFeaturesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new QueryRenderedFeaturesCallbackPeerCleaner(j));
    }
}
