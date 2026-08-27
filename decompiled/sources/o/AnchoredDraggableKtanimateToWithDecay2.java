package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKtanimateToWithDecay2 {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int serializer;
    public long[] read = detectDragGestures.write;
    public long[] write = ContextMenuUiKt.serializer;
    public Object[] MediaDescriptionCompat = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;

    public final void write() {
        this.serializer = 0;
        long[] jArr = this.read;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.read;
            int i = this.RemoteActionCompatParcelizer;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        onContentCardClicked.write(0, this.RemoteActionCompatParcelizer, null, this.MediaDescriptionCompat);
        this.IconCompatParcelizer = detectDragGestures.IconCompatParcelizer(this.RemoteActionCompatParcelizer) - this.serializer;
    }

    public final int hashCode() {
        long[] jArr = this.write;
        Object[] objArr = this.MediaDescriptionCompat;
        long[] jArr2 = this.read;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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

    public final void read(long j, Object obj) {
        long j2;
        int i;
        int iNumberOfTrailingZeros;
        int i2;
        long[] jArr;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = i4 & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr2 = this.read;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j4 = i3 & 127;
            int i10 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = -9187201950435737472L;
            for (long j7 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i6) & i5;
                if (this.write[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i4);
                long j8 = 255;
                if (this.IconCompatParcelizer != 0 || ((this.read[iRemoteActionCompatParcelizer >> 3] >> ((iRemoteActionCompatParcelizer & 7) << 3)) & 255) == 254) {
                    j2 = j4;
                    i = 0;
                } else {
                    int i11 = this.RemoteActionCompatParcelizer;
                    if (i11 > 8) {
                        i2 = i4;
                        if (Long.compareUnsigned(((long) this.serializer) * 32, ((long) i11) * 25) <= 0) {
                            long[] jArr3 = this.read;
                            int i12 = this.RemoteActionCompatParcelizer;
                            long[] jArr4 = this.write;
                            Object[] objArr = this.MediaDescriptionCompat;
                            int i13 = 0;
                            while (i13 < ((i12 + 7) >> 3)) {
                                long j9 = jArr3[i13] & j6;
                                jArr3[i13] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i13++;
                                j6 = -9187201950435737472L;
                            }
                            int iRemoteActionCompatParcelizer2 = onContentCardClicked.RemoteActionCompatParcelizer(jArr3);
                            int i14 = iRemoteActionCompatParcelizer2 - 1;
                            jArr3[i14] = (jArr3[i14] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iRemoteActionCompatParcelizer2] = jArr3[0];
                            int i15 = 0;
                            while (i15 != i12) {
                                int i16 = i15 >> 3;
                                int i17 = (i15 & 7) << 3;
                                long j10 = (jArr3[i16] >> i17) & 255;
                                if (j10 != 128 && j10 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr4[i15]) * (-862048943);
                                    int i18 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i19 = i18 >>> 7;
                                    int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(i19);
                                    int i20 = i19 & i12;
                                    if (((iRemoteActionCompatParcelizer3 - i20) & i12) / 8 == ((i15 - i20) & i12) / 8) {
                                        jArr3[i16] = (jArr3[i16] & (~(255 << i17))) | (((long) (i18 & 127)) << i17);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i15++;
                                    } else {
                                        int i21 = iRemoteActionCompatParcelizer3 >> 3;
                                        long j11 = jArr3[i21];
                                        int i22 = (iRemoteActionCompatParcelizer3 & 7) << 3;
                                        if (((j11 >> i22) & 255) == 128) {
                                            jArr = jArr4;
                                            jArr3[i21] = (j11 & (~(255 << i22))) | (((long) (i18 & 127)) << i22);
                                            jArr3[i16] = (jArr3[i16] & (~(255 << i17))) | (128 << i17);
                                            jArr[iRemoteActionCompatParcelizer3] = jArr[i15];
                                            jArr[i15] = 0;
                                            objArr[iRemoteActionCompatParcelizer3] = objArr[i15];
                                            objArr[i15] = null;
                                        } else {
                                            jArr = jArr4;
                                            jArr3[i21] = (j11 & (~(255 << i22))) | (((long) (i18 & 127)) << i22);
                                            long j12 = jArr[iRemoteActionCompatParcelizer3];
                                            jArr[iRemoteActionCompatParcelizer3] = jArr[i15];
                                            jArr[i15] = j12;
                                            Object obj2 = objArr[iRemoteActionCompatParcelizer3];
                                            objArr[iRemoteActionCompatParcelizer3] = objArr[i15];
                                            objArr[i15] = obj2;
                                            i15--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i15++;
                                        i12 = i12;
                                        jArr4 = jArr;
                                        j4 = j4;
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            j2 = j4;
                            i = 0;
                            this.IconCompatParcelizer = detectDragGestures.IconCompatParcelizer(this.RemoteActionCompatParcelizer) - this.serializer;
                        }
                        iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
                    } else {
                        i2 = i4;
                    }
                    j2 = j4;
                    i = 0;
                    int iSerializer = detectDragGestures.serializer(this.RemoteActionCompatParcelizer);
                    long[] jArr5 = this.read;
                    long[] jArr6 = this.write;
                    Object[] objArr2 = this.MediaDescriptionCompat;
                    int i23 = this.RemoteActionCompatParcelizer;
                    serializer(iSerializer);
                    long[] jArr7 = this.read;
                    long[] jArr8 = this.write;
                    Object[] objArr3 = this.MediaDescriptionCompat;
                    int i24 = this.RemoteActionCompatParcelizer;
                    int i25 = 0;
                    while (i25 < i23) {
                        if (((jArr5[i25 >> 3] >> ((i25 & 7) << 3)) & j8) < 128) {
                            long j13 = jArr6[i25];
                            int iHashCode3 = Long.hashCode(j13) * (-862048943);
                            int i26 = iHashCode3 ^ (iHashCode3 << 16);
                            int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(i26 >>> 7);
                            long j14 = i26 & 127;
                            int i27 = iRemoteActionCompatParcelizer4 >> 3;
                            int i28 = (iRemoteActionCompatParcelizer4 & 7) << 3;
                            long j15 = (jArr7[i27] & (~(255 << i28))) | (j14 << i28);
                            jArr7[i27] = j15;
                            jArr7[(((iRemoteActionCompatParcelizer4 - 7) & i24) + (i24 & 7)) >> 3] = j15;
                            jArr8[iRemoteActionCompatParcelizer4] = j13;
                            objArr3[iRemoteActionCompatParcelizer4] = objArr2[i25];
                        }
                        i25++;
                        jArr5 = jArr5;
                        jArr6 = jArr6;
                        j8 = 255;
                    }
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2);
                }
                iNumberOfTrailingZeros = iRemoteActionCompatParcelizer;
                this.serializer++;
                int i29 = this.IconCompatParcelizer;
                long[] jArr9 = this.read;
                int i30 = iNumberOfTrailingZeros >> 3;
                long j16 = jArr9[i30];
                int i31 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j16 >> i31) & 255) == 128) {
                    i = 1;
                }
                this.IconCompatParcelizer = i29 - i;
                int i32 = this.RemoteActionCompatParcelizer;
                long j17 = (j16 & (~(255 << i31))) | (j2 << i31);
                jArr9[i30] = j17;
                jArr9[(((iNumberOfTrailingZeros - 7) & i32) + (i32 & 7)) >> 3] = j17;
                break;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
        this.write[iNumberOfTrailingZeros] = j;
        this.MediaDescriptionCompat[iNumberOfTrailingZeros] = obj;
    }

    public final boolean read(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.read;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j2 = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j3 = (((long) (i & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.write[iNumberOfTrailingZeros] == j) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return true;
                    }
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        return false;
    }

    public final String toString() {
        int i;
        int i2;
        if (this.serializer == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.write;
        Object[] objArr = this.MediaDescriptionCompat;
        long[] jArr2 = this.read;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.serializer) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public AnchoredDraggableKtanimateToWithDecay2(int i) {
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
        this.RemoteActionCompatParcelizer = iMax;
        if (iMax == 0) {
            jArr = detectDragGestures.write;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.read = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.IconCompatParcelizer = detectDragGestures.IconCompatParcelizer(this.RemoteActionCompatParcelizer) - this.serializer;
        this.write = new long[iMax];
        this.MediaDescriptionCompat = new Object[iMax];
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.read;
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

    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[LOOP:0: B:14:0x0023->B:35:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[EDGE_INSN: B:38:0x0079->B:36:0x0079 BREAK  A[LOOP:0: B:14:0x0023->B:35:0x0076], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableKtanimateToWithDecay2)) {
            return false;
        }
        AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2 = (AnchoredDraggableKtanimateToWithDecay2) obj;
        if (anchoredDraggableKtanimateToWithDecay2.serializer != this.serializer) {
            return false;
        }
        long[] jArr = this.write;
        Object[] objArr = this.MediaDescriptionCompat;
        long[] jArr2 = this.read;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            long j2 = jArr[i5];
                            Object obj2 = objArr[i5];
                            if (obj2 == null) {
                                if (anchoredDraggableKtanimateToWithDecay2.serializer(j2) != null || !anchoredDraggableKtanimateToWithDecay2.read(j2)) {
                                    return false;
                                }
                            } else if (!obj2.equals(anchoredDraggableKtanimateToWithDecay2.serializer(j2))) {
                                return false;
                            }
                            i2 = 8;
                        }
                        j >>= i2;
                    }
                    if (i3 != i2) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final Object IconCompatParcelizer(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.read;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j2 = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j3 = (((long) (i & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.write[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.serializer--;
        long[] jArr2 = this.read;
        int i7 = this.RemoteActionCompatParcelizer;
        int i8 = iNumberOfTrailingZeros >> 3;
        int i9 = (iNumberOfTrailingZeros & 7) << 3;
        long j5 = (jArr2[i8] & (~(255 << i9))) | (254 << i9);
        jArr2[i8] = j5;
        jArr2[(((iNumberOfTrailingZeros - 7) & i7) + (i7 & 7)) >> 3] = j5;
        Object[] objArr = this.MediaDescriptionCompat;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final Object serializer(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.read;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j2 = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j3 = (((long) (i & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.write[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.MediaDescriptionCompat[iNumberOfTrailingZeros];
        }
        return null;
    }
}
