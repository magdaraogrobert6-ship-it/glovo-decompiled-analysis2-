package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class ExperimentalNative implements Experimental {
    protected long peer;

    public static class ExperimentalPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ExperimentalNative.cleanNativePeer(this.peer);
        }

        public ExperimentalPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.Experimental
    @Deprecated
    public native void generateEh360(double d, GenerateEh360Callback generateEh360Callback);

    @Override // com.mapbox.navigator.Experimental
    @Deprecated
    public native void updateETCGateInfo(ETCGateInfo eTCGateInfo);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ExperimentalNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ExperimentalPeerCleaner(j));
    }
}
