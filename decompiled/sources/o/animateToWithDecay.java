package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class animateToWithDecay extends StretchOverscrollNode {
    public int MediaBrowserCompatMediaItem;

    public final void RemoteActionCompatParcelizer() {
        this.read = 0;
        long[] jArr = this.RemoteActionCompatParcelizer;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.RemoteActionCompatParcelizer;
            int i = this.write;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        onContentCardClicked.write(0, this.write, null, this.IconCompatParcelizer);
        this.MediaBrowserCompatMediaItem = detectDragGestures.IconCompatParcelizer(this.write) - this.read;
    }

    public final int read(int i) {
        long j;
        int i2;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = this.write;
        int i6 = i4 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = i3 & 127;
            int i10 = i7;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = -9187201950435737472L;
            for (long j6 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i6) & i5;
                if (this.serializer[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iWrite = write(i4);
                long j7 = 255;
                if (this.MediaBrowserCompatMediaItem != 0 || ((this.RemoteActionCompatParcelizer[iWrite >> 3] >> ((iWrite & 7) << 3)) & 255) == 254) {
                    j = j3;
                    i2 = 0;
                } else {
                    int i11 = this.write;
                    if (i11 <= 8 || Long.compareUnsigned(((long) this.read) * 32, ((long) i11) * 25) > 0) {
                        j = j3;
                        i2 = 0;
                        int iSerializer = detectDragGestures.serializer(this.write);
                        long[] jArr2 = this.RemoteActionCompatParcelizer;
                        int[] iArr = this.serializer;
                        Object[] objArr = this.IconCompatParcelizer;
                        int i12 = this.write;
                        IconCompatParcelizer(iSerializer);
                        long[] jArr3 = this.RemoteActionCompatParcelizer;
                        int[] iArr2 = this.serializer;
                        Object[] objArr2 = this.IconCompatParcelizer;
                        int i13 = this.write;
                        int i14 = 0;
                        while (i14 < i12) {
                            if (((jArr2[i14 >> 3] >> ((i14 & 7) << 3)) & j7) < 128) {
                                int i15 = iArr[i14];
                                int iHashCode2 = Integer.hashCode(i15) * (-862048943);
                                int i16 = iHashCode2 ^ (iHashCode2 << 16);
                                int iWrite2 = write(i16 >>> 7);
                                long j8 = i16 & 127;
                                int i17 = iWrite2 >> 3;
                                int i18 = (iWrite2 & 7) << 3;
                                long j9 = (j8 << i18) | (jArr3[i17] & (~(255 << i18)));
                                jArr3[i17] = j9;
                                jArr3[(((iWrite2 - 7) & i13) + (i13 & 7)) >> 3] = j9;
                                iArr2[iWrite2] = i15;
                                objArr2[iWrite2] = objArr[i14];
                            }
                            i14++;
                            j7 = 255;
                        }
                        i4 = i4;
                    } else {
                        long[] jArr4 = this.RemoteActionCompatParcelizer;
                        int i19 = this.write;
                        int[] iArr3 = this.serializer;
                        Object[] objArr3 = this.IconCompatParcelizer;
                        int i20 = 0;
                        while (i20 < ((i19 + 7) >> 3)) {
                            long j10 = jArr4[i20] & j5;
                            jArr4[i20] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                            i20++;
                            j5 = -9187201950435737472L;
                        }
                        int iRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer(jArr4);
                        int i21 = iRemoteActionCompatParcelizer - 1;
                        jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                        jArr4[iRemoteActionCompatParcelizer] = jArr4[0];
                        int i22 = 0;
                        while (i22 != i19) {
                            int i23 = i22 >> 3;
                            int i24 = (i22 & 7) << 3;
                            long j11 = (jArr4[i23] >> i24) & 255;
                            if (j11 != 128 && j11 == 254) {
                                int iHashCode3 = Integer.hashCode(iArr3[i22]) * (-862048943);
                                int i25 = iHashCode3 ^ (iHashCode3 << 16);
                                int i26 = i25 >>> 7;
                                int iWrite3 = write(i26);
                                int i27 = i26 & i19;
                                if (((iWrite3 - i27) & i19) / 8 == ((i22 - i27) & i19) / 8) {
                                    jArr4[i23] = ((~(255 << i24)) & jArr4[i23]) | (((long) (i25 & 127)) << i24);
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i22++;
                                    j3 = j3;
                                } else {
                                    long j12 = j3;
                                    int i28 = iWrite3 >> 3;
                                    long j13 = jArr4[i28];
                                    int i29 = (iWrite3 & 7) << 3;
                                    if (((j13 >> i29) & 255) == 128) {
                                        jArr4[i28] = ((~(255 << i29)) & j13) | (((long) (i25 & 127)) << i29);
                                        jArr4[i23] = (jArr4[i23] & (~(255 << i24))) | (128 << i24);
                                        iArr3[iWrite3] = iArr3[i22];
                                        iArr3[i22] = 0;
                                        objArr3[iWrite3] = objArr3[i22];
                                        objArr3[i22] = null;
                                    } else {
                                        jArr4[i28] = (((long) (i25 & 127)) << i29) | ((~(255 << i29)) & j13);
                                        int i30 = iArr3[iWrite3];
                                        iArr3[iWrite3] = iArr3[i22];
                                        iArr3[i22] = i30;
                                        Object obj = objArr3[iWrite3];
                                        objArr3[iWrite3] = objArr3[i22];
                                        objArr3[i22] = obj;
                                        i22--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i22++;
                                    i4 = i4;
                                    j3 = j12;
                                    i19 = i19;
                                }
                            } else {
                                i22++;
                            }
                        }
                        j = j3;
                        i2 = 0;
                        this.MediaBrowserCompatMediaItem = detectDragGestures.IconCompatParcelizer(this.write) - this.read;
                    }
                    iWrite = write(i4);
                }
                this.read++;
                int i31 = this.MediaBrowserCompatMediaItem;
                long[] jArr5 = this.RemoteActionCompatParcelizer;
                int i32 = iWrite >> 3;
                long j14 = jArr5[i32];
                int i33 = (iWrite & 7) << 3;
                if (((j14 >> i33) & 255) == 128) {
                    i2 = 1;
                }
                this.MediaBrowserCompatMediaItem = i31 - i2;
                int i34 = this.write;
                long j15 = (j14 & (~(255 << i33))) | (j << i33);
                jArr5[i32] = j15;
                jArr5[(((iWrite - 7) & i34) + (i34 & 7)) >> 3] = j15;
                return iWrite;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public animateToWithDecay(int i) {
        this.RemoteActionCompatParcelizer = detectDragGestures.write;
        this.serializer = Contentfoundation.read;
        this.IconCompatParcelizer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        if (i >= 0) {
            IconCompatParcelizer(detectDragGestures.write(i));
        } else {
            ForEachGestureKt.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void IconCompatParcelizer(int i) {
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
        this.RemoteActionCompatParcelizer = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.MediaBrowserCompatMediaItem = detectDragGestures.IconCompatParcelizer(this.write) - this.read;
        this.serializer = new int[iMax];
        this.IconCompatParcelizer = new Object[iMax];
    }

    public final void IconCompatParcelizer(int i, Object obj) {
        int i2 = read(i);
        this.serializer[i2] = i;
        this.IconCompatParcelizer[i2] = obj;
    }

    public final Object MediaMetadataCompat(int i) {
        this.read--;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.IconCompatParcelizer;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int write(int i) {
        int i2 = this.write;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
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

    public final Object MediaBrowserCompatMediaItem(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.write;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.serializer[iNumberOfTrailingZeros] == i) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return MediaMetadataCompat(iNumberOfTrailingZeros);
        }
        return null;
    }

    public /* synthetic */ animateToWithDecay() {
        this(6);
    }
}
