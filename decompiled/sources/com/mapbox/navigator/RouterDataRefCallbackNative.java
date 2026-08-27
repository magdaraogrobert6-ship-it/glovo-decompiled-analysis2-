package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RouterDataRefCallbackNative implements RouterDataRefCallback {
    private long peer;

    public static class RouterDataRefCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouterDataRefCallbackNative.cleanNativePeer(this.peer);
        }

        public RouterDataRefCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouterDataRefCallback
    public native void run(Expected<List<RouterError>, DataRef> expected, RouterOrigin routerOrigin);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private RouterDataRefCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouterDataRefCallbackPeerCleaner(j));
    }
}
