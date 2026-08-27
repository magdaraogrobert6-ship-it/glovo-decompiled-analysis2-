package com.mapbox.common.crypto;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class PublicKeyNative implements PublicKey {
    protected long peer;

    public static class PublicKeyPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PublicKeyNative.cleanNativePeer(this.peer);
        }

        public PublicKeyPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.crypto.PublicKey
    public native SignatureAlgorithm getAlgorithm();

    @Override // com.mapbox.common.crypto.PublicKey
    public native Expected<String, Boolean> verify(Signature signature, DataRef dataRef);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PublicKeyNative(long j) {
        this.peer = j;
        CleanerService.register(this, new PublicKeyPeerCleaner(j));
    }
}
