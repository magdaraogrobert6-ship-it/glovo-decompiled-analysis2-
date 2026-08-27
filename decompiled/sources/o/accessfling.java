package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class accessfling {
    public int IconCompatParcelizer;
    public int serializer;
    public int write;
    public long[] RemoteActionCompatParcelizer = detectDragGestures.write;
    public Object[] read = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
    public float[] MediaSessionCompatQueueItem = PlatformMagnifierFactoryApi29ImplPlatformMagnifierImpl.serializer;

    public final int hashCode() {
        Object[] objArr = this.read;
        float[] fArr = this.MediaSessionCompatQueueItem;
        long[] jArr = this.RemoteActionCompatParcelizer;
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
                        iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.write == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.read;
        float[] fArr = this.MediaSessionCompatQueueItem;
        long[] jArr = this.RemoteActionCompatParcelizer;
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
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(f);
                            i2++;
                            if (i2 < this.write) {
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

    public accessfling(int i) {
        if (i >= 0) {
            IconCompatParcelizer(detectDragGestures.write(i));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int IconCompatParcelizer(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = this.IconCompatParcelizer;
        int i4 = i2 >>> 7;
        while (true) {
            int i5 = i4 & i3;
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
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

    public final void IconCompatParcelizer(int i) {
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
        this.RemoteActionCompatParcelizer = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.serializer = detectDragGestures.IconCompatParcelizer(this.IconCompatParcelizer) - this.write;
        this.read = new Object[iMax];
        this.MediaSessionCompatQueueItem = new float[iMax];
    }

    public final int RemoteActionCompatParcelizer(int i) {
        int i2 = this.IconCompatParcelizer;
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

    public final void serializer(float f, String str) {
        long j;
        int i;
        int iNumberOfTrailingZeros;
        int iHashCode = (str != null ? str.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.IconCompatParcelizer;
        int i6 = i3 & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.RemoteActionCompatParcelizer;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = i4;
            int i10 = i4;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            int i11 = i3;
            long j5 = -9187201950435737472L;
            for (long j6 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i6) & i5;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read[iNumberOfTrailingZeros], str}, getCieXyz.write())).booleanValue()) {
                    break loop0;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i11);
                if (this.serializer != 0 || ((this.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer >> 3] >> ((iRemoteActionCompatParcelizer & 7) << 3)) & 255) == 254) {
                    j = j3;
                    i = 0;
                } else {
                    int i12 = this.IconCompatParcelizer;
                    if (i12 > 8 && Long.compareUnsigned(((long) this.write) * 32, ((long) i12) * 25) <= 0) {
                        long[] jArr2 = this.RemoteActionCompatParcelizer;
                        int i13 = this.IconCompatParcelizer;
                        Object[] objArr = this.read;
                        float[] fArr = this.MediaSessionCompatQueueItem;
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
                                Object obj = objArr[i16];
                                int iHashCode2 = (obj != null ? obj.hashCode() : 0) * (-862048943);
                                int i19 = iHashCode2 ^ (iHashCode2 << 16);
                                int i20 = i19 >>> 7;
                                int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(i20);
                                int i21 = i20 & i13;
                                if (((iRemoteActionCompatParcelizer3 - i21) & i13) / 8 == ((i16 - i21) & i13) / 8) {
                                    jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (((long) (i19 & 127)) << i18);
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i16++;
                                } else {
                                    int i22 = iRemoteActionCompatParcelizer3 >> 3;
                                    long j9 = jArr2[i22];
                                    int i23 = (iRemoteActionCompatParcelizer3 & 7) << 3;
                                    if (((j9 >> i23) & 255) == 128) {
                                        jArr2[i22] = ((~(255 << i23)) & j9) | (((long) (i19 & 127)) << i23);
                                        jArr2[i17] = (jArr2[i17] & (~(255 << i18))) | (128 << i18);
                                        objArr[iRemoteActionCompatParcelizer3] = objArr[i16];
                                        objArr[i16] = null;
                                        fArr[iRemoteActionCompatParcelizer3] = fArr[i16];
                                        fArr[i16] = 0.0f;
                                    } else {
                                        jArr2[i22] = (((long) (i19 & 127)) << i23) | ((~(255 << i23)) & j9);
                                        Object obj2 = objArr[iRemoteActionCompatParcelizer3];
                                        objArr[iRemoteActionCompatParcelizer3] = objArr[i16];
                                        objArr[i16] = obj2;
                                        float f2 = fArr[iRemoteActionCompatParcelizer3];
                                        fArr[iRemoteActionCompatParcelizer3] = fArr[i16];
                                        fArr[i16] = f2;
                                        i16--;
                                    }
                                    jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i16++;
                                }
                                j3 = j3;
                            } else {
                                i16++;
                            }
                        }
                        j = j3;
                        i = 0;
                        this.serializer = detectDragGestures.IconCompatParcelizer(this.IconCompatParcelizer) - this.write;
                    } else {
                        j = j3;
                        i = 0;
                        int iSerializer = detectDragGestures.serializer(this.IconCompatParcelizer);
                        long[] jArr3 = this.RemoteActionCompatParcelizer;
                        Object[] objArr2 = this.read;
                        float[] fArr2 = this.MediaSessionCompatQueueItem;
                        int i24 = this.IconCompatParcelizer;
                        IconCompatParcelizer(iSerializer);
                        long[] jArr4 = this.RemoteActionCompatParcelizer;
                        Object[] objArr3 = this.read;
                        float[] fArr3 = this.MediaSessionCompatQueueItem;
                        int i25 = this.IconCompatParcelizer;
                        int i26 = 0;
                        while (i26 < i24) {
                            if (((jArr3[i26 >> 3] >> ((i26 & 7) << 3)) & 255) < 128) {
                                Object obj3 = objArr2[i26];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(i27 >>> 7);
                                long j10 = i27 & 127;
                                int i28 = iRemoteActionCompatParcelizer4 >> 3;
                                int i29 = (iRemoteActionCompatParcelizer4 & 7) << 3;
                                long j11 = (j10 << i29) | (jArr4[i28] & (~(255 << i29)));
                                jArr4[i28] = j11;
                                jArr4[(((iRemoteActionCompatParcelizer4 - 7) & i25) + (i25 & 7)) >> 3] = j11;
                                objArr3[iRemoteActionCompatParcelizer4] = obj3;
                                fArr3[iRemoteActionCompatParcelizer4] = fArr2[i26];
                            }
                            i26++;
                            jArr3 = jArr3;
                            objArr2 = objArr2;
                        }
                    }
                    iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i11);
                }
                this.write++;
                int i30 = this.serializer;
                long[] jArr5 = this.RemoteActionCompatParcelizer;
                int i31 = iRemoteActionCompatParcelizer >> 3;
                long j12 = jArr5[i31];
                int i32 = (iRemoteActionCompatParcelizer & 7) << 3;
                this.serializer = i30 - (((j12 >> i32) & 255) != 128 ? i : 1);
                int i33 = this.IconCompatParcelizer;
                long j13 = (j12 & (~(255 << i32))) | (j << i32);
                jArr5[i31] = j13;
                jArr5[(((iRemoteActionCompatParcelizer - 7) & i33) + (i33 & 7)) >> 3] = j13;
                iNumberOfTrailingZeros = ~iRemoteActionCompatParcelizer;
                break;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i11;
            i4 = i10;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.read[iNumberOfTrailingZeros] = str;
        this.MediaSessionCompatQueueItem[iNumberOfTrailingZeros] = f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[LOOP:0: B:14:0x0023->B:29:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessfling)) {
            return false;
        }
        accessfling accessflingVar = (accessfling) obj;
        if (accessflingVar.write != this.write) {
            return false;
        }
        Object[] objArr = this.read;
        float[] fArr = this.MediaSessionCompatQueueItem;
        long[] jArr = this.RemoteActionCompatParcelizer;
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
                        float f = fArr[i4];
                        int iIconCompatParcelizer = accessflingVar.IconCompatParcelizer(obj2);
                        if (iIconCompatParcelizer < 0 || f != accessflingVar.MediaSessionCompatQueueItem[iIconCompatParcelizer]) {
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
}
