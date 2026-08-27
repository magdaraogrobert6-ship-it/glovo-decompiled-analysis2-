package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class onRemeasuredozmzZPI extends DefaultScrollableState {
    public int read;

    public final void IconCompatParcelizer() {
        this.serializer = 0;
        long[] jArr = this.write;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.write;
            int i = this.RemoteActionCompatParcelizer;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        onContentCardClicked.write(0, this.RemoteActionCompatParcelizer, null, this.MediaMetadataCompat);
        onContentCardClicked.write(0, this.RemoteActionCompatParcelizer, null, this.IconCompatParcelizer);
        this.read = detectDragGestures.IconCompatParcelizer(this.RemoteActionCompatParcelizer) - this.serializer;
    }

    public onRemeasuredozmzZPI(int i) {
        this.write = detectDragGestures.write;
        Object[] objArr = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        this.IconCompatParcelizer = objArr;
        this.MediaMetadataCompat = objArr;
        if (i >= 0) {
            IconCompatParcelizer(detectDragGestures.write(i));
        } else {
            ForEachGestureKt.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final Object IconCompatParcelizer(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.RemoteActionCompatParcelizer;
        int i4 = i2 >>> 7;
        loop0: while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.write;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i4 = i5 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return write(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void IconCompatParcelizer(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(i)) : 0;
        this.RemoteActionCompatParcelizer = iMax;
        if (iMax == 0) {
            jArr = detectDragGestures.write;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.write = jArr;
        this.read = detectDragGestures.IconCompatParcelizer(this.RemoteActionCompatParcelizer) - this.serializer;
        Object[] objArr = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        this.IconCompatParcelizer = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.MediaMetadataCompat = objArr;
    }

    public final int read(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.write;
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

    public final Object write(int i) {
        this.serializer--;
        long[] jArr = this.write;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.IconCompatParcelizer[i] = null;
        Object[] objArr = this.MediaMetadataCompat;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int write(Object obj) {
        long j;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.write;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = i3;
            int i9 = i3;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            int i10 = i2;
            long j5 = -9187201950435737472L;
            for (long j6 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i5) & i4;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i11 = 8;
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int i12 = read(i10);
                if (this.read != 0 || ((this.write[i12 >> 3] >> ((i12 & 7) << 3)) & 255) == 254) {
                    j = j3;
                } else {
                    int i13 = this.RemoteActionCompatParcelizer;
                    if (i13 > 8 && Long.compareUnsigned(((long) this.serializer) * 32, ((long) i13) * 25) <= 0) {
                        long[] jArr2 = this.write;
                        int i14 = this.RemoteActionCompatParcelizer;
                        Object[] objArr = this.IconCompatParcelizer;
                        Object[] objArr2 = this.MediaMetadataCompat;
                        int i15 = 0;
                        while (i15 < ((i14 + 7) >> 3)) {
                            long j7 = jArr2[i15] & j5;
                            jArr2[i15] = ((~j7) + (j7 >>> 7)) & (-72340172838076674L);
                            i15++;
                            j5 = -9187201950435737472L;
                        }
                        int iRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(jArr2);
                        int i16 = iRemoteActionCompatParcelizer - 1;
                        jArr2[i16] = (jArr2[i16] & 72057594037927935L) | (-72057594037927936L);
                        jArr2[iRemoteActionCompatParcelizer] = jArr2[0];
                        int i17 = 0;
                        while (i17 != i14) {
                            int i18 = i17 >> 3;
                            int i19 = (i17 & 7) << 3;
                            long j8 = (jArr2[i18] >> i19) & 255;
                            if (j8 != 128 && j8 == 254) {
                                Object obj2 = objArr[i17];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i20 = iHashCode2 ^ (iHashCode2 << 16);
                                int i21 = i20 >>> 7;
                                int i22 = read(i21);
                                int i23 = i21 & i14;
                                if (((i22 - i23) & i14) / 8 == ((i17 - i23) & i14) / i11) {
                                    jArr2[i18] = (jArr2[i18] & (~(255 << i19))) | (((long) (i20 & 127)) << i19);
                                    jArr2[jArr2.length - 1] = jArr2[0];
                                    i17++;
                                    i11 = 8;
                                } else {
                                    int i24 = i22 >> 3;
                                    long j9 = jArr2[i24];
                                    int i25 = (i22 & 7) << 3;
                                    if (((j9 >> i25) & 255) == 128) {
                                        jArr2[i24] = ((~(255 << i25)) & j9) | (((long) (i20 & 127)) << i25);
                                        jArr2[i18] = (jArr2[i18] & (~(255 << i19))) | (128 << i19);
                                        objArr[i22] = objArr[i17];
                                        objArr[i17] = null;
                                        objArr2[i22] = objArr2[i17];
                                        objArr2[i17] = null;
                                    } else {
                                        jArr2[i24] = ((~(255 << i25)) & j9) | (((long) (i20 & 127)) << i25);
                                        Object obj3 = objArr[i22];
                                        objArr[i22] = objArr[i17];
                                        objArr[i17] = obj3;
                                        Object obj4 = objArr2[i22];
                                        objArr2[i22] = objArr2[i17];
                                        objArr2[i17] = obj4;
                                        i17--;
                                    }
                                    jArr2[jArr2.length - 1] = jArr2[0];
                                    i17++;
                                    j3 = j3;
                                    i11 = 8;
                                }
                            } else {
                                i17++;
                            }
                        }
                        j = j3;
                        this.read = detectDragGestures.IconCompatParcelizer(this.RemoteActionCompatParcelizer) - this.serializer;
                    } else {
                        j = j3;
                        int i26 = 0;
                        int iSerializer = detectDragGestures.serializer(this.RemoteActionCompatParcelizer);
                        long[] jArr3 = this.write;
                        Object[] objArr3 = this.IconCompatParcelizer;
                        Object[] objArr4 = this.MediaMetadataCompat;
                        int i27 = this.RemoteActionCompatParcelizer;
                        IconCompatParcelizer(iSerializer);
                        long[] jArr4 = this.write;
                        Object[] objArr5 = this.IconCompatParcelizer;
                        Object[] objArr6 = this.MediaMetadataCompat;
                        int i28 = this.RemoteActionCompatParcelizer;
                        int i29 = 0;
                        while (i29 < i27) {
                            if (((jArr3[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                Object obj5 = objArr3[i29];
                                int iHashCode3 = (obj5 != null ? obj5.hashCode() : i26) * (-862048943);
                                int i30 = iHashCode3 ^ (iHashCode3 << 16);
                                int i31 = read(i30 >>> 7);
                                long j10 = i30 & 127;
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j11 = (j10 << i33) | (jArr4[i32] & (~(255 << i33)));
                                jArr4[i32] = j11;
                                jArr4[(((i31 - 7) & i28) + (i28 & 7)) >> 3] = j11;
                                objArr5[i31] = obj5;
                                objArr6[i31] = objArr4[i29];
                            }
                            i29++;
                            objArr3 = objArr3;
                            i26 = 0;
                        }
                    }
                    i12 = read(i10);
                }
                this.serializer++;
                int i34 = this.read;
                long[] jArr5 = this.write;
                int i35 = i12 >> 3;
                long j12 = jArr5[i35];
                int i36 = (i12 & 7) << 3;
                this.read = i34 - (((j12 >> i36) & 255) == 128 ? 1 : 0);
                int i37 = this.RemoteActionCompatParcelizer;
                long j13 = (j12 & (~(255 << i36))) | (j << i36);
                jArr5[i35] = j13;
                jArr5[(((i12 - 7) & i37) + (i37 & 7)) >> 3] = j13;
                return ~i12;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i2 = i10;
            i3 = i9;
        }
    }

    public final void write(Object obj, Object obj2) {
        int iWrite = write(obj);
        if (iWrite < 0) {
            iWrite = ~iWrite;
        }
        this.IconCompatParcelizer[iWrite] = obj;
        this.MediaMetadataCompat[iWrite] = obj2;
    }

    public /* synthetic */ onRemeasuredozmzZPI() {
        this(6);
    }
}
