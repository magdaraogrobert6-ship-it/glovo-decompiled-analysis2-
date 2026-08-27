package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes3.dex */
public class AdasisFacadeHandle implements AdasisFacadeHandleInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class AdasisFacadeHandlePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            AdasisFacadeHandle.cleanNativePeer(this.peer);
        }

        public AdasisFacadeHandlePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.AdasisFacadeHandleInterface
    public native void resetAdasisMessageCallback();

    @Override // com.mapbox.navigator.AdasisFacadeHandleInterface
    @MapboxExperimental
    public native void setAdasisMessageCallback(ADASISv2MessageCallback aDASISv2MessageCallback, AdasisConfig adasisConfig);

    @Override // com.mapbox.navigator.AdasisFacadeHandleInterface
    public native void triggerResetOfEhProvider();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public AdasisFacadeHandle(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new AdasisFacadeHandlePeerCleaner(j));
    }
}
