package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.camera.video.Recorder$3;
import com.roadrunner.domain.util.RetryWithDelay;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
public final class getPopupBackground {
    public final androidx.navigation.internal.NavContext IconCompatParcelizer;
    public final com.huawei.hmf.tasks.a.j read;
    public final BiometricManager serializer;

    public final Recorder$3 serializer(int i) {
        Context context = this.IconCompatParcelizer.IconCompatParcelizer;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            BiometricManager biometricManager = this.serializer;
            if (biometricManager != null) {
                return new Recorder$3(setAdapter.ad_(biometricManager, i));
            }
            SentryLogcatAdapter.serializer("BiometricManager", "Failure in getStrings(). BiometricManager was null.");
            return null;
        }
        Resources resources = context.getResources();
        boolean z = AppCompatTextHelper1.read(context);
        boolean z2 = i2 >= 29 && context != null && context.getPackageManager() != null && access201.write(context.getPackageManager());
        boolean z3 = i2 >= 29 && context != null && context.getPackageManager() != null && access201.serializer(context.getPackageManager());
        KeyguardManager keyguardManager = AppCompatTextView.read(context);
        return new Recorder$3(new RetryWithDelay(this, resources, i, z, z2, z3, keyguardManager == null ? false : AppCompatTextView.read(keyguardManager)));
    }

    public getPopupBackground(androidx.navigation.internal.NavContext navContext) {
        this.IconCompatParcelizer = navContext;
        int i = Build.VERSION.SDK_INT;
        this.serializer = i >= 29 ? getDropDownVerticalOffset.Z_(navContext.IconCompatParcelizer) : null;
        this.read = i <= 29 ? new com.huawei.hmf.tasks.a.j(8) : null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0137 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0139 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    public final int read(int i) {
        KeyguardManager keyguardManager;
        getPopupContext getpopupcontext;
        int i2 = Build.VERSION.SDK_INT;
        int iY_ = 1;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.serializer;
            if (biometricManager != null) {
                return getDropDownHorizontalOffset.aa_(biometricManager, i);
            }
            SentryLogcatAdapter.serializer("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!androidx.biometric.AuthenticatorUtils.serializer(i)) {
            return -2;
        }
        if (i == 0) {
            return 12;
        }
        androidx.navigation.internal.NavContext navContext = this.IconCompatParcelizer;
        Context context = navContext.IconCompatParcelizer;
        if (AppCompatTextView.read(context) == null) {
            return 12;
        }
        if (androidx.biometric.AuthenticatorUtils.read(i)) {
            KeyguardManager keyguardManager2 = AppCompatTextView.read(context);
            return (keyguardManager2 != null && AppCompatTextView.read(keyguardManager2)) ? 0 : 11;
        }
        if (i2 != 29) {
            if (i2 != 28) {
                return write();
            }
            if (!AppCompatTextHelper1.read(context)) {
                return 12;
            }
            KeyguardManager keyguardManager3 = AppCompatTextView.read(navContext.IconCompatParcelizer);
            if (keyguardManager3 != null && AppCompatTextView.read(keyguardManager3)) {
                return write() == 0 ? 0 : -1;
            }
            return write();
        }
        if ((i & 255) == 255) {
            BiometricManager biometricManager2 = this.serializer;
            if (biometricManager2 != null) {
                return getDropDownVerticalOffset.Y_(biometricManager2);
            }
            SentryLogcatAdapter.serializer("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method methodRemoteActionCompatParcelizer = getDropDownVerticalOffset.RemoteActionCompatParcelizer();
        if (methodRemoteActionCompatParcelizer != null) {
            Object objInvoke = null;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                KeyGenParameterSpec.Builder builder = setPopupBackgroundDrawable.read("androidxBiometric", 3);
                setPopupBackgroundDrawable.write(builder);
                setPopupBackgroundDrawable.RemoteActionCompatParcelizer(builder);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                setPopupBackgroundDrawable.write(keyGenerator, setPopupBackgroundDrawable.read(builder));
                keyGenerator.generateKey();
                SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, secretKey);
                getpopupcontext = new getPopupContext(cipher);
            } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
                SentryLogcatAdapter.write("CryptoObjectUtils", "Failed to create fake crypto object.", e);
                getpopupcontext = null;
            }
            BiometricPrompt.CryptoObject cryptoObjectWrite = androidx.biometric.CryptoObjectUtils.write(getpopupcontext);
            if (cryptoObjectWrite != null) {
                if (i2 == 29) {
                    try {
                        objInvoke = methodRemoteActionCompatParcelizer.invoke(this.serializer, cryptoObjectWrite);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                        SentryLogcatAdapter.write("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e2);
                    }
                }
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                SentryLogcatAdapter.IconCompatParcelizer("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            }
        }
        BiometricManager biometricManager3 = this.serializer;
        if (biometricManager3 == null) {
            SentryLogcatAdapter.serializer("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        } else {
            iY_ = getDropDownVerticalOffset.Y_(biometricManager3);
        }
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String str2 : context.getResources().getStringArray(com.logistics.rider.glovo.R.array.assume_strong_biometrics_models)) {
                if (!str.equals(str2)) {
                }
            }
            if (iY_ == 0) {
                keyguardManager = AppCompatTextView.read(navContext.IconCompatParcelizer);
                if (keyguardManager == null || !AppCompatTextView.read(keyguardManager)) {
                    return write();
                }
                if (write() == 0) {
                    return 0;
                }
                return -1;
            }
        } else if (iY_ == 0) {
            keyguardManager = AppCompatTextView.read(navContext.IconCompatParcelizer);
            if (keyguardManager == null) {
                if (write() == 0) {
                    return 0;
                }
                return -1;
            }
            return write();
        }
        return iY_;
    }

    public static getPopupBackground write(Context context) {
        return new getPopupBackground(new androidx.navigation.internal.NavContext(context, 1));
    }

    public final int write() {
        com.huawei.hmf.tasks.a.j jVar = this.read;
        if (jVar == null) {
            SentryLogcatAdapter.serializer("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        jVar.getClass();
        return 12;
    }
}
