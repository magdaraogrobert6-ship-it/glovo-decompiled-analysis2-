package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;

/* JADX INFO: loaded from: classes4.dex */
public class Buffer {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class BufferPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Buffer.cleanNativePeer(this.peer);
        }

        public BufferPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(DataRef dataRef);

    private native DataRef nativeGetData();

    private static native void nativeSelfRegister();

    public DataRef getData() {
        return nativeGetData();
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Buffer(DataRef dataRef) {
        initialize(dataRef);
    }

    public Buffer(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new BufferPeerCleaner(j));
    }
}
