package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
public class RoutingProfileConverter implements RoutingProfileConverterInterface {
    protected long peer;

    public static class RoutingProfileConverterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RoutingProfileConverter.cleanNativePeer(this.peer);
        }

        public RoutingProfileConverterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public static native RoutingProfile toRoutingProfile(String str);

    public static native RoutingProfile toRoutingProfile(String str, String str2);

    public static native String toString(RoutingProfile routingProfile);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RoutingProfileConverter(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new RoutingProfileConverterPeerCleaner(j));
    }
}
