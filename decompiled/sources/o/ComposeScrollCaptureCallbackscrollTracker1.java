package o;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ComposeScrollCaptureCallbackscrollTracker1 {
    public static final String[] read = {"SHA-256", "SHA-384", "SHA-512"};

    public static String IconCompatParcelizer(String str) {
        byte[] bytes;
        byte[] bArrDigest;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("SHA-256")) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("SHA", "content or algorithm is null.");
            return "";
        }
        for (int i = 0; i < 3; i++) {
            String[] strArr = read;
            if (strArr[i].equals("SHA-256")) {
                try {
                    bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
                } catch (UnsupportedEncodingException unused) {
                    bytes = new byte[0];
                    ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("SHA", "Error in generate SHA UnsupportedEncodingException");
                }
                if (bytes == null || TextUtils.isEmpty("SHA-256")) {
                    ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("SHA", "content or algorithm is null.");
                    bArrDigest = new byte[0];
                } else {
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (strArr[i2].equals("SHA-256")) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(bytes);
                                bArrDigest = messageDigest.digest();
                            } catch (NoSuchAlgorithmException unused2) {
                                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("SHA", "Error in generate SHA NoSuchAlgorithmException");
                                bArrDigest = new byte[0];
                            }
                        }
                    }
                    ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("SHA", "algorithm is not safe or legal");
                    bArrDigest = new byte[0];
                }
                return accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(bArrDigest);
            }
        }
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("SHA", "algorithm is not safe or legal");
        return "";
    }
}
