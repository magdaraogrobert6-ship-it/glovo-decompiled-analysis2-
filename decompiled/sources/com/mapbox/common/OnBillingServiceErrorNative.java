package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class OnBillingServiceErrorNative implements OnBillingServiceError {
    private long peer;

    public static class OnBillingServiceErrorPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OnBillingServiceErrorNative.cleanNativePeer(this.peer);
        }

        public OnBillingServiceErrorPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.OnBillingServiceError
    public native void run(BillingServiceError billingServiceError);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private OnBillingServiceErrorNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OnBillingServiceErrorPeerCleaner(j));
    }
}
