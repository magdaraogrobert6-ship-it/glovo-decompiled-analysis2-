package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RouteParserCallbackNative implements RouteParserCallback {
    private long peer;

    public static class RouteParserCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteParserCallbackNative.cleanNativePeer(this.peer);
        }

        public RouteParserCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteParserCallback
    public native void run(Expected<String, List<RouteInterface>> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RouteParserCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteParserCallbackPeerCleaner(j));
    }
}
