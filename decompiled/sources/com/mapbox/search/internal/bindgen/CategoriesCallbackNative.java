package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class CategoriesCallbackNative implements CategoriesCallback {
    private long peer;

    public static class CategoriesCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CategoriesCallbackNative.cleanNativePeer(this.peer);
        }

        public CategoriesCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.CategoriesCallback
    public native void run(Expected<Error, List<Category>> expected);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private CategoriesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CategoriesCallbackPeerCleaner(j));
    }
}
