package com.mapbox.common.crypto;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class Signature {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class SignaturePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Signature.cleanNativePeer(this.peer);
        }

        public SignaturePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private native void initialize(DataRef dataRef, SignatureEncoding signatureEncoding, SignatureAlgorithm signatureAlgorithm);

    private static native void nativeSelfRegister();

    public native SignatureAlgorithm getAlgorithm();

    public native DataRef getData();

    public native SignatureEncoding getEncoding();

    public native Expected<String, Signature> reEncode(SignatureEncoding signatureEncoding);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Signature(DataRef dataRef, SignatureEncoding signatureEncoding, SignatureAlgorithm signatureAlgorithm) {
        initialize(dataRef, signatureEncoding, signatureAlgorithm);
    }

    public Signature(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new SignaturePeerCleaner(j));
    }
}
