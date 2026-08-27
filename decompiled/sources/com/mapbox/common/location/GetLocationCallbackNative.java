package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class GetLocationCallbackNative implements GetLocationCallback {
    private long peer;

    public static class GetLocationCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            GetLocationCallbackNative.cleanNativePeer(this.peer);
        }

        public GetLocationCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.location.GetLocationCallback
    public native void run(Location location);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private GetLocationCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetLocationCallbackPeerCleaner(j));
    }
}
