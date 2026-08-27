package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class CacheHandle implements CacheHandleInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class CacheHandlePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CacheHandle.cleanNativePeer(this.peer);
        }

        public CacheHandlePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.CacheHandleInterface
    public native Cancelable getCurrentHDGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback);

    @Override // com.mapbox.navigator.CacheHandleInterface
    public native Cancelable getCurrentRoadGraphVersionInfo(RoadGraphVersionInfoCallback roadGraphVersionInfoCallback);

    @Override // com.mapbox.navigator.CacheHandleInterface
    public native Cancelable isHDGraphDataUpdateAvailable(RoadGraphUpdateAvailabilityCallback roadGraphUpdateAvailabilityCallback);

    @Override // com.mapbox.navigator.CacheHandleInterface
    public native Cancelable isRoadGraphDataUpdateAvailable(RoadGraphUpdateAvailabilityCallback roadGraphUpdateAvailabilityCallback);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CacheHandle(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new CacheHandlePeerCleaner(j));
    }
}
