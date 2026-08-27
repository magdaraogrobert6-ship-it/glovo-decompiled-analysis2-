package o;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: o.getTimestamp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0170getTimestamp {
    public static final long[] read = new long[0];

    public static final int serializer(ArrayList arrayList, int i, int i2) {
        int iWrite = write(arrayList, i, i2);
        return iWrite >= 0 ? iWrite : -(iWrite + 1);
    }

    public static final void IconCompatParcelizer() {
        throw new ConcurrentModificationException();
    }

    public static final int read(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final int write(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 30) + iArr[i2 + 4];
    }

    public static final void write(int[] iArr, int i, int i2) {
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final AndroidContentCaptureManagersendContentCaptureAppearEvents1 serializer(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1) {
        if (!(androidContentCaptureManagersendContentCaptureAppearEvents1 instanceof AndroidContentCaptureManagersendContentCaptureAppearEvents1)) {
            androidContentCaptureManagersendContentCaptureAppearEvents1 = null;
        }
        if (androidContentCaptureManagersendContentCaptureAppearEvents1 != null) {
            return androidContentCaptureManagersendContentCaptureAppearEvents1;
        }
        getCreditCardExpirationDay.IconCompatParcelizer("Inconsistent composition");
        DrawableTransformation.read();
        return null;
    }

    public static final int write(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((AndroidContentCaptureManagercurrentSemanticsNodes1) arrayList.get(i4)).IconCompatParcelizer;
            if (i5 < 0) {
                i5 += i2;
            }
            int iSerializer = removeNodeAtDepth.serializer(i5, i);
            if (iSerializer < 0) {
                i3 = i4 + 1;
            } else {
                if (iSerializer <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
