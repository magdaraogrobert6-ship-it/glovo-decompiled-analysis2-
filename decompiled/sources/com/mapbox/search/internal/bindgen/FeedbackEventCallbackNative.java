package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class FeedbackEventCallbackNative implements FeedbackEventCallback {
    private long peer;

    public static class FeedbackEventCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            FeedbackEventCallbackNative.cleanNativePeer(this.peer);
        }

        public FeedbackEventCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.FeedbackEventCallback
    public native void run(String str);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private FeedbackEventCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new FeedbackEventCallbackPeerCleaner(j));
    }
}
