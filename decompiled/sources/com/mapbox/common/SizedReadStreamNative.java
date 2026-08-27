package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes5.dex */
final class SizedReadStreamNative implements SizedReadStream {
    protected long peer;

    public static class SizedReadStreamPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            SizedReadStreamNative.cleanNativePeer(this.peer);
        }

        public SizedReadStreamPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.SizedReadStream
    public native Long getTotalSize();

    @Override // com.mapbox.common.ReadStream
    public native boolean isExhausted();

    @Override // com.mapbox.common.ReadStream
    public native boolean isReadable();

    @Override // com.mapbox.common.ReadStream
    public native Expected<String, Long> read(Buffer buffer);

    @Override // com.mapbox.common.ReadStream
    public native long readBytes();

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public SizedReadStreamNative(long j) {
        this.peer = j;
        CleanerService.register(this, new SizedReadStreamPeerCleaner(j));
    }
}
