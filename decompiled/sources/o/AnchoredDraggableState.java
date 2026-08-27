package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableState {
    public Object[] IconCompatParcelizer;
    public int[] MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public long[] write;

    public final void RemoteActionCompatParcelizer() {
        this.serializer = 0;
        long[] jArr = this.write;
        if (jArr != detectDragGestures.write) {
            onContentCardClicked.IconCompatParcelizer(jArr, -9187201950435737472L);
            long[] jArr2 = this.write;
            int i = this.read;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        onContentCardClicked.write(0, this.read, null, this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = detectDragGestures.IconCompatParcelizer(this.read) - this.serializer;
    }

    public final int hashCode() {
        Object[] objArr = this.IconCompatParcelizer;
        int[] iArr = this.MediaMetadataCompat;
        long[] jArr = this.write;
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
                        Object obj = objArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.serializer == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.IconCompatParcelizer;
        int[] iArr = this.MediaMetadataCompat;
        long[] jArr = this.write;
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
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(i6);
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

    public AnchoredDraggableState(int i) {
        this.write = detectDragGestures.write;
        this.IconCompatParcelizer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        this.MediaMetadataCompat = Contentfoundation.read;
        if (i >= 0) {
            write(detectDragGestures.write(i));
        } else {
            ForEachGestureKt.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int serializer(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.read;
        int i4 = i2 >>> 7;
        while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.write;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    public final void write(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(i)) : 0;
        this.read = iMax;
        if (iMax == 0) {
            jArr = detectDragGestures.write;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.write = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.RemoteActionCompatParcelizer = detectDragGestures.IconCompatParcelizer(this.read) - this.serializer;
        this.IconCompatParcelizer = new Object[iMax];
        this.MediaMetadataCompat = new int[iMax];
    }

    public final void IconCompatParcelizer(int i) {
        this.serializer--;
        long[] jArr = this.write;
        int i2 = this.read;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.IconCompatParcelizer[i] = null;
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2 = this.read;
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

    public final int RemoteActionCompatParcelizer(Object obj) {
        int iSerializer = serializer(obj);
        if (iSerializer >= 0) {
            return this.MediaMetadataCompat[iSerializer];
        }
        ForEachGestureKt.RemoteActionCompatParcelizer("There is no key " + obj + " in the map");
        throw null;
    }

    public final int write(Object obj) {
        long j;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.read;
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
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i10);
                if (this.RemoteActionCompatParcelizer != 0 || ((this.write[iRemoteActionCompatParcelizer >> 3] >> ((iRemoteActionCompatParcelizer & 7) << 3)) & 255) == 254) {
                    j = j3;
                } else {
                    int i12 = this.read;
                    if (i12 > 8 && Long.compareUnsigned(((long) this.serializer) * 32, ((long) i12) * 25) <= 0) {
                        long[] jArr2 = this.write;
                        int i13 = this.read;
                        Object[] objArr = this.IconCompatParcelizer;
                        int[] iArr = this.MediaMetadataCompat;
                        int i14 = 0;
                        while (i14 < ((i13 + 7) >> 3)) {
                            long j7 = jArr2[i14] & j5;
                            jArr2[i14] = ((~j7) + (j7 >>> 7)) & (-72340172838076674L);
                            i14++;
                            j5 = -9187201950435737472L;
                        }
                        int iRemoteActionCompatParcelizer2 = onContentCardClicked.RemoteActionCompatParcelizer(jArr2);
                        int i15 = iRemoteActionCompatParcelizer2 - 1;
                        jArr2[i15] = (jArr2[i15] & 72057594037927935L) | (-72057594037927936L);
                        jArr2[iRemoteActionCompatParcelizer2] = jArr2[0];
                        int i16 = 0;
                        while (i16 != i13) {
                            int i17 = i16 >> 3;
                            int i18 = (i16 & 7) << 3;
                            long j8 = (jArr2[i17] >> i18) & 255;
                            if (j8 != 128 && j8 == 254) {
                                Object obj2 = objArr[i16];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i19 = iHashCode2 ^ (iHashCode2 << 16);
                                int i20 = i19 >>> 7;
                                int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(i20);
                                int i21 = i20 & i13;
                                if (((iRemoteActionCompatParcelizer3 - i21) & i13) / 8 == ((i16 - i21) & i13) / i11) {
                                    jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (((long) (i19 & 127)) << i18);
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i16++;
                                    i11 = 8;
                                } else {
                                    int i22 = iRemoteActionCompatParcelizer3 >> 3;
                                    long j9 = jArr2[i22];
                                    int i23 = (iRemoteActionCompatParcelizer3 & 7) << 3;
                                    if (((j9 >> i23) & 255) == 128) {
                                        jArr2[i22] = ((~(255 << i23)) & j9) | (((long) (i19 & 127)) << i23);
                                        jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (128 << i18);
                                        objArr[iRemoteActionCompatParcelizer3] = objArr[i16];
                                        objArr[i16] = null;
                                        iArr[iRemoteActionCompatParcelizer3] = iArr[i16];
                                        iArr[i16] = 0;
                                    } else {
                                        jArr2[i22] = ((~(255 << i23)) & j9) | (((long) (i19 & 127)) << i23);
                                        Object obj3 = objArr[iRemoteActionCompatParcelizer3];
                                        objArr[iRemoteActionCompatParcelizer3] = objArr[i16];
                                        objArr[i16] = obj3;
                                        int i24 = iArr[iRemoteActionCompatParcelizer3];
                                        iArr[iRemoteActionCompatParcelizer3] = iArr[i16];
                                        iArr[i16] = i24;
                                        i16--;
                                    }
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i16++;
                                    j3 = j3;
                                    i11 = 8;
                                }
                            } else {
                                i16++;
                            }
                        }
                        j = j3;
                        this.RemoteActionCompatParcelizer = detectDragGestures.IconCompatParcelizer(this.read) - this.serializer;
                    } else {
                        j = j3;
                        int i25 = 0;
                        int iSerializer = detectDragGestures.serializer(this.read);
                        long[] jArr3 = this.write;
                        Object[] objArr2 = this.IconCompatParcelizer;
                        int[] iArr2 = this.MediaMetadataCompat;
                        int i26 = this.read;
                        write(iSerializer);
                        long[] jArr4 = this.write;
                        Object[] objArr3 = this.IconCompatParcelizer;
                        int[] iArr3 = this.MediaMetadataCompat;
                        int i27 = this.read;
                        int i28 = 0;
                        while (i28 < i26) {
                            if (((jArr3[i28 >> 3] >> ((i28 & 7) << 3)) & 255) < 128) {
                                Object obj4 = objArr2[i28];
                                int iHashCode3 = (obj4 != null ? obj4.hashCode() : i25) * (-862048943);
                                int i29 = iHashCode3 ^ (iHashCode3 << 16);
                                int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(i29 >>> 7);
                                long j10 = i29 & 127;
                                int i30 = iRemoteActionCompatParcelizer4 >> 3;
                                int i31 = (iRemoteActionCompatParcelizer4 & 7) << 3;
                                long j11 = (j10 << i31) | (jArr4[i30] & (~(255 << i31)));
                                jArr4[i30] = j11;
                                jArr4[(((iRemoteActionCompatParcelizer4 - 7) & i27) + (i27 & 7)) >> 3] = j11;
                                objArr3[iRemoteActionCompatParcelizer4] = obj4;
                                iArr3[iRemoteActionCompatParcelizer4] = iArr2[i28];
                            }
                            i28++;
                            objArr2 = objArr2;
                            i25 = 0;
                        }
                    }
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i10);
                }
                this.serializer++;
                int i32 = this.RemoteActionCompatParcelizer;
                long[] jArr5 = this.write;
                int i33 = iRemoteActionCompatParcelizer >> 3;
                long j12 = jArr5[i33];
                int i34 = (iRemoteActionCompatParcelizer & 7) << 3;
                this.RemoteActionCompatParcelizer = i32 - (((j12 >> i34) & 255) == 128 ? 1 : 0);
                int i35 = this.read;
                long j13 = (j12 & (~(255 << i34))) | (j << i34);
                jArr5[i33] = j13;
                jArr5[(((iRemoteActionCompatParcelizer - 7) & i35) + (i35 & 7)) >> 3] = j13;
                return ~iRemoteActionCompatParcelizer;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i2 = i10;
            i3 = i9;
        }
    }

    public final void write(int i, Object obj) {
        int iWrite = write(obj);
        if (iWrite < 0) {
            iWrite = ~iWrite;
        }
        this.IconCompatParcelizer[iWrite] = obj;
        this.MediaMetadataCompat[iWrite] = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[LOOP:0: B:14:0x0023->B:28:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableState)) {
            return false;
        }
        AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) obj;
        if (anchoredDraggableState.serializer != this.serializer) {
            return false;
        }
        Object[] objArr = this.IconCompatParcelizer;
        int[] iArr = this.MediaMetadataCompat;
        long[] jArr = this.write;
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
                        Object obj2 = objArr[i4];
                        int i5 = iArr[i4];
                        int iSerializer = anchoredDraggableState.serializer(obj2);
                        if (iSerializer < 0 || i5 != anchoredDraggableState.MediaMetadataCompat[iSerializer]) {
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

    public /* synthetic */ AnchoredDraggableState() {
        this(6);
    }
}
