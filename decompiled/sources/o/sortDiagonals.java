package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sortDiagonals {
    public static byte[] read(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            byte b = 0;
            long jSerializer = serializer(0, bArr) & 67108863;
            long jSerializer2 = (serializer(3, bArr) >> 2) & 67108611;
            long jSerializer3 = (serializer(6, bArr) >> 4) & 67092735;
            long jSerializer4 = (serializer(9, bArr) >> 6) & 66076671;
            long jSerializer5 = (serializer(12, bArr) >> 8) & 1048575;
            long j = jSerializer3 * 5;
            long j2 = jSerializer4 * 5;
            long j3 = jSerializer5 * 5;
            int i = 17;
            byte[] bArr3 = new byte[17];
            long j4 = 0;
            int i2 = 0;
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            while (i2 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i2);
                System.arraycopy(bArr2, i2, bArr3, b, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i, b);
                }
                long jSerializer6 = j8 + (serializer(b, bArr3) & 67108863);
                long jSerializer7 = j5 + ((serializer(3, bArr3) >> 2) & 67108863);
                long jSerializer8 = j4 + ((serializer(6, bArr3) >> 4) & 67108863);
                long jSerializer9 = j6 + ((serializer(9, bArr3) >> 6) & 67108863);
                long jSerializer10 = j7 + (((serializer(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
                long j9 = (jSerializer2 * 5 * jSerializer10) + (jSerializer9 * j) + (jSerializer8 * j2) + (jSerializer7 * j3) + (jSerializer6 * jSerializer);
                long j10 = (jSerializer10 * j) + (jSerializer9 * j2) + (jSerializer8 * j3) + (jSerializer7 * jSerializer) + (jSerializer6 * jSerializer2) + (j9 >> 26);
                long j11 = (jSerializer10 * j2) + (jSerializer9 * j3) + (jSerializer8 * jSerializer) + (jSerializer7 * jSerializer2) + (jSerializer6 * jSerializer3) + (j10 >> 26);
                long j12 = (jSerializer10 * j3) + (jSerializer9 * jSerializer) + (jSerializer8 * jSerializer2) + (jSerializer7 * jSerializer3) + (jSerializer6 * jSerializer4) + (j11 >> 26);
                long j13 = (jSerializer10 * jSerializer) + (jSerializer9 * jSerializer2) + (jSerializer8 * jSerializer3) + (jSerializer7 * jSerializer4) + (jSerializer6 * jSerializer5) + (j12 >> 26);
                long j14 = ((j13 >> 26) * 5) + (j9 & 67108863);
                i2 += 16;
                j6 = j12 & 67108863;
                j8 = j14 & 67108863;
                j5 = (j10 & 67108863) + (j14 >> 26);
                j7 = j13 & 67108863;
                j4 = j11 & 67108863;
                b = 0;
                i = 17;
            }
            long j15 = j4 + (j5 >> 26);
            long j16 = j15 & 67108863;
            long j17 = j6 + (j15 >> 26);
            long j18 = j17 & 67108863;
            long j19 = j7 + (j17 >> 26);
            long j20 = j19 & 67108863;
            long j21 = ((j19 >> 26) * 5) + j8;
            long j22 = j21 & 67108863;
            long j23 = (j5 & 67108863) + (j21 >> 26);
            long j24 = j22 + 5;
            long j25 = j23 + (j24 >> 26);
            long j26 = j16 + (j25 >> 26);
            long j27 = j18 + (j26 >> 26);
            long j28 = (j20 + (j27 >> 26)) - 67108864;
            long j29 = j28 >> 63;
            long j30 = ~j29;
            long j31 = (j23 & j29) | (j25 & 67108863 & j30);
            long j32 = (j16 & j29) | (j26 & 67108863 & j30);
            long j33 = (j18 & j29) | (j27 & 67108863 & j30);
            long jSerializer11 = serializer(16, bArr) + (((j22 & j29) | (j24 & 67108863 & j30) | (j31 << 26)) & 4294967295L);
            long jSerializer12 = serializer(20, bArr) + (((j31 >> 6) | (j32 << 20)) & 4294967295L) + (jSerializer11 >> 32);
            long jSerializer13 = serializer(24, bArr) + (((j32 >> 12) | (j33 << 14)) & 4294967295L) + (jSerializer12 >> 32);
            long jSerializer14 = serializer(28, bArr);
            byte[] bArr4 = new byte[16];
            write(0, jSerializer11 & 4294967295L, bArr4);
            write(4, jSerializer12 & 4294967295L, bArr4);
            write(8, jSerializer13 & 4294967295L, bArr4);
            write(12, ((((j33 >> 18) | (((j20 & j29) | (j28 & j30)) << 8)) & 4294967295L) + jSerializer14 + (jSerializer13 >> 32)) & 4294967295L, bArr4);
            return bArr4;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The key length in bytes must be 32.");
        return null;
    }

    public static long serializer(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static void write(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
