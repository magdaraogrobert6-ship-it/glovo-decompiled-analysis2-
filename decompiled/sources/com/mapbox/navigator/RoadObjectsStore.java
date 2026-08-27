package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RoadObjectsStore implements RoadObjectsStoreInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class RoadObjectsStorePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectsStore.cleanNativePeer(this.peer);
        }

        public RoadObjectsStorePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native Cancelable addCustomRoadObject(UnmatchedRoadObject unmatchedRoadObject, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    @Deprecated
    public native void addCustomRoadObject(RoadObject roadObject);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void addObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native HashMap<String, RoadObjectEdgeLocation> get(long j);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native RoadObject getRoadObject(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native List<String> getRoadObjectIdsByEdgeIds(List<Long> list);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native boolean hasObservers();

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeAllCustomRoadObjects();

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeCustomRoadObject(String str);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeCustomRoadObjects(List<String> list);

    @Override // com.mapbox.navigator.RoadObjectsStoreInterface
    public native void removeObserver(RoadObjectsStoreObserver roadObjectsStoreObserver);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RoadObjectsStore(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RoadObjectsStorePeerCleaner(j));
    }
}
