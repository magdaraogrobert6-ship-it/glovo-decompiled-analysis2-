package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes4.dex */
public class TilesetDescriptor {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class TilesetDescriptorPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TilesetDescriptor.cleanNativePeer(this.peer);
        }

        public TilesetDescriptorPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native void toValue(TilesetDescriptorValueCallback tilesetDescriptorValueCallback);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TilesetDescriptor(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TilesetDescriptorPeerCleaner(j));
    }
}
