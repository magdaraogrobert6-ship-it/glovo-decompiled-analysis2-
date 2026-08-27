package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class RoadObjectMatcherListenerNative implements RoadObjectMatcherListener {
    protected long peer;

    public static class RoadObjectMatcherListenerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoadObjectMatcherListenerNative.cleanNativePeer(this.peer);
        }

        public RoadObjectMatcherListenerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public native void onMatchingCancelled(String str);

    @Override // com.mapbox.navigator.RoadObjectMatcherListener
    public native void onRoadObjectMatched(Expected<RoadObjectMatcherError, RoadObject> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RoadObjectMatcherListenerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoadObjectMatcherListenerPeerCleaner(j));
    }
}
