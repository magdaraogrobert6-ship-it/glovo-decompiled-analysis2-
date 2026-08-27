package o;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* JADX INFO: loaded from: classes.dex */
public abstract class access001 {
    public static IdentityCredential af_(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }

    public static BiometricPrompt.CryptoObject ae_(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }
}
