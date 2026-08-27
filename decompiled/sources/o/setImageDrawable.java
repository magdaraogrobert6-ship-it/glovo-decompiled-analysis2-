package o;

import android.hardware.biometrics.BiometricPrompt;

/* JADX INFO: loaded from: classes.dex */
public abstract class setImageDrawable {
    public static BiometricPrompt.CryptoObject write(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }

    public static BiometricPrompt.AuthenticationCallback IconCompatParcelizer(setImageResource setimageresource) {
        return new setSupportImageTintList(setimageresource);
    }
}
