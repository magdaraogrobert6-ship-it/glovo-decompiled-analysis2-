package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RouterRefreshCallbackNative implements RouterRefreshCallback {
    private long peer;

    public static class RouterRefreshCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouterRefreshCallbackNative.cleanNativePeer(this.peer);
        }

        public RouterRefreshCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouterRefreshCallback
    public native void run(Expected<List<RouterError>, DataRef> expected, RouterOrigin routerOrigin, HashMap<String, String> map);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RouterRefreshCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouterRefreshCallbackPeerCleaner(j));
    }
}
