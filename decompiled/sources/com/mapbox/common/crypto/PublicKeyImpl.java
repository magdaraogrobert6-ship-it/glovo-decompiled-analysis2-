package com.mapbox.common.crypto;

import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class PublicKeyImpl implements PublicKey {
    private final SignatureAlgorithm algorithm;
    private final java.security.PublicKey javaKey;

    @Override // com.mapbox.common.crypto.PublicKey
    public SignatureAlgorithm getAlgorithm() {
        return this.algorithm;
    }

    public PublicKeyImpl(java.security.PublicKey publicKey) {
        publicKey.getClass();
        this.javaKey = publicKey;
        String algorithm = publicKey.getAlgorithm();
        algorithm.getClass();
        this.algorithm = SigningKeysKt.getSignatureAlgorithm(algorithm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean verify$lambda$1(java.security.Signature signature, Signature signature2) {
        signature2.getClass();
        DataRef data = signature2.getData();
        data.getClass();
        return Boolean.valueOf(signature.verify(SigningKeysKt.asByteArray(data)));
    }

    @Override // com.mapbox.common.crypto.PublicKey
    public Expected<String, Boolean> verify(Signature signature, DataRef dataRef) {
        signature.getClass();
        dataRef.getClass();
        try {
            java.security.Signature signature2 = java.security.Signature.getInstance(SigningKeysKt.getSignatureName(this.algorithm, this.javaKey));
            signature2.initVerify(this.javaKey);
            signature2.update(SigningKeysKt.asByteArray(dataRef));
            Expected expectedMapValue = signature.reEncode(SignatureEncoding.DER).mapValue(new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(28, signature2));
            expectedMapValue.getClass();
            return expectedMapValue;
        } catch (Exception e) {
            Expected<String, Boolean> expectedCreateError = ExpectedFactory.createError("Verification failed: " + e.getMessage());
            expectedCreateError.getClass();
            return expectedCreateError;
        }
    }
}
