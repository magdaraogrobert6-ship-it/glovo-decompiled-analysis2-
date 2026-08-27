package o;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessmaxIntrinsicWidthjd {
    public static String RemoteActionCompatParcelizer(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] RemoteActionCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            String upperCase = str.toUpperCase(java.util.Locale.ENGLISH);
            int length = upperCase.length() / 2;
            byte[] bArr = new byte[length];
            try {
                byte[] bytes = upperCase.getBytes(com.adjust.sdk.Constants.ENCODING);
                for (int i = 0; i < length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("0x");
                    int i2 = i * 2;
                    sb.append(new String(new byte[]{bytes[i2]}, com.adjust.sdk.Constants.ENCODING));
                    bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, com.adjust.sdk.Constants.ENCODING)).byteValue());
                }
                return bArr;
            } catch (UnsupportedEncodingException | NumberFormatException e) {
                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("HexUtil", "hex string 2 byte array exception : " + e.getMessage());
                return new byte[0];
            }
        } catch (Throwable th) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("HexUtil", "hex string toUpperCase exception : " + th.getMessage());
            return new byte[0];
        }
    }
}
