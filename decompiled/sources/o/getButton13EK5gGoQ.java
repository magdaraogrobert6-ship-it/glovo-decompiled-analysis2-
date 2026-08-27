package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getButton13EK5gGoQ {
    public static String read(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            if ((b & 240) == 0) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & 255));
        }
        return sb.toString().toUpperCase(java.util.Locale.ENGLISH);
    }

    public static byte[] write(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("purported base16 string has odd number of characters");
            return null;
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 16);
            int iDigit2 = Character.digit(str.charAt(i + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("purported base16 string has illegal char");
                return null;
            }
            bArr[i / 2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }
}
