package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class DumpHistoryCallbackNative implements DumpHistoryCallback {
    private long peer;

    public static class DumpHistoryCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            DumpHistoryCallbackNative.cleanNativePeer(this.peer);
        }

        public DumpHistoryCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.DumpHistoryCallback
    public native void run(String str);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private DumpHistoryCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DumpHistoryCallbackPeerCleaner(j));
    }
}
