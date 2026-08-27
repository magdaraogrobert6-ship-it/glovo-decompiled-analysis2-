package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class drag {
    public int IconCompatParcelizer;
    public int[] RemoteActionCompatParcelizer;
    public int read;
    public long[] serializer;
    public int write;

    public final void RemoteActionCompatParcelizer() {
        this.read = 0;
        long[] jArr = this.serializer;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.serializer;
            int i = this.IconCompatParcelizer;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.write = detectDragGestures.IconCompatParcelizer(this.IconCompatParcelizer) - this.read;
    }

    public final boolean IconCompatParcelizer(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.IconCompatParcelizer;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.serializer;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            MediaDescriptionCompat(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final int hashCode() {
        int[] iArr = this.RemoteActionCompatParcelizer;
        long[] jArr = this.serializer;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        iHashCode += Integer.hashCode(iArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final boolean read(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.IconCompatParcelizer;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.serializer;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == i) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return true;
                    }
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.RemoteActionCompatParcelizer;
        long[] jArr = this.serializer;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = iArr[(i << 3) + i4];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i5);
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public drag(int i) {
        this.serializer = detectDragGestures.write;
        this.RemoteActionCompatParcelizer = Contentfoundation.read;
        if (i >= 0) {
            serializer(detectDragGestures.write(i));
        } else {
            ForEachGestureKt.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void serializer(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(i)) : 0;
        this.IconCompatParcelizer = iMax;
        if (iMax == 0) {
            jArr = detectDragGestures.write;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.serializer = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.write = detectDragGestures.IconCompatParcelizer(this.IconCompatParcelizer) - this.read;
        this.RemoteActionCompatParcelizer = new int[iMax];
    }

    public final void MediaDescriptionCompat(int i) {
        this.read--;
        long[] jArr = this.serializer;
        int i2 = this.IconCompatParcelizer;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        long j;
        int iWrite;
        int iNumberOfTrailingZeros;
        int i2;
        int i3 = this.read;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = this.IconCompatParcelizer;
        int i7 = i5 & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.serializer;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = i8;
            long j2 = (((-i10) >> 63) & (jArr[i9 + 1] << (64 - i10))) | (jArr[i9] >>> i10);
            long j3 = i4 & 127;
            int i12 = i5;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = -9187201950435737472L;
            for (long j6 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                if (this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int i13 = i12;
                int iWrite2 = write(i13);
                if (this.write != 0 || ((this.serializer[iWrite2 >> 3] >> ((iWrite2 & 7) << 3)) & 255) == 254) {
                    j = j3;
                    iWrite = iWrite2;
                } else {
                    int i14 = this.IconCompatParcelizer;
                    if (i14 > 8 && Long.compareUnsigned(((long) this.read) * 32, ((long) i14) * 25) <= 0) {
                        long[] jArr2 = this.serializer;
                        int i15 = this.IconCompatParcelizer;
                        int[] iArr = this.RemoteActionCompatParcelizer;
                        int i16 = 0;
                        while (i16 < ((i15 + 7) >> 3)) {
                            long j7 = jArr2[i16] & j5;
                            jArr2[i16] = (-72340172838076674L) & ((~j7) + (j7 >>> 7));
                            i16++;
                            i3 = i3;
                            j5 = -9187201950435737472L;
                        }
                        int i17 = i3;
                        int iRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(jArr2);
                        int i18 = iRemoteActionCompatParcelizer - 1;
                        jArr2[i18] = (jArr2[i18] & 72057594037927935L) | (-72057594037927936L);
                        jArr2[iRemoteActionCompatParcelizer] = jArr2[0];
                        int i19 = 0;
                        while (i19 != i15) {
                            int i20 = i19 >> 3;
                            int i21 = (i19 & 7) << 3;
                            long j8 = (jArr2[i20] >> i21) & 255;
                            if (j8 != 128 && j8 == 254) {
                                int iHashCode2 = Integer.hashCode(iArr[i19]) * (-862048943);
                                int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                int i23 = i22 >>> 7;
                                int iWrite3 = write(i23);
                                int i24 = i23 & i15;
                                if (((iWrite3 - i24) & i15) / 8 == ((i19 - i24) & i15) / 8) {
                                    jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (((long) (i22 & 127)) << i21);
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i19++;
                                    i13 = i13;
                                    i15 = i15;
                                    i17 = i17;
                                } else {
                                    int i25 = iWrite3 >> 3;
                                    long j9 = jArr2[i25];
                                    int i26 = (iWrite3 & 7) << 3;
                                    if (((j9 >> i26) & 255) == 128) {
                                        jArr2[i25] = ((~(255 << i26)) & j9) | (((long) (i22 & 127)) << i26);
                                        jArr2[i20] = (jArr2[i20] & (~(255 << i21))) | (128 << i21);
                                        iArr[iWrite3] = iArr[i19];
                                        iArr[i19] = 0;
                                    } else {
                                        jArr2[i25] = (((long) (i22 & 127)) << i26) | ((~(255 << i26)) & j9);
                                        int i27 = iArr[iWrite3];
                                        iArr[iWrite3] = iArr[i19];
                                        iArr[i19] = i27;
                                        i19--;
                                    }
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i19++;
                                }
                                i17 = i17;
                                j3 = j3;
                                i13 = i13;
                                i15 = i15;
                            } else {
                                i19++;
                            }
                        }
                        i2 = i13;
                        i3 = i17;
                        j = j3;
                        this.write = detectDragGestures.IconCompatParcelizer(this.IconCompatParcelizer) - this.read;
                    } else {
                        i2 = i13;
                        j = j3;
                        int iSerializer = detectDragGestures.serializer(this.IconCompatParcelizer);
                        long[] jArr3 = this.serializer;
                        int[] iArr2 = this.RemoteActionCompatParcelizer;
                        int i28 = this.IconCompatParcelizer;
                        serializer(iSerializer);
                        long[] jArr4 = this.serializer;
                        int[] iArr3 = this.RemoteActionCompatParcelizer;
                        int i29 = this.IconCompatParcelizer;
                        for (int i30 = 0; i30 < i28; i30++) {
                            if (((jArr3[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < 128) {
                                int i31 = iArr2[i30];
                                int iHashCode3 = Integer.hashCode(i31) * (-862048943);
                                int i32 = iHashCode3 ^ (iHashCode3 << 16);
                                int iWrite4 = write(i32 >>> 7);
                                int i33 = iWrite4 >> 3;
                                int i34 = (iWrite4 & 7) << 3;
                                long j10 = (jArr4[i33] & (~(255 << i34))) | (((long) (i32 & 127)) << i34);
                                jArr4[i33] = j10;
                                jArr4[(((iWrite4 - 7) & i29) + (i29 & 7)) >> 3] = j10;
                                iArr3[iWrite4] = i31;
                            }
                        }
                    }
                    iWrite = write(i2);
                }
                this.read++;
                int i35 = this.write;
                long[] jArr5 = this.serializer;
                int i36 = iWrite >> 3;
                long j11 = jArr5[i36];
                int i37 = (iWrite & 7) << 3;
                this.write = i35 - (((j11 >> i37) & 255) == 128 ? 1 : 0);
                int i38 = this.IconCompatParcelizer;
                long j12 = (j11 & (~(255 << i37))) | (j << i37);
                jArr5[i36] = j12;
                jArr5[(((iWrite - 7) & i38) + (i38 & 7)) >> 3] = j12;
                iNumberOfTrailingZeros = iWrite;
                break;
            }
            i8 = i11 + 8;
            i7 = (i7 + i8) & i6;
            i5 = i12;
        }
        this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] = i;
        return this.read != i3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof drag)) {
            return false;
        }
        drag dragVar = (drag) obj;
        if (dragVar.read != this.read) {
            return false;
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        long[] jArr = this.serializer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !dragVar.read(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final int write(int i) {
        int i2 = this.IconCompatParcelizer;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.serializer;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public /* synthetic */ drag() {
        this(6);
    }
}
