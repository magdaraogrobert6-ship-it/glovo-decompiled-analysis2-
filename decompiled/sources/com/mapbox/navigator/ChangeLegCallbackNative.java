package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class ChangeLegCallbackNative implements ChangeLegCallback {
    private long peer;

    public static class ChangeLegCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ChangeLegCallbackNative.cleanNativePeer(this.peer);
        }

        public ChangeLegCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.ChangeLegCallback, com.mapbox.navigator.UpdateLocationCallback
    public native void run(boolean z);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ChangeLegCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ChangeLegCallbackPeerCleaner(j));
    }
}
