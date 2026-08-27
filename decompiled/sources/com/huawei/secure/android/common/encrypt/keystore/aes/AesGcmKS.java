package com.huawei.secure.android.common.encrypt.keystore.aes;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.MediaSessionCompatQueueItem;
import o.accessmaxIntrinsicWidthjd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AesGcmKS {
    public static final ConcurrentHashMap IconCompatParcelizer = new ConcurrentHashMap();

    public static byte[] IconCompatParcelizer(String str, byte[] bArr) {
        SecretKey secretKeyWrite;
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        if (bArr.length <= 12) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        }
        try {
            secretKeyWrite = write(Boolean.FALSE, str);
        } catch (AesKsParamException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "e : " + e.getMessage());
            secretKeyWrite = null;
        }
        if (secretKeyWrite == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[0];
        if (bArr.length <= 12) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "Decrypt source data is invalid.");
            return bArr3;
        }
        try {
            return write(secretKeyWrite, bArr);
        } catch (AesKsParamException e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "e : " + e2.getMessage());
            return bArr3;
        }
    }

    public static byte[] RemoteActionCompatParcelizer(String str, byte[] bArr) {
        SecretKey secretKeyWrite;
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        try {
            secretKeyWrite = write(Boolean.TRUE, str);
        } catch (AesKsParamException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "e : " + e.getMessage());
            secretKeyWrite = null;
        }
        if (secretKeyWrite == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[0];
        try {
            return RemoteActionCompatParcelizer(secretKeyWrite, bArr);
        } catch (AesKsParamException e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "e : " + e2.getMessage());
            return bArr3;
        }
    }

    public static byte[] RemoteActionCompatParcelizer(SecretKey secretKey, byte[] bArr) throws AesKsParamException {
        byte[] bArr2 = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "InvalidKeyException : " + e.getMessage());
            throw new AesKsParamException("InvalidKeyException : " + e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "NoSuchAlgorithmException : " + e2.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e2.getMessage());
        } catch (BadPaddingException e3) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "BadPaddingException : " + e3.getMessage());
            throw new AesKsParamException("BadPaddingException : " + e3.getMessage());
        } catch (IllegalBlockSizeException e4) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "IllegalBlockSizeException : " + e4.getMessage());
            throw new AesKsParamException("IllegalBlockSizeException : " + e4.getMessage());
        } catch (NoSuchPaddingException e5) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "NoSuchPaddingException : " + e5.getMessage());
            throw new AesKsParamException("NoSuchPaddingException : " + e5.getMessage());
        } catch (Exception e6) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "Exception: " + e6.getMessage());
            throw new AesKsParamException(MediaSessionCompatQueueItem.read(e6, new StringBuilder("Exception : ")));
        }
    }

    public static SecretKey IconCompatParcelizer(Boolean bool, String str) throws AesKsParamException {
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("GCMKS");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            if (!bool.booleanValue()) {
                return null;
            }
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("GCMKS");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(Fields.RotationX).build());
            return keyGenerator.generateKey();
        } catch (IOException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "IOException : " + e.getMessage());
            throw new AesKsParamException("IOException : " + e.getMessage());
        } catch (InvalidAlgorithmParameterException e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "InvalidAlgorithmParameterException : " + e2.getMessage());
            throw new AesKsParamException("InvalidAlgorithmParameterException : " + e2.getMessage());
        } catch (KeyStoreException e3) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "KeyStoreException : " + e3.getMessage());
            throw new AesKsParamException("KeyStoreException : " + e3.getMessage());
        } catch (NoSuchAlgorithmException e4) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "NoSuchAlgorithmException : " + e4.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e4.getMessage());
        } catch (NoSuchProviderException e5) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "NoSuchProviderException : " + e5.getMessage());
            throw new AesKsParamException("NoSuchProviderException : " + e5.getMessage());
        } catch (UnrecoverableKeyException e6) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "UnrecoverableKeyException : " + e6.getMessage());
            throw new AesKsParamException("UnrecoverableKeyException : " + e6.getMessage());
        } catch (CertificateException e7) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "CertificateException : " + e7.getMessage());
            throw new AesKsParamException("CertificateException : " + e7.getMessage());
        } catch (Exception e8) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "Exception: " + e8.getMessage());
            throw new AesKsParamException(MediaSessionCompatQueueItem.read(e8, new StringBuilder("Exception : ")));
        }
    }

    public static String serializer(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(str, str2.getBytes(Constants.ENCODING)));
            } catch (UnsupportedEncodingException e) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "encrypt: UnsupportedEncodingException : " + e.getMessage());
                return "";
            }
        }
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "alias or encrypt content is null");
        return "";
    }

    public static String read(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new String(IconCompatParcelizer(str, accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str2)), Constants.ENCODING);
            } catch (UnsupportedEncodingException e) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "decrypt: UnsupportedEncodingException : " + e.getMessage());
                return "";
            }
        }
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "alias or encrypt content is null");
        return "";
    }

    public static SecretKey write(Boolean bool, String str) throws AesKsParamException {
        if (!TextUtils.isEmpty(str)) {
            ConcurrentHashMap concurrentHashMap = IconCompatParcelizer;
            if (((SecretKey) concurrentHashMap.get(str)) == null) {
                synchronized (AesGcmKS.class) {
                    if (((SecretKey) concurrentHashMap.get(str)) == null) {
                        SecretKey secretKeyIconCompatParcelizer = IconCompatParcelizer(bool, str);
                        if (secretKeyIconCompatParcelizer != null) {
                            concurrentHashMap.put(str, secretKeyIconCompatParcelizer);
                        } else {
                            throw new AesKsParamException("AES GCM is decrypt,but alias is null");
                        }
                    }
                }
            }
            return (SecretKey) concurrentHashMap.get(str);
        }
        throw new AesKsParamException("alias is null");
    }

    public static byte[] write(SecretKey secretKey, byte[] bArr) throws AesKsParamException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(Fields.SpotShadowColor, bArrCopyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "InvalidAlgorithmParameterException : " + e.getMessage());
            throw new AesKsParamException("InvalidAlgorithmParameterException : " + e.getMessage());
        } catch (InvalidKeyException e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "InvalidKeyException : " + e2.getMessage());
            throw new AesKsParamException("InvalidKeyException : " + e2.getMessage());
        } catch (NoSuchAlgorithmException e3) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "NoSuchAlgorithmException : " + e3.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e3.getMessage());
        } catch (BadPaddingException e4) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "BadPaddingException : " + e4.getMessage());
            throw new AesKsParamException("BadPaddingException : " + e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "IllegalBlockSizeException : " + e5.getMessage());
            throw new AesKsParamException("IllegalBlockSizeException : " + e5.getMessage());
        } catch (NoSuchPaddingException e6) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "NoSuchPaddingException : " + e6.getMessage());
            throw new AesKsParamException("NoSuchPaddingException : " + e6.getMessage());
        } catch (Exception e7) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCMKS", "Exception: " + e7.getMessage());
            throw new AesKsParamException(MediaSessionCompatQueueItem.read(e7, new StringBuilder("Exception: ")));
        }
    }
}
