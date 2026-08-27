package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
final class IMUServiceNative implements IMUService {
    protected long peer;

    public static class IMUServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            IMUServiceNative.cleanNativePeer(this.peer);
        }

        public IMUServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.IMUService
    public native int registerAltimeterUpdateCallback(AltimeterUpdateCallback altimeterUpdateCallback);

    @Override // com.mapbox.navigator.IMUService
    public native int registerCompassUpdateCallback(CompassUpdateCallback compassUpdateCallback);

    @Override // com.mapbox.navigator.IMUService
    public native int registerIMUUpdateCallback(IMUUpdateCallback iMUUpdateCallback);

    @Override // com.mapbox.navigator.IMUService
    public native void unregisterCallback(int i);

    @Override // com.mapbox.navigator.IMUService
    public native void update(Point point, Float f);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public IMUServiceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new IMUServicePeerCleaner(j));
    }
}
