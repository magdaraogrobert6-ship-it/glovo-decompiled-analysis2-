package o;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ComposeScrollCaptureCallbackonScrollCaptureImageRequest1 {
    public static byte[] serializer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "NullPointerException: " + e.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "InvalidKeyException: " + e3.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e4) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
            return new byte[0];
        } catch (BadPaddingException e5) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "BadPaddingException: " + e5.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "IllegalBlockSizeException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e7) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "NoSuchPaddingException: " + e7.getMessage());
            return new byte[0];
        }
    }

    public static String write(String str, byte[] bArr) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
            } catch (Exception e) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "getIv exception : " + e.getMessage());
                str2 = "";
            }
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            try {
                str3 = str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
            } catch (Exception e2) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "get encryptword exception : " + e2.getMessage());
                str3 = "";
            }
        }
        if (TextUtils.isEmpty(str2)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 2 iv is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 2 encrypt content is null");
            return "";
        }
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str2);
        if (TextUtils.isEmpty(str3)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 4 content is null");
            return "";
        }
        if (bArr.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 4 key error: 4 key length less than 16 bytes.");
            return "";
        }
        if (bArrRemoteActionCompatParcelizer.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 4 iv error: 4 iv length less than 16 bytes.");
            return "";
        }
        try {
            return new String(IconCompatParcelizer(accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str3), bArr, bArrRemoteActionCompatParcelizer), com.adjust.sdk.Constants.ENCODING);
        } catch (UnsupportedEncodingException e3) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", " cbc decrypt data error" + e3.getMessage());
            return "";
        }
    }

    public static String IconCompatParcelizer(String str, byte[] bArr) {
        byte[] bArrSerializer;
        if (TextUtils.isEmpty(str)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        byte[] bArrRemoteActionCompatParcelizer = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(16);
        if (TextUtils.isEmpty(str)) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 5 content is null");
            bArrSerializer = new byte[0];
        } else if (bArr.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 5 key error: 5 key length less than 16 bytes.");
            bArrSerializer = new byte[0];
        } else if (bArrRemoteActionCompatParcelizer.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt 5 iv error: 5 iv length less than 16 bytes.");
            bArrSerializer = new byte[0];
        } else {
            try {
                bArrSerializer = serializer(str.getBytes(com.adjust.sdk.Constants.ENCODING), bArr, bArrRemoteActionCompatParcelizer);
            } catch (UnsupportedEncodingException e) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", " cbc encrypt data error" + e.getMessage());
                bArrSerializer = new byte[0];
            }
        }
        if (bArrSerializer == null || bArrSerializer.length == 0) {
            return "";
        }
        String strRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer);
        String strRemoteActionCompatParcelizer2 = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(bArrSerializer);
        if (TextUtils.isEmpty(strRemoteActionCompatParcelizer) || TextUtils.isEmpty(strRemoteActionCompatParcelizer2)) {
            return "";
        }
        try {
            return strRemoteActionCompatParcelizer2.substring(0, 6) + strRemoteActionCompatParcelizer.substring(0, 6) + strRemoteActionCompatParcelizer2.substring(6, 10) + strRemoteActionCompatParcelizer.substring(6, 16) + strRemoteActionCompatParcelizer2.substring(10, 16) + strRemoteActionCompatParcelizer.substring(16) + strRemoteActionCompatParcelizer2.substring(16);
        } catch (Exception e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "mix exception: " + e2.getMessage());
            return "";
        }
    }

    public static byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 0) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "NullPointerException: " + e.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e2) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "InvalidAlgorithmParameterException: " + e2.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e3) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "InvalidKeyException: " + e3.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e4) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "NoSuchAlgorithmException: " + e4.getMessage());
            return new byte[0];
        } catch (BadPaddingException e5) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "BadPaddingException: " + e5.getMessage());
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e6) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "IllegalBlockSizeException: " + e6.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e7) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "NoSuchPaddingException: " + e7.getMessage());
            return new byte[0];
        }
    }
}
