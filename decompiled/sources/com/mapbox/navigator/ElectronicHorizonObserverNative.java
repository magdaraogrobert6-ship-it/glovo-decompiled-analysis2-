package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class ElectronicHorizonObserverNative implements ElectronicHorizonObserver {
    protected long peer;

    public static class ElectronicHorizonObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ElectronicHorizonObserverNative.cleanNativePeer(this.peer);
        }

        public ElectronicHorizonObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onPositionUpdated(ElectronicHorizonPosition electronicHorizonPosition, List<RoadObjectDistance> list);

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onRoadObjectEnter(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onRoadObjectExit(RoadObjectEnterExitInfo roadObjectEnterExitInfo);

    @Override // com.mapbox.navigator.ElectronicHorizonObserver
    public native void onRoadObjectPassed(RoadObjectPassInfo roadObjectPassInfo);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ElectronicHorizonObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ElectronicHorizonObserverPeerCleaner(j));
    }
}
