package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetMinimumTouchTargetSizeMYxV2XQjd {
    public static final char[] IconCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String read(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = IconCompatParcelizer;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static byte[] IconCompatParcelizer(String str) {
        String strM;
        char[] charArray = str.toCharArray();
        if ((charArray.length & 1) == 0) {
            byte[] bArr = new byte[charArray.length >> 1];
            int i = 0;
            int i2 = 0;
            while (i < charArray.length) {
                int iDigit = Character.digit(charArray[i], 16);
                if (iDigit != -1) {
                    int i3 = i + 1;
                    int iDigit2 = Character.digit(charArray[i3], 16);
                    if (iDigit2 != -1) {
                        i += 2;
                        bArr[i2] = (byte) (((iDigit << 4) | iDigit2) & 255);
                        i2++;
                    } else {
                        strM = c8$$ExternalSyntheticOutline0.m(i3, "Illegal hexadecimal character at index ");
                    }
                } else {
                    strM = c8$$ExternalSyntheticOutline0.m(i, "Illegal hexadecimal character at index ");
                }
            }
            return bArr;
        }
        strM = "Odd number of characters.";
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(strM);
        return null;
    }
}
