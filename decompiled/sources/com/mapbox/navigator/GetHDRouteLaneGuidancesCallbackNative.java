package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class GetHDRouteLaneGuidancesCallbackNative implements GetHDRouteLaneGuidancesCallback {
    private long peer;

    public static class GetHDRouteLaneGuidancesCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            GetHDRouteLaneGuidancesCallbackNative.cleanNativePeer(this.peer);
        }

        public GetHDRouteLaneGuidancesCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.GetHDRouteLaneGuidancesCallback
    public native void run(Expected<GetHDRouteLaneGuidancesErrorType, List<RouteLaneGuidance>> expected);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private GetHDRouteLaneGuidancesCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new GetHDRouteLaneGuidancesCallbackPeerCleaner(j));
    }
}
