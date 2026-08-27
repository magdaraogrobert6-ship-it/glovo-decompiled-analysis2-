package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class LogThrottler {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class LogThrottlerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            LogThrottler.cleanNativePeer(this.peer);
        }

        public LogThrottlerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(Long l);

    private static native void nativeSelfRegister();

    public native void allowLog();

    public native boolean onLog();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LogThrottler(Long l) {
        initialize(l);
    }

    public LogThrottler(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LogThrottlerPeerCleaner(j));
    }
}
