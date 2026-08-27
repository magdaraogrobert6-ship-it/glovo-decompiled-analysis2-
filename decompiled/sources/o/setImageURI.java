package o;

import android.hardware.biometrics.BiometricPrompt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setImageURI {
    public static int IconCompatParcelizer(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
