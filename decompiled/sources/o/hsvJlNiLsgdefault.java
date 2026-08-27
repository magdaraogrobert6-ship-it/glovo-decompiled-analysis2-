package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class hsvJlNiLsgdefault {
    public static final String RemoteActionCompatParcelizer(Collection collection) {
        return isCurrentlyDisplayingInAppMessage.serializer(onContentCardDismissed.IconCompatParcelizer(collection, ",", null, null, null, 62)).concat(isCurrentlyDisplayingInAppMessage.serializer(" }"));
    }

    public static final String read(Collection collection) {
        return isCurrentlyDisplayingInAppMessage.serializer(onContentCardDismissed.IconCompatParcelizer(collection, ",", null, null, null, 62)).concat(isCurrentlyDisplayingInAppMessage.serializer("},"));
    }

    public static Object serializer(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        String str;
        MemoryCachedeleteFeature1 memoryCachedeleteFeature1 = new MemoryCachedeleteFeature1(cls, new ByteArrayInputStream(bArr));
        Object object = memoryCachedeleteFeature1.readObject();
        if (memoryCachedeleteFeature1.available() != 0) {
            str = "unexpected data found at end of ObjectInputStream";
        } else {
            if (cls.isInstance(object)) {
                return object;
            }
            str = "unexpected class found in ObjectInputStream";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(str);
        return null;
    }

    public static final String IconCompatParcelizer(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? isCurrentlyDisplayingInAppMessage.serializer(onContentCardDismissed.IconCompatParcelizer(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final boolean serializer(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3++;
                }
            }
            if (i2 == 0) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hideCurrentlyDisplayingInAppMessage.read((CharSequence) str.substring(1, str.length() - 1)).toString(), str2}, getCieXyz.write())).booleanValue();
            }
        }
        return false;
    }

    public static byte[][] RemoteActionCompatParcelizer(byte[][] bArr) {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                }
            }
            byte[][] bArr3 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr4 = new byte[bArr[i].length];
                bArr3[i] = bArr4;
                byte[] bArr5 = bArr[i];
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            }
            return bArr3;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("in has null pointers");
        return null;
    }

    public static void serializer(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("src == null");
            return;
        }
        if (i >= 0) {
            if (bArr2.length + i <= bArr.length) {
                for (int i2 = 0; i2 < bArr2.length; i2++) {
                    bArr[i + i2] = bArr2[i2];
                }
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("src length + offset must not be greater than size of destination");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("offset hast to be >= 0");
    }

    public static byte[] write(int i, long j) {
        byte[] bArr = new byte[i];
        while (true) {
            i--;
            if (i < 0) {
                return bArr;
            }
            bArr[i] = (byte) j;
            j >>>= 8;
        }
    }

    public static byte[] RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("src == null");
            return null;
        }
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("offset hast to be >= 0");
            return null;
        }
        if (i2 >= 0) {
            if (i + i2 <= bArr.length) {
                byte[] bArr2 = new byte[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr2[i3] = bArr[i + i3];
                }
                return bArr2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("offset + length must not be greater then size of source array");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("length hast to be >= 0");
        return null;
    }

    public static long write(int i, byte[] bArr) {
        long j = 0;
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("in == null");
            return 0L;
        }
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public static boolean RemoteActionCompatParcelizer(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("index must not be negative");
        return false;
    }

    public static byte[] write(byte[] bArr) {
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("in == null");
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
