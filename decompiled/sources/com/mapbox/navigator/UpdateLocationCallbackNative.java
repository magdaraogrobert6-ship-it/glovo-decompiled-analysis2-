package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class UpdateLocationCallbackNative implements UpdateLocationCallback {
    private long peer;

    public static class UpdateLocationCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            UpdateLocationCallbackNative.cleanNativePeer(this.peer);
        }

        public UpdateLocationCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.UpdateLocationCallback
    public native void run(boolean z);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private UpdateLocationCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new UpdateLocationCallbackPeerCleaner(j));
    }
}
