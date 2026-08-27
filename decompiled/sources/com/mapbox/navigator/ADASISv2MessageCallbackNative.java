package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
final class ADASISv2MessageCallbackNative implements ADASISv2MessageCallback {
    private long peer;

    public static class ADASISv2MessageCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ADASISv2MessageCallbackNative.cleanNativePeer(this.peer);
        }

        public ADASISv2MessageCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.ADASISv2MessageCallback
    public native void run(List<Byte> list);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private ADASISv2MessageCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ADASISv2MessageCallbackPeerCleaner(j));
    }
}
