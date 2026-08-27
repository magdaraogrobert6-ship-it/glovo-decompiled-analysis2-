package com.incognia.internal;

import android.security.keystore.KeyGenParameterSpec;
import androidx.compose.ui.graphics.Fields;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.ECGenParameterSpec;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes2.dex */
public final class HlS {
    public static final String mbG = (String) W4i.hZX.MediaSessionCompatResultReceiverWrapper();
    public final KeyStore BGx;

    public HlS() {
        KeyStore keyStore;
        try {
            keyStore = KeyStore.getInstance(mbG);
        } catch (KeyStoreException unused) {
            keyStore = null;
        }
        this.BGx = keyStore;
    }

    public static void BGx(String str, byte[] bArr, boolean z) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        XUh xUh = XUh.BGx;
        if (XUh.BGx(xUh, 24, 0, 2)) {
            KeyGenParameterSpec.Builder attestationChallenge = new KeyGenParameterSpec.Builder(str, 12).setAlgorithmParameterSpec(new ECGenParameterSpec((String) W4i.pbW.MediaSessionCompatResultReceiverWrapper())).setDigests("SHA-256").setKeySize(Fields.RotationX).setAttestationChallenge(bArr);
            if (z && XUh.BGx(xUh, 31, 0, 2)) {
                attestationChallenge.setDevicePropertiesAttestationIncluded(true);
            }
            KeyGenParameterSpec keyGenParameterSpecBuild = attestationChallenge.build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", mbG);
            keyPairGenerator.initialize(keyGenParameterSpecBuild);
            keyPairGenerator.generateKeyPair();
        }
    }

    public static void BGx(HlS hlS, String str) {
        try {
            if (XUh.BGx(XUh.BGx, 24, 0, 2)) {
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setUserAuthenticationRequired(true).setInvalidatedByBiometricEnrollment(true).build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", mbG);
                keyGenerator.init(keyGenParameterSpecBuild);
                keyGenerator.generateKey();
            }
        } catch (Throwable unused) {
        }
    }
}
