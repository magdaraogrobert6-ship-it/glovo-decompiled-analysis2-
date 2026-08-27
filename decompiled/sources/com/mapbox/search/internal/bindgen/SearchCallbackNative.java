package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class SearchCallbackNative implements SearchCallback {
    private long peer;

    public static class SearchCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SearchCallbackNative.cleanNativePeer(this.peer);
        }

        public SearchCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.SearchCallback
    public native void run(SearchResponse searchResponse);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SearchCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SearchCallbackPeerCleaner(j));
    }
}
