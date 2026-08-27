package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class ResourceLoadResultCallbackNative implements ResourceLoadResultCallback {
    private long peer;

    public static class ResourceLoadResultCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadResultCallbackNative.cleanNativePeer(this.peer);
        }

        public ResourceLoadResultCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ResourceLoadResultCallback
    public native void run(Expected<ResourceLoadError, ResourceLoadResult> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ResourceLoadResultCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResourceLoadResultCallbackPeerCleaner(j));
    }
}
