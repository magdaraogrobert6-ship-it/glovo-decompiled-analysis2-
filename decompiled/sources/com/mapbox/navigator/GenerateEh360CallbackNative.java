package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class GenerateEh360CallbackNative implements GenerateEh360Callback {
    private long peer;

    public static class GenerateEh360CallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            GenerateEh360CallbackNative.cleanNativePeer(this.peer);
        }

        public GenerateEh360CallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.GenerateEh360Callback
    public native void run(ElectronicHorizon360Graph electronicHorizon360Graph);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private GenerateEh360CallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GenerateEh360CallbackPeerCleaner(j));
    }
}
