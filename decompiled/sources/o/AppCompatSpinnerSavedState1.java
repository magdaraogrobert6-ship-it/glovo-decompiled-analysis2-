package o;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.PresentationSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatSpinnerSavedState1 {
    public static PresentationSession ah_(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getPresentationSession();
    }

    public static BiometricPrompt.CryptoObject ag_(PresentationSession presentationSession) {
        return new BiometricPrompt.CryptoObject(presentationSession);
    }
}
