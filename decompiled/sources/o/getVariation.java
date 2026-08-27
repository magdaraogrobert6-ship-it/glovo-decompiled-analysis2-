package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getVariation implements clearEvaluationsCache {
    public static final boolean[] read = {true, true, true, false, true, false, false, false};
    public static final int[] serializer = {0, 1, 2, 2, 3, 3, 3, 3};
    public int IconCompatParcelizer;
    public int write;

    @Override // o.clearEvaluationsCache
    public final int write(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i - 1;
        int i5 = i;
        while (true) {
            if (i5 > (i2 + i) - 5) {
                break;
            }
            if ((bArr[i5] & 254) == 232) {
                int i6 = i5 - i4;
                int[] iArr = serializer;
                if ((i6 & (-4)) != 0) {
                    this.IconCompatParcelizer = 0;
                } else {
                    int i7 = (this.IconCompatParcelizer << (i6 - 1)) & 7;
                    this.IconCompatParcelizer = i7;
                    if (i7 != 0) {
                        if (read[i7]) {
                            int i8 = bArr[(i5 + 4) - iArr[i7]] & 255;
                            if (i8 == 0 || i8 == 255) {
                            }
                            i4 = i5;
                        }
                        this.IconCompatParcelizer = (i7 << 1) | 1;
                        i4 = i5;
                    }
                }
                int i9 = i5 + 4;
                int i10 = bArr[i9];
                int i11 = i10 & 255;
                if (i11 != 0 && i11 != 255) {
                    this.IconCompatParcelizer = (this.IconCompatParcelizer << 1) | 1;
                    i4 = i5;
                } else {
                    int i12 = i5 + 1;
                    int i13 = i5 + 2;
                    int i14 = i5 + 3;
                    int i15 = (i10 << 24) | (bArr[i12] & 255) | ((bArr[i13] & 255) << 8) | ((bArr[i14] & 255) << 16);
                    while (true) {
                        i3 = i15 - ((this.write + i5) - i);
                        int i16 = this.IconCompatParcelizer;
                        if (i16 != 0) {
                            int i17 = iArr[i16] * 8;
                            int i18 = ((byte) (i3 >>> (24 - i17))) & 255;
                            if (i18 != 0 && i18 != 255) {
                                break;
                            }
                            i15 = i3 ^ ((1 << (32 - i17)) - 1);
                        } else {
                            break;
                        }
                    }
                    int i19 = (i3 << 7) >> 7;
                    bArr[i12] = (byte) i19;
                    bArr[i13] = (byte) (i19 >>> 8);
                    bArr[i14] = (byte) (i19 >>> 16);
                    bArr[i9] = (byte) (i19 >>> 24);
                    i4 = i5;
                    i5 = i9;
                }
            }
            i5++;
        }
        int i20 = i5 - i4;
        this.IconCompatParcelizer = (i20 & (-4)) == 0 ? this.IconCompatParcelizer << (i20 - 1) : 0;
        int i21 = i5 - i;
        this.write += i21;
        return i21;
    }
}
