package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class IMUUpdateCallbackNative implements IMUUpdateCallback {
    private long peer;

    public static class IMUUpdateCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            IMUUpdateCallbackNative.cleanNativePeer(this.peer);
        }

        public IMUUpdateCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.IMUUpdateCallback
    public native void run(MotionData motionData);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private IMUUpdateCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new IMUUpdateCallbackPeerCleaner(j));
    }
}
