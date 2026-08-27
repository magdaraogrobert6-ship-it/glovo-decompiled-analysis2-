package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdagkrDDkERifauZUmtkJOYYCCYn0 {
    public static void read(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String serializer(String str, String str2) {
        try {
            byte[] bytes = (str + ":" + str2).getBytes("ISO-8859-1");
            RequestBuilder requestBuilder = RequestBuilder.EMPTY;
            return "Basic " + ImageHeaderParserImageType.IconCompatParcelizer(bytes).read();
        } catch (UnsupportedEncodingException unused) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            return null;
        }
    }

    public static void serializer(getSizeNHjbRcannotations getsizenhjbrcannotations, AudioSourceAccessException audioSourceAccessException, int i) {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = getsizenhjbrcannotations.read(bArr, 0, iMin);
            if (i2 != iMin) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i -= i2;
                audioSourceAccessException.write(bArr, 0, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] IconCompatParcelizer(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static boolean RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static void read(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}
