package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class OfflineRegion {
    protected long peer;

    public static class OfflineRegionPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegion.cleanNativePeer(this.peer);
        }

        public OfflineRegionPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native OfflineRegionGeometryDefinition getGeometryDefinition();

    public native long getIdentifier();

    public native byte[] getMetadata();

    public native void getStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    public native OfflineRegionTilePyramidDefinition getTilePyramidDefinition();

    public native void invalidate(AsyncOperationResultCallback asyncOperationResultCallback);

    public native void purge(AsyncOperationResultCallback asyncOperationResultCallback);

    public native void setMetadata(byte[] bArr, AsyncOperationResultCallback asyncOperationResultCallback);

    public native void setOfflineRegionDownloadState(OfflineRegionDownloadState offlineRegionDownloadState);

    public native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public OfflineRegion(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new OfflineRegionPeerCleaner(j));
    }
}
