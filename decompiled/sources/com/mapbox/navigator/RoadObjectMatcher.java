package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RoadObjectMatcher implements RoadObjectMatcherInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class RoadObjectMatcherPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectMatcher.cleanNativePeer(this.peer);
        }

        public RoadObjectMatcherPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(CacheHandle cacheHandle);

    private native void initialize(CacheHandle cacheHandle, RoadObjectMatcherConfig roadObjectMatcherConfig);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void cancel(List<String> list);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void cancelAll();

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchGantries(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchOpenLRs(List<MatchableOpenLr> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchPoints(List<MatchablePoint> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchPolygons(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void matchPolylines(List<MatchableGeometry> list, MatchingOptions matchingOptions);

    @Override // com.mapbox.navigator.RoadObjectMatcherInterface
    public native void setListener(RoadObjectMatcherListener roadObjectMatcherListener);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RoadObjectMatcher(CacheHandle cacheHandle) {
        initialize(cacheHandle);
    }

    public RoadObjectMatcher(CacheHandle cacheHandle, RoadObjectMatcherConfig roadObjectMatcherConfig) {
        initialize(cacheHandle, roadObjectMatcherConfig);
    }

    public RoadObjectMatcher(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RoadObjectMatcherPeerCleaner(j));
    }
}
