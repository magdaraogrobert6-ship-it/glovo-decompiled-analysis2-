package com.mapbox.common.crypto;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class PrivateKeyImpl implements PrivateKey {
    private final SignatureAlgorithm algorithm;
    private final java.security.PrivateKey javaKey;

    @Override // com.mapbox.common.crypto.PrivateKey
    public SignatureAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public PrivateKeyImpl(java.security.PrivateKey privateKey) {
        privateKey.getClass();
        this.javaKey = privateKey;
        String algorithm = privateKey.getAlgorithm();
        algorithm.getClass();
        this.algorithm = SigningKeysKt.getSignatureAlgorithm(algorithm);
    }

    @Override // com.mapbox.common.crypto.PrivateKey
    public Expected<String, Signature> sign(DataRef dataRef) {
        dataRef.getClass();
        try {
            java.security.Signature signature = java.security.Signature.getInstance(SigningKeysKt.getSignatureName(this.algorithm, this.javaKey));
            signature.initSign(this.javaKey);
            signature.update(SigningKeysKt.asByteArray(dataRef));
            byte[] bArrSign = signature.sign();
            DataRef dataRefAllocateNative = DataRef.allocateNative(bArrSign.length);
            dataRefAllocateNative.getBuffer().put(bArrSign).rewind();
            Expected<String, Signature> expectedCreateValue = ExpectedFactory.createValue(new Signature(dataRefAllocateNative, SignatureEncoding.DER, this.algorithm));
            expectedCreateValue.getClass();
            return expectedCreateValue;
        } catch (Exception e) {
            Expected<String, Signature> expectedCreateError = ExpectedFactory.createError("Signing failed: " + e.getMessage());
            expectedCreateError.getClass();
            return expectedCreateError;
        }
    }
}
