package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RouteObjectMatcherListenerNative implements RouteObjectMatcherListener {
    protected long peer;

    public static class RouteObjectMatcherListenerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteObjectMatcherListenerNative.cleanNativePeer(this.peer);
        }

        public RouteObjectMatcherListenerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteObjectMatcherListener
    public native void onMatchingCancelled(List<String> list);

    @Override // com.mapbox.navigator.RouteObjectMatcherListener
    public native void onRouteObjectsMatched(Expected<List<RouteObjectMatcherError>, List<MatchedRouteObject>> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteObjectMatcherListenerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteObjectMatcherListenerPeerCleaner(j));
    }
}
