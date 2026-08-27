package com.mapbox.bindgen;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class DataRef {
    private ByteBuffer buffer;
    private long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class DataRefPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            DataRef.cleanNativePeer(this.peer);
        }

        public DataRefPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native DataRef allocateNativeMemory(int i);

    public static native void cleanNativePeer(long j);

    public static DataRef allocateNative(int i) {
        if (i >= 0) {
            return allocateNativeMemory(i);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Buffer size must be a non-negative integer");
        return null;
    }

    private void setPeer(long j) {
        this.peer = j;
        CleanerService.register(this.buffer, new DataRefPeerCleaner(j));
    }

    public ByteBuffer getBuffer() {
        return this.buffer.duplicate();
    }

    public DataRef(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            this.buffer = byteBuffer;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Buffer must be an instance of class java.nio.DirectByteBuffer(created by ByteBuffer#allocateDirect() or JNI#NewDirectByteBuffer()).");
            throw null;
        }
    }

    private DataRef(long j, ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        setPeer(j);
    }
}
