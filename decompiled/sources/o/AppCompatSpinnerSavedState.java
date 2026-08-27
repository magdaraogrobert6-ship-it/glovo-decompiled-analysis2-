package o;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatSpinnerSavedState {
    public static Signature IconCompatParcelizer(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }

    public static Mac RemoteActionCompatParcelizer(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    public static Cipher serializer(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    public static BiometricPrompt.CryptoObject write(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static BiometricPrompt.CryptoObject RemoteActionCompatParcelizer(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    public static BiometricPrompt.CryptoObject IconCompatParcelizer(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }
}
