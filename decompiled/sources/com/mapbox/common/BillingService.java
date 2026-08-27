package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class BillingService {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class BillingServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            BillingService.cleanNativePeer(this.peer);
        }

        public BillingServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native void beginBillingSession(SdkInformation sdkInformation, SessionSKUIdentifier sessionSKUIdentifier, OnBillingServiceError onBillingServiceError, long j);

    public native String getSessionSKUTokenIfValid(SessionSKUIdentifier sessionSKUIdentifier);

    public native BillingSessionStatus getSessionStatus(SessionSKUIdentifier sessionSKUIdentifier);

    public native String getUserSKUToken(UserSKUIdentifier userSKUIdentifier);

    public native void pauseBillingSession(SessionSKUIdentifier sessionSKUIdentifier);

    public native void resumeBillingSession(SessionSKUIdentifier sessionSKUIdentifier, OnBillingServiceError onBillingServiceError);

    public native void stopBillingSession(SessionSKUIdentifier sessionSKUIdentifier);

    public native void triggerMaploadBillingEvent(MaploadSKUIdentifier maploadSKUIdentifier, OnBillingServiceError onBillingServiceError);

    public native void triggerUserBillingEvent(SdkInformation sdkInformation, UserSKUIdentifier userSKUIdentifier, OnBillingServiceError onBillingServiceError);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public BillingService(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BillingServicePeerCleaner(j));
    }
}
