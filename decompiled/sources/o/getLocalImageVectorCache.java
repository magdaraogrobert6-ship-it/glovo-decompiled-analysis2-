package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLocalImageVectorCache {
    public static boolean write(byte b) {
        return b > -65;
    }

    public static void serializer(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62) {
            if (!write(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    }

    public static void write(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (write(b2) || (((b2 + 112) + (b << 28)) >> 30) != 0 || write(b3) || write(b4)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
            return;
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void IconCompatParcelizer(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (write(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || write(b3)))) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
        } else {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }
}
