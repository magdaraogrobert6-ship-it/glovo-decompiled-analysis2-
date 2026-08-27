package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getNumLockEK5gGoQ {
    public static void IconCompatParcelizer(String str, boolean z) {
        if (z) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
    }

    public static String serializer(int i, int i2, String str) {
        if (i < 0) {
            return BrazeInAppMessageManagerregisterInAppMessageManager52.IconCompatParcelizer("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return BrazeInAppMessageManagerregisterInAppMessageManager52.IconCompatParcelizer("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    public static void serializer(int i, int i2) {
        String strIconCompatParcelizer;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strIconCompatParcelizer = BrazeInAppMessageManagerregisterInAppMessageManager52.IconCompatParcelizer("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strIconCompatParcelizer = BrazeInAppMessageManagerregisterInAppMessageManager52.IconCompatParcelizer("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strIconCompatParcelizer);
        }
    }

    public static void write(int i, int i2, int i3) {
        String strSerializer;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strSerializer = serializer(i, i3, "start index");
            } else if (i2 >= 0 && i2 <= i3) {
                strSerializer = BrazeInAppMessageManagerregisterInAppMessageManager52.IconCompatParcelizer("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                strSerializer = serializer(i2, i3, "end index");
            }
            throw new IndexOutOfBoundsException(strSerializer);
        }
    }
}
