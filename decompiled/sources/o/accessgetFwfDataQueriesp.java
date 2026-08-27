package o;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetFwfDataQueriesp {
    public int[][] RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final byte[] IconCompatParcelizer() {
        int[][] iArr = this.RemoteActionCompatParcelizer;
        int i = this.read;
        int i2 = this.write;
        int i3 = 8;
        byte[] bArr = new byte[(((i + 7) >>> 3) * i2) + 8];
        composeColorSpace.serializer(bArr, i2, 0);
        composeColorSpace.serializer(bArr, this.read, 4);
        int i4 = this.read;
        int i5 = i4 >>> 5;
        for (int i6 = 0; i6 < this.write; i6++) {
            int i7 = 0;
            while (i7 < i5) {
                composeColorSpace.serializer(bArr, iArr[i6][i7], i3);
                i7++;
                i3 += 4;
            }
            int i8 = 0;
            while (i8 < (i4 & 31)) {
                bArr[i3] = (byte) ((iArr[i6][i5] >>> i8) & 255);
                i8 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public accessgetFwfDataQueriesp(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.write = composeColorSpace.serializer(0, bArr);
        int iSerializer = composeColorSpace.serializer(4, bArr);
        this.read = iSerializer;
        int i = this.write;
        if (i > 0) {
            int i2 = 8;
            if (((iSerializer + 7) >>> 3) * i == bArr.length - 8) {
                int i3 = (iSerializer + 31) >>> 5;
                this.serializer = i3;
                this.RemoteActionCompatParcelizer = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i3);
                int i4 = this.read;
                int i5 = i4 >> 5;
                for (int i6 = 0; i6 < this.write; i6++) {
                    int i7 = 0;
                    while (i7 < i5) {
                        this.RemoteActionCompatParcelizer[i6][i7] = composeColorSpace.serializer(i2, bArr);
                        i7++;
                        i2 += 4;
                    }
                    int i8 = 0;
                    while (i8 < (i4 & 31)) {
                        int[] iArr = this.RemoteActionCompatParcelizer[i6];
                        iArr[i5] = iArr[i5] ^ ((bArr[i2] & 255) << i8);
                        i8 += 8;
                        i2++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    public final int hashCode() {
        int i;
        int i2 = (((this.write * 31) + this.read) * 31) + this.serializer;
        for (int i3 = 0; i3 < this.write; i3++) {
            int[] iArr = this.RemoteActionCompatParcelizer[i3];
            if (iArr == null) {
                i = 0;
            } else {
                int length = iArr.length;
                i = length + 1;
                while (true) {
                    length--;
                    if (length >= 0) {
                        i = (i * 257) ^ iArr[length];
                    }
                }
            }
            i2 = (i2 * 31) + i;
        }
        return i2;
    }

    public final String toString() {
        int[][] iArr;
        int i = this.read & 31;
        int i2 = this.serializer;
        int i3 = i == 0 ? i2 : i2 - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < this.write; i4++) {
            stringBuffer.append(i4 + ": ");
            int i5 = 0;
            while (true) {
                iArr = this.RemoteActionCompatParcelizer;
                if (i5 >= i3) {
                    break;
                }
                int i6 = iArr[i4][i5];
                for (int i7 = 0; i7 < 32; i7++) {
                    if (((i6 >>> i7) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
                i5++;
            }
            int i8 = iArr[i4][i2 - 1];
            for (int i9 = 0; i9 < i; i9++) {
                if (((i8 >>> i9) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof accessgetFwfDataQueriesp)) {
            return false;
        }
        accessgetFwfDataQueriesp accessgetfwfdataqueriesp = (accessgetFwfDataQueriesp) obj;
        if (this.write != accessgetfwfdataqueriesp.write || this.read != accessgetfwfdataqueriesp.read || this.serializer != accessgetfwfdataqueriesp.serializer) {
            return false;
        }
        for (int i = 0; i < this.write; i++) {
            if (!getJEK5gGoQ.IconCompatParcelizer(this.RemoteActionCompatParcelizer[i], accessgetfwfdataqueriesp.RemoteActionCompatParcelizer[i])) {
                return false;
            }
        }
        return true;
    }

    public accessgetFwfDataQueriesp() {
    }
}
