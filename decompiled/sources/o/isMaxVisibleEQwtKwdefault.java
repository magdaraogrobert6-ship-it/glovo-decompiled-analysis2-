package o;

import androidx.collection.ObjectList$toString$1;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class isMaxVisibleEQwtKwdefault {
    public int read;
    public int serializer;
    public int write;
    public long[] MediaDescriptionCompat = detectDragGestures.write;
    public Object[] RemoteActionCompatParcelizer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
    public long[] MediaMetadataCompat = DragGestureDetectorKtawaitLongPressOrCancellation2.RemoteActionCompatParcelizer;
    public int IconCompatParcelizer = Integer.MAX_VALUE;
    public int RatingCompat = Integer.MAX_VALUE;

    public final void IconCompatParcelizer() {
        this.read = 0;
        long[] jArr = this.MediaDescriptionCompat;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.MediaDescriptionCompat;
            int i = this.write;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        onContentCardClicked.write(0, this.write, null, this.RemoteActionCompatParcelizer);
        onContentCardClicked.IconCompatParcelizer(this.MediaMetadataCompat, 4611686018427387903L);
        this.IconCompatParcelizer = Integer.MAX_VALUE;
        this.RatingCompat = Integer.MAX_VALUE;
        this.serializer = detectDragGestures.IconCompatParcelizer(this.write) - this.read;
    }

    public final boolean IconCompatParcelizer(Object obj) {
        int i = this.read;
        int iWrite = write(obj);
        this.RemoteActionCompatParcelizer[iWrite] = obj;
        long[] jArr = this.MediaMetadataCompat;
        int i2 = this.IconCompatParcelizer;
        jArr[iWrite] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iWrite) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.IconCompatParcelizer = iWrite;
        if (this.RatingCompat == Integer.MAX_VALUE) {
            this.RatingCompat = iWrite;
        }
        return this.read != i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[LOOP:0: B:5:0x0012->B:17:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[EDGE_INSN: B:24:0x0054->B:18:0x0054 BREAK  A[LOOP:0: B:5:0x0012->B:17:0x0051], SYNTHETIC] */
    public final boolean write(Collection collection) {
        collection.getClass();
        Object[] objArr = this.RemoteActionCompatParcelizer;
        int i = this.read;
        long[] jArr = this.MediaDescriptionCompat;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!onContentCardDismissed.write(collection, objArr[i5])) {
                                IconCompatParcelizer(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.read;
    }

    public isMaxVisibleEQwtKwdefault(int i) {
        if (i >= 0) {
            read(detectDragGestures.write(i));
        } else {
            ForEachGestureKt.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void read(int i) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(i)) : 0;
        this.write = iMax;
        if (iMax == 0) {
            jArr = detectDragGestures.write;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.MediaDescriptionCompat = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.serializer = detectDragGestures.IconCompatParcelizer(this.write) - this.read;
        if (iMax == 0) {
            objArr = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        } else {
            objArr = new Object[iMax];
        }
        this.RemoteActionCompatParcelizer = objArr;
        if (iMax == 0) {
            jArr2 = DragGestureDetectorKtawaitLongPressOrCancellation2.RemoteActionCompatParcelizer;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.MediaMetadataCompat = jArr2;
    }

    public final String toString() {
        ObjectList$toString$1 objectList$toString$1 = new ObjectList$toString$1(1, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.RemoteActionCompatParcelizer;
        long[] jArr = this.MediaMetadataCompat;
        int i = this.RatingCompat;
        int i2 = 0;
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) objectList$toString$1.invoke(obj));
            i2++;
            i = i3;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public final void IconCompatParcelizer(int i) {
        this.read--;
        long[] jArr = this.MediaDescriptionCompat;
        int i2 = this.write;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.RemoteActionCompatParcelizer[i] = null;
        long[] jArr2 = this.MediaMetadataCompat;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.IconCompatParcelizer = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | ((-4611686016279904257L) & jArr2[i6]);
        } else {
            this.RatingCompat = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isMaxVisibleEQwtKwdefault)) {
            return false;
        }
        isMaxVisibleEQwtKwdefault ismaxvisibleeqwtkwdefault = (isMaxVisibleEQwtKwdefault) obj;
        if (ismaxvisibleeqwtkwdefault.read != this.read) {
            return false;
        }
        Object[] objArr = this.RemoteActionCompatParcelizer;
        long[] jArr = this.MediaDescriptionCompat;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !ismaxvisibleeqwtkwdefault.read(objArr[(i << 3) + i3])) {
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

    public final int hashCode() {
        int iHashCode = (this.write * 31) + this.read;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        long[] jArr = this.MediaDescriptionCompat;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this}, getCieXyz.write())).booleanValue()) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return iHashCode;
    }

    public final int serializer(int i) {
        int i2 = this.write;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.MediaDescriptionCompat;
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

    public final boolean RemoteActionCompatParcelizer(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.write;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.MediaDescriptionCompat;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * 72340172838076673L) ^ j;
            int i7 = i;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    break loop0;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
            i = i7;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            IconCompatParcelizer(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final boolean read(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.write;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.MediaDescriptionCompat;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * 72340172838076673L) ^ j;
            int i7 = i;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    return iNumberOfTrailingZeros >= 0;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                return false;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
            i = i7;
        }
    }

    public final int write(Object obj) {
        long j;
        int i;
        int i2;
        int i3;
        long j2;
        long j3;
        int i4;
        int i5;
        int iHashCode;
        int iHashCode2 = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode2 ^ (iHashCode2 << 16);
        int i7 = i6 >>> 7;
        int i8 = this.write;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.MediaDescriptionCompat;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j4 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j5 = i6 & 127;
            int i13 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = -9187201950435737472L;
            for (long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i9) & i8;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iSerializer = serializer(i7);
                long j9 = 255;
                if (this.serializer != 0 || ((this.MediaDescriptionCompat[iSerializer >> 3] >> ((iSerializer & 7) << 3)) & 255) == 254) {
                    j = j5;
                    i = 0;
                } else {
                    int i14 = this.write;
                    if (i14 > 8) {
                        i2 = i7;
                        if (Long.compareUnsigned(((long) this.read) * 32, ((long) i14) * 25) <= 0) {
                            long[] jArr2 = this.MediaDescriptionCompat;
                            if (jArr2 == null) {
                                j = j5;
                                i3 = i2;
                                i = 0;
                            } else {
                                int i15 = this.write;
                                Object[] objArr = this.RemoteActionCompatParcelizer;
                                long[] jArr3 = this.MediaMetadataCompat;
                                long[] jArr4 = new long[i15];
                                Arrays.fill(jArr4, 0, i15, androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask);
                                int i16 = 0;
                                while (i16 < ((i15 + 7) >> 3)) {
                                    long j10 = jArr2[i16] & j7;
                                    jArr2[i16] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                    i16++;
                                    j7 = -9187201950435737472L;
                                }
                                int length = jArr2.length;
                                int i17 = length - 2;
                                jArr2[i17] = (jArr2[i17] & 72057594037927935L) | (-72057594037927936L);
                                jArr2[length - 1] = jArr2[0];
                                int i18 = 0;
                                while (i18 != i15) {
                                    int i19 = i18 >> 3;
                                    int i20 = (i18 & 7) << 3;
                                    long j11 = (jArr2[i19] >> i20) & j9;
                                    if (j11 != 128 && j11 == 254) {
                                        Object obj2 = objArr[i18];
                                        if (obj2 != null) {
                                            iHashCode = obj2.hashCode();
                                            i5 = -862048943;
                                        } else {
                                            i5 = -862048943;
                                            iHashCode = 0;
                                        }
                                        int i21 = iHashCode * i5;
                                        int i22 = i21 ^ (i21 << 16);
                                        int i23 = i22 >>> 7;
                                        int iSerializer2 = serializer(i23);
                                        int i24 = i23 & i15;
                                        if (((iSerializer2 - i24) & i15) / 8 == ((i18 - i24) & i15) / 8) {
                                            jArr2[i19] = (((long) (i22 & 127)) << i20) | (jArr2[i19] & (~(j9 << i20)));
                                            if (jArr4[i18] == androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) {
                                                long j12 = i18;
                                                jArr4[i18] = j12 | (j12 << 32);
                                            }
                                            jArr2[jArr2.length - 1] = jArr2[0];
                                            i18++;
                                        } else {
                                            int i25 = iSerializer2 >> 3;
                                            long j13 = jArr2[i25];
                                            int i26 = (iSerializer2 & 7) << 3;
                                            if (((j13 >> i26) & j9) == 128) {
                                                jArr2[i25] = (j13 & (~(j9 << i26))) | (((long) (i22 & 127)) << i26);
                                                jArr2[i19] = (jArr2[i19] & (~(j9 << i20))) | (128 << i20);
                                                objArr[iSerializer2] = objArr[i18];
                                                objArr[i18] = null;
                                                jArr3[iSerializer2] = jArr3[i18];
                                                jArr3[i18] = 4611686018427387903L;
                                                int i27 = (int) ((jArr4[i18] >> 32) & 4294967295L);
                                                if (i27 != Integer.MAX_VALUE) {
                                                    jArr4[i27] = ((long) iSerializer2) | (jArr4[i27] & (-4294967296L));
                                                    jArr4[i18] = (jArr4[i18] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr4[i18] = ((long) iSerializer2) | 9223372032559808512L;
                                                }
                                                jArr4[iSerializer2] = (((long) i18) << 32) | 2147483647L;
                                            } else {
                                                jArr2[i25] = (((long) (i22 & 127)) << i26) | (j13 & (~(255 << i26)));
                                                Object obj3 = objArr[iSerializer2];
                                                objArr[iSerializer2] = objArr[i18];
                                                objArr[i18] = obj3;
                                                long j14 = jArr3[iSerializer2];
                                                jArr3[iSerializer2] = jArr3[i18];
                                                jArr3[i18] = j14;
                                                int i28 = (int) ((jArr4[i18] >> 32) & 4294967295L);
                                                if (i28 != Integer.MAX_VALUE) {
                                                    long j15 = iSerializer2;
                                                    jArr4[i28] = (jArr4[i28] & (-4294967296L)) | j15;
                                                    jArr4[i18] = (j15 << 32) | (jArr4[i18] & 4294967295L);
                                                } else {
                                                    long j16 = iSerializer2;
                                                    jArr4[i18] = j16 | (j16 << 32);
                                                    i28 = i18;
                                                }
                                                jArr4[iSerializer2] = (((long) i28) << 32) | ((long) i18);
                                                i18--;
                                            }
                                            jArr2[jArr2.length - 1] = jArr2[0];
                                            i18++;
                                            j5 = j5;
                                            j9 = 255;
                                        }
                                    } else {
                                        i18++;
                                    }
                                }
                                j = j5;
                                i = 0;
                                this.serializer = detectDragGestures.IconCompatParcelizer(this.write) - this.read;
                                long[] jArr5 = this.MediaMetadataCompat;
                                int length2 = jArr5.length;
                                for (int i29 = 0; i29 < length2; i29++) {
                                    long j17 = jArr5[i29];
                                    int i30 = (int) ((j17 >> 31) & 2147483647L);
                                    int i31 = (int) (j17 & 2147483647L);
                                    if (i30 == Integer.MAX_VALUE) {
                                        i4 = Integer.MAX_VALUE;
                                        j3 = 4294967295L;
                                    } else {
                                        j3 = 4294967295L;
                                        i4 = (int) (jArr4[i30] & 4294967295L);
                                    }
                                    jArr5[i29] = (((j17 & (-4611686018427387904L)) | ((long) i4)) << 31) | ((long) (i31 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr4[i31] & j3)));
                                }
                                int i32 = this.IconCompatParcelizer;
                                if (i32 != Integer.MAX_VALUE) {
                                    j2 = 4294967295L;
                                    this.IconCompatParcelizer = (int) (jArr4[i32] & 4294967295L);
                                } else {
                                    j2 = 4294967295L;
                                }
                                int i33 = this.RatingCompat;
                                if (i33 != Integer.MAX_VALUE) {
                                    this.RatingCompat = (int) (jArr4[i33] & j2);
                                }
                            }
                            iSerializer = serializer(i3);
                        }
                        i3 = i2;
                        iSerializer = serializer(i3);
                    } else {
                        i2 = i7;
                    }
                    j = j5;
                    i = 0;
                    int iSerializer3 = detectDragGestures.serializer(this.write);
                    long[] jArr6 = this.MediaDescriptionCompat;
                    Object[] objArr2 = this.RemoteActionCompatParcelizer;
                    long[] jArr7 = this.MediaMetadataCompat;
                    int i34 = this.write;
                    int[] iArr = new int[i34];
                    read(iSerializer3);
                    long[] jArr8 = this.MediaDescriptionCompat;
                    Object[] objArr3 = this.RemoteActionCompatParcelizer;
                    long[] jArr9 = this.MediaMetadataCompat;
                    int i35 = this.write;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr6[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr2[i36];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * (-862048943);
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iSerializer4 = serializer(i37 >>> 7);
                            long j18 = i37 & 127;
                            int i38 = iSerializer4 >> 3;
                            int i39 = (iSerializer4 & 7) << 3;
                            long j19 = (j18 << i39) | (jArr8[i38] & (~(255 << i39)));
                            jArr8[i38] = j19;
                            jArr8[(((iSerializer4 - 7) & i35) + (i35 & 7)) >> 3] = j19;
                            objArr3[iSerializer4] = obj4;
                            jArr9[iSerializer4] = jArr7[i36];
                            iArr[i36] = iSerializer4;
                        }
                        i36++;
                        jArr6 = jArr6;
                        objArr2 = objArr2;
                    }
                    long[] jArr10 = this.MediaMetadataCompat;
                    int length3 = jArr10.length;
                    for (int i40 = 0; i40 < length3; i40++) {
                        long j20 = jArr10[i40];
                        int i41 = (int) ((j20 >> 31) & 2147483647L);
                        int i42 = (int) (j20 & 2147483647L);
                        jArr10[i40] = (((j20 & (-4611686018427387904L)) | ((long) (i41 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i41]))) << 31) | ((long) (i42 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i42]));
                    }
                    int i43 = this.IconCompatParcelizer;
                    if (i43 != Integer.MAX_VALUE) {
                        this.IconCompatParcelizer = iArr[i43];
                    }
                    int i44 = this.RatingCompat;
                    if (i44 != Integer.MAX_VALUE) {
                        this.RatingCompat = iArr[i44];
                    }
                    i3 = i2;
                    iSerializer = serializer(i3);
                }
                this.read++;
                int i45 = this.serializer;
                long[] jArr11 = this.MediaDescriptionCompat;
                int i46 = iSerializer >> 3;
                long j21 = jArr11[i46];
                int i47 = (iSerializer & 7) << 3;
                this.serializer = i45 - (((j21 >> i47) & 255) != 128 ? i : 1);
                int i48 = this.write;
                long j22 = (j21 & (~(255 << i47))) | (j << i47);
                jArr11[i46] = j22;
                jArr11[(((iSerializer - 7) & i48) + (i48 & 7)) >> 3] = j22;
                return iSerializer;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i6 = i13;
        }
    }
}
