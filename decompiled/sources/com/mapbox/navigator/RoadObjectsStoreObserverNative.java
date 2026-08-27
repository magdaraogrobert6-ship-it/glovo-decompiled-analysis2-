package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RoadObjectsStoreObserverNative implements RoadObjectsStoreObserver {
    protected long peer;

    public static class RoadObjectsStoreObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectsStoreObserverNative.cleanNativePeer(this.peer);
        }

        public RoadObjectsStoreObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onCustomRoadObjectAddingCancelled(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onCustomRoadObjectMatched(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onCustomRoadObjectMatchingFailed(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onRoadObjectAdded(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onRoadObjectRemoved(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public native void onRoadObjectUpdated(String str);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RoadObjectsStoreObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadObjectsStoreObserverPeerCleaner(j));
    }
}
