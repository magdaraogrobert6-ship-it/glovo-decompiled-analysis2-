package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkInfoRegistryFactory implements SdkInfoRegistryFactoryInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class SdkInfoRegistryFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SdkInfoRegistryFactory.cleanNativePeer(this.peer);
        }

        public SdkInfoRegistryFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native SdkInfoRegistry getInstance();

    private static native void nativeSelfRegister();

    public static native void reset();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SdkInfoRegistryFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SdkInfoRegistryFactoryPeerCleaner(j));
    }
}
