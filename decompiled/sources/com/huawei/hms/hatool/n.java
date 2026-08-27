package com.huawei.hms.hatool;

import android.util.Pair;
import androidx.compose.ui.graphics.Fields;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.ComposeScrollCaptureCallbackonScrollCaptureImageRequest1;
import o.accessmaxIntrinsicWidthjd;
import o.accessminIntrinsicHeightjd;

/* JADX INFO: loaded from: classes2.dex */
public class n {
    public static final Charset a = Charset.forName(Constants.ENCODING);

    public static String b(String str, String str2) {
        byte[] bArr;
        byte[] bytes = str.getBytes(a);
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str2);
        byte[] bArrRemoteActionCompatParcelizer2 = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(16);
        byte[] bArrSerializer = ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.serializer(bytes, bArrRemoteActionCompatParcelizer, bArrRemoteActionCompatParcelizer2);
        if (Arrays.equals(bArrSerializer, new byte[0])) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("CBC", "encrypt encryptContent is null");
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[bArrRemoteActionCompatParcelizer2.length + bArrSerializer.length];
            System.arraycopy(bArrRemoteActionCompatParcelizer2, 0, bArr2, 0, bArrRemoteActionCompatParcelizer2.length);
            System.arraycopy(bArrSerializer, 0, bArr2, bArrRemoteActionCompatParcelizer2.length, bArrSerializer.length);
            bArr = bArr2;
        }
        return accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(bArr);
    }

    public static String a(byte[] bArr, String str) {
        byte[] bArrDoFinal;
        if (bArr == null || bArr.length == 0 || str == null) {
            v.b("AesCipher", "cbc encrypt(byte) param is not right");
            return "";
        }
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str);
        if (bArrRemoteActionCompatParcelizer.length < 16) {
            v.b("AesCipher", "key length is not right");
            return "";
        }
        byte[] bArrRemoteActionCompatParcelizer2 = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(12);
        if (bArr.length == 0) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCM", "encrypt 6 content length is 0");
            bArrDoFinal = new byte[0];
        } else if (bArrRemoteActionCompatParcelizer.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCM", "encrypt 6 key error: 6 key length less than 16 bytes.");
            bArrDoFinal = new byte[0];
        } else if (bArrRemoteActionCompatParcelizer2.length < 12) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCM", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            bArrDoFinal = new byte[0];
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArrRemoteActionCompatParcelizer, "AES");
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKeySpec, new GCMParameterSpec(Fields.SpotShadowColor, bArrRemoteActionCompatParcelizer2));
                bArrDoFinal = cipher.doFinal(bArr);
            } catch (NullPointerException e) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCM", "GCM encrypt data error" + e.getMessage());
                bArrDoFinal = new byte[0];
            } catch (GeneralSecurityException e2) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("GCM", "GCM encrypt data error" + e2.getMessage());
                bArrDoFinal = new byte[0];
            }
        }
        byte[] bArr2 = new byte[bArrRemoteActionCompatParcelizer2.length + bArrDoFinal.length];
        System.arraycopy(bArrRemoteActionCompatParcelizer2, 0, bArr2, 0, bArrRemoteActionCompatParcelizer2.length);
        System.arraycopy(bArrDoFinal, 0, bArr2, bArrRemoteActionCompatParcelizer2.length, bArrDoFinal.length);
        return accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(bArr2);
    }

    public static String a(String str, String str2) {
        Pair<byte[], String> pairA = a(str, 32);
        return new String(ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.IconCompatParcelizer(accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer((String) pairA.second), accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str2), (byte[]) pairA.first), a);
    }

    public static Pair<byte[], String> a(String str, int i) {
        if (str == null || str.length() < i) {
            return new Pair<>(new byte[0], str);
        }
        String strSubstring = str.substring(0, i);
        return new Pair<>(accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(strSubstring), str.substring(i));
    }
}
