package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
public class HistoryReader implements HistoryReaderInterface {
    protected long peer;

    public static class HistoryReaderPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            HistoryReader.cleanNativePeer(this.peer);
        }

        public HistoryReaderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(String str);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.HistoryReaderInterface
    public native HistoryRecord next();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public HistoryReader(String str) {
        initialize(str);
    }

    public HistoryReader(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new HistoryReaderPeerCleaner(j));
    }
}
