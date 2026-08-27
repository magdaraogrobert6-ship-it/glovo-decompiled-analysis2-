package com.mapbox.common;

import android.os.SystemClock;
import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class ReachabilityFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class ReachabilityFactoryPeerCleaner implements Runnable {
        public static int RemoteActionCompatParcelizer;
        public static int read;
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityFactory.cleanNativePeer(this.peer);
        }

        public ReachabilityFactoryPeerCleaner(long j) {
            this.peer = j;
        }

        public static int serializer() {
            int i = read;
            int i2 = i % 6543738;
            read = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            RemoteActionCompatParcelizer = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public static native ReachabilityInterface reachability(String str);

    public static native void reset();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ReachabilityFactory(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ReachabilityFactoryPeerCleaner(j));
    }
}
