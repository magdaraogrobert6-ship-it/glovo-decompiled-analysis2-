package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RouteObjectMatcherNative implements RouteObjectMatcher {
    protected long peer;

    public static class RouteObjectMatcherPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RouteObjectMatcherNative.cleanNativePeer(this.peer);
        }

        public RouteObjectMatcherPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void cancel(List<String> list);

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void cancelAll();

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void matchRouteObjects(List<MatchableRouteObject> list);

    @Override // com.mapbox.navigator.RouteObjectMatcher
    public native void setListener(RouteObjectMatcherListener routeObjectMatcherListener);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RouteObjectMatcherNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RouteObjectMatcherPeerCleaner(j));
    }
}
