package o;

/* JADX INFO: loaded from: classes2.dex */
public class stopNestedScrolls {
    static final byte[] read = new byte[androidx.compose.ui.graphics.Fields.RotationX];
    static final byte[] RemoteActionCompatParcelizer = new byte[androidx.compose.ui.graphics.Fields.RotationX];
    static final int[] write = new int[androidx.compose.ui.graphics.Fields.RotationX];
    static final int[] IconCompatParcelizer = new int[androidx.compose.ui.graphics.Fields.RotationX];
    static final int[] serializer = new int[androidx.compose.ui.graphics.Fields.RotationX];
    static final int[] MediaMetadataCompat = new int[androidx.compose.ui.graphics.Fields.RotationX];
    static final int[] RatingCompat = new int[10];

    private static int IconCompatParcelizer(byte b, int i) {
        int i2 = b & 255;
        return (i2 >> (8 - i)) | (i2 << i);
    }

    static {
        write();
        for (int i = 0; i < 256; i++) {
            int i2 = read[i] & 255;
            RemoteActionCompatParcelizer[i2] = (byte) i;
            int i3 = i << 1;
            if (i3 >= 256) {
                i3 ^= 283;
            }
            int i4 = i3 << 1;
            if (i4 >= 256) {
                i4 ^= 283;
            }
            int i5 = i4 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 ^ i;
            int i7 = ((i3 ^ (i4 ^ i5)) << 24) | (i6 << 16) | ((i6 ^ i4) << 8) | (i6 ^ i3);
            write[i2] = i7;
            IconCompatParcelizer[i2] = (i7 >>> 8) | (i7 << 24);
            serializer[i2] = (i7 >>> 16) | (i7 << 16);
            MediaMetadataCompat[i2] = (i7 << 8) | (i7 >>> 24);
        }
        read(283);
    }

    static int[] serializer(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 1) * 4;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = i4 + 3;
            int i7 = ((bArr[i4 + 1] & 255) << 16) | (bArr[i4] << 24) | ((bArr[i4 + 2] & 255) << 8);
            i4 += 4;
            iArr[i5] = i7 | (bArr[i6] & 255);
        }
        int i8 = 4;
        int i9 = 0;
        while (i8 < i2) {
            int i10 = iArr[i8 - 1];
            if (i3 == 0) {
                byte[] bArr2 = read;
                i10 = ((bArr2[i10 >>> 24] & 255) | (((bArr2[(i10 >>> 16) & 255] << 24) | ((bArr2[(i10 >>> 8) & 255] & 255) << 16)) | ((bArr2[i10 & 255] & 255) << 8))) ^ RatingCompat[i9];
                i3 = 4;
                i9++;
            }
            iArr[i8] = i10 ^ iArr[i8 - 4];
            i8++;
            i3--;
        }
        return iArr;
    }

    static int[] write(byte[] bArr, int i) throws IllegalArgumentException {
        return write(bArr, serializer(bArr, i), i);
    }

    private static int[] write(byte[] bArr, int[] iArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = 4;
        int[] iArr2 = new int[(i + 1) * 4];
        int i3 = i * 4;
        iArr2[0] = iArr[i3];
        iArr2[1] = iArr[i3 + 1];
        iArr2[2] = iArr[i3 + 2];
        iArr2[3] = iArr[i3 + 3];
        int i4 = i3 - 4;
        for (int i5 = 1; i5 < i; i5++) {
            int i6 = iArr[i4];
            int[] iArr3 = write;
            byte[] bArr2 = read;
            int i7 = iArr3[bArr2[i6 >>> 24] & 255];
            int[] iArr4 = IconCompatParcelizer;
            int i8 = i7 ^ iArr4[bArr2[(i6 >>> 16) & 255] & 255];
            int[] iArr5 = serializer;
            int i9 = i8 ^ iArr5[bArr2[(i6 >>> 8) & 255] & 255];
            int[] iArr6 = MediaMetadataCompat;
            iArr2[i2] = iArr6[bArr2[i6 & 255] & 255] ^ i9;
            int i10 = iArr[i4 + 1];
            iArr2[i2 + 1] = iArr6[bArr2[i10 & 255] & 255] ^ ((iArr4[bArr2[(i10 >>> 16) & 255] & 255] ^ iArr3[bArr2[i10 >>> 24] & 255]) ^ iArr5[bArr2[(i10 >>> 8) & 255] & 255]);
            int i11 = iArr[i4 + 2];
            int i12 = i2 + 3;
            iArr2[i2 + 2] = iArr6[bArr2[i11 & 255] & 255] ^ ((iArr3[bArr2[i11 >>> 24] & 255] ^ iArr4[bArr2[(i11 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i11 >>> 8) & 255] & 255]);
            int i13 = iArr[i4 + 3];
            i2 += 4;
            iArr2[i12] = iArr6[bArr2[i13 & 255] & 255] ^ ((iArr3[bArr2[i13 >>> 24] & 255] ^ iArr4[bArr2[(i13 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i13 >>> 8) & 255] & 255]);
            i4 -= 4;
        }
        iArr2[i2] = iArr[i4];
        iArr2[i2 + 1] = iArr[i4 + 1];
        iArr2[i2 + 2] = iArr[i4 + 2];
        iArr2[i2 + 3] = iArr[i4 + 3];
        return iArr2;
    }

    public static byte[][] IconCompatParcelizer(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 * 8);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    private static void write() {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) (((b & 128) != 0 ? 27 : 0) ^ ((b << 1) ^ b));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = read;
            i = b & 255;
            bArr[i] = (byte) (((((b2 ^ 99) ^ IconCompatParcelizer(b2, 1)) ^ IconCompatParcelizer(b2, 2)) ^ IconCompatParcelizer(b2, 3)) ^ IconCompatParcelizer(b2, 4));
        } while (i != 1);
        bArr[0] = 99;
    }

    private static void read(int i) {
        RatingCompat[0] = 16777216;
        int i2 = 1;
        for (int i3 = 1; i3 < 10; i3++) {
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= i;
            }
            RatingCompat[i3] = i2 << 24;
        }
    }
}
