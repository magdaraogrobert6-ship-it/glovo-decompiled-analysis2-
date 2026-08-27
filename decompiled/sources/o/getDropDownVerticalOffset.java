package o;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class getDropDownVerticalOffset {
    public static int Y_(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager Z_(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method RemoteActionCompatParcelizer() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
