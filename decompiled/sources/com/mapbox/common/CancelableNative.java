package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes5.dex */
final class CancelableNative implements Cancelable {
    protected long peer;

    public static class CancelablePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            CancelableNative.cleanNativePeer(this.peer);
        }

        public CancelablePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.Cancelable
    public native void cancel();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CancelableNative(long j) {
        this.peer = j;
        CleanerService.register(this, new CancelablePeerCleaner(j));
    }
}
