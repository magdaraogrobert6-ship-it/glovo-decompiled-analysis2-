package com.mapbox.common.crypto;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class PrivateKeyNative implements PrivateKey {
    protected long peer;

    public static class PrivateKeyPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PrivateKeyNative.cleanNativePeer(this.peer);
        }

        public PrivateKeyPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.crypto.PrivateKey
    public native SignatureAlgorithm getAlgorithm();

    @Override // com.mapbox.common.crypto.PrivateKey
    public native Expected<String, Signature> sign(DataRef dataRef);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PrivateKeyNative(long j) {
        this.peer = j;
        CleanerService.register(this, new PrivateKeyPeerCleaner(j));
    }
}
