package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class RoutesDataNative implements RoutesData {
    protected long peer;

    public static class RoutesDataPeerCleaner implements Runnable {
        public static int IconCompatParcelizer;
        public static int write;
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoutesDataNative.cleanNativePeer(this.peer);
        }

        public RoutesDataPeerCleaner(long j) {
            this.peer = j;
        }

        public static int read() {
            int i = IconCompatParcelizer;
            int i2 = i % 6515522;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return write;
            }
            int i3 = (int) Runtime.getRuntime().totalMemory();
            write = i3;
            return i3;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.RoutesData
    public native List<RouteAlternative> alternativeRoutes();

    @Override // com.mapbox.navigator.RoutesData
    public native RouteInterface primaryRoute();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RoutesDataNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RoutesDataPeerCleaner(j));
    }
}
