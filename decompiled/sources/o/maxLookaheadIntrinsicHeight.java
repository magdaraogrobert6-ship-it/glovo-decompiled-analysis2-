package o;

import android.security.keystore.KeyGenParameterSpec;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes2.dex */
public final class maxLookaheadIntrinsicHeight {
    public static final Object IconCompatParcelizer = new Object();
    public KeyStore read;

    public final minLookaheadIntrinsicHeight IconCompatParcelizer(String str) {
        minLookaheadIntrinsicHeight minlookaheadintrinsicheight;
        synchronized (this) {
            minlookaheadintrinsicheight = new minLookaheadIntrinsicHeight(setLookaheadCoordinatesAccessedDuringPlacement.RemoteActionCompatParcelizer(str), this.read);
            byte[] bArrIconCompatParcelizer = setLookaheadCoordinatesAccessedDuringModifierPlacement.IconCompatParcelizer(10);
            byte[] bArr = new byte[0];
            if (!Arrays.equals(bArrIconCompatParcelizer, minlookaheadintrinsicheight.serializer(minlookaheadintrinsicheight.IconCompatParcelizer(bArrIconCompatParcelizer, bArr), bArr))) {
                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
            }
        }
        return minlookaheadintrinsicheight;
    }

    public final boolean write(String str) {
        boolean zContainsAlias;
        synchronized (this) {
            String strRemoteActionCompatParcelizer = setLookaheadCoordinatesAccessedDuringPlacement.RemoteActionCompatParcelizer(str);
            try {
                zContainsAlias = this.read.containsAlias(strRemoteActionCompatParcelizer);
            } catch (NullPointerException unused) {
                SentryLogcatAdapter.IconCompatParcelizer("AndroidKeystoreKmsClient", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                try {
                    try {
                        Thread.sleep((int) (Math.random() * 40.0d));
                    } catch (InterruptedException unused2) {
                    }
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.read = keyStore;
                    keyStore.load(null);
                    return this.read.containsAlias(strRemoteActionCompatParcelizer);
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            }
        }
        return zContainsAlias;
    }

    public static boolean read(String str) {
        maxLookaheadIntrinsicHeight maxlookaheadintrinsicheight = new maxLookaheadIntrinsicHeight();
        synchronized (IconCompatParcelizer) {
            if (maxlookaheadintrinsicheight.write(str)) {
                return false;
            }
            RemoteActionCompatParcelizer(str);
            return true;
        }
    }

    public maxLookaheadIntrinsicHeight() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.read = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            throw null;
        }
    }

    public static void RemoteActionCompatParcelizer(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strRemoteActionCompatParcelizer = setLookaheadCoordinatesAccessedDuringPlacement.RemoteActionCompatParcelizer(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strRemoteActionCompatParcelizer, 3).setKeySize(androidx.compose.ui.graphics.Fields.RotationX).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }
}
