package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class SetAlternativeRoutesCallbackNative implements SetAlternativeRoutesCallback {
    private long peer;

    public static class SetAlternativeRoutesCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SetAlternativeRoutesCallbackNative.cleanNativePeer(this.peer);
        }

        public SetAlternativeRoutesCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.SetAlternativeRoutesCallback, com.mapbox.navigator.SetRouteCallback
    public native void run(Expected<String, List<RouteAlternative>> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SetAlternativeRoutesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SetAlternativeRoutesCallbackPeerCleaner(j));
    }
}
