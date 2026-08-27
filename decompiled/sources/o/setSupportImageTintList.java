package o;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class setSupportImageTintList extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ setImageResource read;

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public setSupportImageTintList(setImageResource setimageresource) {
        this.read = setimageresource;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        java.lang.ref.WeakReference weakReference = ((setDropDownWidth) this.read).write;
        if (weakReference.get() == null || ((getPrompt) weakReference.get()).PlaybackStateCompatCustomAction || !((getPrompt) weakReference.get()).MediaSessionCompatToken) {
            return;
        }
        ((getPrompt) weakReference.get()).read(new hasOverlappingRendering(i, charSequence));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        java.lang.ref.WeakReference weakReference = ((setDropDownWidth) this.read).write;
        if (weakReference.get() == null || !((getPrompt) weakReference.get()).MediaSessionCompatToken) {
            return;
        }
        getPrompt getprompt = (getPrompt) weakReference.get();
        if (getprompt.PlaybackStateCompat == null) {
            getprompt.PlaybackStateCompat = new AndroidGraphicsContext2();
        }
        getPrompt.IconCompatParcelizer(getprompt.PlaybackStateCompat, Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        getPopupContext getpopupcontext;
        int iIconCompatParcelizer;
        BiometricPrompt.CryptoObject cryptoObjectWrite;
        PresentationSession presentationSessionAh_;
        IdentityCredential identityCredentialAf_;
        if (authenticationResult == null || (cryptoObjectWrite = setImageDrawable.write(authenticationResult)) == null) {
            getpopupcontext = null;
        } else {
            Cipher cipherSerializer = AppCompatSpinnerSavedState.serializer(cryptoObjectWrite);
            if (cipherSerializer != null) {
                getpopupcontext = new getPopupContext(cipherSerializer);
            } else {
                Signature signatureIconCompatParcelizer = AppCompatSpinnerSavedState.IconCompatParcelizer(cryptoObjectWrite);
                if (signatureIconCompatParcelizer != null) {
                    getpopupcontext = new getPopupContext(signatureIconCompatParcelizer);
                } else {
                    Mac macRemoteActionCompatParcelizer = AppCompatSpinnerSavedState.RemoteActionCompatParcelizer(cryptoObjectWrite);
                    if (macRemoteActionCompatParcelizer != null) {
                        getpopupcontext = new getPopupContext(macRemoteActionCompatParcelizer);
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30 && (identityCredentialAf_ = access001.af_(cryptoObjectWrite)) != null) {
                            getpopupcontext = new getPopupContext(identityCredentialAf_);
                        } else if (i < 33 || (presentationSessionAh_ = AppCompatSpinnerSavedState1.ah_(cryptoObjectWrite)) == null) {
                            getpopupcontext = null;
                        } else {
                            getpopupcontext = new getPopupContext(presentationSessionAh_);
                        }
                    }
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            if (authenticationResult != null) {
                iIconCompatParcelizer = setImageURI.IconCompatParcelizer(authenticationResult);
            } else {
                iIconCompatParcelizer = -1;
            }
        } else if (i2 == 29) {
            iIconCompatParcelizer = -1;
        } else {
            iIconCompatParcelizer = 2;
        }
        setDropDownHorizontalOffset setdropdownhorizontaloffset = new setDropDownHorizontalOffset(getpopupcontext, iIconCompatParcelizer);
        java.lang.ref.WeakReference weakReference = ((setDropDownWidth) this.read).write;
        if (weakReference.get() == null || !((getPrompt) weakReference.get()).MediaSessionCompatToken) {
            return;
        }
        if (iIconCompatParcelizer == -1) {
            int iWrite = ((getPrompt) weakReference.get()).write();
            setdropdownhorizontaloffset = new setDropDownHorizontalOffset(getpopupcontext, ((iWrite & 32767) == 0 || androidx.biometric.AuthenticatorUtils.read(iWrite)) ? -1 : 2);
        }
        getPrompt getprompt = (getPrompt) weakReference.get();
        if (getprompt.serializer == null) {
            getprompt.serializer = new AndroidGraphicsContext2();
        }
        getPrompt.IconCompatParcelizer(getprompt.serializer, setdropdownhorizontaloffset);
    }
}
