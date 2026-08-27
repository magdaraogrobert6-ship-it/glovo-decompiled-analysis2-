package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    /* JADX INFO: renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m2174add0FcD4WY(long j) {
        return add(j);
    }

    public final void clear() {
        this.size = 0;
    }

    /* JADX INFO: renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m2175contains0FcD4WY(long j) {
        return contains(j);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    /* JADX INFO: renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m2177remove0FcD4WY(long j) {
        return remove(j);
    }

    /* JADX INFO: renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m2178setDmW0f2w(int i, long j) {
        set(i, j);
    }

    private final long[] resizeStorage(int i) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, jArr.length * 2));
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    /* JADX INFO: renamed from: get-_I2yYro, reason: not valid java name */
    public final long m2176get_I2yYro(int i) {
        return PointerId.m2048constructorimpl(this.internalArray[i]);
    }

    public final void set(int i, long j) {
        long[] jArrResizeStorage = this.internalArray;
        if (i >= jArrResizeStorage.length) {
            jArrResizeStorage = resizeStorage(i + 1);
        }
        jArrResizeStorage[i] = j;
        if (i >= this.size) {
            this.size = i + 1;
        }
    }

    public final boolean add(long j) {
        if (contains(j)) {
            return false;
        }
        set(this.size, j);
        return true;
    }

    public final boolean contains(long j) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.internalArray[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean remove(long j) {
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.internalArray[i2]) {
                int i3 = this.size;
                while (i2 < i3 - 1) {
                    long[] jArr = this.internalArray;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.size--;
                return true;
            }
            i2++;
        }
        return false;
    }

    public final boolean removeAt(int i) {
        int i2 = this.size;
        if (i >= i2) {
            return false;
        }
        while (i < i2 - 1) {
            long[] jArr = this.internalArray;
            int i3 = i + 1;
            jArr[i] = jArr[i3];
            i = i3;
        }
        this.size--;
        return true;
    }
}
