package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class SourceAddedCallbackNative implements SourceAddedCallback {
    private long peer;

    public static class SourceAddedCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SourceAddedCallbackNative.cleanNativePeer(this.peer);
        }

        public SourceAddedCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.SourceAddedCallback
    public native void run(SourceAdded sourceAdded);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private SourceAddedCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SourceAddedCallbackPeerCleaner(j));
    }
}
