package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.AppCompatSpinnerSavedState;
import o.AppCompatSpinnerSavedState1;
import o.access001;
import o.getPopupContext;
import o.onAnimationEndlambda0;
import o.onAnimationEndlambda1;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class CryptoObjectUtils {
    public static final ContextScope newChildScope(ContextScope contextScope) {
        contextScope.getClass();
        return YieldKt.write(contextScope, new onAnimationEndlambda0((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) contextScope.serializer.get(onAnimationEndlambda1.RemoteActionCompatParcelizer)));
    }

    public static BiometricPrompt.CryptoObject write(getPopupContext getpopupcontext) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (getpopupcontext == null) {
            return null;
        }
        Cipher cipher = getpopupcontext.serializer;
        if (cipher != null) {
            return AppCompatSpinnerSavedState.write(cipher);
        }
        Signature signature = getpopupcontext.IconCompatParcelizer;
        if (signature != null) {
            return AppCompatSpinnerSavedState.RemoteActionCompatParcelizer(signature);
        }
        Mac mac = getpopupcontext.write;
        if (mac != null) {
            return AppCompatSpinnerSavedState.IconCompatParcelizer(mac);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (identityCredential = getpopupcontext.RemoteActionCompatParcelizer) != null) {
            return access001.ae_(identityCredential);
        }
        if (i < 33 || (presentationSession = getpopupcontext.read) == null) {
            return null;
        }
        return AppCompatSpinnerSavedState1.ag_(presentationSession);
    }
}
