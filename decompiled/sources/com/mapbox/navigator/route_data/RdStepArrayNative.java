package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdStepArrayNative implements RdStepArray {
    protected long peer;

    public static class RdStepArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdStepArrayNative.cleanNativePeer(this.peer);
        }

        public RdStepArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdStepArray
    public native RdStep get(long j);

    @Override // com.mapbox.navigator.route_data.RdStepArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdStepArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdStepArrayPeerCleaner(j));
    }
}
