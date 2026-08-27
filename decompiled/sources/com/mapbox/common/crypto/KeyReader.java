package com.mapbox.common.crypto;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class KeyReader {
    protected long peer;

    public static class KeyReaderPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            KeyReader.cleanNativePeer(this.peer);
        }

        public KeyReaderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public static native Expected<String, PrivateKey> readPrivateKeyFromPKCS8PEM(String str, SignatureAlgorithm signatureAlgorithm);

    public static native Expected<String, PublicKey> readPublicKeyFromCertificatePEM(String str, SignatureAlgorithm signatureAlgorithm);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public KeyReader(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new KeyReaderPeerCleaner(j));
    }
}
