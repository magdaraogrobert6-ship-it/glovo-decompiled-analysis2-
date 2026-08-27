package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
public class PlatformStreamFactory {
    protected long peer;

    public static class PlatformStreamFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PlatformStreamFactory.cleanNativePeer(this.peer);
        }

        public PlatformStreamFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native ReadStream fileReadStream(String str);

    public static native ReadStream memoryReadStream(String str);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PlatformStreamFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new PlatformStreamFactoryPeerCleaner(j));
    }
}
