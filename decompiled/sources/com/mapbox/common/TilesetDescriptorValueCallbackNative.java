package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes5.dex */
final class TilesetDescriptorValueCallbackNative implements TilesetDescriptorValueCallback {
    private long peer;

    public static class TilesetDescriptorValueCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TilesetDescriptorValueCallbackNative.cleanNativePeer(this.peer);
        }

        public TilesetDescriptorValueCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.TilesetDescriptorValueCallback
    public native void run(Expected<String, Value> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private TilesetDescriptorValueCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new TilesetDescriptorValueCallbackPeerCleaner(j));
    }
}
