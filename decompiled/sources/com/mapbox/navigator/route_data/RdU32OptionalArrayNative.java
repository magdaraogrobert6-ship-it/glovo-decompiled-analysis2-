package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class RdU32OptionalArrayNative implements RdU32OptionalArray {
    protected long peer;

    public static class RdU32OptionalArrayPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdU32OptionalArrayNative.cleanNativePeer(this.peer);
        }

        public RdU32OptionalArrayPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdU32OptionalArray
    public native Integer get(long j);

    @Override // com.mapbox.navigator.route_data.RdU32OptionalArray
    public native long size();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdU32OptionalArrayNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdU32OptionalArrayPeerCleaner(j));
    }
}
