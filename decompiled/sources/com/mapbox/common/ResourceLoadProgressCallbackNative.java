package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class ResourceLoadProgressCallbackNative implements ResourceLoadProgressCallback {
    private long peer;

    public static class ResourceLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }

        public ResourceLoadProgressCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.ResourceLoadProgressCallback
    public native void run(ResourceLoadProgress resourceLoadProgress);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ResourceLoadProgressCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResourceLoadProgressCallbackPeerCleaner(j));
    }
}
