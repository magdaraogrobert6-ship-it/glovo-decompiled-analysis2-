package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RouteOptionsAdapterNative implements RouteOptionsAdapter {
    protected long peer;

    public static class RouteOptionsAdapterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteOptionsAdapterNative.cleanNativePeer(this.peer);
        }

        public RouteOptionsAdapterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteOptionsAdapter
    public native String modifyRouteRequestOptions(String str);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteOptionsAdapterNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteOptionsAdapterPeerCleaner(j));
    }
}
