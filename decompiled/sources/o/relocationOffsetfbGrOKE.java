package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class relocationOffsetfbGrOKE extends awaitTouchSlopOrCancellationjO51t88 {
    public int read;

    public final void serializer() {
        this.write = 0;
        long[] jArr = this.IconCompatParcelizer;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.IconCompatParcelizer;
            int i = this.serializer;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        onContentCardClicked.write(0, this.serializer, null, this.RemoteActionCompatParcelizer);
        this.read = detectDragGestures.IconCompatParcelizer(this.serializer) - this.write;
    }

    public final boolean serializer(Object obj) {
        int i = this.write;
        this.RemoteActionCompatParcelizer[IconCompatParcelizer(obj)] = obj;
        return this.write != i;
    }

    public relocationOffsetfbGrOKE(int i) {
        this.IconCompatParcelizer = detectDragGestures.write;
        this.RemoteActionCompatParcelizer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        if (i >= 0) {
            serializer(detectDragGestures.write(i));
        } else {
            ForEachGestureKt.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void read(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.serializer;
        int i4 = i2 >>> 7;
        loop0: while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.IconCompatParcelizer;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i4 = i5 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            RemoteActionCompatParcelizer(iNumberOfTrailingZeros);
        }
    }

    public final void serializer(int i) {
        long[] jArr;
        Object[] objArr;
        int iMax = i > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(i)) : 0;
        this.serializer = iMax;
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
        this.read = detectDragGestures.IconCompatParcelizer(this.serializer) - this.write;
        if (iMax == 0) {
            objArr = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        } else {
            objArr = new Object[iMax];
        }
        this.RemoteActionCompatParcelizer = objArr;
    }

    public final void serializer(awaitTouchSlopOrCancellationjO51t88 awaittouchsloporcancellationjo51t88) {
        awaittouchsloporcancellationjo51t88.getClass();
        Object[] objArr = awaittouchsloporcancellationjo51t88.RemoteActionCompatParcelizer;
        long[] jArr = awaittouchsloporcancellationjo51t88.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        RemoteActionCompatParcelizer(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.write--;
        long[] jArr = this.IconCompatParcelizer;
        int i2 = this.serializer;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.RemoteActionCompatParcelizer[i] = null;
    }

    public final int read(int i) {
        int i2 = this.serializer;
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

    public final int IconCompatParcelizer(Object obj) {
        long j;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.serializer;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.IconCompatParcelizer;
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
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    return iNumberOfTrailingZeros;
                }
            }
            int i11 = 8;
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int i12 = read(i10);
                if (this.read != 0 || ((this.IconCompatParcelizer[i12 >> 3] >> ((i12 & 7) << 3)) & 255) == 254) {
                    j = j3;
                } else {
                    int i13 = this.serializer;
                    if (i13 > 8 && Long.compareUnsigned(((long) this.write) * 32, ((long) i13) * 25) <= 0) {
                        long[] jArr2 = this.IconCompatParcelizer;
                        int i14 = this.serializer;
                        Object[] objArr = this.RemoteActionCompatParcelizer;
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
                                    jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (((long) (i20 & 127)) << i19);
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i17++;
                                    i11 = 8;
                                } else {
                                    int i24 = i22 >> 3;
                                    long j9 = jArr2[i24];
                                    int i25 = (i22 & 7) << 3;
                                    if (((j9 >> i25) & 255) == 128) {
                                        jArr2[i24] = (((long) (i20 & 127)) << i25) | ((~(255 << i25)) & j9);
                                        jArr2[i18] = (jArr2[i18] & (~(255 << i19))) | (128 << i19);
                                        objArr[i22] = objArr[i17];
                                        objArr[i17] = null;
                                    } else {
                                        jArr2[i24] = (((long) (i20 & 127)) << i25) | ((~(255 << i25)) & j9);
                                        Object obj3 = objArr[i22];
                                        objArr[i22] = objArr[i17];
                                        objArr[i17] = obj3;
                                        i17--;
                                    }
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i17++;
                                    j3 = j3;
                                    i11 = 8;
                                }
                            } else {
                                i17++;
                            }
                        }
                        j = j3;
                        this.read = detectDragGestures.IconCompatParcelizer(this.serializer) - this.write;
                    } else {
                        j = j3;
                        int i26 = 0;
                        int iSerializer = detectDragGestures.serializer(this.serializer);
                        long[] jArr3 = this.IconCompatParcelizer;
                        Object[] objArr2 = this.RemoteActionCompatParcelizer;
                        int i27 = this.serializer;
                        serializer(iSerializer);
                        long[] jArr4 = this.IconCompatParcelizer;
                        Object[] objArr3 = this.RemoteActionCompatParcelizer;
                        int i28 = this.serializer;
                        int i29 = 0;
                        while (i29 < i27) {
                            if (((jArr3[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                Object obj4 = objArr2[i29];
                                int iHashCode3 = (obj4 != null ? obj4.hashCode() : i26) * (-862048943);
                                int i30 = iHashCode3 ^ (iHashCode3 << 16);
                                int i31 = read(i30 >>> 7);
                                long j10 = i30 & 127;
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j11 = (jArr4[i32] & (~(255 << i33))) | (j10 << i33);
                                jArr4[i32] = j11;
                                jArr4[(((i31 - 7) & i28) + (i28 & 7)) >> 3] = j11;
                                objArr3[i31] = obj4;
                            }
                            i29++;
                            objArr2 = objArr2;
                            i26 = 0;
                        }
                    }
                    i12 = read(i10);
                }
                this.write++;
                int i34 = this.read;
                long[] jArr5 = this.IconCompatParcelizer;
                int i35 = i12 >> 3;
                long j12 = jArr5[i35];
                int i36 = (i12 & 7) << 3;
                this.read = i34 - (((j12 >> i36) & 255) != 128 ? 0 : 1);
                int i37 = this.serializer;
                long j13 = (j12 & (~(255 << i36))) | (j << i36);
                jArr5[i35] = j13;
                jArr5[(((i12 - 7) & i37) + (i37 & 7)) >> 3] = j13;
                return i12;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i2 = i10;
            i3 = i9;
        }
    }

    public final boolean write(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.serializer;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.IconCompatParcelizer;
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
            RemoteActionCompatParcelizer(iNumberOfTrailingZeros);
        }
        return z;
    }

    public /* synthetic */ relocationOffsetfbGrOKE() {
        this(6);
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer[IconCompatParcelizer(obj)] = obj;
    }
}
