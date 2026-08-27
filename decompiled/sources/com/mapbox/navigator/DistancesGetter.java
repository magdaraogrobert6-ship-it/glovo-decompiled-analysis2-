package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
public class DistancesGetter implements DistancesGetterInterface {
    protected long peer;

    public static class DistancesGetterPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            DistancesGetter.cleanNativePeer(this.peer);
        }

        public DistancesGetterPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public DistancesGetter(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new DistancesGetterPeerCleaner(j));
    }
}
