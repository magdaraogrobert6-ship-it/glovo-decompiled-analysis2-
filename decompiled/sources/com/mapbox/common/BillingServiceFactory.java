package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class BillingServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BillingServiceFactory.cleanNativePeer(this.peer);
        }

        public BillingServiceFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native BillingService getInstance();

    private static native void nativeSelfRegister();

    public static native void reset();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public BillingServiceFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BillingServiceFactoryPeerCleaner(j));
    }
}
