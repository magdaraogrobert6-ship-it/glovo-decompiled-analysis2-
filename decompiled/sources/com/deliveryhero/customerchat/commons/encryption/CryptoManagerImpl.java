package com.deliveryhero.customerchat.commons.encryption;

import android.security.keystore.KeyGenParameterSpec;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.customerchat.commons.ChatCryptoException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import o.DrawChildContainer;
import o.RegistryNoModelLoaderAvailableException;
import o.SimpleItemTouchHelperCallback;
import o.getLayerOutlineProviderui_graphics;
import o.isIdentityannotations;
import o.onImageAvailable;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class CryptoManagerImpl {
    public final onImageAvailable IconCompatParcelizer;
    public final KeyStore serializer;

    public final void IconCompatParcelizer(byte[] bArr, RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, write());
            byte[] iv = cipher.getIV();
            try {
                ((FileOutputStream) registryNoModelLoaderAvailableException.read).write(DrawChildContainer.RemoteActionCompatParcelizer);
                registryNoModelLoaderAvailableException.write(iv);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                byte[] bArr2 = new byte[Fields.TransformOrigin];
                while (byteArrayInputStream.available() > 4096) {
                    byteArrayInputStream.read(bArr2);
                    registryNoModelLoaderAvailableException.write(cipher.update(bArr2));
                }
                registryNoModelLoaderAvailableException.write(cipher.doFinal(SentryUUID.write(byteArrayInputStream)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{registryNoModelLoaderAvailableException, th}, i3);
                    throw th2;
                }
            }
        } catch (Exception e) {
            isIdentityannotations isidentityannotations = this.IconCompatParcelizer.serializer;
            if (isidentityannotations != null) {
                isidentityannotations.serializer("CACHE_SERIALIZATION_ERROR", SimpleItemTouchHelperCallback.serializer, e);
            }
            throw new ChatCryptoException("Encryption failed.", e);
        }
    }

    public CryptoManagerImpl(onImageAvailable onimageavailable, getLayerOutlineProviderui_graphics getlayeroutlineproviderui_graphics) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.IconCompatParcelizer = onimageavailable;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        this.serializer = keyStore;
    }

    public final byte[] IconCompatParcelizer(InputStream inputStream) {
        Cipher cipher;
        inputStream.getClass();
        try {
            try {
                byte[] bArr = DrawChildContainer.RemoteActionCompatParcelizer;
                byte[] bArr2 = new byte[3];
                inputStream.read(bArr2);
                if (Arrays.equals(bArr2, bArr)) {
                    byte[] bArr3 = new byte[12];
                    inputStream.read(bArr3);
                    cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, write(), new GCMParameterSpec(Fields.SpotShadowColor, bArr3));
                } else {
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(bArr2, 0, bArr4, 0, 3);
                    inputStream.read(bArr4, 3, 13);
                    KeyStore.Entry entry = this.serializer.getEntry("ChatSDKCrypto", null);
                    KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
                    SecretKey secretKey = secretKeyEntry != null ? secretKeyEntry.getSecretKey() : null;
                    if (secretKey != null) {
                        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
                        cipher2.init(2, secretKey, new IvParameterSpec(bArr4));
                        cipher = cipher2;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Legacy CBC key not found");
                        cipher = null;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr5 = new byte[Fields.TransformOrigin];
                while (inputStream.available() > 4096) {
                    inputStream.read(bArr5);
                    byteArrayOutputStream.write(cipher.update(bArr5));
                }
                byteArrayOutputStream.write(cipher.doFinal(SentryUUID.write(inputStream)));
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                inputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStream, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Exception e) {
            isIdentityannotations isidentityannotations = this.IconCompatParcelizer.serializer;
            if (isidentityannotations != null) {
                isidentityannotations.serializer("CACHE_DESERIALIZATION_ERROR", SimpleItemTouchHelperCallback.serializer, e);
            }
            throw new ChatCryptoException("Decryption failed.", e);
        }
    }

    public final SecretKey write() throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        KeyStore.Entry entry = this.serializer.getEntry("ChatSDKCryptoGCM", null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        SecretKey secretKey = secretKeyEntry != null ? secretKeyEntry.getSecretKey() : null;
        if (secretKey != null) {
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(new KeyGenParameterSpec.Builder("ChatSDKCryptoGCM", 3).setKeySize(Fields.SpotShadowColor).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).setRandomizedEncryptionRequired(true).build());
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }
}
