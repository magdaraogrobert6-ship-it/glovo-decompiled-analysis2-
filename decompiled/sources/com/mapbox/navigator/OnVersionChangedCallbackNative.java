package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class OnVersionChangedCallbackNative implements OnVersionChangedCallback {
    private long peer;

    public static class OnVersionChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OnVersionChangedCallbackNative.cleanNativePeer(this.peer);
        }

        public OnVersionChangedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.OnVersionChangedCallback
    public native void run(RoadGraphVersionInfo roadGraphVersionInfo);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private OnVersionChangedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OnVersionChangedCallbackPeerCleaner(j));
    }
}
