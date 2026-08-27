package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class SourceRemovedCallbackNative implements SourceRemovedCallback {
    private long peer;

    public static class SourceRemovedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SourceRemovedCallbackNative.cleanNativePeer(this.peer);
        }

        public SourceRemovedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.SourceRemovedCallback
    public native void run(SourceRemoved sourceRemoved);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SourceRemovedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SourceRemovedCallbackPeerCleaner(j));
    }
}
