package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class AltimeterUpdateCallbackNative implements AltimeterUpdateCallback {
    private long peer;

    public static class AltimeterUpdateCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            AltimeterUpdateCallbackNative.cleanNativePeer(this.peer);
        }

        public AltimeterUpdateCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.AltimeterUpdateCallback
    public native void run(AltimeterData altimeterData);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private AltimeterUpdateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new AltimeterUpdateCallbackPeerCleaner(j));
    }
}
