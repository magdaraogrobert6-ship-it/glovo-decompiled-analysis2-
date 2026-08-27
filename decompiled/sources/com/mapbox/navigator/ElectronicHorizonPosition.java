package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes3.dex */
public class ElectronicHorizonPosition implements ElectronicHorizonPositionInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class ElectronicHorizonPositionPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ElectronicHorizonPosition.cleanNativePeer(this.peer);
        }

        public ElectronicHorizonPositionPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.ElectronicHorizonPositionInterface
    public native GraphPosition position();

    @Override // com.mapbox.navigator.ElectronicHorizonPositionInterface
    public native ElectronicHorizon tree();

    @Override // com.mapbox.navigator.ElectronicHorizonPositionInterface
    public native ElectronicHorizonResultType type();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ElectronicHorizonPosition(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ElectronicHorizonPositionPeerCleaner(j));
    }
}
