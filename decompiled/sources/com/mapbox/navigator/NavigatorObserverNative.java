package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class NavigatorObserverNative implements NavigatorObserver {
    protected long peer;

    public static class NavigatorObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            NavigatorObserverNative.cleanNativePeer(this.peer);
        }

        public NavigatorObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.NavigatorObserver
    public native void onRoutesChanged(RoutesChangeInfo routesChangeInfo);

    @Override // com.mapbox.navigator.NavigatorObserver
    public native void onStatus(NavigationStatusOrigin navigationStatusOrigin, NavigationStatus navigationStatus);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public NavigatorObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new NavigatorObserverPeerCleaner(j));
    }
}
