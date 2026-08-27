package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.common.TileDataDomain;
import com.mapbox.common.TilesetDescriptor;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TilesManagerHandle implements TilesManagerHandleInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class TilesManagerHandlePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TilesManagerHandle.cleanNativePeer(this.peer);
        }

        public TilesManagerHandlePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native TilesManagerHandle build(TilesConfig tilesConfig, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle, BillingProductType billingProductType);

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public static native TilesetDescriptor tilesetDescriptor(String str, String str2, List<TileDataDomain> list);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native void addOfflineCache(TilesConfig tilesConfig, ConfigHandle configHandle, HistoryRecorderHandle historyRecorderHandle, BillingProductType billingProductType);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native Cancelable checkHDUpdateAvailable(TilesUpdateAvailabilityCallback tilesUpdateAvailabilityCallback);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native Cancelable checkUpdateAvailable(TilesUpdateAvailabilityCallback tilesUpdateAvailabilityCallback);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native Cancelable currentHDVersion(CurrentTilesVersionCallback currentTilesVersionCallback);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native Cancelable currentVersion(CurrentTilesVersionCallback currentTilesVersionCallback);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native void pinHDVersion(String str);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native void pinVersion(String str);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native void subscribeOnHDVersionChanged(OnVersionChangedCallback onVersionChangedCallback);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native void subscribeOnVersionChanged(OnVersionChangedCallback onVersionChangedCallback);

    @Override // com.mapbox.navigator.TilesManagerHandleInterface
    public native TilesetDescriptor tilesetDescriptor(List<TileDataDomain> list);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TilesManagerHandle(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TilesManagerHandlePeerCleaner(j));
    }
}
