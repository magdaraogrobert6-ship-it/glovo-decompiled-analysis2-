package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class ResourceRequestCallbackNative implements ResourceRequestCallback {
    private long peer;

    public static class ResourceRequestCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ResourceRequestCallbackNative.cleanNativePeer(this.peer);
        }

        public ResourceRequestCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.ResourceRequestCallback
    public native void run(ResourceRequest resourceRequest);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ResourceRequestCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ResourceRequestCallbackPeerCleaner(j));
    }
}
