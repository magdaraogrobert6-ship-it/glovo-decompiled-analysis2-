package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class accessanimateTo {
    public long[] IconCompatParcelizer;
    public int[] RatingCompat;
    public int[] RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final void read() {
        this.serializer = 0;
        long[] jArr = this.IconCompatParcelizer;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.IconCompatParcelizer;
            int i = this.write;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.read = detectDragGestures.IconCompatParcelizer(this.write) - this.serializer;
    }

    public final int hashCode() {
        int[] iArr = this.RemoteActionCompatParcelizer;
        int[] iArr2 = this.RatingCompat;
        long[] jArr = this.IconCompatParcelizer;
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
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        iHashCode += Integer.hashCode(iArr2[i4]) ^ Integer.hashCode(i5);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.serializer == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.RemoteActionCompatParcelizer;
        int[] iArr2 = this.RatingCompat;
        long[] jArr = this.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            sb.append(i6);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(i7);
                            i2++;
                            if (i2 < this.serializer) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public accessanimateTo(int i) {
        this.IconCompatParcelizer = detectDragGestures.write;
        int[] iArr = Contentfoundation.read;
        this.RemoteActionCompatParcelizer = iArr;
        this.RatingCompat = iArr;
        if (i >= 0) {
            read(detectDragGestures.write(i));
        } else {
            ForEachGestureKt.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void read(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(i)) : 0;
        this.write = iMax;
        if (iMax == 0) {
            jArr = detectDragGestures.write;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.IconCompatParcelizer = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.read = detectDragGestures.IconCompatParcelizer(this.write) - this.serializer;
        this.RemoteActionCompatParcelizer = new int[iMax];
        this.RatingCompat = new int[iMax];
    }

    public final void IconCompatParcelizer(int i, int i2) {
        long j;
        int i3;
        int i4;
        int i5;
        accessanimateTo accessanimateto = this;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = accessanimateto.write;
        int i9 = i7 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = accessanimateto.IconCompatParcelizer;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j2 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j3 = i6 & 127;
            int i13 = i10;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = -9187201950435737472L;
            for (long j6 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i9) & i8;
                if (accessanimateto.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == i) {
                    i4 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iRemoteActionCompatParcelizer = accessanimateto.RemoteActionCompatParcelizer(i7);
                long j7 = 255;
                if (accessanimateto.read != 0 || ((accessanimateto.IconCompatParcelizer[iRemoteActionCompatParcelizer >> 3] >> ((iRemoteActionCompatParcelizer & 7) << 3)) & 255) == 254) {
                    j = j3;
                    i3 = 0;
                } else {
                    int i14 = accessanimateto.write;
                    if (i14 > 8) {
                        i5 = i7;
                        if (Long.compareUnsigned(((long) accessanimateto.serializer) * 32, ((long) i14) * 25) <= 0) {
                            long[] jArr2 = accessanimateto.IconCompatParcelizer;
                            int i15 = accessanimateto.write;
                            int[] iArr = accessanimateto.RemoteActionCompatParcelizer;
                            int[] iArr2 = accessanimateto.RatingCompat;
                            int i16 = 0;
                            while (i16 < ((i15 + 7) >> 3)) {
                                long j8 = jArr2[i16] & j5;
                                jArr2[i16] = (-72340172838076674L) & ((~j8) + (j8 >>> 7));
                                i16++;
                                j5 = -9187201950435737472L;
                            }
                            int iRemoteActionCompatParcelizer2 = onContentCardClicked.RemoteActionCompatParcelizer(jArr2);
                            int i17 = iRemoteActionCompatParcelizer2 - 1;
                            jArr2[i17] = (jArr2[i17] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iRemoteActionCompatParcelizer2] = jArr2[0];
                            int i18 = 0;
                            while (i18 != i15) {
                                int i19 = i18 >> 3;
                                int i20 = (i18 & 7) << 3;
                                long j9 = (jArr2[i19] >> i20) & 255;
                                if (j9 != 128 && j9 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr[i18]) * (-862048943);
                                    int i21 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i22 = i21 >>> 7;
                                    int iRemoteActionCompatParcelizer3 = accessanimateto.RemoteActionCompatParcelizer(i22);
                                    int i23 = i22 & i15;
                                    if (((iRemoteActionCompatParcelizer3 - i23) & i15) / 8 == ((i18 - i23) & i15) / 8) {
                                        jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (((long) (i21 & 127)) << i20);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i18++;
                                    } else {
                                        int i24 = iRemoteActionCompatParcelizer3 >> 3;
                                        long j10 = jArr2[i24];
                                        int i25 = (iRemoteActionCompatParcelizer3 & 7) << 3;
                                        if (((j10 >> i25) & 255) == 128) {
                                            jArr2[i24] = ((~(255 << i25)) & j10) | (((long) (i21 & 127)) << i25);
                                            jArr2[i19] = (jArr2[i19] & (~(255 << i20))) | (128 << i20);
                                            iArr[iRemoteActionCompatParcelizer3] = iArr[i18];
                                            iArr[i18] = 0;
                                            iArr2[iRemoteActionCompatParcelizer3] = iArr2[i18];
                                            iArr2[i18] = 0;
                                        } else {
                                            jArr2[i24] = (((long) (i21 & 127)) << i25) | ((~(255 << i25)) & j10);
                                            int i26 = iArr[iRemoteActionCompatParcelizer3];
                                            iArr[iRemoteActionCompatParcelizer3] = iArr[i18];
                                            iArr[i18] = i26;
                                            int i27 = iArr2[iRemoteActionCompatParcelizer3];
                                            iArr2[iRemoteActionCompatParcelizer3] = iArr2[i18];
                                            iArr2[i18] = i27;
                                            i18--;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i18++;
                                        accessanimateto = this;
                                    }
                                    j3 = j3;
                                } else {
                                    i18++;
                                }
                            }
                            j = j3;
                            i3 = 0;
                            accessanimateto.read = detectDragGestures.IconCompatParcelizer(accessanimateto.write) - accessanimateto.serializer;
                        }
                        iRemoteActionCompatParcelizer = accessanimateto.RemoteActionCompatParcelizer(i5);
                    } else {
                        i5 = i7;
                    }
                    j = j3;
                    i3 = 0;
                    int iSerializer = detectDragGestures.serializer(accessanimateto.write);
                    long[] jArr3 = accessanimateto.IconCompatParcelizer;
                    int[] iArr3 = accessanimateto.RemoteActionCompatParcelizer;
                    int[] iArr4 = accessanimateto.RatingCompat;
                    int i28 = accessanimateto.write;
                    accessanimateto.read(iSerializer);
                    long[] jArr4 = accessanimateto.IconCompatParcelizer;
                    int[] iArr5 = accessanimateto.RemoteActionCompatParcelizer;
                    int[] iArr6 = accessanimateto.RatingCompat;
                    int i29 = accessanimateto.write;
                    int i30 = 0;
                    while (i30 < i28) {
                        if (((jArr3[i30 >> 3] >> ((i30 & 7) << 3)) & j7) < 128) {
                            int i31 = iArr3[i30];
                            int iHashCode3 = Integer.hashCode(i31) * (-862048943);
                            int i32 = iHashCode3 ^ (iHashCode3 << 16);
                            int iRemoteActionCompatParcelizer4 = accessanimateto.RemoteActionCompatParcelizer(i32 >>> 7);
                            long j11 = i32 & 127;
                            int i33 = iRemoteActionCompatParcelizer4 >> 3;
                            int i34 = (iRemoteActionCompatParcelizer4 & 7) << 3;
                            long j12 = (j11 << i34) | (jArr4[i33] & (~(255 << i34)));
                            jArr4[i33] = j12;
                            jArr4[(((iRemoteActionCompatParcelizer4 - 7) & i29) + (i29 & 7)) >> 3] = j12;
                            iArr5[iRemoteActionCompatParcelizer4] = i31;
                            iArr6[iRemoteActionCompatParcelizer4] = iArr4[i30];
                        }
                        i30++;
                        j7 = 255;
                    }
                    iRemoteActionCompatParcelizer = accessanimateto.RemoteActionCompatParcelizer(i5);
                }
                accessanimateto.serializer++;
                int i35 = accessanimateto.read;
                long[] jArr5 = accessanimateto.IconCompatParcelizer;
                int i36 = iRemoteActionCompatParcelizer >> 3;
                long j13 = jArr5[i36];
                int i37 = (iRemoteActionCompatParcelizer & 7) << 3;
                accessanimateto.read = i35 - (((j13 >> i37) & 255) != 128 ? i3 : 1);
                int i38 = accessanimateto.write;
                long j14 = (j13 & (~(255 << i37))) | (j << i37);
                jArr5[i36] = j14;
                jArr5[(((iRemoteActionCompatParcelizer - 7) & i38) + (i38 & 7)) >> 3] = j14;
                i4 = ~iRemoteActionCompatParcelizer;
                break;
            }
            i10 = i13 + 8;
            i9 = (i9 + i10) & i8;
        }
        if (i4 < 0) {
            i4 = ~i4;
        }
        accessanimateto.RemoteActionCompatParcelizer[i4] = i;
        accessanimateto.RatingCompat[i4] = i2;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2 = this.write;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.IconCompatParcelizer;
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

    public final int IconCompatParcelizer(int i) {
        int iWrite = write(i);
        if (iWrite >= 0) {
            return this.RatingCompat[iWrite];
        }
        ForEachGestureKt.RemoteActionCompatParcelizer("Cannot find value for key " + i);
        throw null;
    }

    public final int serializer(int i) {
        int iWrite = write(i);
        if (iWrite >= 0) {
            return this.RatingCompat[iWrite];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[LOOP:0: B:14:0x0023->B:28:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessanimateTo)) {
            return false;
        }
        accessanimateTo accessanimateto = (accessanimateTo) obj;
        if (accessanimateto.serializer != this.serializer) {
            return false;
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        int[] iArr2 = this.RatingCompat;
        long[] jArr = this.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        int i6 = iArr2[i4];
                        int iWrite = accessanimateto.write(i5);
                        if (iWrite < 0 || i6 != accessanimateto.RatingCompat[iWrite]) {
                            break loop0;
                        }
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
            return true;
        }
        return false;
    }

    public final int write(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.write;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.IconCompatParcelizer;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public /* synthetic */ accessanimateTo() {
        this(6);
    }
}
