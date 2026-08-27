package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ContentScaleCompanion {
    public static int IconCompatParcelizer(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static void write(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int serializer(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iSerializer = getFillBoundsannotations.serializer(obj);
        int i2 = iSerializer & i;
        int iIconCompatParcelizer = IconCompatParcelizer(i2, obj3);
        if (iIconCompatParcelizer != 0) {
            int i3 = ~i;
            int i4 = -1;
            while (true) {
                int i5 = iIconCompatParcelizer - 1;
                int i6 = iArr[i5];
                if ((i6 & i3) == (iSerializer & i3) && decodeInitialData.write(obj, objArr[i5])) {
                    if (objArr2 == null || decodeInitialData.write(obj2, objArr2[i5])) {
                        int i7 = i6 & i;
                        if (i4 == -1) {
                            write(i2, i7, obj3);
                            return i5;
                        }
                        iArr[i4] = (i & i7) | (iArr[i4] & i3);
                        return i5;
                    }
                }
                int i8 = i6 & i;
                if (i8 == 0) {
                    break;
                }
                i4 = i5;
                iIconCompatParcelizer = i8;
            }
        }
        return -1;
    }

    public static Object read(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        if (i <= 65536) {
            return new short[i];
        }
        return new int[i];
    }
}
