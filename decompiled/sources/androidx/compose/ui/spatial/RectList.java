package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import java.util.Arrays;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;

/* JADX INFO: loaded from: classes.dex */
public final class RectList {
    public static final int $stable = 8;
    public int itemsSize;
    public long[] items = new long[192];
    public long[] stack = new long[192];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            resizeStorage(length, i, jArr);
        }
        return i;
    }

    private final void updateSubhierarchy(long j, int i, int i2) {
        int i3;
        int i4;
        char c;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        getSize();
        jArr2[0] = j;
        int i5 = 1;
        while (i5 > 0) {
            i5--;
            long j2 = jArr2[i5];
            int i6 = (int) j2;
            int i7 = 33554431;
            int i8 = ((int) (j2 >> 25)) & 33554431;
            char c2 = 1023;
            int i9 = ((int) (j2 >> 50)) & 1023;
            int i10 = i9 == 1023 ? this.itemsSize : (i9 * 3) + i8;
            if (i8 < 0) {
                return;
            }
            while (i8 < jArr.length - 2 && i8 < i10) {
                int i11 = i8 + 2;
                long j3 = jArr[i11];
                if ((((int) (j3 >> 25)) & i7) == (i6 & i7)) {
                    long j4 = jArr[i8];
                    int i12 = i8 + 1;
                    i3 = i6;
                    long j5 = jArr[i12];
                    jArr[i8] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i12] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i11] = (((j3 >> 63) & 1) << 60) | j3;
                    c = 1023;
                    if ((((int) (j3 >> 50)) & 1023) > 0) {
                        i4 = 33554431;
                        jArr2[i5] = (((long) ((i8 + 3) & 33554431)) << 25) | (RectListKt.getEverythingButParentId() & j3);
                        i5++;
                    } else {
                        i4 = 33554431;
                    }
                } else {
                    i3 = i6;
                    i4 = i7;
                    c = c2;
                }
                i8 += 3;
                i6 = i3;
                c2 = c;
                i7 = i4;
            }
        }
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            jArr[i3] = jArr[i3] & (-1152921504606846977L);
        }
    }

    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = 0;
        while (i2 < jArr.length - 2 && i2 < i) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            int i3 = (int) j3;
            int i4 = (int) (j3 >> 25);
            long[] jArr2 = jArr;
            int i5 = i;
            int i6 = (int) (j2 >> 32);
            int i7 = (int) j2;
            int i8 = (int) (j3 >> 50);
            StringBuilder sb2 = sb;
            int i9 = (int) (j3 >> 60);
            int i10 = (int) (j3 >> 61);
            int i11 = (int) (j3 >> 62);
            StringBuilder sb3 = new StringBuilder("id=");
            sb3.append(i3 & 33554431);
            sb3.append(", rect=[");
            sb3.append((int) (j >> 32));
            sb3.append(',');
            sb3.append((int) j);
            sb3.append(',');
            sb3.append(i6);
            sb3.append(',');
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i7, i4 & 33554431, "], parent=", ", lastChildOffset=", sb3);
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i8 & 1023, i9 & 1, ", updated=", ", focusable=", sb3);
            sb3.append(i10 & 1);
            sb3.append(", gesturable=");
            sb3.append(i11 & 1);
            sb2.append(sb3.toString());
            sb2.append('\n');
            i2 += 3;
            jArr = jArr2;
            sb = sb2;
            i = i5;
        }
        return sb.toString();
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long[] jArr2 = this.stack;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
            int i4 = i3 + 2;
            if (jArr[i4] != RectListKt.getTombStone()) {
                jArr2[i2] = jArr[i3];
                jArr2[i2 + 1] = jArr[i3 + 1];
                jArr2[i2 + 2] = jArr[i4];
                i2 += 3;
            }
        }
        this.itemsSize = i2;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final int findNearestNeighbor(int i, int i2, int i3, int i4, int i5) {
        long[] jArr = this.items;
        int i6 = this.itemsSize;
        int i7 = Integer.MAX_VALUE;
        int i8 = -1;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i6; i9 += 3) {
            long j = jArr[i9];
            int i10 = i9 + 1;
            long j2 = jArr[i10];
            int iDistanceScore = RectListKt.distanceScore(i, i2, i3, i4, i5, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
            boolean z = (iDistanceScore < i7) & (iDistanceScore > 0);
            if (z) {
                i7 = iDistanceScore;
            }
            if (z) {
                i8 = i10;
            }
        }
        if (i8 < 0 || i8 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i8]) & 33554431;
    }

    public final void forEachRect(r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            r8lambdagdus9ewsajl31fka79xr2pb0c4e.serializer(Integer.valueOf(33554431 & ((int) jArr[i2 + 2])), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
        }
    }

    public final void forEachUpdatedRect(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2 + 2];
            if ((((int) (j >> 60)) & 1) != 0) {
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(Integer.valueOf(((int) j) & 33554431), Long.valueOf(jArr[i2]), Long.valueOf(jArr[i2 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final void insert(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        int i9 = i8 + 3;
        this.itemsSize = i9;
        int length = jArr.length;
        if (length <= i9) {
            resizeStorage(length, i8, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (((long) Math.min((i8 - i11) / 3, 1023)) << 50) | (j & RectListKt.getEverythingButLastChildOffset());
                return;
            }
        }
    }

    public final int[] neighborsScoredByDistance$ui(int i, int i2, int i3, int i4, int i5) {
        long[] jArr = this.items;
        int i6 = this.itemsSize / 3;
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 * 3;
            if (i8 < 0 || i8 >= jArr.length - 1) {
                break;
            }
            long j = jArr[i8];
            long j2 = jArr[i8 + 1];
            iArr[i7] = RectListKt.distanceScore(i, i2, i3, i4, i5, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        }
        return iArr;
    }

    private final void resizeStorage(int i, int i2, long[] jArr) {
        int iMax = Math.max(i * 2, i2 + 3);
        this.items = Arrays.copyOf(jArr, iMax);
        this.stack = Arrays.copyOf(this.stack, iMax);
    }

    public final boolean contains(int i) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == (33554431 & i)) {
                return true;
            }
        }
        return false;
    }

    public final void forEachIntersectingRectWithValueAt(int i, r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e) {
        int i2 = i;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        long j = jArr[i2];
        long j2 = jArr[i2 + 1];
        int i4 = 0;
        while (i4 < jArr.length - 2 && i4 < i3) {
            if (i4 != i2) {
                long j3 = jArr[i4];
                long j4 = jArr[i4 + 1];
                if (((((j2 - j3) - InlineClassHelperKt.Uint64Low32) | ((j4 - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    r8lambdagdus9ewsajl31fka79xr2pb0c4e.serializer(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) j4), Integer.valueOf(33554431 & ((int) jArr[i4 + 2])));
                }
            }
            i4 += 3;
            i2 = i;
        }
    }

    public final long getTopLeft(int i) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == (33554431 & i)) {
                return jArr[i3];
            }
        }
        return Long.MAX_VALUE;
    }

    public final int indexOf(int i) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == (33554431 & i)) {
                return i3;
            }
        }
        return -1;
    }

    public final void markUpdated(int i) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 33554431) == (33554431 & i)) {
                jArr[i4] = (((j >> 63) & 1) << 60) | j;
                return;
            }
        }
    }

    public final long metaFor(int i) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            long j = jArr[i3 + 2];
            if ((((int) j) & 33554431) == (33554431 & i)) {
                return j;
            }
        }
        return RectListKt.getTombStone();
    }

    public final boolean remove(int i) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 33554431) == (33554431 & i)) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = RectListKt.getTombStone();
                return true;
            }
        }
        return false;
    }

    public final boolean updateFlagsFor(int i, boolean z, boolean z2) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 33554431) == (33554431 & i)) {
                jArr[i4] = ((z ? 1L : 0L) * 2305843009213693952L) | (j & (-6917529027641081857L)) | ((z2 ? 1L : 0L) * 4611686018427387904L);
                return true;
            }
        }
        return false;
    }

    public final boolean updateHasCallbacks(int i, boolean z) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 33554431) == (33554431 & i)) {
                long j2 = z ? 1L : 0L;
                jArr[i4] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j2);
                return true;
            }
        }
        return false;
    }

    public final boolean withRect(int i, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == (33554431 & i)) {
                long j = jArr[i3];
                long j2 = jArr[i3 + 1];
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return true;
            }
        }
        return false;
    }

    public final boolean withTopLeftBottomRight(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == (33554431 & i)) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Long.valueOf(jArr[i3]), Long.valueOf(jArr[i3 + 1]));
                return true;
            }
        }
        return false;
    }

    public final void insertBasedOnParentOffset(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        long[] jArr = this.items;
        for (int i7 = this.itemsSize - 3; i7 >= 0; i7 -= 3) {
            if ((((int) jArr[i7 + 2]) & 33554431) == i2) {
                long j = jArr[i7];
                int i8 = ((int) (j >> 32)) + i3;
                int i9 = ((int) j) + i4;
                insert(i & 33554431, i8, i9, i8 + i5, i9 + i6, i2, z, z2, z3, i7);
                return;
            }
        }
    }

    public final boolean update(int i, int i2, int i3, int i4, int i5) {
        long[] jArr = this.items;
        int i6 = this.itemsSize;
        for (int i7 = 0; i7 < jArr.length - 2 && i7 < i6; i7 += 3) {
            int i8 = i7 + 2;
            long j = jArr[i8];
            if ((((int) j) & 33554431) == (33554431 & i)) {
                jArr[i7] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                jArr[i7 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
                jArr[i8] = (((j >> 63) & 1) << 60) | j;
                return true;
            }
        }
        return false;
    }

    public final void moveBasedOnParentOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        long[] jArr = this.items;
        int i8 = this.itemsSize;
        int i9 = 0;
        while (i9 < jArr.length - 2 && i9 < i8) {
            if ((((int) jArr[i9 + 2]) & 33554431) == i2) {
                long j = jArr[i9];
                int i10 = ((int) (j >> 32)) + i3;
                int i11 = ((int) j) + i4;
                while (true) {
                    i7 = i9 + 3;
                    if (i7 >= jArr.length - 2 || i7 >= i8) {
                        break;
                    }
                    int i12 = i9 + 5;
                    long j2 = jArr[i12];
                    if ((((int) j2) & 33554431) == (i & 33554431)) {
                        long j3 = jArr[i7];
                        int i13 = i10 - ((int) (j3 >> 32));
                        int i14 = i11 - ((int) j3);
                        jArr[i7] = (((long) i11) & 4294967295L) | (((long) i10) << 32);
                        jArr[i9 + 4] = (((long) (i10 + i5)) << 32) | (((long) (i11 + i6)) & 4294967295L);
                        jArr[i12] = (((j2 >> 63) & 1) << 60) | j2;
                        if (i13 == 0 && i14 == 0) {
                            return;
                        }
                        updateSubhierarchy((RectListKt.getEverythingButParentId() & j2) | (((long) ((i9 + 6) & 33554431)) << 25), i13, i14);
                        return;
                    }
                    i9 = i7;
                }
                i9 = i7;
            }
            i9 += 3;
        }
    }

    public final void move(int i, int i2, int i3, int i4, int i5) {
        long[] jArr = this.items;
        int i6 = this.itemsSize;
        for (int i7 = 0; i7 < jArr.length - 2 && i7 < i6; i7 += 3) {
            int i8 = i7 + 2;
            long j = jArr[i8];
            if ((((int) j) & 33554431) == (i & 33554431)) {
                long j2 = jArr[i7];
                jArr[i7] = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                jArr[i7 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
                jArr[i8] = (((j >> 63) & 1) << 60) | j;
                int i9 = i2 - ((int) (j2 >> 32));
                int i10 = i3 - ((int) j2);
                if ((i9 != 0) || (i10 != 0)) {
                    updateSubhierarchy((RectListKt.getEverythingButParentId() & j) | (((long) (33554431 & (i7 + 3))) << 25), i9, i10);
                    return;
                }
                return;
            }
        }
    }

    public final void findKNearestNeighbors(int i, int i2, int i3, int i4, int i5, int i6, r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim) {
        int[] iArrNeighborsScoredByDistance$ui = neighborsScoredByDistance$ui(i, i3, i4, i5, i6);
        long[] jArr = this.items;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 <= i2) {
            int iMin = Integer.MAX_VALUE;
            int i10 = 0;
            while (i10 < iArrNeighborsScoredByDistance$ui.length) {
                int i11 = iArrNeighborsScoredByDistance$ui[i10];
                if (i11 > i7) {
                    iMin = Math.min(iMin, i11);
                }
                if (i11 == i7) {
                    int i12 = i10 * 3;
                    long j = jArr[i12];
                    long j2 = jArr[i12 + 1];
                    r8lambdahlfuu54mfvlmnthbk7uy9j3wgim.read(Integer.valueOf(i11), Integer.valueOf(((int) jArr[i12 + 2]) & 33554431), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                    i9++;
                    if (i9 == i2) {
                        return;
                    }
                }
                i10++;
                i8 = i8;
                iArrNeighborsScoredByDistance$ui = iArrNeighborsScoredByDistance$ui;
            }
            i8++;
            i7 = iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    public final void forEachFocusableIntersection(int i, int i2, int i3, int i4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long j = i;
        long j2 = i2;
        long j3 = i3;
        long j4 = i4;
        long[] jArr = this.items;
        int i5 = this.itemsSize;
        for (int i6 = 0; i6 < jArr.length - 2 && i6 < i5; i6 += 3) {
            long j5 = jArr[i6 + 2];
            if ((((int) (j5 >> 61)) & 1) != 0) {
                if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i6]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i6 + 1] - ((j << 32) | (j2 & 4294967295L))) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(((int) j5) & 33554431));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    public final void forEachGesturableIntersection(int i, int i2, int i3, int i4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long j = i;
        long j2 = i2;
        long j3 = i3;
        long j4 = i4;
        long[] jArr = this.items;
        int i5 = this.itemsSize;
        for (int i6 = 0; i6 < jArr.length - 2 && i6 < i5; i6 += 3) {
            long j5 = jArr[i6 + 2];
            if ((((int) (j5 >> 62)) & 1) != 0) {
                if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i6]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i6 + 1] - ((j << 32) | (j2 & 4294967295L))) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(((int) j5) & 33554431));
                }
            }
        }
    }

    public final void forEachIntersection(int i, int i2, int i3, int i4, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long j = i;
        long j2 = i2;
        long j3 = i3;
        long j4 = i4;
        long[] jArr = this.items;
        int i5 = this.itemsSize;
        for (int i6 = 0; i6 < jArr.length - 2 && i6 < i5; i6 += 3) {
            if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i6]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i6 + 1] - ((j << 32) | (j2 & 4294967295L))) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(((int) jArr[i6 + 2]) & 33554431));
            }
        }
    }

    public final void forEachIntersection(int i, int i2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if (((((j - jArr[i4]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i4 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf(((int) jArr[i4 + 2]) & 33554431));
            }
        }
    }

    public final void updateSubhierarchy(int i, int i2, int i3) {
        updateSubhierarchy((((long) Math.min(this.itemsSize / 3, 1023)) << 50) | ((long) (i & 33554431)), i2, i3);
    }
}
