package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes3.dex */
public class MatchedPointLocation implements MatchedPointLocationInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class MatchedPointLocationPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MatchedPointLocation.cleanNativePeer(this.peer);
        }

        public MatchedPointLocationPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.MatchedPointLocationInterface
    public native Position getPosition();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MatchedPointLocation(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MatchedPointLocationPeerCleaner(j));
    }
}
