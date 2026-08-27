package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class DeviceLocationProviderFactoryNative implements DeviceLocationProviderFactory {
    protected long peer;

    public static class DeviceLocationProviderFactoryPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderFactoryNative.cleanNativePeer(this.peer);
        }

        public DeviceLocationProviderFactoryPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.location.DeviceLocationProviderFactory
    public native Expected<LocationError, DeviceLocationProvider> build(LocationProviderRequest locationProviderRequest);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public DeviceLocationProviderFactoryNative(long j) {
        this.peer = j;
        CleanerService.register(this, new DeviceLocationProviderFactoryPeerCleaner(j));
    }
}
