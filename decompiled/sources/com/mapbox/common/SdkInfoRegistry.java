package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkInfoRegistry implements SdkInfoRegistryInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class SdkInfoRegistryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SdkInfoRegistry.cleanNativePeer(this.peer);
        }

        public SdkInfoRegistryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native List<SdkInformation> getSdkInformation();

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native void registerSdkInformation(SdkInformation sdkInformation);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SdkInfoRegistry(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SdkInfoRegistryPeerCleaner(j));
    }
}
