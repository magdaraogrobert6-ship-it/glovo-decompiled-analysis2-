package com.mapbox.common.crypto;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import java.io.ByteArrayInputStream;
import java.security.KeyFactory;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class KeyReaderImpl {
    public static final KeyReaderImpl INSTANCE = new KeyReaderImpl();

    private KeyReaderImpl() {
    }

    public static final Expected<String, PublicKey> readPublicKey(DataRef dataRef, SignatureAlgorithm signatureAlgorithm) {
        dataRef.getClass();
        signatureAlgorithm.getClass();
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(KeyReaderImplKt.asByteArray(dataRef)));
            X509Certificate x509Certificate = certificateGenerateCertificate instanceof X509Certificate ? (X509Certificate) certificateGenerateCertificate : null;
            if (x509Certificate == null) {
                Expected<String, PublicKey> expectedCreateError = ExpectedFactory.createError("Data is not a valid X.509 certificate");
                expectedCreateError.getClass();
                return expectedCreateError;
            }
            java.security.PublicKey publicKey = x509Certificate.getPublicKey();
            publicKey.getClass();
            PublicKeyImpl publicKeyImpl = new PublicKeyImpl(publicKey);
            if (publicKeyImpl.getAlgorithm() == signatureAlgorithm) {
                Expected<String, PublicKey> expectedCreateValue = ExpectedFactory.createValue(publicKeyImpl);
                expectedCreateValue.getClass();
                return expectedCreateValue;
            }
            Expected<String, PublicKey> expectedCreateError2 = ExpectedFactory.createError("Algorithm mismatch: expected " + KeyReaderImplKt.keyName(signatureAlgorithm) + ", found " + KeyReaderImplKt.keyName(publicKeyImpl.getAlgorithm()));
            expectedCreateError2.getClass();
            return expectedCreateError2;
        } catch (Exception e) {
            Expected<String, PublicKey> expectedCreateError3 = ExpectedFactory.createError("Unable to parse X.509 certificate: " + e.getMessage());
            expectedCreateError3.getClass();
            return expectedCreateError3;
        }
    }

    public static final Expected<String, PrivateKey> readPrivateKey(DataRef dataRef, SignatureAlgorithm signatureAlgorithm) {
        dataRef.getClass();
        signatureAlgorithm.getClass();
        try {
            java.security.PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(KeyReaderImplKt.keyName(signatureAlgorithm)).generatePrivate(new PKCS8EncodedKeySpec(KeyReaderImplKt.asByteArray(dataRef)));
            privateKeyGeneratePrivate.getClass();
            Expected<String, PrivateKey> expectedCreateValue = ExpectedFactory.createValue(new PrivateKeyImpl(privateKeyGeneratePrivate));
            expectedCreateValue.getClass();
            return expectedCreateValue;
        } catch (Exception e) {
            Expected<String, PrivateKey> expectedCreateError = ExpectedFactory.createError("Unable to parse PKCS8 private key: " + e.getMessage());
            expectedCreateError.getClass();
            return expectedCreateError;
        }
    }
}
