package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getVariationsdefault implements clearEvaluationsCache {
    public static final int[] serializer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;

    @Override // o.clearEvaluationsCache
    public final int write(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = 16;
        if (i4 == 0) {
            int i6 = i;
            while (i6 <= (i + i2) - 4) {
                if ((bArr[i6 + 3] & 255) == 235) {
                    int i7 = i6 + 2;
                    int i8 = i6 + 1;
                    int i9 = (((((bArr[i7] & 255) << 16) | ((bArr[i8] & 255) << 8)) | (bArr[i6] & 255)) << 2) - ((this.read + i6) - i);
                    bArr[i7] = (byte) (i9 >>> 18);
                    bArr[i8] = (byte) (i9 >>> 10);
                    bArr[i6] = (byte) (i9 >>> 2);
                }
                i6 += 4;
            }
            int i10 = i6 - i;
            this.read += i10;
            return i10;
        }
        int i11 = 3;
        char c = '\t';
        int i12 = 1;
        if (i4 != 1) {
            if (i4 == 2) {
                int i13 = i;
                while (i13 <= (i + i2) - 4) {
                    int i14 = i13 + 1;
                    int i15 = bArr[i14];
                    if ((i15 & 248) == 240) {
                        int i16 = i13 + 3;
                        int i17 = bArr[i16];
                        if ((i17 & 248) == 248) {
                            int i18 = i13 + 2;
                            int i19 = ((((((i15 & 7) << 19) | ((bArr[i13] & 255) << 11)) | ((i17 & 7) << 8)) | (bArr[i18] & 255)) << 1) - ((this.read + i13) - i);
                            bArr[i14] = (byte) (240 | ((i19 >>> 20) & 7));
                            bArr[i13] = (byte) (i19 >>> 12);
                            bArr[i16] = (byte) (((i19 >>> 9) & 7) | 248);
                            bArr[i18] = (byte) (i19 >>> 1);
                            i13 = i18;
                        }
                    }
                    i13 += 2;
                }
                int i20 = i13 - i;
                this.read += i20;
                return i20;
            }
            if (i4 != 3) {
                int i21 = i;
                while (i21 <= (i + i2) - 4) {
                    byte b = bArr[i21];
                    if ((b == 64 && (bArr[i21 + 1] & 192) == 0) || (b == 127 && (bArr[i21 + 1] & 192) == 192)) {
                        getRegionfwf_client_release.serializer(bArr, i21, ((((getRegionfwf_client_release.read(i21, bArr) + (-(((this.read + i21) - i) >>> 2))) << 9) >> 9) & 1073741823) | 1073741824);
                    }
                    i21 += 4;
                }
                int i22 = i21 - i;
                this.read += i22;
                return i22;
            }
            int i23 = i;
            while (i23 <= (i + i2) - 4) {
                if ((bArr[i23] & 252) == 72 && (bArr[i23 + 3] & 3) == 1) {
                    getRegionfwf_client_release.serializer(bArr, i23, ((getRegionfwf_client_release.read(i23, bArr) + (-((this.read + i23) - i))) & 67108860) | 1207959553);
                }
                i23 += 4;
            }
            int i24 = i23 - i;
            this.read += i24;
            return i24;
        }
        int i25 = i;
        while (i25 <= (i + i2) - i5) {
            int i26 = serializer[bArr[i25] & 31];
            int i27 = 5;
            int i28 = 0;
            while (i28 < i11) {
                if (((i26 >>> i28) & i12) == 0) {
                    i3 = i27;
                } else {
                    int i29 = i27 >>> 3;
                    int i30 = i27 & 7;
                    long j = 0;
                    int i31 = 0;
                    while (i31 < 6) {
                        j |= (((long) bArr[(i25 + i29) + i31]) & 255) << (i31 * 8);
                        i31++;
                        i27 = i27;
                    }
                    i3 = i27;
                    long j2 = j >>> i30;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> c) & 7) == 0) {
                        long j3 = (((((((int) (j2 >>> 36)) & i12) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4) - ((this.read + i25) - i)) >>> 4;
                        long j4 = (i12 << i30) - i12;
                        int i32 = 0;
                        while (i32 < 6) {
                            bArr[i25 + i29 + i32] = (byte) ((((((j2 & (-77309403137L)) | ((j3 & 1048575) << 13)) | ((j3 & 1048576) << 16)) << i30) | (j & j4)) >>> (i32 * 8));
                            i32++;
                            j2 = j2;
                        }
                    }
                }
                i28++;
                i27 = i3 + 41;
                i11 = 3;
                c = '\t';
                i12 = 1;
            }
            i25 += 16;
            i5 = 16;
            i11 = 3;
            c = '\t';
            i12 = 1;
        }
        int i33 = i25 - i;
        this.read += i33;
        return i33;
    }
}
