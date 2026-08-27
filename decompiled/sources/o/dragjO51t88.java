package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class dragjO51t88 {
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public Object[] MediaSessionCompatQueueItem;
    public int MediaSessionCompatToken;
    public long[] ParcelableVolumeInfo;
    public Object[] PlaybackStateCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public final int write;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaSessionCompatResultReceiverWrapper = isPointerUpDmW0f2w.serializer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer = horizontalDragjO51t88.RemoteActionCompatParcelizer;
    public final r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds PlaybackStateCompatCustomAction = DragGestureNode.RemoteActionCompatParcelizer;
    public long[] RatingCompat = detectDragGestures.write;

    public final int hashCode() {
        Object[] objArr = this.MediaSessionCompatQueueItem;
        Object[] objArr2 = this.PlaybackStateCompat;
        long[] jArr = this.RatingCompat;
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
                        obj.getClass();
                        Object obj2 = objArr2[i4];
                        obj2.getClass();
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
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

    public final void write(int i) {
        while (this.RemoteActionCompatParcelizer > i && this.read != 0) {
            long[] jArr = this.ParcelableVolumeInfo;
            int i2 = this.MediaMetadataCompat;
            if (i2 == Integer.MAX_VALUE) {
                i2 = this.MediaSessionCompatToken;
            }
            while (i2 != Integer.MAX_VALUE) {
                long j = jArr[i2];
                if (((int) ((j >> 62) & 1)) == 0) {
                    break;
                }
                int i3 = (int) ((j >> 31) & 2147483647L);
                jArr[i2] = 4611686018427387903L & j;
                i2 = i3 != Integer.MAX_VALUE ? i3 : this.MediaSessionCompatToken;
            }
            int i4 = (int) ((jArr[i2] >> 31) & 2147483647L);
            if (i4 == Integer.MAX_VALUE) {
                i4 = Integer.MAX_VALUE;
            }
            this.MediaMetadataCompat = i4;
            if (i2 == Integer.MAX_VALUE) {
                return;
            }
            Object obj = this.MediaSessionCompatQueueItem[i2];
            obj.getClass();
            this.read--;
            long[] jArr2 = this.RatingCompat;
            int i5 = this.IconCompatParcelizer;
            int i6 = i2 >> 3;
            int i7 = (i2 & 7) << 3;
            long j2 = ((~(255 << i7)) & jArr2[i6]) | (254 << i7);
            jArr2[i6] = j2;
            jArr2[(((i2 - 7) & i5) + (i5 & 7)) >> 3] = j2;
            this.MediaSessionCompatQueueItem[i2] = null;
            Object[] objArr = this.PlaybackStateCompat;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            long[] jArr3 = this.ParcelableVolumeInfo;
            long j3 = jArr3[i2];
            int i8 = (int) ((j3 >> 31) & 2147483647L);
            int i9 = (int) (j3 & 2147483647L);
            if (i8 != Integer.MAX_VALUE) {
                jArr3[i8] = (((long) i9) & 2147483647L) | (jArr3[i8] & (-2147483648L));
            } else {
                this.MediaBrowserCompatMediaItem = i9;
            }
            if (i9 != Integer.MAX_VALUE) {
                jArr3[i9] = (jArr3[i9] & (-4611686016279904257L)) | ((2147483647L & ((long) i8)) << 31);
            } else {
                this.MediaSessionCompatToken = i8;
            }
            if (this.MediaMetadataCompat == i2) {
                this.MediaMetadataCompat = i8;
            }
            jArr3[i2] = 4611686018427387903L;
            if (obj2 != null) {
                this.RemoteActionCompatParcelizer -= ((Number) this.MediaSessionCompatResultReceiverWrapper.invoke(obj, obj2)).intValue();
                this.PlaybackStateCompatCustomAction.invoke(obj, obj2, null, Boolean.TRUE);
            }
        }
    }

    public dragjO51t88() {
        Object[] objArr = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = objArr;
        this.PlaybackStateCompat = objArr;
        this.ParcelableVolumeInfo = DragGestureDetectorKtawaitLongPressOrCancellation2.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = Integer.MAX_VALUE;
        this.MediaSessionCompatToken = Integer.MAX_VALUE;
        this.MediaMetadataCompat = Integer.MAX_VALUE;
        this.write = 16;
        IconCompatParcelizer(detectDragGestures.write(16));
    }

    public final void IconCompatParcelizer(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, detectDragGestures.RemoteActionCompatParcelizer(i)) : 0;
        this.IconCompatParcelizer = iMax;
        if (iMax == 0) {
            jArr = detectDragGestures.write;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr3[i3] = (jArr3[i3] & (~j)) | j;
            jArr = jArr3;
        }
        this.RatingCompat = jArr;
        this.MediaDescriptionCompat = detectDragGestures.IconCompatParcelizer(this.IconCompatParcelizer) - this.read;
        Object[] objArr = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.PlaybackStateCompat = objArr;
        if (iMax == 0) {
            jArr2 = DragGestureDetectorKtawaitLongPressOrCancellation2.RemoteActionCompatParcelizer;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.ParcelableVolumeInfo = jArr2;
    }

    public final int read(int i) {
        int i2 = this.IconCompatParcelizer;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.RatingCompat;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("SieveCache[maxSize=");
        sb.append(this.write);
        sb.append(", size=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", capacity=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", count=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ']');
    }

    public final void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        long j;
        int i;
        int i2;
        int[] iArr;
        int i3;
        long j2;
        long j3;
        int i4;
        int i5;
        int iHashCode;
        int i6;
        long[] jArr;
        Object obj3 = obj;
        Object obj4 = obj2;
        int iHashCode2 = obj.hashCode() * (-862048943);
        int i7 = iHashCode2 ^ (iHashCode2 << 16);
        int i8 = i7 >>> 7;
        int i9 = this.IconCompatParcelizer;
        int i10 = i8 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr2 = this.RatingCompat;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = i11;
            long j4 = (((-i13) >> 63) & (jArr2[i12 + 1] << (64 - i13))) | (jArr2[i12] >>> i13);
            long j5 = i7 & 127;
            int i15 = i8;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = -9187201950435737472L;
            for (long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i10) & i9;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem[iNumberOfTrailingZeros], obj3}, getCieXyz.write())).booleanValue()) {
                    i = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int i16 = i15;
                int i17 = read(i16);
                if (this.MediaDescriptionCompat != 0 || ((this.RatingCompat[i17 >> 3] >> ((i17 & 7) << 3)) & 255) == 254) {
                    j = j5;
                } else {
                    int i18 = this.IconCompatParcelizer;
                    if (i18 > 8 && Long.compareUnsigned(((long) this.read) * 32, ((long) i18) * 25) <= 0) {
                        long[] jArr3 = this.RatingCompat;
                        if (jArr3 == null) {
                            i3 = i16;
                            j = j5;
                        } else {
                            int i19 = this.IconCompatParcelizer;
                            Object[] objArr = this.MediaSessionCompatQueueItem;
                            Object[] objArr2 = this.PlaybackStateCompat;
                            long[] jArr4 = this.ParcelableVolumeInfo;
                            long[] jArr5 = new long[i19];
                            j = j5;
                            Arrays.fill(jArr5, 0, i19, androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask);
                            int i20 = 0;
                            while (i20 < ((i19 + 7) >> 3)) {
                                long j9 = jArr3[i20] & j7;
                                int i21 = i20;
                                jArr3[i21] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i20 = i21 + 1;
                                j7 = -9187201950435737472L;
                            }
                            int length = jArr3.length;
                            int i22 = length - 2;
                            jArr3[i22] = (jArr3[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[length - 1] = jArr3[0];
                            int i23 = 0;
                            while (i23 != i19) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j10 = (jArr3[i24] >> i25) & 255;
                                if (j10 != 128 && j10 == 254) {
                                    Object obj5 = objArr[i23];
                                    if (obj5 != null) {
                                        iHashCode = obj5.hashCode();
                                        i5 = -862048943;
                                    } else {
                                        i5 = -862048943;
                                        iHashCode = 0;
                                    }
                                    int i26 = iHashCode * i5;
                                    int i27 = i26 ^ (i26 << 16);
                                    int i28 = i27 >>> 7;
                                    int i29 = read(i28);
                                    int i30 = i28 & i19;
                                    if (((i29 - i30) & i19) / 8 == ((i23 - i30) & i19) / 8) {
                                        jArr3[i24] = (jArr3[i24] & (~(255 << i25))) | (((long) (i27 & 127)) << i25);
                                        if (jArr5[i23] == androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) {
                                            long j11 = i23;
                                            jArr5[i23] = j11 | (j11 << 32);
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i23++;
                                    } else {
                                        int i31 = i29 >> 3;
                                        long j12 = jArr3[i31];
                                        int i32 = (i29 & 7) << 3;
                                        if (((j12 >> i32) & 255) == 128) {
                                            i6 = i16;
                                            jArr = jArr5;
                                            jArr3[i31] = (((long) (i27 & 127)) << i32) | (j12 & (~(255 << i32)));
                                            jArr3[i24] = (jArr3[i24] & (~(255 << i25))) | (128 << i25);
                                            objArr[i29] = objArr[i23];
                                            objArr[i23] = null;
                                            objArr2[i29] = objArr2[i23];
                                            objArr2[i23] = null;
                                            jArr4[i29] = jArr4[i23];
                                            jArr4[i23] = 4611686018427387903L;
                                            int i33 = (int) ((jArr[i23] >> 32) & 4294967295L);
                                            if (i33 != Integer.MAX_VALUE) {
                                                jArr[i33] = ((long) i29) | (jArr[i33] & (-4294967296L));
                                                jArr[i23] = (jArr[i23] & 4294967295L) | (-4294967296L);
                                            } else {
                                                jArr[i23] = ((long) i29) | 9223372032559808512L;
                                            }
                                            jArr[i29] = (((long) i23) << 32) | 2147483647L;
                                        } else {
                                            i6 = i16;
                                            jArr = jArr5;
                                            jArr3[i31] = (((long) (i27 & 127)) << i32) | (j12 & (~(255 << i32)));
                                            Object obj6 = objArr[i29];
                                            objArr[i29] = objArr[i23];
                                            objArr[i23] = obj6;
                                            Object obj7 = objArr2[i29];
                                            objArr2[i29] = objArr2[i23];
                                            objArr2[i23] = obj7;
                                            long j13 = jArr4[i29];
                                            jArr4[i29] = jArr4[i23];
                                            jArr4[i23] = j13;
                                            int i34 = (int) ((jArr[i23] >> 32) & 4294967295L);
                                            if (i34 != Integer.MAX_VALUE) {
                                                long j14 = i29;
                                                jArr[i34] = (jArr[i34] & (-4294967296L)) | j14;
                                                jArr[i23] = (j14 << 32) | (jArr[i23] & 4294967295L);
                                            } else {
                                                long j15 = i29;
                                                jArr[i23] = j15 | (j15 << 32);
                                                i34 = i23;
                                            }
                                            jArr[i29] = (((long) i34) << 32) | ((long) i23);
                                            i23--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i23++;
                                        jArr5 = jArr;
                                        i19 = i19;
                                        i16 = i6;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            i2 = i16;
                            long[] jArr6 = jArr5;
                            this.MediaDescriptionCompat = detectDragGestures.IconCompatParcelizer(this.IconCompatParcelizer) - this.read;
                            long[] jArr7 = this.ParcelableVolumeInfo;
                            int length2 = jArr7.length;
                            for (int i35 = 0; i35 < length2; i35++) {
                                long j16 = jArr7[i35];
                                int i36 = (int) ((j16 >> 31) & 2147483647L);
                                int i37 = (int) (j16 & 2147483647L);
                                if (i36 == Integer.MAX_VALUE) {
                                    i4 = Integer.MAX_VALUE;
                                    j3 = 4294967295L;
                                } else {
                                    j3 = 4294967295L;
                                    i4 = (int) (jArr6[i36] & 4294967295L);
                                }
                                jArr7[i35] = (((j16 & (-4611686018427387904L)) | ((long) i4)) << 31) | ((long) (i37 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i37] & j3)));
                            }
                            int i38 = this.MediaBrowserCompatMediaItem;
                            if (i38 != Integer.MAX_VALUE) {
                                j2 = 4294967295L;
                                this.MediaBrowserCompatMediaItem = (int) (jArr6[i38] & 4294967295L);
                            } else {
                                j2 = 4294967295L;
                            }
                            int i39 = this.MediaSessionCompatToken;
                            if (i39 != Integer.MAX_VALUE) {
                                this.MediaSessionCompatToken = (int) (jArr6[i39] & j2);
                            }
                            int i40 = this.MediaMetadataCompat;
                            if (i40 != Integer.MAX_VALUE) {
                                this.MediaMetadataCompat = (int) (jArr6[i40] & j2);
                            }
                        }
                        i17 = read(i3);
                    } else {
                        i2 = i16;
                        j = j5;
                        int i41 = 0;
                        int iSerializer = detectDragGestures.serializer(this.IconCompatParcelizer);
                        long[] jArr8 = this.RatingCompat;
                        Object[] objArr3 = this.MediaSessionCompatQueueItem;
                        Object[] objArr4 = this.PlaybackStateCompat;
                        long[] jArr9 = this.ParcelableVolumeInfo;
                        int i42 = this.IconCompatParcelizer;
                        int[] iArr2 = new int[i42];
                        IconCompatParcelizer(iSerializer);
                        long[] jArr10 = this.RatingCompat;
                        Object[] objArr5 = this.MediaSessionCompatQueueItem;
                        Object[] objArr6 = this.PlaybackStateCompat;
                        long[] jArr11 = this.ParcelableVolumeInfo;
                        int i43 = this.IconCompatParcelizer;
                        int i44 = 0;
                        while (i44 < i42) {
                            if (((jArr8[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < 128) {
                                Object obj8 = objArr3[i44];
                                int iHashCode3 = (obj8 != null ? obj8.hashCode() : i41) * (-862048943);
                                int i45 = iHashCode3 ^ (iHashCode3 << 16);
                                int i46 = read(i45 >>> 7);
                                long j17 = i45 & 127;
                                int i47 = i46 >> 3;
                                int i48 = (i46 & 7) << 3;
                                iArr = iArr2;
                                long j18 = (j17 << i48) | (jArr10[i47] & (~(255 << i48)));
                                jArr10[i47] = j18;
                                jArr10[(((i46 - 7) & i43) + (i43 & 7)) >> 3] = j18;
                                objArr5[i46] = obj8;
                                objArr6[i46] = objArr4[i44];
                                jArr11[i46] = jArr9[i44];
                                iArr[i44] = i46;
                            } else {
                                iArr = iArr2;
                            }
                            i44++;
                            jArr8 = jArr8;
                            objArr3 = objArr3;
                            i42 = i42;
                            iArr2 = iArr;
                            i41 = 0;
                        }
                        int[] iArr3 = iArr2;
                        long[] jArr12 = this.ParcelableVolumeInfo;
                        int length3 = jArr12.length;
                        for (int i49 = 0; i49 < length3; i49++) {
                            long j19 = jArr12[i49];
                            int i50 = (int) ((j19 >> 31) & 2147483647L);
                            int i51 = (int) (j19 & 2147483647L);
                            jArr12[i49] = (((j19 & (-4611686018427387904L)) | ((long) (i50 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr3[i50]))) << 31) | ((long) (i51 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr3[i51]));
                        }
                        int i52 = this.MediaBrowserCompatMediaItem;
                        if (i52 != Integer.MAX_VALUE) {
                            this.MediaBrowserCompatMediaItem = iArr3[i52];
                        }
                        int i53 = this.MediaSessionCompatToken;
                        if (i53 != Integer.MAX_VALUE) {
                            this.MediaSessionCompatToken = iArr3[i53];
                        }
                        int i54 = this.MediaMetadataCompat;
                        if (i54 != Integer.MAX_VALUE) {
                            this.MediaMetadataCompat = iArr3[i54];
                        }
                    }
                    i3 = i2;
                    i17 = read(i3);
                }
                this.read++;
                int i55 = this.MediaDescriptionCompat;
                long[] jArr13 = this.RatingCompat;
                int i56 = i17 >> 3;
                long j20 = jArr13[i56];
                int i57 = (i17 & 7) << 3;
                this.MediaDescriptionCompat = i55 - (((j20 >> i57) & 255) == 128 ? 1 : 0);
                int i58 = this.IconCompatParcelizer;
                long j21 = (j20 & (~(255 << i57))) | (j << i57);
                jArr13[i56] = j21;
                jArr13[(((i17 - 7) & i58) + (i58 & 7)) >> 3] = j21;
                i = ~i17;
                break;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            obj4 = obj4;
            i8 = i15;
            obj3 = obj3;
        }
        if (i < 0) {
            i = ~i;
        }
        Object[] objArr7 = this.PlaybackStateCompat;
        Object obj9 = objArr7[i];
        objArr7[i] = obj2;
        this.MediaSessionCompatQueueItem[i] = obj;
        int i59 = this.RemoteActionCompatParcelizer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.MediaSessionCompatResultReceiverWrapper;
        int iIntValue = ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, obj2)).intValue() + i59;
        this.RemoteActionCompatParcelizer = iIntValue;
        int i60 = this.write;
        if (obj9 != null) {
            this.RemoteActionCompatParcelizer = iIntValue - ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, obj9)).intValue();
            this.PlaybackStateCompatCustomAction.invoke(obj, obj9, obj2, Boolean.FALSE);
            write(i60);
            return;
        }
        write(i60);
        long[] jArr14 = this.ParcelableVolumeInfo;
        int i61 = this.MediaBrowserCompatMediaItem;
        jArr14[i] = (((long) i61) & 2147483647L) | 4611686016279904256L;
        if (i61 != Integer.MAX_VALUE) {
            jArr14[i61] = (jArr14[i61] & (-4611686016279904257L)) | ((((long) i) & 2147483647L) << 31);
        }
        this.MediaBrowserCompatMediaItem = i;
        if (this.MediaSessionCompatToken == Integer.MAX_VALUE) {
            this.MediaSessionCompatToken = i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[LOOP:0: B:16:0x0029->B:28:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dragjO51t88)) {
            return false;
        }
        dragjO51t88 dragjo51t88 = (dragjO51t88) obj;
        if (dragjo51t88.RemoteActionCompatParcelizer != this.RemoteActionCompatParcelizer || dragjo51t88.read != this.read) {
            return false;
        }
        Object[] objArr = this.MediaSessionCompatQueueItem;
        Object[] objArr2 = this.PlaybackStateCompat;
        long[] jArr = this.RatingCompat;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            obj2.getClass();
                            Object obj3 = objArr2[i4];
                            obj3.getClass();
                            if (!obj3.equals(dragjo51t88.write(obj2))) {
                                return false;
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
            }
        }
        return true;
    }

    public final Object write(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj.hashCode() * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = this.IconCompatParcelizer;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.RatingCompat;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem[iNumberOfTrailingZeros], obj}, getCieXyz.write())).booleanValue()) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (iNumberOfTrailingZeros >= 0) {
            long[] jArr2 = this.ParcelableVolumeInfo;
            jArr2[iNumberOfTrailingZeros] = (jArr2[iNumberOfTrailingZeros] & 4611686018427387903L) | 4611686018427387904L;
            return this.PlaybackStateCompat[iNumberOfTrailingZeros];
        }
        Object objInvoke = this.serializer.invoke(obj);
        if (objInvoke == null) {
            return null;
        }
        RemoteActionCompatParcelizer(obj, objInvoke);
        return objInvoke;
    }
}
